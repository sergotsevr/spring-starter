package src.main.java.com;

import com.service.ErrorPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import src.main.java.com.printer.Printer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(Application.class, args)){
            Printer printer = context.getBean(Printer.class);
            printer.printMessage("Hello spring!");
            ErrorPrinter errorPrinter = context.getBean(ErrorPrinter.class);
            errorPrinter.printMessage("Hello spring!");
        }
    }
}
