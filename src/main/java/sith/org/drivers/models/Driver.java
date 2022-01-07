package sith.org.drivers.models;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Nome;

    private String sobrenome;

    private String numero;

    private String nacionalidade;

    private String idade;

    private String equipe;

    @CreatedDate
    @Column(name = "created_at")
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Date updatedAt;

    public Driver() {

    }

    public Driver(String nome, String sobrenome, String numero, String nacionalidade, String idade, String equipe) {
        Nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.equipe = equipe;
    }

    public Driver(Long id, String nome, String sobrenome, String numero, String nacionalidade, String idade, String equipe, Date createdAt) {
        this.id = id;
        Nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.equipe = equipe;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
