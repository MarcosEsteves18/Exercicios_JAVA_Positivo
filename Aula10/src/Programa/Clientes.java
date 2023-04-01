package Programa;

import java.util.ArrayList;
import java.util.Calendar;

public class Clientes {

	public String nome;
	public String cpf;
	public String endereco;
	public Calendar nascimento;
	private ArrayList <Conta> Contas = new ArrayList <>();
	
	//get ler um atributo do obj
	//set editar um atributo do obj
	
	public Clientes() {
		nascimento = Calendar.getInstance();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Calendar getNascimento(){
		return this.nascimento;
	}
	
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	public ArrayList<Conta> getContas(){
		return Contas;
	}
	
	public String addConta(Conta conta) {
		if(Contas.contains(conta)){
			return "Conta ja esta cadatrada";
		}else {
			Contas.add(conta);
			return "Conta cadastrada com sucesso";
		}
		        
	}
	
	
	
	
	public String toString() {
		String clientes = "Nome :" +this.nome + "\t CPF :" + this.cpf + "\t ENDEREÇO : " + this.endereco + "\t DATA NASCIMENTO : " + this.nascimento;
		return clientes;
	}
	
	
	
	
	
	
}
