package FileHandaling.C_PropertiesFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        properties.setProperty("Name","Aditya");
        properties.setProperty("Email","abc@gmail.com");
        properties.setProperty("Age","21");

        String filePath = System.getProperty("user.dir")+"\\data\\example.properties";

        FileOutputStream file = new FileOutputStream(filePath);
        properties.store(file,"Sample data in properties file...");
        file.close();

        System.out.println("Properties have been written into "+filePath);
    }
}
