package com.jersey.test.jerseyRestApi.config;

import com.jersey.test.jerseyRestApi.controller.HelloController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloController.class);
    }
}
