package io.springboot.learning.startup.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
	
	
	//getAlltopics()
	//getTopic(String id)
	//updateTopics(Topic t)
	//deleteTopic(String id)
	
	
}
