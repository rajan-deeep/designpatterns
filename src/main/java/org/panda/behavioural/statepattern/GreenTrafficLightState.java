package org.panda.behavioural.statepattern;

public class GreenTrafficLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext trafficLightContext) {
        System.out.println("green light running");
        trafficLightContext.setTrafficLightState(new YellowTrafficLightState());
    }
}
