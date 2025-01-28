package org.panda.behavioural.statepattern;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;

    public TrafficLightContext() {
        this.trafficLightState = new RedTrafficLightState();
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void handle() {
        trafficLightState.handleRequest(this);
    }

}
