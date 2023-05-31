package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader extends CommonMethods {
    public static Properties properties;
    public static Properties readProperties(){
        try {
            FileInputStream file = new FileInputStream(Constants.PROPERTIES_FILE_PATH);
            properties=new Properties();
            properties.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
    public static String getValueOfProperties(String text){
        return properties.getProperty(text);
    }
}
