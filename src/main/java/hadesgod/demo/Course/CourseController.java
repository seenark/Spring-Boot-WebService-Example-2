package hadesgod.demo.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hadesgod.demo.Topics.TopicModel;

@RestController
@RequestMapping("/topics/{topicId}")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<CourseModel> getAllCourses(@PathVariable(name = "topicId")  String topicId) {
        return this.courseService.getAllCourse(topicId);
    }

    @GetMapping(path ="/courses/{id}")
    public CourseModel getCourse(@PathVariable(name = "id") final String id) {
        return this.courseService.getCourse(id);
    }

    @GetMapping(path = "/courses/byName/{name}")
    public List<CourseModel> getAllCourseByName(@PathVariable(name = "name") final String name) {
        return this.courseService.getCoursesByName(name);       
    }
    
    @PostMapping
    public void addCourse(@RequestBody final CourseModel course,@PathVariable(name = "topicId") final String topicId){
        final CourseModel newCourse = course;
        final TopicModel newTopic = new TopicModel(topicId, "", "");
        newCourse.setTopic(newTopic);
        this.courseService.addCourse(newCourse);
    }

    @DeleteMapping(path = "courses/{id}")
    public void deleteCourse(@PathVariable(name = "id") final String id){
        this.courseService.deleteCourse(id);
    }

    @PutMapping(path = "courses/{id}")
    public void updateCourse(@RequestBody CourseModel course,
                            @PathVariable(name = "id") final String courseId, 
                            @PathVariable(name = "topicId") final String topicId
                            ) {
        CourseModel newCourse = new CourseModel(course.getId(), course.getName(), course.getDescription(), topicId);
        this.courseService.updateCourse(newCourse);
    }
    
}