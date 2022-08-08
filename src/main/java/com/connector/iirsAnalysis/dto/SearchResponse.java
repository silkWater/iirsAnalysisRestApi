package com.connector.iirsAnalysis.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SearchResponse {
    private String respCode;
    private SearchResponseRespData respData;
}