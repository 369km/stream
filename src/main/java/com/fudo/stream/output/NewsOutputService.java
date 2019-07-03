package com.fudo.stream.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(NewsOutput.class)
public class NewsOutputService {
    @Autowired
    private NewsOutput newsOutput;

    public void send(String request) {
        newsOutput.output().send(MessageBuilder.withPayload(request).build());
    }
}
