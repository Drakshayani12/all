package com.example.Exception;

import java.security.Timestamp;
import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String message;
    private String detail;
    public ExceptionResponse(){

    }
    
    public ExceptionResponse(Date date2, String message, String detail) {
        this.date = date2;
        this.message = message;
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }
    public String getMessage() {
        return message;
    }
    public String getDetail() {
        return detail;
    }
    
}
