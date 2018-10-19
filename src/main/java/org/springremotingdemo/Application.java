package org.springremotingdemo;

/**
 * Hello world!
 *
 */


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@SpringBootApplication
public class Application {
    
    Logger log = Logger.getLogger(Application.class);
    
    @Bean
    public GreetingServiceImpl greetingServiceImpl() {
        log.info("Creating GreetingServiceImpl bean");
        return new GreetingServiceImpl();
    }

    @Bean(name="/greetingService")
    public HttpInvokerServiceExporter greetingExporter() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(greetingServiceImpl());
        exporter.setServiceInterface(GreetingService.class);
        return exporter;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
