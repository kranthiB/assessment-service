package com.prokarma.config;

import com.prokarma.controller.AssessmentController;
import com.prokarma.mongo.repositories.IAssessmentRepository;
import com.prokarma.service.IAssessmentService;
import com.prokarma.service.impl.AssessmentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 10-07-2016.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public AssessmentController assessmentController(IAssessmentService assessmentService) {
        return new AssessmentController(assessmentService);
    }

    @Bean
    public IAssessmentService assessmentService(IAssessmentRepository assessmentRepository) {
        return new AssessmentServiceImpl(assessmentRepository);
    }

}
