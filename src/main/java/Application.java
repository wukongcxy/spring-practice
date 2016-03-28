import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenxinyue on 2016/3/16.
 */

    @Configuration
    @ComponentScan
    @EnableAutoConfiguration
    public class Application {
        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(Application.class);
            app.run(args);
        }
    }

