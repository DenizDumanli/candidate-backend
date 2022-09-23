package com.candidate.service;

import com.candidate.model.dto.CandidateDto;

import java.util.List;

public interface CandidateServiceInterface {

    List<CandidateDto> getCandidates();

    CandidateDto getCandidate(long id);

    CandidateDto createCandidate(CandidateDto candidateDto);

    CandidateDto updateCandidate(CandidateDto candidateDto);

    CandidateDto deleteCandidate(long id);

    List<CandidateDto> getCoursesByCourseName(String name);

}
