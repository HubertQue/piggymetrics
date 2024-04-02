package com.piggymetrics.account.repository.async;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.piggymetrics.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface AccountReactiveRepository extends ReactiveMongoRepository<Account, String> {

    Mono<Account> findByName(String name);
}