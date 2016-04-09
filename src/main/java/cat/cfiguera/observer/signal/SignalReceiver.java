package cat.cfiguera.observer.signal;

import sun.misc.Signal;
import sun.misc.SignalHandler;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SignalReceiver {

    private static final String SIGNAL = "TERM";

    @Inject
    Event<SignalEvent> events;

    @PostConstruct
    public void postConstruct() {
        Signal.handle(new Signal(SIGNAL), new SignalHandler() {
            public void handle(Signal sig) {
                System.out.println("SIGTERM received!");
                events.fire(new SignalEvent(SIGNAL));
            }
        });
    }
}
