package org.panda.behavioural.commandpattern;

public class FirstReceiver implements Receiver{
    @Override
    public void execute(RequestContext requestContext) {
        System.out.println("Running first receiver for requestId " + requestContext.getRequestId());
    }
}
