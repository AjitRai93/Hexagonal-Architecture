package com.hexagonal.arch.config;

import com.hexagonal.arch.domain.port.output.OrderRepositoryPort;
import com.hexagonal.arch.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    public OrderService orderService(OrderRepositoryPort repository) {
        return new OrderService(repository);
    }
}
