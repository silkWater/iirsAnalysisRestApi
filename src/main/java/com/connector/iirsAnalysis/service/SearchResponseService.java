package com.connector.iirsAnalysis.service;

import com.connector.iirsAnalysis.dto.SearchRequest;
import com.connector.iirsAnalysis.dto.SearchResponse;
import com.connector.iirsAnalysis.dto.SearchResponseRespData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SearchResponseService {
    public SearchResponse cidResponse(SearchRequest searchRequest) {
        JSONObject left = new JSONObject();
        JSONObject top = new JSONObject();
        JSONObject right = new JSONObject();
        JSONObject bottom = new JSONObject();
        left.put("left", 126.123456);
        top.put("top", 37.123456);
        right.put("right", 127.123456);
        bottom.put("bottom", 36.123456);

        JSONArray mapBoundaryArr = new JSONArray();
        mapBoundaryArr.add(left);
        mapBoundaryArr.add(top);
        mapBoundaryArr.add(right);
        mapBoundaryArr.add(bottom);

        JSONObject file0 = new JSONObject();
        JSONObject file1 = new JSONObject();
        file0.put("0", "example.kml");
        file1.put("1", "example.png");
        JSONArray filesArr = new JSONArray();
        filesArr.add(file0);
        filesArr.add(file1);

        SearchResponseRespData searchResponseRespData = SearchResponseRespData.builder()
                .respId(searchRequest.getReqId())
                .phone(searchRequest.getPhone())
                .reqType(searchRequest.getReqType())
                .mapBoundary(mapBoundaryArr)
                .files(filesArr)
                .build();

        return SearchResponse.builder()
                .respCode("OK-200")
                .respData(searchResponseRespData)
                .build();
    }
}