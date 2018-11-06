package com.Ritu.EducationWebsite.ExceptionPractice;


import com.Ritu.EducationWebsite.Topic.TopicController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(assignableTypes = {TopicController.class})
public class ExceptionAdvice {

    @ExceptionHandler(CustomException1.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse1 getMsg1(CustomException1 e){
        return new ErrorResponse1(" reason - CustomException1", "solution - CustomException1");
    }

    @ExceptionHandler(CustomException2.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse1 getMsg2(CustomException2 e){
        return new ErrorResponse1(" reason - CustomException2", "solution - CustomException2");
    }
}
