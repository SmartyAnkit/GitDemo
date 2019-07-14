package Beta;
import org.apache.logging.log4j.*;
public class Demo1 {
	static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
	log.debug("This is debuging message");	
		
	log.error("this is error message in Demo1");	
	}

}
