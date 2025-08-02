package Model;

import java.util.ArrayList;

public record Daily(ArrayList<String> time, ArrayList<Integer> precipitation_probability_mean, ArrayList<Double> apparent_temperature_mean) {}