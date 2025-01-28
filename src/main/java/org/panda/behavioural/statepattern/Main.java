package org.panda.behavioural.statepattern;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();

        trafficLightContext.handle();
        trafficLightContext.handle();
        trafficLightContext.handle();
        trafficLightContext.handle();
        trafficLightContext.handle();
        trafficLightContext.handle();
    }
}
