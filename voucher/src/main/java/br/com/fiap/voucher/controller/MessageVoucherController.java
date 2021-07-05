package br.com.fiap.voucher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test-voucher-messages")
@RestController
public class MessageVoucherController {
	
	@GetMapping
	public String greeting() {
		return  "Voucher Service";
	}
}
