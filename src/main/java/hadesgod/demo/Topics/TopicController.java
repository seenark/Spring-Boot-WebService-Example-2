package hadesgod.demo.Topics;

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



@RestController
@RequestMapping("/topics")
public class TopicController {
    
    @Autowired
    private TopicService topicService;

    @PostMapping
    public void addTopic(@RequestBody final TopicModel topic) {
        this.topicService.addTopic(topic);
    }

    @GetMapping
    public List<TopicModel> getAllTopics() {
        return this.topicService.getAllTopic();
    }

    @GetMapping(path = "/{id}")
    public TopicModel getTopicById(@PathVariable(name = "id") String id) {
        return this.topicService.getTopicById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTopic(@PathVariable(name = "id") String id) {
        this.topicService.deleteTopic(id);
    }

    @PutMapping(path = "{id}")
    public void updateTopic(@PathVariable(name = "id") String id,@RequestBody TopicModel topic) {
        this.topicService.updateTopic(id, topic);
    }



}