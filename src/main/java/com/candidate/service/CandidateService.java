package com.candidate.service;

import com.candidate.model.dto.CandidateDto;
import com.candidate.model.entity.Candidate;
import com.candidate.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class CandidateService implements CandidateServiceInterface {

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public List<CandidateDto> getCandidates() {
        return candidateRepository.findAll().stream().map(Candidate::toCandidateDto).collect(Collectors.toList());
    }

    @Override
    public CandidateDto getCandidate(long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);

        return candidate.get().toCandidateDto();
    }

    @Override
    public CandidateDto createCandidate(CandidateDto candidate) {

        Candidate createdCandidate = candidateRepository.save(candidate.toCandidate());
        return createdCandidate.toCandidateDto();
    }

    @Override
    public CandidateDto updateCandidate(CandidateDto candidateDto, long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        candidateDto.setId(id);
        if (candidate.isPresent()) {
            Candidate updatedCandidate = candidateRepository.save(candidateDto.toCandidate());
            return updatedCandidate.toCandidateDto();
        } else {
            return null;
        }
    }

    @Override
    public CandidateDto deleteCandidate(long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        if (candidate.isPresent()) {
            Candidate tobedeletedCandidate = candidate.get();
            candidateRepository.delete(tobedeletedCandidate);
            return tobedeletedCandidate.toCandidateDto();
        } else
            return null;
    }

}
