package br.com.fiap.voucher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.voucher.client.PurchaseClient;
import br.com.fiap.voucher.dto.MessageVoucherDTO;
import br.com.fiap.voucher.service.VoucherService;

@Service
public class VoucherServiceImpl implements VoucherService{
	
	private final String GIFT_HAPPY_BITHDAY = "Feliz Aniversario você acaba de ganhar um voucher";
	private final String NO_GIFT_HAPPY_BITHDAY = "Sem voucher";
	private final Double  GIFT_HAPPY_BITHDAY_VALUE = 50.00D;
	private final Double  NO_GIFT_HAPPY_BITHDAY_VALUE = 00.00D;
	
	@Autowired
	private PurchaseClient purchaseClient;

	@Override
	public MessageVoucherDTO birthdayMessage(String email) {
	
		Boolean gift = false;
		
		gift = purchaseClient.validateBiggestBuyerByBirthday(email);
		
		return messageBirthdayGift(gift);
	}
	
	private MessageVoucherDTO messageBirthdayGift(Boolean gift) {
		return MessageVoucherDTO.builder()
				.message(gift ? GIFT_HAPPY_BITHDAY : NO_GIFT_HAPPY_BITHDAY)
				.value(gift ? GIFT_HAPPY_BITHDAY_VALUE : NO_GIFT_HAPPY_BITHDAY_VALUE )
				.gift(gift)
				.build();
	}

}
