package com.example.demo;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.model.Funcionario;

@SpringBootTest
class Rh001ApplicationTests {

	@Test
	public void CT01CadastrarFuncionarioDadosValidos() {
		try {
			// cenario
			Funcionario umFuncionario;
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 25.00);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}

	}
}
