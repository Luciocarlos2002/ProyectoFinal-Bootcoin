package com.microservice.repository;

import com.microservice.model.Bootcoin;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootcoinRepository extends ReactiveCrudRepository<Bootcoin, String> {
}
