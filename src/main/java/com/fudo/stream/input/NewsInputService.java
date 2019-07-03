package com.fudo.stream.input;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(value = {NewsInput.class})
public class NewsInputService {
    @StreamListener(NewsInput.INPUT)
    public void receive(Object o) {
        System.out.println(o);
    }
}
