package br.com.fiap.voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.voucher.dto.MessageVoucherDTO;
import br.com.fiap.voucher.service.VoucherService;

@RequestMapping("birthiday-gift")
@RestController
public class MessageVoucherController {
	
	@Autowired
	private VoucherService service;
	
	@GetMapping(value="/{email}")
	public MessageVoucherDTO greeting(@PathVariable("email") String email) {
		return  service.birthdayMessage(email);
	}
}
