package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monitor {
    private final String env;
    private final String hostname;
    private final String status;
    
    public Monitor(@JsonProperty("environment") String env, 
                @JsonProperty("name") String hostname,
                @JsonProperty("status") String status) {
        this.env = env;
        this.hostname = hostname;
        this.status = status;
    }
    public String getEnv() {
        return env;
    }
    public String getHostname() {
        return hostname;
    }
    public String getStatus() {
        return status;
    }
}
