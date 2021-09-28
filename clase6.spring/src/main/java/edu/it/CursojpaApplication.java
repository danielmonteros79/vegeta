package edu.it;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursojpaApplication {
    private static Logger logger = Logger.getLogger(CursojpaApplication.class);
    public static void main(String[] args) {
        logger.info("Levantando la app en spring boot");
        SpringApplication.run(CursojpaApplication.class, args);
    }
}
