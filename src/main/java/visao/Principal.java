package visao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import controle.Conexao;
import controle.DAO;
import modelo.Esportivo;
import modelo.Utilitario;
import modelo.Veiculo;


public class Principal {

	static DAO d = new DAO();
	static EntityManager em = Conexao.getInstance();
	
	private static void cadastrarVeiculo(){
		Veiculo v = new Veiculo();
		v.setAno(2017);
		v.setCor("azul");
		Date dataUtil = new Date();
		Date dataSQL = new java.sql.Date(dataUtil.getTime());
		v.setDataFabricacao(dataSQL);
		v.setModelo("GOL");
		v.setPlaca("MXV7182");
		v.setValorDiaria(100);
		d.inserirVeículo(v);
	}
	
	private static void cadastrarEsportivo(){
		Esportivo e = new Esportivo();
		e.setAno(2017);
		e.setCor("prata");
		Date dataUtil = new Date();
		Date dataSQL = new java.sql.Date(dataUtil.getTime());
		e.setDataFabricacao(dataSQL);
		e.setModelo("Porsche Cabriolet");
		e.setPlaca("NNQ1974");
		e.setValorDiaria(1000);
		e.setVelocidadeMaxima(240);
		d.inserirEsportivo(e);
	}

	private static void cadastrarUtilitario(){
		Utilitario u = new Utilitario();
		u.setAno(2017);
		u.setCor("preta");
		Date dataUtil = new Date();
		Date dataSQL = new java.sql.Date(dataUtil.getTime());
		u.setDataFabricacao(dataSQL);
		u.setModelo("Chevrolet Montana");
		u.setPlaca("QGD2565");
		u.setValorDiaria(300);
		u.setNumPassageiros(2);
		d.inserirUtilitario(u);
	}
	
	private static void alterarVeiculo(){
		Veiculo v = new Veiculo();
		Veiculo v2 = em.find(Veiculo.class, 1);
		v2.setModelo("Volkswagen GOL");
		d.alterarVeículo(v2);
	}

	private static void alterarEsportivo(){
		Esportivo e = new Esportivo();
		Esportivo e2 = em.find(Esportivo.class, 2);
		e2.setModelo("Mercedez-Benz Classe A");
		e2.setValorDiaria(840);
		d.alterarVeículo(e2);
	}

	private static void alterarUtilitario(){
		Utilitario u = new Utilitario();
		Utilitario u2 = em.find(Utilitario.class, 3);
		u2.setModelo("Fiat Strada");
		d.alterarVeículo(u2);
	}


	private static void deletarVeiculo(){
		Veiculo v = em.find(Veiculo.class, 1);
		d.deletarVeículo(v);
	}

	private static void deletarEsportivo(){
		Esportivo e = em.find(Esportivo.class, 2);
		d.deletarEsportivo(e);
	}

	private static void deletarUtilitario(){
		Utilitario u = em.find(Utilitario.class, 3);
		d.deletarUtilitario(u);
	}

		
	public static void main(String args[]){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Atividade02");
		EntityManager em = emf.createEntityManager();
		
			
		
		int op = 9;
		switch (op){
			case 1: cadastrarVeiculo();
					break;
			case 2: cadastrarEsportivo();
					break;
			case 3: cadastrarUtilitario();
					break;
			case 4: alterarVeiculo();
					break;
			case 5: alterarEsportivo();
					break;
			case 6: alterarUtilitario();
					break;
			case 7: deletarVeiculo();
					break;
			case 8: deletarEsportivo();
					break;
			case 9: deletarUtilitario();
					break;


			default: System.out.println("Opção inválida.");
		}
		
	}
}
