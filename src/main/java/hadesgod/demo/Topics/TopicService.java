package hadesgod.demo.Topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;


    public void addTopic(TopicModel topic) {
        this.topicRepository.save(topic);
    }
    public List<TopicModel> getAllTopic() {
        List<TopicModel> topics = new ArrayList<>();
        this.topicRepository.findAll().forEach(topic -> {
            topics.add(topic);
        });
        return topics;
    }
    
    public TopicModel getTopicById(String id) {
        return this.topicRepository.findById(id).orElse(null);
    }
    public void deleteTopic(String id) {
        this.topicRepository.deleteById(id);
    }
    public void updateTopic(String id, TopicModel topic) {
        this.topicRepository.save(topic);
    }
    
}