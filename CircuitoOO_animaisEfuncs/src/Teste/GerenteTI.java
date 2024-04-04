package Teste;

public abstract class GerenteTI extends Funcionario {
	private Integer numEmployees;
	private int ramal;
	private String password;
	
	public GerenteTI(String name, String cpf, String birthDate, Integer numDependents, double salary,
			Integer numEmployees, int ramal, String password) {
		super();
		this.numEmployees = numEmployees;
		this.ramal = ramal;
		this.password = password;
	}
	
	public GerenteTI() {
		// TODO Auto-generated constructor stub
	}

	public GerenteTI(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public Boolean Autentication(String password) {
		return password.equals(this.password);
	}
	
	public double bonusAnual() {
		return (super.getSalary() * 0.1) * this.getNumEmployees(); 
	}
	
	public Boolean autentication(String password, String cpf) {
		if((this.password == password) && (cpf.length() == 11)) {
			return true;
		} else { 
			return false;
		}
		}

}
