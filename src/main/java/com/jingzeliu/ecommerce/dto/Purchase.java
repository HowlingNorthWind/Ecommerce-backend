package com.jingzeliu.ecommerce.dto;

import com.jingzeliu.ecommerce.entity.Address;
import com.jingzeliu.ecommerce.entity.Customer;
import com.jingzeliu.ecommerce.entity.Order;
import com.jingzeliu.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
