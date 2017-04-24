package controle;

import javax.persistence.EntityManager;

import modelo.Esportivo;
import modelo.Utilitario;
import modelo.Veiculo;

public class DAO {
	public static void inserirVe�culo(Veiculo v){
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(v);
		System.out.println("Veiculo " + v.getModelo() + " cadastrado.");
		em.getTransaction().commit();
	}

}
	