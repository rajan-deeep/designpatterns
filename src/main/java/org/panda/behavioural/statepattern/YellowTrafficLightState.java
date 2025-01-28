package org.panda.behavioural.statepattern;

public class YellowTrafficLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext trafficLightContext) {
        System.out.println("Yellow light running");
        trafficLightContext.setTrafficLightState(new RedTrafficLightState());
    }
}
