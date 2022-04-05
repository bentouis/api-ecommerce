package com.bentouis.ecommerce.dto;

import com.bentouis.ecommerce.entity.Address;
import com.bentouis.ecommerce.entity.Customer;
import com.bentouis.ecommerce.entity.Order;
import com.bentouis.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.List;



@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;
}

