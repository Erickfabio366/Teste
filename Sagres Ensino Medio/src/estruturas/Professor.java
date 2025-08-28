package estruturas;

public class Professor extends Pessoa
{
	String formaAcademica;
	
	public Professor(String nome, String cpf, String rg, String dataNasc, String endereco, String telefone, String email, String formaAcademica, char sexo)
	{
		super(nome, cpf, rg, dataNasc, endereco, telefone, email, sexo);
		
		this.formaAcademica = formaAcademica;
	}
}
