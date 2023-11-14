package src.main.java.com.printer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Printer {
    public void printMessage(String message){
        log.info(message);
    }
}
