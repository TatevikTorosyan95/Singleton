package com.picsart;

import java.io.Serializable;

public class ConnectionConfig implements Serializable {

    private static ConnectionConfig instance;

    private ConnectionConfig() {

    }

    protected Object readResolve() {
        return instance;
    }

    public static synchronized ConnectionConfig getInstance() {
        if (instance == null) {
            synchronized (ConnectionConfig.class) {
                if (instance == null) {
                    instance = new ConnectionConfig();
                }
            }
        }
        return instance;
    }
}
