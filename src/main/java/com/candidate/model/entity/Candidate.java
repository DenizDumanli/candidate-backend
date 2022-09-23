package com.candidate.model.entity;

import com.candidate.model.dto.CandidateDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "notes", nullable = false)
    private String notes;

    @Column(name = "status", nullable = false)
    private String status;


    public CandidateDto toCandidateDto(){
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setId(this.getId());
        candidateDto.setName(this.getName());
        candidateDto.setSurname(this.getSurname());
        candidateDto.setEmail(this.getEmail());
        candidateDto.setNotes(this.getNotes());
        candidateDto.setStatus(this.getStatus());
        return candidateDto;
    }

}
