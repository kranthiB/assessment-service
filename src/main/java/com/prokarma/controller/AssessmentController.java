package com.prokarma.controller;

import com.prokarma.dto.AssessmentDto;
import com.prokarma.service.IAssessmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bkranthi on 29-09-2016.
 */
@RestController
@RequestMapping(value = "assessment")
@Api(value = "Assessment Controller", description = "This Controller is for the Assessment Service", tags = "Assessment Controller")
public class AssessmentController {

    private final IAssessmentService assessmentService;

    public AssessmentController(IAssessmentService assessmentService) {
        this.assessmentService = assessmentService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "This will be used to get all the Assessment Details")
    public List<AssessmentDto> getAssessments() {
        return assessmentService.getAssessments();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "This will be used to delete an assessment")
    public void deleteAssessment(@PathVariable String id) {
        assessmentService.deleteAssessment(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "This Will be used to save an assessment")
    public void addAssessment(@RequestBody final AssessmentDto assessmentDto) {
        assessmentService.addAssessment(assessmentDto);
    }
}
