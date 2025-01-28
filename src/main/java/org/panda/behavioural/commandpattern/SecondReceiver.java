package org.panda.behavioural.commandpattern;

public class SecondReceiver implements Receiver{
    @Override
    public void execute(RequestContext requestContext) {
        System.out.println("Running second receiver for requestId " + requestContext.getRequestId());
    }
}
