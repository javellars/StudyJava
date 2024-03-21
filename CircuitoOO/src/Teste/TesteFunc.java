package Teste;

public class TesteFunc {

	//modificadores de acesso || tipo que retorna || nome do método || Parâmetros
	public static void main(String[]args) {
	
		PessoaProgramadora p = new PessoaProgramadora();
		
		p.setNome("Paulo");
		p.setCPF("1236547896");
		p.setDataNsc("12/03/1987");
		p.setNum_dep(5);
		p.setSalario(2000);
		
		System.out.println(p.getBonusAnual());
		
		
		CientistaDados c = new CientistaDados();
		c.setNome("Maria");
		c.setCPF("1236547896");
		c.setDataNsc("12/03/1987");
		c.setNum_dep(5);
		c.setSalario(2500);
		c.setCRP(15);
		
		System.out.println(c.getBonusAnual());
		
		
		GerenteTi g = new GerenteTi();
		g.setNome("Maria");
		g.setCPF("1236547896");
		g.setDataNsc("12/03/1987");
		g.setNum_dep(5);
		g.setSalario(3500);
		g.setNumFunc(10);
		g.setRamal(12);
		
		System.out.println(g.getBonusAnual());

		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
