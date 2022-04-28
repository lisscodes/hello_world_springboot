package com.helloword.hello.bsm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/BSM")
public class Bsm {
	@GetMapping
	public String bsm () {
		return "\nOrientação ao Futuro;"
				+ "\nComunicação;"
				+ "\nOrientação ao detalhe;"
				+ "\nProatividade;"
				+ "\nPersistência;"
				+ "\nResponsabilidade Pessoal;"
				+ "\nTrabalho em Equipe;"
				+ "\nMentalidade de Crescimento";
	}

}
