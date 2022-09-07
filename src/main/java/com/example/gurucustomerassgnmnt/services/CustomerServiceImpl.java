package com.example.gurucustomerassgnmnt.services;

import com.example.gurucustomerassgnmnt.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Xolani Delman")
                .cellNumber("0731234567")
                .build();
    }
}
