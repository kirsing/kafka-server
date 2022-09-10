package com.example.mykafkaserver;

import com.example.mykafkaserver.model.User;
import com.example.mykafkaserver.producer.KafkaJsonProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final KafkaJsonProducer jsonProducer;

    public CommandLineAppStartupRunner(KafkaJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        jsonProducer.sendMessage(new User("Larry"));
        jsonProducer.sendMessage(new User("The Edge"));
        jsonProducer.sendMessage(new User("Charly"));
    }
}