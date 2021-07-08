package br.com.fiap.voucher.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("purchase")
public interface PurchaseClient {
	
	@RequestMapping("validate-gift/{email}")
	Boolean validateBiggestBuyerByBirthday(@PathVariable String email);

}
