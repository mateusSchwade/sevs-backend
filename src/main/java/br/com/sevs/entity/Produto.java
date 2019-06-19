package br.com.sevs.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="procod")
	private int procod;
	
	@Column(name="pronom")
	private String pronom;
	
	@Column(name="protip")
	private String protip;
	
	@Column(name="propre")
	private BigDecimal propre;

	public int getProcod() {
		return procod;
	}

	public void setProcod(int procod) {
		this.procod = procod;
	}

	public String getPronom() {
		return pronom;
	}

	public void setPronom(String pronom) {
		this.pronom = pronom;
	}

	public String getProtip() {
		return protip;
	}

	public void setProtip(String protip) {
		this.protip = protip;
	}

	public BigDecimal getPropre() {
		return propre;
	}

	public void setPropre(BigDecimal propre) {
		this.propre = propre;
	}
	
}
