/**
 * Created by chenxinyue on 2016/3/16.
 */
public class Application {
    @Configuration
    @ComponentScan
    @EnableAutoConfiguration
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class);
        }
    }
}
