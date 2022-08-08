package com.connector.iirsAnalysis.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ValidTargetResponse {
    private String respCode;
    private ValidTargetResponseRespData respData;
}