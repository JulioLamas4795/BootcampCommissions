package com.example.demo.repository;

import com.example.demo.bean.Commission;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface CommissionRepository extends ReactiveMongoRepository<Commission, String> {
}
