package com.prokarma.service;

import com.prokarma.dto.AssessmentDto;

import java.util.List;

/**
 * Created by bkranthi on 29-09-2016.
 */
public interface IAssessmentService {

    List<AssessmentDto> getAssessments();

    void addAssessment(AssessmentDto assessmentDto);

    void deleteAssessment(String id);
}
