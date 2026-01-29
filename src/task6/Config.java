package task6;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Config implements Serializable {
    private static volatile Config instance;
    private Config() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance()!");
        }
    }
    public static Config getInstance() {
        if (instance == null) {
            synchronized (Config.class) {
                if (instance == null) {
                    instance = new Config();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
    private String appName = "MyApp";

    public String getAppName() {
        return appName;
    }
}
