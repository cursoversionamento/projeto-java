
public class Professor {
	private String nome;
	private String CPF;
	private NivelPosgraduacao nivelPosgraduacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	public NivelPosgraduacao getNivelPosgraduacao() {
		return nivelPosgraduacao;
	}

	public void setNivelPosgraduacao(NivelPosgraduacao nivelPosgraduacao) {
		this.nivelPosgraduacao = nivelPosgraduacao;
	}

	public double calcularValor(int qtdHoras, double valorHora)
	{
		double bounus = 0;
		if(this.nivelPosgraduacao == NivelPosgraduacao.ESPECIALIZA)
		{
			bounus = 0.1;//10%
		}else if(this.nivelPosgraduacao == NivelPosgraduacao.MESTRE)
		{
			bounus = 0.2;//20%
		}else if(this.nivelPosgraduacao == NivelPosgraduacao.DOUTOR)
		{
			bounus = 0.3;//30%
		}
		double salario = qtdHoras * valorHora;
		double valorMaisBonus = salario + (salario * bounus);
		return valorMaisBonus;
	}
	
}
