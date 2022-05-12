package com.trustbit.truckagent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trustbit.truckagent.model.DecideRequest;
import com.trustbit.truckagent.model.Location;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;
import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@JsonTest
public class DeserializationTests {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testDecideRequest() throws IOException, JSONException {
        var jsonContent = new String(DeserializationTests.class.getResourceAsStream("/sample_decide_0.json").readAllBytes());
        var decideRequest = objectMapper.readValue(jsonContent, DecideRequest.class);

        assertEquals(jsonContent, objectMapper.writeValueAsString(decideRequest), JSONCompareMode.STRICT);
    }
}
