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
	
		
	public static void main(String args[]){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Atividade02");
		EntityManager em = emf.createEntityManager();
		
			
		
		int op = 1;
		switch (op){
			case 1: cadastrarVeiculo();
			//		break;
			//case 2: cadastrarDepartamentos();
			//		break;
			//case 3: cadastrarPessoas();
			//		break;
			//case 4: cadastrarProfessores();
			//		break;
			//case 5: cadastrarAlunos();
			//		break;
			default: System.out.println("Opção inválida.");
		}
		
	}
}
