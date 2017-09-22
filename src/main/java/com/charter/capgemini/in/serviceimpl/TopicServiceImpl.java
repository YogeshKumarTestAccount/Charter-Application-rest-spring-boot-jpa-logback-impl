package com.charter.capgemini.in.serviceimpl;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.capgemini.in.datarepository.TopicRepository;
import com.charter.capgemini.in.model.RelatedTopic;
import com.charter.capgemini.in.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicRepository topicRepogitory;

	public TopicServiceImpl() {
	};

	@Override
	public List<RelatedTopic> getAllTopics() {
		List<RelatedTopic> topics = new ArrayList<>();
		topicRepogitory.findAll().forEach(topics::add);
		return topics;
	}

	public RelatedTopic getTopicById(String id) {

		return topicRepogitory.findOne(id);
	}

	@Override
	public void addTopic(RelatedTopic topic) {

		topicRepogitory.save(topic);

	}

	@Override
	public void updateTopic(RelatedTopic topic, String id) {

		topicRepogitory.save(topic);

	}

	@Override
	public void deleteTopic(String id) {

		topicRepogitory.delete(id);
	}

}
