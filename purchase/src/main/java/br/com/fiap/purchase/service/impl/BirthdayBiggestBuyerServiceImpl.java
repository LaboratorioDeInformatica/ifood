package br.com.fiap.purchase.service.impl;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.fiap.purchase.sell.dto.BuyerDto;
import br.com.fiap.purchase.sell.repository.SumationRepository;
import br.com.fiap.purchase.service.BirthdayBiggestBuyerService;

@Service
public class BirthdayBiggestBuyerServiceImpl implements BirthdayBiggestBuyerService{

	@Autowired
	private SumationRepository sellRepository;
	
	@Override
	public Boolean bestBuyer(String email) {
		
		if(annyversaryValidate(email)) {
			Pageable firstPageWithTwoElements = PageRequest.of(0,1);
			
			List<BuyerDto> findBestBuyer = sellRepository.findBestBuyer(firstPageWithTwoElements, birthdayDate());
			List<BuyerDto> collect = findBestBuyer.stream().filter(x->x.getEmail().equals(email)).collect(Collectors.toList());
			if (!collect.isEmpty()) {
				return true;
			}
			
			return false;
		}
		
		return false;
	}
	

	private Boolean annyversaryValidate(String email) {
		List<String> annyversaryList = Arrays.asList("teste@teste.com.br","teste1@teste.com.br","teste2@teste.com.br");
		List<String> collect = annyversaryList.stream().filter(x -> x.equals(email)).collect(Collectors.toList());
		return collect.isEmpty() ? false : true;
	}
	
	private String birthdayDate() {
	//	String birthday = LocalDate.now().getMonth().toString().concat("-").concat( String.valueOf((LocalDate.now().getDayOfMonth())) ); 
		String birthday = Month.JULY + "-05";		
		return birthday;
	} 

}
