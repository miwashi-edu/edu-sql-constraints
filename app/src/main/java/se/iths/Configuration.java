package se.iths;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    public static final String PROPERTIES_FILE_NAME = "application.properties";
    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    /**
     * Vi har skapat filen application.properties i ./src/java/resources eller ./rsc/test/resources
     * , då byggs den in i vår application och vi kan hitta den via ClassLoader.
     */
    public Configuration() {
        Properties prop = new Properties();
        try {
            prop.load(Configuration.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        dbUrl = prop.getProperty("db.url");
        dbUser = prop.getProperty("db.user");
        dbPassword = prop.getProperty("db.password");
    }

    public String toString(){
        StringBuffer buf = new StringBuffer("");
        buf.append("dbUser=");
        buf.append(dbUser);
        buf.append(", dbPassword=");
        buf.append(dbPassword);
        buf.append(", dbURL=");
        buf.append(dbUrl);
        return  buf.toString();
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
