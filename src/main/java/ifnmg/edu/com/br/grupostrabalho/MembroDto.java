/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.time.LocalDate;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
public class MembroDto {
    
    private String grupo;
    private String nome;
    private LocalDate inicio;

    public MembroDto(String nomeGrupo, LocalDate dataInicio, String nomeMembro) {
        this.grupo = nomeGrupo;
        this.inicio = dataInicio;
        this.nome = nomeMembro;
    }

    public MembroDto(String grupo, String nome) {
        this.grupo = grupo;
        this.nome = nome;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    //</editor-fold>
    
}
