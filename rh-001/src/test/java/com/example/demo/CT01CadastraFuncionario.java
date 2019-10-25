package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.model.Funcionario;
@SpringBootTest
class UC01CadastrarFuncionario {
	private Funcionario umFuncionario;
	private Funcionario umFuncionario2;

	@Test
	public void CT01CadastrarFuncionarioDadosValidos() {
		try {
//acao
			setUmFuncionario(new Funcionario("Jose da Silva", "111111", 25.00));
		} catch (RuntimeException e) {
//verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT01CadastrarFuncionarioCom_nome_invalido() {
try {
//acao
			setUmFuncionario2(new Funcionario("", "111111", 25.00));
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	public Funcionario getUmFuncionario2() {
		return umFuncionario2;
	}

	public void setUmFuncionario2(Funcionario umFuncionario2) {
		this.umFuncionario2 = umFuncionario2;
	}

	public Funcionario getUmFuncionario() {
		return umFuncionario;
	}

	public void setUmFuncionario(Funcionario umFuncionario) {
		this.umFuncionario = umFuncionario;
	}
}