package Teste;

public abstract class Funcionario {
// o abstract após o public indica que é uma classe abstrata, ou seja, não é possivel instânciar um novo objeto
	
	private String name;
	private String cpf;
	private String birthDate;
	private Integer numDependents;
	private double salary;
	//private String password;
	
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/
	
	public Funcionario () {}
	
	public Funcionario(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public Funcionario(String name, String cpf, String birthDate, Integer numDependents, double salary) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.numDependents = numDependents;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getNumDependents() {
		return numDependents;
	}
	public void setNumDependents(Integer numDependents) {
		this.numDependents = numDependents;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Só existem métodos abstratos em classes abstratas 
	//dessa forma indica que é um método abstrato 
     public abstract double getBonusAnual() ;


     public void saudacao() {
    	 
     }
     
}
