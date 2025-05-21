package io.github.caioluscas.libraryapi.repository;

import io.github.caioluscas.libraryapi.model.Autor;
import org.antlr.v4.runtime.misc.LogManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {
    @Autowired
    AutorRepository repository;

    @Test
    public void salvarTest(){
        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Indiano");
        autor.setDataNascimento(LocalDate.of(1973, 6, 12));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: " + autorSalvo);
    }

    @Test
    public void autalizarTeste(){
        var id = UUID.fromString("28bc06e3-15a4-4055-9967-d114c5b8da10");

        Optional<Autor> possivelAutor = repository.findById(id);

        if(possivelAutor.isPresent()){
            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do Autor:");
            System.out.println(autorEncontrado);

            autorEncontrado.setDataNascimento(LocalDate.of(1888, 1, 30));

            repository.save(autorEncontrado);
        }
    }
}
