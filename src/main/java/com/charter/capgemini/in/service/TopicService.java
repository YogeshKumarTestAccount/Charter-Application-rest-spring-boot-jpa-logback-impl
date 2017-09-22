package com.charter.capgemini.in.service;
import com.charter.capgemini.in.model.RelatedTopic;

import java.util.List;

public interface TopicService {

	public List<RelatedTopic> getAllTopics();

	public RelatedTopic getTopicById(String id);

	public void addTopic(RelatedTopic topic);

	public void updateTopic(RelatedTopic topic, String id);

	public void deleteTopic(String id);

}
