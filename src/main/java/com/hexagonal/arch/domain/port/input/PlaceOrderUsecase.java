package com.hexagonal.arch.domain.port.input;

import com.hexagonal.arch.domain.dto.FoodOrder;

public interface PlaceOrderUsecase {

    void placeOrder(FoodOrder order);
}
