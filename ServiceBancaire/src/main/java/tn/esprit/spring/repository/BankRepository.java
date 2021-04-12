package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query("SELECT name FROM Bank")
    public List<String> getAllBankByNames();
    @Query("SELECT b FROM Bank b where b.name=:name")
    public List<Bank> getBankByNames(@Param("name")String name);
}
