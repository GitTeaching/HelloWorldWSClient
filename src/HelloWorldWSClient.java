import org.soa.ws.tp2.HelloWorld;
import org.soa.ws.tp2.HelloWorldImplService;


public class HelloWorldWSClient {

	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld hello = service.getHelloWorldImplPort();
		System.out.println(hello.makeHello("JAX-WS"));
	}
}
