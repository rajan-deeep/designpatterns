package org.panda.behavioural.commandpattern;

import java.util.List;

public class Invoker {

    private List<Receiver> receivers;

    private RequestContext requestContext;

    public Invoker(List<Receiver> receivers, RequestContext requestContext) {
        this.receivers = receivers;
        this.requestContext = requestContext;
    }

    public void run() {
        for (Receiver receiver : receivers) {
            receiver.execute(requestContext);
        }
    }
}
