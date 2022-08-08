package com.connector.iirsAnalysis.service;

import com.connector.iirsAnalysis.dto.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidResponseService {
    public ValidTargetResponse targetResponse(ValidTargetRequest validTargetRequest) {
        JSONObject target1 = new JSONObject();
        JSONObject target2 = new JSONObject();
        JSONObject target3 = new JSONObject();
        target1.put("0", "지리산");
        target2.put("1", "설악산");
        target3.put("2", "백두산");

        JSONArray targetArr = new JSONArray();
        targetArr.add(target1);
        targetArr.add(target2);
        targetArr.add(target3);

        ValidTargetResponseRespData respData = new ValidTargetResponseRespData();
        respData.setRespId(validTargetRequest.getReqId());
        respData.setTarget(targetArr);

        return ValidTargetResponse.builder()
                .respCode("OK-200")
                .respData(respData)
                .build();
    }

    public ValidStationResponse stationsResponse(ValidStationRequest validStationRequest) {
        ValidStationResponseRespData respData = new ValidStationResponseRespData();
        List<ValidStationResponseRespDataStations> stations = new ArrayList<ValidStationResponseRespDataStations>();
        if (validStationRequest.getType() == 1) {
            for(int i = 0; i < validStationRequest.getStations().size(); i++)
            {
                ValidStationResponseRespDataStations station = ValidStationResponseRespDataStations.builder()
                        .callSign(validStationRequest.getStations().get(i).getCallSign())
                        .service("4G")
                        .build();
                stations.add(station);
            }
            respData.setStations(stations);
            respData.setRespId(validStationRequest.getReqId());
            respData.setCompany(validStationRequest.getCompany());
        }
        else {
            // type=2 (지번주소), type=3 (법정동주소)
        }

        return ValidStationResponse.builder()
                .respCode("OK-200")
                .respData(respData)
                .build();
    }
}