package org.acme;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@DenyAll
public interface FruitsRepository extends CrudRepository<Fruit, Long> {
    @Override
//    @RestResource
    @PermitAll
    Iterable<Fruit> findAll();
}
