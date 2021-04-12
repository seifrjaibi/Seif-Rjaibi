package tn.esprit.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.Assurance;

public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

}
