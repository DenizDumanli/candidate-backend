package com.candidate.model.dto;

import com.candidate.model.entity.Candidate;
import lombok.Data;

@Data
public class CandidateDto {

    private long id;
    private String name;
    private String surname;
    private String email;
    private String notes;
    private String status;

    public Candidate toCandidate(){
        Candidate candidate = new Candidate();
        candidate.setId(this.getId());
        candidate.setName(this.getSurname());
        candidate.setSurname(this.getSurname());
        candidate.setEmail(this.getEmail());
        candidate.setNotes(this.getNotes());
        candidate.setStatus(this.getStatus());
        return candidate;
    }

}
