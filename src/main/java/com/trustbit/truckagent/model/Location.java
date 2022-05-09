package com.trustbit.truckagent.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Location {
    private String name;
    private Map<String, Double> roads;
}
