package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.repository.transactionrepo;
import net.javaguides.springboot.model.bank_transaction;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private transactionrepo transactionRepo;
	
	@Override
	public void run(String... args) throws Exception {
		this.transactionRepo.save(new bank_transaction("01/04/2012",2,1,3100.00,4300.21));
		this.transactionRepo.save(new bank_transaction("01/04/2012",4,3,5800.00,6412.44));
		this.transactionRepo.save(new bank_transaction("01/04/2012",3,4,1200.00,307.85));
		this.transactionRepo.save(new bank_transaction("02/04/2012",1,5,2500.00,229.87));
		this.transactionRepo.save(new bank_transaction("02/04/2012",5,1,50.00,4250.21));
		this.transactionRepo.save(new bank_transaction("02/04/2012",3,3,100.00,612.4));
		this.transactionRepo.save(new bank_transaction("03/04/2012",1,6,810.00,99119.91));
		this.transactionRepo.save(new bank_transaction("04/04/2012",3,1,50.00,4200.21));
		this.transactionRepo.save(new bank_transaction("04/04/2012",2,1,3500.00,1000.45));
		this.transactionRepo.save(new bank_transaction("05/04/2012",5,6,250.00,70000.88));
	}

}
