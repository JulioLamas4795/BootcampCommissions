package com.commission.service;

import com.commission.repository.CommissionRepository;
import com.commission.util.AppUtils;
import com.commission.bean.Commission;
import com.commission.dto.CommissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CommissionServiceImpl implements CommissionService{

    @Autowired
    private CommissionRepository commissionRepository;

    public Flux<Commission> findAllCommission(){
        return commissionRepository.findAll();
    }

    public Mono<Commission> findByIdCommission(String id){
        return commissionRepository.findById(id);
    }

    public Mono<Commission> saveCommission(Commission commission){
        return commissionRepository.save(commission);
    }

    public Mono<CommissionDto> updateCommission(Mono<CommissionDto> commissionDtoMono, String id){
        return commissionRepository.findById(id)
                .flatMap(p -> commissionDtoMono.map(AppUtils::dtoToEntity)
                        .doOnNext(e -> e.setId(id)))
                .flatMap(commissionRepository::save)
                .map(AppUtils::entityToDto);
    }

    public Mono<Void> deleteByIdCommission(String id){
        return commissionRepository.deleteById(id);
    }






}
