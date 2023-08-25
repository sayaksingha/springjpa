package com.tayana.dao;

import org.springframework.data.repository.CrudRepository;

import com.tayana.dto.CoronaVacine;

public interface ImplDao extends CrudRepository<CoronaVacine, Integer> {

}
