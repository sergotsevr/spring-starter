package com.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@AllArgsConstructor
public class ErrorPrinter {

    private final String prefix;

    public ErrorPrinter(String prefix) {
        this.prefix = prefix;
    }

    public void printMessage(String message){
        log.error(prefix);
        log.error(message);
    }

}
