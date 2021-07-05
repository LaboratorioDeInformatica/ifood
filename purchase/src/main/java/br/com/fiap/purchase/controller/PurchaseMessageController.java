package br.com.fiap.purchase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test-purchase-messages")
@RestController
public class PurchaseMessageController {
	
	@GetMapping
	public String greeting() {
		return  "Purchase Service";
	}

}
