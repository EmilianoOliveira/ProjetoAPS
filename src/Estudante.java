
public class Estudante {	
	
	String nome;
	int idade;
	int matricula;
	
	public Estudante(){
		
		nome = "Bruna";
		idade = 19;
		matricula = 81241349;
			
	}
	public boolean NomeCorreto(){
		if (nome.equals(nome))
			return true;
		else
			return false;
	}
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setNome(String nome) {
		
		
	}
	
}


	
	


	