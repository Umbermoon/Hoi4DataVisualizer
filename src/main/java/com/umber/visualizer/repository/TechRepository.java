package com.umber.visualizer.repository;

import com.umber.visualizer.entity.TechnologyEntity;
import org.springframework.data.repository.CrudRepository;

public interface TechRepository extends CrudRepository<TechnologyEntity, Integer> {
}
