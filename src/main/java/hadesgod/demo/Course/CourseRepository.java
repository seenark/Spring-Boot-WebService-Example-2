package hadesgod.demo.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseModel, String> {
    
    List<CourseModel> findByName(String name);
    List<CourseModel> findByTopicId(String topicId);
}