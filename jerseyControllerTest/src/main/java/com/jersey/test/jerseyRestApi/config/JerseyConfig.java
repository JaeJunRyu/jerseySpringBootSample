package com.jersey.test.jerseyRestApi.config;

import com.jersey.test.jerseyRestApi.config.controller.ControllerRegistration;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
//        register(HelloController.class);
        registerEndpoints();
    }


    private void registerEndpoints(){
        ControllerRegistration.HELLO_CONTROLLERS.forEach(c -> register(c));
    }

}
