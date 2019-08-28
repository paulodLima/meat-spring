package com.meat.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meat.api.model.Restaurants;

public interface RestaurantsRepository extends JpaRepository<Restaurants, Long>{

}
