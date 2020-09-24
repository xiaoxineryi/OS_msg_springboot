package com.kaito;

import com.kaito.RunnableThread.DispatchThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebsocketApplication.class, args);
        new DispatchThread().start();
    }

}
