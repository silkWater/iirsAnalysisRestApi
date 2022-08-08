package com.connector.iirsAnalysis.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {
    private String errorCode;
    private String errorMsg;
    private String errorParam;
}