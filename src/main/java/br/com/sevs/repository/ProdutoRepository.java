package br.com.sevs.repository;

import java.util.List;

import br.com.sevs.entity.Produto;

public class ProdutoRepository {

	private SevsRepository sevs = new SevsRepository();
	
	public void save(Produto produto) {
		sevs.save(produto);
	}

	public void update(Produto produto) {
		sevs.update(produto);
	}
	
	public void remove(Produto produto) {
		sevs.delete(produto);
	}
	
	public Produto getByProcod(int procod) {
		return (Produto) sevs.getSevsRepository()
				.createQuery("FROM Produto WHERE procod = :PROCOD")
				.setParameter("PROCOD", procod)
				.setMaxResults(1)
				.getSingleResult();
	}
	
	public List<Produto> getAll() {
		return sevs.getSevsRepository()
				.createQuery("FROM Produto")
				.getResultList();
	}

	public List<Produto> getByProtip(String protip) {
		return sevs.getSevsRepository()
				.createQuery("FROM Produto WHERE protip = :PROTIP")
				.setParameter("PROTIP", protip)
				.getResultList();
	}

}
