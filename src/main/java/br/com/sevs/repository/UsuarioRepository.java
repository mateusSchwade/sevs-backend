package br.com.sevs.repository;

import java.util.List;

import br.com.sevs.entity.Usuario;

public class UsuarioRepository {

	private SevsRepository sevs = new SevsRepository();
	
	public void save(Usuario usuario) {
		sevs.save(usuario);
	}

	public void update(Usuario usuario) {
		sevs.update(usuario);
	}
	
	public void remove(Usuario usuario) {
		sevs.delete(usuario);
	}
	
	public Usuario getByUsucod(int usucod) {
		return (Usuario) sevs.getSevsRepository()
				.createQuery("FROM Usuario u WHERE u.usucod = :USUCOD")
				.setParameter("USUCOD", usucod)
				.setMaxResults(1)
				.getSingleResult();
	}
	
	public List<Usuario> getAll() {
		return sevs.getSevsRepository()
				.createQuery("FROM Usuario")
				.getResultList();
	}

	public Usuario getBySenhaEmail(String usuema, String ususen) {
		return (Usuario) sevs.getSevsRepository()
				.createQuery("FROM Usuario u WHERE u.usuema = :USUEMA AND u.ususen = :USUSEN")
				.setParameter("USUEMA", usuema)
				.setParameter("USUSEN", ususen)
				.setMaxResults(1)
				.getSingleResult();
	}
	
}
