package com.trustbit.truckagent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckState {
    private int uid;
    private double balance;
    private String loc;
    @JsonProperty("driving_non_stop")
    private double drivingNonStop;
    private double time;
}
