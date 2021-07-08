package br.com.fiap.purchase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/validate-gift")
@RestController
public class PurchaseMessageController {
	
	@GetMapping("/{email}")
	Boolean validateBiggestBuyerByBirthday(@PathVariable String email) {
		if(email.equals("teste@teste.com.br")) {
			return  true;
		}else {
			return  false;
		}
	}

}
