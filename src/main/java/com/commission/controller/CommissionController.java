package com.commission.controller;

import com.commission.bean.Commission;
import com.commission.dto.CommissionDto;
import com.commission.service.CommissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/api/commission")
public class CommissionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionController.class);


    @Resource
    private CommissionService commissionService;


    @GetMapping("/")
    public Flux<Commission> findAllCommission(){
        LOGGER.debug("Getting commission!");
        return commissionService.findAllCommission();
    }


    @GetMapping("/{id}")
    public Mono<Commission> findByIdCommission(@PathVariable String id){
        LOGGER.debug("Getting a particular commission!");
        return commissionService.findByIdCommission(id);
    }

    @PostMapping("/create")
    public Mono<Commission> saveCommission(@RequestBody Commission commission){
        LOGGER.debug("Saving commission!");
        return commissionService.saveCommission(commission);
    }

    @PutMapping("/{id}")
    public Mono<CommissionDto> updateCommission(@RequestBody Mono<CommissionDto> commissionDtoMono, @PathVariable String id){
        LOGGER.debug("Updating commission!");
        return commissionService.updateCommission(commissionDtoMono,id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteByIdCommission(@PathVariable String id){
        LOGGER.debug("Deleting commission!");
        return commissionService.deleteByIdCommission(id);
    }



}
