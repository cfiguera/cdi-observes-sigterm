package cat.cfiguera.observer.signal;

import javax.enterprise.event.Observes;
import javax.inject.Named;

@Named
public class SignalObserver {

    public void handlingSignal(@Observes SignalEvent event){
        System.out.println("Observed singal: " + event.getSignal());
        System.exit(0);
    }
}
