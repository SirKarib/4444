package server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @GetMapping("/serv")
    String serv(@RequestParam String text) {
        logger.info(text);
        return text;
    }

    private static Logger logger = LoggerFactory.getLogger(Server.class);
}
