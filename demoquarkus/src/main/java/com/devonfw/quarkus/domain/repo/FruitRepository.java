package com.devonfw.quarkus.domain.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.devonfw.quarkus.domain.model.Fruit;

public interface FruitRepository extends CassandraRepository<Fruit, Long> {

	// List<Fruit> findByColor(String color);
}
