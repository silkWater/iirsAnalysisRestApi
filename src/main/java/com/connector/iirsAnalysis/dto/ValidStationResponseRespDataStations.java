package com.connector.iirsAnalysis.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ValidStationResponseRespDataStations {
    private String callSign;
    private String service;
}