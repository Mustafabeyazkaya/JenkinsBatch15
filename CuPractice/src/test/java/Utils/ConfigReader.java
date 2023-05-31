package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   static Properties prop;
    public static Properties readProperties(){
        try {
            FileInputStream fileInputStream= new FileInputStream("C:\\Users\\mbeya\\OneDrive\\Desktop\\demo\\CuPractice\\src\\test\\resources\\Config\\config.properties");
            prop=new Properties();
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
    public static String getValueFromProperties(String key){
        return prop.getProperty(key);
    }
}
