package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    public static void readProperties(){
        try {
            FileInputStream fileInputStream=new FileInputStream(Constants.propertiesFile_Path);
            prop=new Properties();
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperties(String key){
      return  prop.getProperty(key);
    }
}
