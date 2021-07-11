package br.com.fiap.purchase.summation.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "summation")
public class Summation implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = -342472673051928825L;

	@Id
	@Type(type = "uuid-char")
	private UUID id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birthday")
	private LocalDate birthday;

	@Column(name="value")
	private Double value;

}
