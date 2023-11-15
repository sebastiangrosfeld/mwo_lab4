package com.github.pipelinecd;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public String returnHelloWorld() {
        return "Hello World";
    }
}
