package com.fatec.scel;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import com.fatec.scel.model.Livro;
import com.fatec.scel.model.LivroRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
public class REQ01CadastrarLivro {
@Autowired
LivroRepository repository;
private Validator validator;
private ValidatorFactory validatorFactory;
/**
* Verificar o comportamento da classe LivroRepository
*/
@Test
public void CT01CadastrarLivroComSucesso() {
// dado que o isbn nao esta cadastrado
repository.deleteAll();
// quando o usurio inclui as informacoes obrigatorias e confirma a operacao
Livro livro = new Livro("3333", "Teste de Software", "Delamaro");
repository.save(livro);
// entao
assertEquals(1, repository.count());
}
}