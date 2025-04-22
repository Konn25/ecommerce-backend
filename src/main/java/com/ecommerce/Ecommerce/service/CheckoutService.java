package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.dto.Purchase;
import com.ecommerce.Ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
