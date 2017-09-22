package com.charter.capgemini.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "RelatedTopic")
public class RelatedTopic {

	@Id
	@Column(name="topic_id")
	private String id;
	@Column(name="topicName")
	private String topicName;
	@Column(name="topicDescription")
	private String topicDescription;

	public RelatedTopic() {
		// TODO Auto-generated constructor stub
	}

	public RelatedTopic(String id, String topicName, String topicDescription) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

}
