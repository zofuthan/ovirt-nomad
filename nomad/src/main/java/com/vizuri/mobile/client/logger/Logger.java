package com.vizuri.mobile.client.logger;

public interface Logger {
    public void info(String message);

    public void warn(String message);

    public void error(String message);

    public void debug(String message);
}
