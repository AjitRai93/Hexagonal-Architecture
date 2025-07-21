package com.hexagonal.arch.adapter.output.repository;

import com.hexagonal.arch.domain.dto.FoodOrder;
import com.hexagonal.arch.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {

    // inject mongo repository

    @Override
    public void saveOrder(FoodOrder order) {

    }

    @Override
    public String findById(String orderId) {
        return "";
    }
}
