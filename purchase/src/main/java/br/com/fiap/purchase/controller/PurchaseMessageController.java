package br.com.fiap.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.purchase.service.BirthdayBiggestBuyerService;

@RequestMapping("/validate-gift")
@RestController
public class PurchaseMessageController {
	
	@Autowired
	private BirthdayBiggestBuyerService service;
	
	@GetMapping("/{email}")
	Boolean validateBiggestBuyerByBirthday(@PathVariable String email) {
		return service.bestBuyer(email);
	}

}
