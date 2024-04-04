package Teste;

public class CientistaDados extends Funcionario {
	private Integer crcd;

	public CientistaDados(String name, String cpf, String birthDate, Integer numDependents, double salary,
			Integer crcd) {
		super(name, cpf);
		this.crcd = crcd;
	}
	
	public CientistaDados () {
		
	}

	public CientistaDados(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getCrcd() {
		return crcd;
	}

	public void setCrcd(Integer crcd) {
		this.crcd = crcd;
	}
	
	@Override
	public double getBonusAnual() {
		return getBonusAnual() + 500.00;
		//o que é esse método super?
	}


}
