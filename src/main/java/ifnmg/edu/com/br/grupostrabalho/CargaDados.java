/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
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
public class CargaDados implements CargaDadosLocal {

    @Inject
    private PessoaBeanLocal pessoaBean;

    @PostConstruct
    @Override
    public void popularBanco() {

        //<editor-fold defaultstate="collapsed" desc="Pessoas/Enderecos/Telefones">
        Pessoa p1 = new Pessoa();

        p1.setNome("Ana Zaira");
        p1.setEmail("ana@mail.com");
        p1.setNascimento(LocalDate.of(2001, Month.JANUARY, 1));

        Endereco e1 = new Endereco(TipoLogradouro.RUA, "1", 1111, "Humberto");

        p1.setEndereco(e1);

        p1.setTelefones(List.of(
                new Telefone((byte) 11, 11111111),
                new Telefone((byte) 12, 12121212),
                new Telefone((byte) 13, 13131313)
        ));

        Pessoa p2 = new Pessoa();

        p2.setNome("Beatriz Yana");
        p2.setEmail("beatriz@mail.com");
        p2.setNascimento(LocalDate.of(2002, Month.FEBRUARY, 2));

        Endereco e2 = new Endereco(TipoLogradouro.AVENIDA, "2", 2222, "Doisberto");

        p2.setEndereco(e2);

        p2.setTelefones(List.of(new Telefone((byte) 22, 22222222)));

        Pessoa p3 = new Pessoa();

        p3.setNome("Cecília Xerxes");
        p3.setEmail("cecilia@mail.com");
        p3.setNascimento(LocalDate.of(2003, Month.MARCH, 3));

        Endereco e3 = new Endereco(TipoLogradouro.AVENIDA, "3", 3333, "Trêsberto");

        p3.setEndereco(e3);

        Pessoa p4 = new Pessoa();

        p4.setNome("Débora Wendel");
        p4.setEmail("debora@mail.com");
        p4.setNascimento(LocalDate.of(2004, Month.APRIL, 4));

        Endereco e4 = new Endereco(TipoLogradouro.PRACA, "4", 4444, "Quatroberto");

        p4.setEndereco(e4);

        p4.setTelefones(List.of(
                new Telefone((byte) 44, 44444444),
                new Telefone((byte) 45, 45454545)
        ));
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Grupos">
        Grupo g1 = new Grupo();

        g1.setNome("Estudo I");
        g1.setAtivo(false);

        Grupo g2 = new Grupo();

        g2.setNome("Estudo II");
        g2.setAtivo(true);

        Grupo g3 = new Grupo();

        g3.setNome("Estudo III");
        g3.setAtivo(false);

        Grupo g4 = new Grupo();

        g4.setNome("Estudo IV");
        g4.setAtivo(true);

        g1.setLider(p1);
        g2.setLider(p2);
        g3.setLider(p3);
        g4.setLider(p2);

        p1.setGrupos(List.of(g1));
        p2.setGrupos(List.of(g1, g2, g4));
        p3.setGrupos(List.of(g1, g3, g4));
        p4.setGrupos(List.of(g1, g2, g3, g4));
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Atuacoes">
        p1.setAtuacoes(List.of(
                new Atuacao(LocalDate.of(2011, 1, 1), LocalDate.of(2021, 11, 11), g1,p1),
                new Atuacao(LocalDate.of(2012, 1, 1), LocalDate.of(2022, 11, 11), g1,p1)
        ));

        p2.setAtuacoes(List.of(
                new Atuacao(LocalDate.of(2012, 1, 2), LocalDate.of(2021, 1, 12), g1,p2),
                new Atuacao(LocalDate.of(2012, 1, 2), g2,p2),
                new Atuacao(LocalDate.of(2012, 1, 4), LocalDate.of(2024, 1, 14), g4,p2)
        ));

        p3.setAtuacoes(List.of(
                new Atuacao(LocalDate.of(2013, 1, 3), LocalDate.of(2021, 1, 13), g1,p3),
                new Atuacao(LocalDate.of(2012, 1, 3), LocalDate.of(2023, 1, 13), g3,p3),
                new Atuacao(LocalDate.of(2012, 1, 4), LocalDate.of(2024, 1, 14), g4,p3)
        ));

        p4.setAtuacoes(List.of(
                new Atuacao(LocalDate.of(2014, 1, 4), LocalDate.of(2021, 1, 14), g1,p4),
                new Atuacao(LocalDate.of(2012, 1, 2), g2,p4),
                new Atuacao(LocalDate.of(2012, 1, 3), LocalDate.of(2023, 1, 13), g3,p4),
                new Atuacao(LocalDate.of(2012, 1, 4), LocalDate.of(2024, 1, 14), g4,p4)
        ));
        //</editor-fold>

        pessoaBean.save(p1);
        pessoaBean.save(p2);
        pessoaBean.save(p3);
        pessoaBean.save(p4);

    }

}
