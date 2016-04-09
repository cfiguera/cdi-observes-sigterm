package cat.cfiguera.observer.signal;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.ejb.embeddable.EJBContainer;

public class AbstractTest {

    private static EJBContainer container;

    @BeforeClass
    public static void start() {
        container = EJBContainer.createEJBContainer();
    }

    @Before
    public void config() throws Exception {
        container.getContext().bind("inject", this);
    }

    @AfterClass
    public static void stop() {
        container.close();
    }
}
