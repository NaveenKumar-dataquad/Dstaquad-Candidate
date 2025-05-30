package com.profile.candidate.repository;

import com.profile.candidate.model.PlacementDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PlacementRepository extends JpaRepository<PlacementDetails, String> {
    boolean existsByCandidateEmailId(String candidateEmailId);
    boolean existsByCandidateContactNo(String candidateContactNo);
    boolean existsByInterviewId(String interviewId);

    @Query(value = "SELECT " +
            "(SELECT COUNT(*) FROM requirements_model) AS requirementsCount, " +
            "(SELECT COUNT(*) FROM candidates) AS candidatesCount, " +
            "(SELECT COUNT(*) FROM bdm_client) AS clientsCount, " +
            "(SELECT COUNT(*) FROM placements) AS placementsCount, " +
            "(SELECT COUNT(*) FROM bench_details) AS benchCount, " +
            "(SELECT COUNT(*) FROM user_details) AS usersCount, " +
            "(SELECT COUNT(*) FROM candidates WHERE interview_date_time IS NOT NULL) AS interviewsCount",
            nativeQuery = true)
    Object getAllCounts();

    @Query(value = "SELECT " +
            "(SELECT COUNT(*) FROM requirements_model WHERE requirement_added_time_stamp BETWEEN :startDate AND :endDate) AS requirementsCount, " +
            "(SELECT COUNT(*) FROM candidate_submissions WHERE submitted_at BETWEEN :startDate AND :endDate) AS candidatesCount, " +
            "(SELECT COUNT(*) FROM bdm_client WHERE created_at BETWEEN :startDate AND :endDate) AS clientsCount, " +
            "(SELECT COUNT(*) FROM placements WHERE created_at BETWEEN :startDate AND :endDate) AS placementsCount, " +
            "(SELECT COUNT(*) FROM bench_details WHERE created_date BETWEEN :startDate AND :endDate) AS benchCount, " +
            "(SELECT COUNT(*) FROM user_details WHERE created_at BETWEEN :startDate AND :endDate) AS usersCount, " +
            "(SELECT COUNT(*) FROM interview_details WHERE timestamp BETWEEN :startDate AND :endDate) AS interviewsCount",
            nativeQuery = true)
    Object getAllCountsByDateRange(@Param("startDate") LocalDateTime startDate,
                                   @Param("endDate") LocalDateTime endDate);

    @Query("SELECT p FROM PlacementDetails p WHERE p.createdAt BETWEEN :startDate AND :endDate")
    List<PlacementDetails> findPlacementsByCreatedAtBetween(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );


}
