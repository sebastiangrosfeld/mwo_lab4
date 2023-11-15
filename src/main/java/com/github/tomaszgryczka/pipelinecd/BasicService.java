package com.github.tomaszgryczka.pipelinecd;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public String returnHelloWorld() {
        return "Hello World";
    }
}
