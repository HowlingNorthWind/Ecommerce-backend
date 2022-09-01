package com.jingzeliu.ecommerce.service;

import com.jingzeliu.ecommerce.dto.Purchase;
import com.jingzeliu.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
