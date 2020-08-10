package hadesgod.demo.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import hadesgod.demo.Topics.TopicModel;

@Entity
public class CourseModel {
    
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private TopicModel topic;



    public CourseModel() {
    }

    public CourseModel(String id, String name, String description,String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new TopicModel(topicId,"", "");
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TopicModel getTopic() {
        return this.topic;
    }

    public void setTopic(TopicModel topic) {
        this.topic = topic;
    }
}