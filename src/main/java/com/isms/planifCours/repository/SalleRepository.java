package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Salle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends CrudRepository<Salle,Long> {
}
