package com.ani.belajarspringdasar.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.ani.belajarspringdasar.spring.core.configuration.BarConfiguration;
import com.ani.belajarspringdasar.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
