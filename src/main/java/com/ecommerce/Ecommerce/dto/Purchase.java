package com.ecommerce.Ecommerce.dto;


import com.ecommerce.Ecommerce.entity.Address;
import com.ecommerce.Ecommerce.entity.Customer;
import com.ecommerce.Ecommerce.entity.Order;
import com.ecommerce.Ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address billingAddress;

    private Address shippingAddress;

    private Order order;

    private Set<OrderItem> orderItems;


}
