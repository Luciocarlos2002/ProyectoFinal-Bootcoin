package com.microservice.service.impl;

import com.microservice.model.Bootcoin;
import com.microservice.response.BootcoinResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinServiceImpl {

    Flux<Bootcoin> getAllBootcoin();
    Flux<BootcoinResponse> getByNumberTransaction(String numberTransaction);
    Mono<Bootcoin> createBootcoin(Bootcoin bootcoin);

}
