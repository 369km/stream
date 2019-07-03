package com.fudo.stream.controller;

import com.fudo.stream.output.NewsOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutputController {
    @Autowired
    private NewsOutputService newsOutputService;

    @GetMapping("/{request}")
    public void send(@PathVariable(value = "request") String request) {
        newsOutputService.send(request);
    }
}
