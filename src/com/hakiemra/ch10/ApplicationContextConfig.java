package com.hakiemra.ch10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/hakiemra/ch10/MyApp.properties")
public class ApplicationContextConfig {
    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }

    @Bean
    public FortuneService randomFortuneService() {
        return new RandomFortuneService();
    }
}
