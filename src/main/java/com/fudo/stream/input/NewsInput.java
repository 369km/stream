package com.fudo.stream.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface NewsInput {
    String INPUT = "news-input";

    @Input(INPUT)
    SubscribableChannel input();
}
