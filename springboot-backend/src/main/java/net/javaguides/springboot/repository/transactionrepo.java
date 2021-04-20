package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.bank_transaction;

@Repository
public interface transactionrepo extends JpaRepository<bank_transaction, Long>{
	
}
