package com.candidate.repository;

import com.candidate.model.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    @Query("select c from Candidate c where c.name=:name")
    List<Candidate> getCoursesByCourseName(String name);
}
