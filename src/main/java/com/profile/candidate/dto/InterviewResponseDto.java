package com.profile.candidate.dto;

import java.util.List;

public class InterviewResponseDto {

    private boolean success;
    private String message;
    private InterviewData data;
    private Object errors;  // Assuming you will have error details if any

    // Constructor
    public InterviewResponseDto(boolean success, String message, InterviewData data, Object errors) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.errors = errors;
    }

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InterviewData getData() {
        return data;
    }

    public void setData(InterviewData data) {
        this.data = data;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }
    // Static inner class to represent the payload
    public static class InterviewData {
        private String candidateId;
        private String userEmail;
        private String emailId;
        private List<String> clientEmail;

        // Constructor
        public InterviewData(String candidateId, String userEmail, String emailId, List<String> clientEmail) {
            this.candidateId = candidateId;
            this.userEmail = userEmail;
            this.emailId = emailId;
            this.clientEmail = clientEmail;
        }

        // Getters and Setters
        public String getCandidateId() {
            return candidateId;
        }

        public void setCandidateId(String candidateId) {
            this.candidateId = candidateId;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public List<String> getClientEmail() {
            return clientEmail;
        }
        public void setClientEmail(List<String> clientEmail) {
            this.clientEmail = clientEmail;
        }
        @Override
        public String toString() {
            return "InterviewPayload{" +
                    "candidateId='" + candidateId + '\'' +
                    ", userEmail='" + userEmail + '\'' +
                    ", emailId='" + emailId + '\'' +
                    ", clientEmail='" + clientEmail + '\'' +
                    '}';
        }
    }
}
