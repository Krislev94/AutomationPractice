package com.framework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // 1. Create Properties object
    // make it private, so it's not accessible from outside of the class. We are limiting access to the object.
    // static is to make sure it is created and loaded before everything else.
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File is not found with given path!!");
            e.printStackTrace();
        }
    }



    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
