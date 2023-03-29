package org.crucial;

public class Url {
    private String protocol;
    private String host;
    Url(String str) {
        String[] buffer = str.split("://");
        this.protocol = buffer[0];
        this.host = buffer[1];
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getHost() {
        return this.host;
    }
}
