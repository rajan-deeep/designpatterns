package org.panda.behavioural.commandpattern;

public class RequestContext {
    private String requestId;

    public RequestContext(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
