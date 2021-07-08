package br.com.fiap.voucher.service.impl;

import org.springframework.stereotype.Service;

import br.com.fiap.voucher.dto.MessageVoucherDTO;
import br.com.fiap.voucher.service.VoucherService;

@Service
public class VoucherServiceImpl implements VoucherService{

	@Override
	public MessageVoucherDTO birthdayMessage(String email) {
	
		return MessageVoucherDTO.builder().message("Feliz Aniversario você acaba de ganhar um voucher").value(50.00D).gift(true).build();
	}

}
