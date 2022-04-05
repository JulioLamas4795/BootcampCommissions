package com.commission.service;

import com.commission.bean.Commission;
import com.commission.dto.CommissionDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommissionService {

    public Flux<Commission> findAllCommission();

    public Mono<Commission> findByIdCommission(String id);

    public Mono<Commission> saveCommission(Commission commission);

    public Mono<CommissionDto> updateCommission(Mono<CommissionDto> commissionDtoMono, String id);

    public Mono<Void> deleteByIdCommission(String id);

}
