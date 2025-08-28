package estruturas;

public class Aluno extends Pessoa{
	String matricula;
	
	public Aluno(String nome, String cpf, String rg, String dataNasc, String endereco, String telefone, String email, String matricula, char sexo) {
		super(nome, cpf, rg, dataNasc, endereco, telefone, email, sexo);
		this.matricula = matricula;
	}
}
