package com.Ritu.EducationWebsite.ExceptionPractice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse1 {
    private String reason;
    private String SuggestedSolution;
}
