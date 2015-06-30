package com.epam.ak.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class PropertyManager {
    private final Properties properties;

    public PropertyManager(String fileName) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<String> stringPropertyNames() {
        return properties.stringPropertyNames();
    }

    public Map<String, String> getPropertiesWithSuffix(String suffix) {
        HashMap<String, String> map = new HashMap<>();
        Set entries = properties.entrySet();
        Set<Map.Entry<String, String>> set = entries;
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            if (key.startsWith(suffix)) {
                map.put(key.substring(suffix.length() + 1), entry.getValue());
            }
        }
        return map;
    }

    public Map<String, List<String>> getStructure(String suffix) {
        HashMap<String, List<String>> map = new HashMap<>();
        Set entries = properties.entrySet();
        Set<Map.Entry<String, String>> set = entries;
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.endsWith(suffix)) {
                String[] strings = value.split(", ?");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
                map.put(key.substring(0, key.indexOf(".")), list);
            }
        }
        return map;
    }

}
