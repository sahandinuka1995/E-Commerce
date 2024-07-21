package com.projectexample.Proexsample.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StanderdResponse {

    private int status;
    private Object data;
    private String message;
    private boolean success;
    
}
