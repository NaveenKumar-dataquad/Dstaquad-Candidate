package com.profile.candidate.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SubmissionsGetResponse {

    private String submissionId;

    private String candidateId;

    private String userId;

    private String fullName;

    private String candidateEmailId;

    private String contactNumber;

    private String currentOrganization;

    private String qualification;

    private float totalExperience;

    private float relevantExperience;

    private String currentCTC;

    private String expectedCTC;

    private String noticePeriod;

    private String currentLocation;

    private String jobId;

    private LocalDate profileReceivedDate;

    private String preferredLocation;

    // Change the skills field from List<String> to String
    private String skills;  // Now it's just a single string

    private String communicationSkills;

    private Double requiredTechnologiesRating;

    private String overallFeedback;

    private LocalDateTime submittedAt;


    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }
    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public LocalDate getProfileReceivedDate() {
        return profileReceivedDate;
    }

    public void setProfileReceivedDate(LocalDate profileReceivedDate) {
        this.profileReceivedDate = profileReceivedDate;
    }



    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCommunicationSkills() {
        return communicationSkills;
    }

    public void setCommunicationSkills(String communicationSkills) {
        this.communicationSkills = communicationSkills;
    }

    public Double getRequiredTechnologiesRating() {
        return requiredTechnologiesRating;
    }

    public void setRequiredTechnologiesRating(Double requiredTechnologiesRating) {
        this.requiredTechnologiesRating = requiredTechnologiesRating;
    }

    public String getOverallFeedback() {
        return overallFeedback;
    }

    public void setOverallFeedback(String overallFeedback) {
        this.overallFeedback = overallFeedback;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCandidateEmailId() {
        return candidateEmailId;
    }

    public void setCandidateEmailId(String candidateEmailId) {
        this.candidateEmailId = candidateEmailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCurrentOrganization() {
        return currentOrganization;
    }

    public void setCurrentOrganization(String currentOrganization) {
        this.currentOrganization = currentOrganization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(float totalExperience) {
        this.totalExperience = totalExperience;
    }

    public float getRelevantExperience() {
        return relevantExperience;
    }

    public void setRelevantExperience(float relevantExperience) {
        this.relevantExperience = relevantExperience;
    }

    public String getCurrentCTC() {
        return currentCTC;
    }

    public void setCurrentCTC(String currentCTC) {
        this.currentCTC = currentCTC;
    }

    public String getExpectedCTC() {
        return expectedCTC;
    }

    public void setExpectedCTC(String expectedCTC) {
        this.expectedCTC = expectedCTC;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
