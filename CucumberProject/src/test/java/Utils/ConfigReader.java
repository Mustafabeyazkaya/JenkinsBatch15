package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    public static Properties readTheData() {
        try {
            FileInputStream fileInputStream = new FileInputStream(Constants.path_Properties_File);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
    public static String getValueOfProperties(String word){
        return properties.getProperty(word);
    }
}
