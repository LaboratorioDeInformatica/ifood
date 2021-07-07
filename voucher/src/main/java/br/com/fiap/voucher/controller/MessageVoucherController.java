package br.com.fiap.voucher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.voucher.dto.MessageVoucherDTO;

@RequestMapping("/test-voucher-messages")
@RestController
public class MessageVoucherController {
	
	@GetMapping("{email}")
	public MessageVoucherDTO greeting() {
		return  null;
	}
}
