package Montye2eExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class load the properties file
 */
public class LoadProp extends BasePage {

    static Properties prop;

    static FileInputStream fileInputStream;

    public String getProperty(String key)
    {
        prop= new Properties();

        try {
            fileInputStream = new FileInputStream("src\\test\\Resources\\config.properties");
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
