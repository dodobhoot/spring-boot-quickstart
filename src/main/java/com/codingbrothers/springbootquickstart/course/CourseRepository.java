package com.codingbrothers.springbootquickstart.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository <Course, String> {
    // For auto implementation give name as
    // findByProperty -> findByName
    // findByClassProperty -> findByTopicName
    List<Course> findByTopicId(String topicId);
}
