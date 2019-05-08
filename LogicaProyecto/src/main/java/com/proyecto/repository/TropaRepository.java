package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.modelo.Unidad;
@Repository
public interface TropaRepository extends CrudRepository<Unidad, Long> {

}
