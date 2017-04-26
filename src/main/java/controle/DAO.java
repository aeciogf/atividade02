package controle;

import javax.persistence.EntityManager;

import modelo.Esportivo;
import modelo.Utilitario;
import modelo.Veiculo;

public class DAO {
	public static void inserirVeículo(Veiculo v){
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(v);
		System.out.println("Veiculo " + v.getModelo() + " cadastrado.");
		em.getTransaction().commit();
	}
	
	public static void inserirEsportivo(Esportivo e){
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(e);
		System.out.println("Veiculo " + e.getModelo() + " cadastrado.");
		em.getTransaction().commit();
	}
	
	public static void inserirUtilitario(Utilitario u){
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(u);
		System.out.println("Veiculo " + u.getModelo() + " cadastrado.");
		em.getTransaction().commit();
	}
	
	public static void alterarVeículo(Veiculo v){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.merge(v);
		System.out.println("Veiculo " + v.getModelo() + " alterado.");
		em.getTransaction().commit();
	}
	
	public static void alterarEsportivo(Esportivo e){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.merge(e);
		System.out.println("Veiculo " + e.getModelo() + " alterado.");
		em.getTransaction().commit();
	}

	public static void alterarUtilitario(Utilitario u){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.merge(u);
		System.out.println("Veiculo " + u.getModelo() + " alterado.");
		em.getTransaction().commit();
	}

	public static void deletarVeículo(Veiculo v){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.remove(v);
		System.out.println("Veiculo " + v.getModelo() + " deletado.");
		em.getTransaction().commit();
	}
	
	public static void deletarEsportivo(Esportivo e){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.remove(e);
		System.out.println("Veiculo " + e.getModelo() + " deletado.");
		em.getTransaction().commit();
	}
	
	public static void deletarUtilitario(Utilitario u){
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.remove(u);
		System.out.println("Veiculo " + u.getModelo() + " deletado.");
		em.getTransaction().commit();
	}
}
	