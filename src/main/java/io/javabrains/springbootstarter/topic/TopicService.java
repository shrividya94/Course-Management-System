package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("spring","spring Framework","spring Framework Description"),
			new Topic("java","core java","java Description"),
			new Topic("javascript","javascript","javascript Description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	 
    public Topic getTopic(String id) {
    	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    
    public void addTopic(Topic topic) {
    	topics.add(topic);
    }
    public void updateTopic(Topic topic,String id) {
    	for(int i=0;i<topics.size();i++) {
    		Topic t=topics.get(i);
    		if(t.getId().equals(id)) {
    			topics.set(i, topic);
    			return;
    		}
    	}
    }
    
    public void deleteTopic(String id) {
    	for(int i=0;i<topics.size();i++) {
    		Topic t=topics.get(i);
    		if(t.getId().equals(id)) {
    			
    			topics.remove(t);
    			return;
    		}
    	}
    	
    }
}
