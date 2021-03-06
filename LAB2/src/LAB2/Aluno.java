/*Nome: Gabriel Volpato Giliotti 		ra:197569*/

package LAB2;

public class Aluno {
	/*Atributos da classe*/
	private int matricula;
	private String nome;
	private String cpf;
	private int curso;
	private int estado;
	
	/*Estado da Classe Aluno*/
	/*Cada variavel indica um possivel estado do aluno*/
	public static final int ESTADOATIVO = 1;
	public static final int ESTADOINATIVO = 2;
	public static final int ESTADOSUSPENSO = 3;
	
	/*construtor recebe	as informações default dos Alunos */
	public Aluno (String nome, String cpf, int curso, int estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.estado = estado;
	}
	
	/*getters da classe Aluno*/
	public int getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getCurso () {
		return curso;
	}
	
	/*Metodo para imprimir os dados dos alunos matriculados*/
	public void imprimeDados() {
		String saida = "########## Aluno\n";
		String estado;
		if(this.estado == Aluno.ESTADOATIVO) {
			estado = "ATIVO";
		} else if (this.estado == Aluno.ESTADOINATIVO) {
			estado = "INATIVO";
		} else {
			estado = "SUSPENSO";
		}
		saida = saida + "Matricula: " + getMatricula() + "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nCurso: " + getCurso() + "\nEstado do Aluno: " + estado;
		System.out.println(saida);
	}
	
	
	/*Setters da classe aluno*/
	
	public void setNome( String nome ) {
		if( nome.length() >= 3 ) {
			this.nome = nome;	
		}else{
			System.out.println("Nome invalido.");
		}
	}
	
	public void setCpf( String cpf ) {
		if( cpf.length() == 11 ) {
			this.cpf = cpf;
			this.matricula = CriadorDeMatricula.matriculador();/*Se o cpf do aluno for valido, entao incrementamos a matricula*/
		}else{
			System.out.println("Cpf invalido.");
		}
	}
	
	public void setCurso ( int curso) {
		if( curso > 0 ) {
			this.curso = curso;
		}else{
			System.out.println("Curso invalido.");
		}
	}
	/*Em uma situação real, o que interessa é o numero do documento da pessoa cadastrada*/
	/*Entao a matricula sera efetuada se o cpf for inserido corretamente*/
}
