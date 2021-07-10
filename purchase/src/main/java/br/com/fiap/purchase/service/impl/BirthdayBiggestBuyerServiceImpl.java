package br.com.fiap.purchase.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.purchase.best.buyer.dto.MockBestBuyerDTO;
import br.com.fiap.purchase.service.BirthdayBiggestBuyerService;

@Service
public class BirthdayBiggestBuyerServiceImpl implements BirthdayBiggestBuyerService{

	@Override
	public Boolean bestBuyer(String email) {
		
		if (email.equals(getBestBuyer(populateBestBuyerMock()))) {
			return true;
		}
		
		return false;
	}
	
	private String getBestBuyer(List<MockBestBuyerDTO> mockBestBuyerDTOList) {
		
		Map<String, Double> collect = mockBestBuyerDTOList.stream()
				.collect(Collectors.groupingBy(MockBestBuyerDTO::getEmail, Collectors.summingDouble(MockBestBuyerDTO::getPurchase)));
		
		return collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	} 
	
	private List<MockBestBuyerDTO> populateBestBuyerMock() {
		
		List<MockBestBuyerDTO> mockBestBuyerDTOList = new ArrayList<>(); 
		
		MockBestBuyerDTO  mockBestBuyer1 = new MockBestBuyerDTO("teste@teste.com.br", 200D );
		MockBestBuyerDTO  mockBestBuyer2 = new MockBestBuyerDTO("teste@teste.com.br", 100D );
		MockBestBuyerDTO  mockBestBuyer3 = new MockBestBuyerDTO("teste@teste.com.br", 300D );
		MockBestBuyerDTO  mockBestBuyer4 = new MockBestBuyerDTO("teste1@teste.com.br", 100D );
		MockBestBuyerDTO  mockBestBuyer5 = new MockBestBuyerDTO("teste1@teste.com.br", 100D );
		MockBestBuyerDTO  mockBestBuyer6 = new MockBestBuyerDTO("teste1@teste.com.br", 100D );
		MockBestBuyerDTO  mockBestBuyer7 = new MockBestBuyerDTO("teste2@teste.com.br", 50D );
		MockBestBuyerDTO  mockBestBuyer8 = new MockBestBuyerDTO("teste2@teste.com.br", 65D );
		MockBestBuyerDTO  mockBestBuyer9 = new MockBestBuyerDTO("teste2@teste.com.br", 90D );
		MockBestBuyerDTO  mockBestBuyer10 = new MockBestBuyerDTO("test2e@teste.com.br", 10D );
		
		mockBestBuyerDTOList = Arrays.asList(
				mockBestBuyer1,
				mockBestBuyer2,
				mockBestBuyer3,
				mockBestBuyer4,
				mockBestBuyer5,
				mockBestBuyer6,
				mockBestBuyer7,
				mockBestBuyer8,
				mockBestBuyer9,
				mockBestBuyer10
			);
		
		return mockBestBuyerDTOList;
	}

}
