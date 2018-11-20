package net.bbelovic.playground;

import org.junit.jupiter.api.Test;

class JavaActionExecutorTest {

    @Test
    void should_execute_action() {
        JavaActionExecutor javaActionExecutor = new JavaActionExecutor();
        javaActionExecutor.executeAction(()-> {
            System.out.println("java");
            System.err.println("java");
        });
    }
}