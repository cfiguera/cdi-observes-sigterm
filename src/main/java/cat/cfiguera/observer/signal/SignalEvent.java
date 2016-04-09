package cat.cfiguera.observer.signal;

public class SignalEvent {

    private String signal;

    public SignalEvent(String signal) {
        this.signal = signal;
    }

    public String getSignal() {
        return signal;
    }
}