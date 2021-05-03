package com.jersey.test.jerseyRestApi.config.controller;

import com.jersey.test.jerseyRestApi.controller.HelloController;
import com.jersey.test.jerseyRestApi.controller.TestController;

import java.util.Set;

public class ControllerRegistration {

    public static final Set<Class<?>> HELLO_CONTROLLERS = Set.of(
            HelloController.class,
            TestController.class
    );

}
