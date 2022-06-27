package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	public DadosPessoais(String nome2, String cpf2, Cargo cargo2, BigDecimal salario2) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	

}
