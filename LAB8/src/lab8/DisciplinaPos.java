package lab8;

public class DisciplinaPos extends Disciplina {

	public DisciplinaPos(int id, String nome, int creditos) {
		super(id, nome, creditos);
	}
	//Metodo sobrescrito que eh abstrato na superclasse
	@Override
	public boolean addAluno(Aluno aluno) {
		if (listaAlunos.size() == MAX_ALUNOS) {
			return false;
		}else {
			listaAlunos.add(aluno);
			aluno.addDisciplina(this); 
			return true;
		}
	}
	//Metodo sobrescrito que eh abstrato na superclasse
	@Override
	public boolean removeAluno(Aluno aluno) {
		if(listaAlunos.size() == 0 ) {
			return false;
		}else{
			listaAlunos.remove(aluno);
			aluno.removeDisciplina(this); 
			return true;
		}
	}
	
}
