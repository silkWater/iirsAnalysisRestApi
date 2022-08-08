package com.connector.iirsAnalysis.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ValidStationResponse {
    private String respCode;
    private ValidStationResponseRespData respData;
}