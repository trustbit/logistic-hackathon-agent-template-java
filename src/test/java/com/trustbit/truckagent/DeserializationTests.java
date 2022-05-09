package com.trustbit.truckagent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trustbit.truckagent.model.DecideRequest;
import com.trustbit.truckagent.model.WorldInfo;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@JsonTest
public class DeserializationTests {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testDecideRequest() throws IOException, JSONException {
        var jsonContent = new String(DeserializationTests.class.getResourceAsStream("/decide.json").readAllBytes());
        var decideRequest = objectMapper.readValue(jsonContent, DecideRequest.class);

        assertEquals(jsonContent, objectMapper.writeValueAsString(decideRequest), JSONCompareMode.STRICT);
    }

    @Test
    public void testWorldInfo() throws IOException, JSONException {
        var jsonContent = new String(DeserializationTests.class.getResourceAsStream("/world.json").readAllBytes());
        var decideRequest = objectMapper.readValue(jsonContent, WorldInfo.class);

        assertEquals(jsonContent, objectMapper.writeValueAsString(decideRequest), JSONCompareMode.STRICT);
    }
}
