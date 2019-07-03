package com.fudo.stream.output;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface NewsOutput {
    String OUTPUT = "news-output";

    @Output(OUTPUT)
    MessageChannel output();
}
