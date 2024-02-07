package com.example.demo.Exception;

import ch.qos.logback.core.encoder.EchoEncoder;

public class EmployeeNotFound extends Exception {
    public EmployeeNotFound(String str)
    {
        super(str);
    }
}
