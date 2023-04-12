/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
@Entity
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Byte ddd;
    
    private Integer numero;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Telefone() {
    }
    
    public Telefone(Byte ddd, Integer numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Hash/Equals/ToString">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        return hashCode() == obj.hashCode();
    }

    

    @Override
    public String toString() {
        return "ifnmg.edu.com.br.grupostrabalho.Telefone[ id=" + id + " ]";
    }
    //</editor-fold>
}
