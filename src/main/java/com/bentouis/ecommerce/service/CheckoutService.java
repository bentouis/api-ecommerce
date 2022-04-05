package com.bentouis.ecommerce.service;

import com.bentouis.ecommerce.dto.Purchase;
import com.bentouis.ecommerce.dto.PurchaseResponse;



public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
