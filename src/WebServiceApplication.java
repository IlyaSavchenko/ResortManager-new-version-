import com.sun.jersey.api.core.PackagesResourceConfig;

/**
 * Created with IntelliJ IDEA.
 * User: ilyasavchenko
 * Date: 30.11.13
 * Time: 0:44
 * To change this template use File | Settings | File Templates.
 */
public class WebServiceApplication extends PackagesResourceConfig {

    public WebServiceApplication() {
        super("resortmanager.webservice.service.handlers");
    }
}
