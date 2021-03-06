/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Manny
 */
@Entity
@Table(name = "permissions")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Permissions.findAll", query = "SELECT p FROM Permissions p")
        , @NamedQuery(name = "Permissions.findById", query = "SELECT p FROM Permissions p WHERE p.id = :id")
        , @NamedQuery(name = "Permissions.findByGrouping", query = "SELECT p FROM Permissions p WHERE p.grouping = :grouping")
        , @NamedQuery(name = "Permissions.findByCode", query = "SELECT p FROM Permissions p WHERE p.code = :code")
    , @NamedQuery(name = "Permissions.findByStatus", query = "SELECT p FROM Permissions p WHERE p.status = :status")})

public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "grouping")
    private String grouping;
    @Size(max = 45)
    @Column(name = "code")
    private String code;

    @Basic(optional = false)
    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;

    @Basic(optional = false)

    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;


    public Permissions() {
    }

    public Permissions(Integer id) {
        this.id = id;
    }

    public Permissions(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions other = (Permissions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{ "
                + "id=" + id
                + " }";
    }

}
