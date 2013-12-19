package test;

import junit.framework.Assert;
import org.junit.Test;
import resortmanager.webservice.service.handlers.ClientsHandler;

/**
 * Created with IntelliJ IDEA.
 * User: ilyasavchenko
 * Date: 19.12.13
 * Time: 4:19
 * To change this template use File | Settings | File Templates.
 */
public class FirstTest {

    @Test
    public void simple_add_test() {
        Assert.assertTrue(2+2 == 4);
    }

    @Test
    public void simple_login_test() {
        ClientsHandler clientsHandler = new ClientsHandler();
        Assert.assertTrue(clientsHandler.Auth("login","pass1")=="YES");
    }

    @Test
    public void simple_login_test1() {
        ClientsHandler clientsHandler = new ClientsHandler();
        Assert.assertTrue(clientsHandler.Auth("login","pass")=="YES");
    }

}
