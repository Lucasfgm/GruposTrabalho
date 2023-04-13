/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
@Local
public interface PessoaBeanLocal {

   public void save(Pessoa pessoa);
   
    //<editor-fold defaultstate="collapsed" desc="Questao 1">
    public List<Pessoa> findAllPessoaQuery();

    public List<Pessoa> findAllPessoaTyped();

    public List<Pessoa> findAllPessoaNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 2">
    public List<String> findNomePessoaQuery();

    public List<String> findNomePessoaTyped();

    public List<String> findNomePessoaNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 3">
    public List<Pessoa> findNomeEnderecoQuery();

    public List<Pessoa> findNomeEnderecoTyped();

    public List<Object[]> findNomeEnderecoNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 4">
    public List<Pessoa> findPessoaInAvenidaQuery();

    public List<Pessoa> findPessoaInAvenidaTyped();

    public List<Pessoa> findPessoaInAvenidaNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 5">
    public List<Pessoa> findPessoaNotPracaQuery();

    public List<Pessoa> findPessoaNotPracaTyped();

    public List<Pessoa> findPessoaNotPracaNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 6">
    public List<Object[]> findPessoaNomeTelefoneQuery();

    public List<Object[]> findPessoaNomeTelefoneTyped();

    public List<Object[]> findPessoaNomeTelefoneNamed();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 7">
    public List<Pessoa> findPessoaByDate(LocalDate dataInicio, LocalDate dataFim);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 9">
    public List<Pessoa> findPessoaTelefoneVazio();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 10">
     public List<String> findQuantidadeTelefonesPorPessoa();
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Questao 11">
    public List<Grupo> findGruposInativos();
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Questao 12">
    public List<String[]> findLideresGrupos();
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="Questao 13">
      public List<String> findMembrosGrupo(String nomeGrupo);
      //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="Questao 14">      
    public List<Grupo> findGruposPorLider(String nomeLider);
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="Questao 15">
    public List<Object[]> findDatasAtuacaoGrupo(String nomeMembro);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questao 16">
    public List<Grupo> findGrupoByNome(String nomeGrupo);
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Questao 17">
    public List<Object[]> findNomeGrupoQuantidadeMembros();
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Questao 18">
    public List<Object[]> findNomeGrupoPorTotalAtuacoes(Long total);
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Questao 19">
    public List<String> findNomePessoaPorDataEntradaEmGrupo(Long grupoId, LocalDate dataInicio);
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Questao 20">
    public List<MembroDto> findMembroDto(LocalDate dataInicio);
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Questao 21">
    public List<String[]> findGruposEPessoaSemDataTermino();
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Quastao 22">
    public List<String[]> findLiderMembrosGrupos();
    //</editor-fold>
       
}
