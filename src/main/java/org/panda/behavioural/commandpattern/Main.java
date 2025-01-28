package org.panda.behavioural.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Receiver firstReceiver = new FirstReceiver();
        Receiver secondReceiver = new SecondReceiver();
        List<Receiver> receivers = new ArrayList<>();
        receivers.add(firstReceiver);
        receivers.add(secondReceiver);

        Invoker invoker = new Invoker(receivers, new RequestContext("123"));
        invoker.run();
    }
}
