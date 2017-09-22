package com.charter.capgemini.in.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.charter.capgemini.in.model.RelatedTopic;
import com.charter.capgemini.in.service.TopicService;

@RestController
public class SpringTopicController {

	@Autowired
	private TopicService topicService;
	private static final Logger logger = LoggerFactory.getLogger(SpringCourseController.class);

	// Reading Server Port Application.Properties File
	@Value("${server.port}")
	String accessPortFromProps;

	// Reading Spring Security flag from Application.Properties File
	@Value("${management.security.enabled}")
	String SpringSecurity;

	// Reading URL from Application.Properties File
	@Value("${spring.datasource.url}")
	String datasourceUrl;

	@RequestMapping(method = RequestMethod.GET, value = "/topics")
	public List<RelatedTopic> getAllTopics() {
		logger.info("Server Port value from Properties file=      " + accessPortFromProps);
		logger.info("Spring Security value from Properties file=  " + SpringSecurity);
		logger.info("Spring.datasource value from Properties file= " + datasourceUrl);

		logger.debug("Called getAllTopics() Method Request...!!!!!!!");
		return topicService.getAllTopics();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
	public RelatedTopic getTopicById(@PathVariable String id) {
		logger.debug("Called getTopicById() Method Request...!!!!!!!");
		return topicService.getTopicById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody RelatedTopic topic) {
		logger.info("addTopic() Post Method Called....!!!!!");
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopics(@RequestBody RelatedTopic topic, @PathVariable String id) {
		logger.info("updateTopics() Put Method Called........!!!!");
		topicService.updateTopic(topic, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topic_id}")
	public void deleteTopic(@PathVariable String topic_id) {
		logger.debug("deleteTopic () Delete Method Called......!!!!");
		topicService.deleteTopic(topic_id);
	}

}
