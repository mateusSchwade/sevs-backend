package br.com.sevs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.glassfish.jersey.server.JSONP;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="usucod")
	private int usucod;
	
	@Column(name="usunom")
	private String usunom;
	
	@Column(name="usutip")
	private String usutip;
	
	@Column(name="ususen")
	private String ususen;
	
	@Column(name="usuema")
	private String usuema;
	
	@Column(name="usucpf")
	private String usucpf;

	public int getUsucod() {
		return usucod;
	}

	public void setUsucod(int usucod) {
		this.usucod = usucod;
	}

	public String getUsunom() {
		return usunom;
	}

	public void setUsunom(String usunom) {
		this.usunom = usunom;
	}

	public String getUsutip() {
		return usutip;
	}

	public void setUsutip(String usutip) {
		this.usutip = usutip;
	}

	public String getUsusen() {
		return ususen;
	}

	public void setUsusen(String ususen) {
		this.ususen = ususen;
	}

	public String getUsuema() {
		return usuema;
	}

	public void setUsuema(String usuema) {
		this.usuema = usuema;
	}

	public String getUsucpf() {
		return usucpf;
	}

	public void setUsucpf(String usucpf) {
		this.usucpf = usucpf;
	}
	
}
