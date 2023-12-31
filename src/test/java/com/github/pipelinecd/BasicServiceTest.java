package com.github.pipelinecd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicServiceTest {

    private final BasicService basicService = new BasicService();

    @Test
    void should_return_helloWorld() {
        //given
        String result = basicService.returnHelloWorld();

        //when

        //then
        String expected = "Hello World";
        assertEquals(result, expected);
    }
}
