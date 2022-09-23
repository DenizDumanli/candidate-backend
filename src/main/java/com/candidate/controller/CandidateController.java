package com.candidate.controller;

import com.candidate.model.dto.CandidateDto;
import com.candidate.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CandidateController {
    @Autowired
    CandidateService candidateService;

    @RequestMapping(value = "/candidate", method = RequestMethod.GET)
    public List<CandidateDto> getCourses() {
        return candidateService.getCandidates();
    }

    @RequestMapping(value = "/candidate/{id}", method = RequestMethod.GET)
    public CandidateDto getCourseById(@PathVariable long id) {
        return candidateService.getCandidate(id);
    }

    @RequestMapping(value = "/candidate", method = RequestMethod.POST)
    public CandidateDto createCourse(@RequestBody CandidateDto course) {
        return candidateService.createCandidate(course);
    }

    @RequestMapping(value = "/candidate", method = RequestMethod.PUT)
    public CandidateDto updateProduct(@RequestBody CandidateDto course) {
        return candidateService.updateCandidate(course);
    }

    @RequestMapping(value = "/candidate/{id}", method = RequestMethod.DELETE)
    public CandidateDto deleteProduct(@PathVariable long id) {
        return candidateService.deleteCandidate(id);
    }

    @RequestMapping(value = "/candidate/name/{name}", method = RequestMethod.GET)
    public List<CandidateDto> getCoursesByCourseName(@PathVariable String name) {
        return candidateService.getCoursesByCourseName(name);
    }
}
