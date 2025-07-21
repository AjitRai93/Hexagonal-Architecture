package com.hexagonal.arch.domain.port.output;

import com.hexagonal.arch.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

    void saveOrder(FoodOrder order);
    String findById(String orderId);
}
