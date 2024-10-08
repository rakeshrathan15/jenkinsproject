package com.neoteric.docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping(value = "/api/docker")
    public String getHelloWorld(){
        return "Hello  jenkins";
    }

}
