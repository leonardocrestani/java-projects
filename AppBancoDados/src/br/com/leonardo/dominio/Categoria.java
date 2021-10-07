package br.com.leonardo.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Categoria implements Serializable {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    
    public Categoria() {
        
    }
    
    public Categoria(Long id, String tipoCategoria) {
        this.id = id;
        this.tipo = tipoCategoria;
    }

    public Long getId() {
        return id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria[ Id:" + id + " Tipo:" + tipo + "]";
    }

}
