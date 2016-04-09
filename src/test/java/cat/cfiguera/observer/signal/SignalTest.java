package cat.cfiguera.observer.signal;

import org.apache.openejb.api.LocalClient;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.EJB;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import static org.junit.Assert.*;

@LocalClient
public class SignalTest extends AbstractTest {

    @Inject
    private SignalReceiver receiver;

    @Test
    public void test() throws InterruptedException {
        System.out.print("Waiting for user kill");
        for (int i=0; i<100; i++) {
            Thread.sleep(1000);
            System.out.print('.');
        }
    }
}
