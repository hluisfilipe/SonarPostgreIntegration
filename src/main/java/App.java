import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

	private final static Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		LOGGER.log(Level.INFO, "My Message");

	}

}
