package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.model.bank_transaction;
import net.javaguides.springboot.repository.transactionrepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class transactionController {
	
	@Autowired
	private transactionrepo transactionRepo;
	
	@GetMapping("transaction")	
	public List<bank_transaction> getId(){
		return this.transactionRepo.findAll();
	}
}
