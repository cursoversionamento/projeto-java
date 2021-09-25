//Modifiquei via github 2
public class Principal {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setNome("Rafael");
		professor.setNivelPosgraduacao(NivelPosgraduacao.DOUTOR);
		double salarioProfessor = professor.calcularValor(10, 100);
		//10 * 100 = 1000
		//1000 * 0.3 = 300
		//1000 + 300 = 1300
		
		System.out.println("Hello: "+professor.getNome()+"!");
		System.out.println("Salario: "+salarioProfessor);
	}
}
