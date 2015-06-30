package com.epam.ak.parser;

import com.epam.ak.util.PropertyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    Logger logger = LoggerFactory.getLogger(Parser.class);
    Map<String, String> borderRegexes = new HashMap<>();
    Map<String, String> matchesRegexes = new HashMap<>();
    Map<String, String> splitRegexes = new HashMap<>();
    Map<String, List<String>> structure = new HashMap<>();

    public void parse(String textString) {
    }

    public void configure(PropertyManager pm) {
        borderRegexes = pm.getPropertiesWithSuffix("border");
        matchesRegexes = pm.getPropertiesWithSuffix("matches");
        splitRegexes = pm.getPropertiesWithSuffix("split");
        structure = pm.getStructure("contains");
    }
}
