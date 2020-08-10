package hadesgod.demo.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    public List<CourseModel> getAllCourse(String topicId){
        List<CourseModel> courses = new ArrayList<>();
        // this.courseRepository.findAll().forEach(course -> {
        //     courses.add(course);
        // });

        this.courseRepository.findByTopicId(topicId).forEach(course -> {
            courses.add(course);
        });
        return courses;
    }

    public CourseModel getCourse(String id) {
        return this.courseRepository.findById(id).orElse(new CourseModel("id", "name", "description",""));
    }

    public List<CourseModel> getCoursesByName(String name) {
        List<CourseModel> courses = new ArrayList<>();
        this.courseRepository.findByName(name).forEach(course -> {
            courses.add(course);
        });
        return courses;
    }

    public void addCourse(CourseModel course) {
        this.courseRepository.save(course);
    }
    public void updateCourse(CourseModel course) {
        this.courseRepository.save(course);
    }
    public void deleteCourse(String id) {
        this.courseRepository.deleteById(id);
    }
}