import logic.Parser;
import org.slf4j.Logger;
import util.Files;
import util.PropertyManager;

public class Runner {
    public static void main(String[] args) {
        Logger logger = org.slf4j.LoggerFactory.getLogger(Runner.class);
        String textString = Files.getText();
        PropertyManager propertyManager = new PropertyManager("components.properties");
        logger.info(String.valueOf(propertyManager.stringPropertyNames()));


        Parser parser = new Parser();
        parser.configure(propertyManager);
        parser.parse(textString);
    }

}
