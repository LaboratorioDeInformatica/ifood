package br.com.fiap.purchase.sell.repository;


import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fiap.purchase.sell.dto.BuyerDto;
import br.com.fiap.purchase.summation.domain.Summation;

@Repository
public interface SumationRepository  extends JpaRepository<Summation, UUID>{

	
	@Query(value =" SELECT  new br.com.fiap.purchase.sell.dto.BuyerDto(summ.email, summ.value) "
			+ " FROM Summation as summ  "
			+ " WHERE summ.birthday = :birthday"
			+ " ORDER BY summ.value  DESC "
			+ "  ")
	List<BuyerDto> findBestBuyer(Pageable pageable, @Param("birthday")  String birthday);
	
}
