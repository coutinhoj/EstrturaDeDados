package aula2;

public class Aluno {
	
	String nome;
	int idade;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//construtor
	public Aluno(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	//metodo soma do tipo Aluno recebendo como parametro calc, Aluno que está entre parenteses é um objeto.  
	/*Aluno soma(Aluno calc) {
		String s1 = this.nome + calc.getNome();
		int s2  = this.idade + calc.getIdade();
		return new Aluno(s1,s2);
	}*/
	
	
	 // metodo soma 
	 public Aluno soma(Aluno calc){
	 
	  return new Aluno(this.nome+calc.getNome(), this.idade+calc.getIdade());
	 }
	 


}
