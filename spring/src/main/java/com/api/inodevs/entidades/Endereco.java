package com.api.inodevs.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//Criando entidade do endereço:
@Entity
public class Endereco {
	// Colunas da  concessionária:
    @Id // Referenciando o Id
	public Long cep;
	
    @Column(nullable = false)
	public String estado;
    
    @Column(nullable = false)
	public String municipio;
    
    @Column(nullable = false)
	public String bairro;
    
    @Column(nullable = false)
	public String rua;
    
    @Column(nullable = false)
	public Integer numero;
    
    @Column
	public String complemento;
	
	@OneToOne(mappedBy = "endereco")
	private Unidade unidade;
	
	// Getters e Setters:
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String município) {
		this.municipio = município;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
