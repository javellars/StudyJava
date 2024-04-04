package Teste;

public abstract class PessoaProgramadora extends Funcionario {
	private Integer crc;
	
	public PessoaProgramadora(String name, String cpf, String birthDate, Integer numDependents, double salary,
			Integer crc) {
		super();
		this.crc = crc;
	}

	public PessoaProgramadora(String name, String cpf) {
		
		
	}

	public Integer getCrc() {
		return crc;
	}

	public void setCrc(Integer crc) {
		this.crc = crc;
	}
	
	
}
