package com.commission.repository;

import com.commission.bean.Commission;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface CommissionRepository extends ReactiveMongoRepository<Commission, String> {
}
