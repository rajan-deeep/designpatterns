package org.panda.behavioural.statepattern;

public class RedTrafficLightState implements TrafficLightState{

    @Override
    public void handleRequest(TrafficLightContext trafficLightContext) {
        System.out.println("red light running");
        trafficLightContext.setTrafficLightState(new GreenTrafficLightState());
    }
}
