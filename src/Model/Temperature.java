package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Temperature(double latitude, Daily daily, DailyUnits daily_units) {}