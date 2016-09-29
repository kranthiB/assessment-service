package com.prokarma.service.impl;

import com.prokarma.dto.AssessmentDto;
import com.prokarma.mongo.repositories.IAssessmentRepository;
import com.prokarma.service.IAssessmentService;

import java.util.List;

/**
 * Created by bkranthi on 29-09-2016.
 */
public class AssessmentServiceImpl implements IAssessmentService {


    IAssessmentRepository assessmentRepository;

    public AssessmentServiceImpl(IAssessmentRepository assessmentRepository) {
        this.assessmentRepository = assessmentRepository;
    }

    @Override
    public List<AssessmentDto> getAssessments() {
        return assessmentRepository.findAll();
    }

    @Override
    public void addAssessment(AssessmentDto assessmentDto) {
        assessmentRepository.save(assessmentDto);
    }

    @Override
    public void deleteAssessment(String id) {
        assessmentRepository.delete(id);
    }
}
