package br.com.fiap.voucher.service;

import br.com.fiap.voucher.dto.MessageVoucherDTO;

public interface  VoucherService {

	MessageVoucherDTO birthdayMessage(String email);
	
}
