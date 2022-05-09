package com.trustbit.truckagent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorldInfo {
    private List<Location> locations;
    @JsonProperty("fuel_cost")
    private double fuelCost;
}
