import org.openqa.selenium.Proxy;
import org.zaproxy.clientapi.core.ClientApi;


public class ZapTest {

    //Initializing client api
    private static ClientApi clientApi;

    //proxy will be needed in our test class when we will be doing our driver setup
    public static Proxy proxy;

    private static final String zapAddress = "127.0.0.1";
    private static final int zapPort = 8080;
    private static String apiKey = "urngcgqhpqlmj3h4r8d2htvtks";

    static {
        clientApi=new ClientApi(zapAddress,zapPort,apiKey);
        proxy=new Proxy().setSslProxy(zapAddress+":"+zapPort).setHttpProxy(zapAddress+":"+zapPort);
    }
}
