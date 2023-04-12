/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.time.LocalDate;
import java.time.Month;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
@Singleton
@Startup
public class PopularBanco implements PopularBancoLocal {

    @Inject
    private PessoaBeanLocal pessoaBean;

    @PostConstruct
    @Override
    public void popularBanco() {

        Pessoa p1 = new Pessoa();
        
        p1.setNome("Ana Zaira");
        p1.setEmail("ana@mail.com");
        p1.setNascimento(LocalDate.of(2001, Month.JANUARY, 1));
        
    }

}
