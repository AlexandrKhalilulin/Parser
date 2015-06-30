package com.epam.ak;

import com.epam.ak.parser.Parser;
import com.epam.ak.util.Files;
import com.epam.ak.util.PropertyManager;
import org.slf4j.Logger;

public class Runner {
    public static void main(String[] args) {
        Logger logger = org.slf4j.LoggerFactory.getLogger(Runner.class);
        String textString = Files.getText();
        PropertyManager propertyManager = new PropertyManager("components.properties");

        Parser parser = new Parser();
        parser.configure(propertyManager);
        parser.parse(textString);
    }

}
