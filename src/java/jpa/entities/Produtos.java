/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stephano
 */
@Entity
@Table(name = "produtos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findById", query = "SELECT p FROM Produtos p WHERE p.id = :id")
    , @NamedQuery(name = "Produtos.findByDescri\u00e7\u00e3o", query = "SELECT p FROM Produtos p WHERE p.descri\u00e7\u00e3o = :descri\u00e7\u00e3o")
    , @NamedQuery(name = "Produtos.findByFabricante", query = "SELECT p FROM Produtos p WHERE p.fabricante = :fabricante")
    , @NamedQuery(name = "Produtos.findByLocaliza\u00e7\u00e3o", query = "SELECT p FROM Produtos p WHERE p.localiza\u00e7\u00e3o = :localiza\u00e7\u00e3o")
    , @NamedQuery(name = "Produtos.findByValidade", query = "SELECT p FROM Produtos p WHERE p.validade = :validade")})
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descri\u00e7\u00e3o")
    private String descrição;
    @Size(max = 100)
    @Column(name = "Fabricante")
    private String fabricante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Localiza\u00e7\u00e3o")
    private String localização;
    @Column(name = "Validade")
    @Temporal(TemporalType.DATE)
    private Date validade;

    public Produtos() {
    }

    public Produtos(String id) {
        this.id = id;
    }

    public Produtos(String id, String descrição, String localização) {
        this.id = id;
        this.descrição = descrição;
        this.localização = localização;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
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
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Produtos[ id=" + id + " ]";
    }
    
}
