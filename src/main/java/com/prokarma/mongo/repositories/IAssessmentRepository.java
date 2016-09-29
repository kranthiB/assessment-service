package com.prokarma.mongo.repositories;

import com.prokarma.dto.AssessmentDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bkranthi on 29-09-2016.
 */
@Repository(value = "assessmentRepository")
public interface IAssessmentRepository extends MongoRepository<AssessmentDto, String> {

}
