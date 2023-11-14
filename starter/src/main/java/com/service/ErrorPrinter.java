package com.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@AllArgsConstructor
public class ErrorPrinter {

    //private final StarterConfig config;
//    public void printMessage(String message){
//        log.error("Alarm");
//        log.error(message);
//        log.error(config.message());
//    }
    public void printMessage(String message){
        log.error("Alarm");
        log.error(message);
    }
}
