package com.example.gurucustomerassgnmnt.services;

import com.example.gurucustomerassgnmnt.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
