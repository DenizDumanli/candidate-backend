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
    public List<CandidateDto> getCandidates() {
        return candidateService.getCandidates();
    }

    @RequestMapping(value = "/candidate/{id}", method = RequestMethod.GET)
    public CandidateDto getCandidateById(@PathVariable long id) {
        return candidateService.getCandidate(id);
    }

    @RequestMapping(value = "/candidate", method = RequestMethod.POST)
    public CandidateDto createCandidate(@RequestBody CandidateDto candidate) {
        return candidateService.createCandidate(candidate);
    }

    @RequestMapping(value = "/candidate/{id}", method = RequestMethod.PUT)
    public CandidateDto updateCandidate(@RequestBody CandidateDto candidate, @PathVariable (value = "id") long id) {
        return candidateService.updateCandidate(candidate, id);
    }

    @RequestMapping(value = "/candidate/{id}", method = RequestMethod.DELETE)
    public CandidateDto deleteCandidate(@PathVariable long id) {
        return candidateService.deleteCandidate(id);
    }

//    @RequestMapping(value = "/candidate/name/{name}", method = RequestMethod.GET)
//    public List<CandidateDto> getcandidatesByCandidateName(@PathVariable String name) {
//        return candidateService.getcandidatesBycandidateName(name);
//    }
}
