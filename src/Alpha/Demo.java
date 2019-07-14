package Alpha;
import org.apache.logging.log4j.*;
public class Demo {
	static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
	log.debug("This is debuging message");	
		
	log.error("this is error message");	
	}

}
