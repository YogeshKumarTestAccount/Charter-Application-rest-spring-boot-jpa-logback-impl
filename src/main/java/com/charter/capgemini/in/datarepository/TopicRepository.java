package com.charter.capgemini.in.datarepository;

import org.springframework.data.repository.CrudRepository;

import com.charter.capgemini.in.model.RelatedTopic;

public interface TopicRepository extends CrudRepository<RelatedTopic, String> {

}
