package com.hakiemra.ch10;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hakiemra.ch10")
@PropertySource("classpath:com/hakiemra/ch10/MyApp.properties")
public class ApplicationContextConfig {

}
