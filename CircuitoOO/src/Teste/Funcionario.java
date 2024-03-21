package Teste;

public class Funcionario {

		private String nome;

		private String CPF;
		private String dataNsc;
		private int num_dep;
		private double salario; 


		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		
		public double getBonusAnual() {
			return this.salario*0.1;
		}
		

		
		public String getDataNsc() {
			return dataNsc;
		}
		
		public void setDataNsc(String dataNsc) {
			this.dataNsc = dataNsc;
		}
		
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome( String nome) {
			this.nome= nome;
		}
		
		
		public int getNum_dep() {
			return num_dep;
		}
		
		public void setNum_dep(int num_dep) {
			this.num_dep = num_dep;
		}
		
		
		public String getCPF() {
			return CPF;
		}
		public void setCPF(String cPF) {
			CPF = CPF;
		}

}


/*public static double getBonusAnual(double[] salario ) {
	double bonusAnual = 0;
	double bonusAnual = 0.10* salario;
	return bonusAnual;
} PQ FEZ UM GET AO INVÉS ISSO?--> pq usamos static quando queremos criar métodos que não fazem algo específico*/




