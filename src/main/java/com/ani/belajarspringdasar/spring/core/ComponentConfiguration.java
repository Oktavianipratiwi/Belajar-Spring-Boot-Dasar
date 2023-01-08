package com.ani.belajarspringdasar.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.ani.belajarspringdasar.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "programmerzamannow.spring.core.repository",
    "programmerzamannow.spring.core.service",
    "programmerzamannow.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
