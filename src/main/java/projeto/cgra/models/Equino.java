package projeto.cgra.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String raca;
	private String nasc;
	private String cor;
	private String brinco;
	private String pai;
	private String mae;
	@ManyToOne
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNasc() {
		return nasc;
	}
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getBrinco() {
		return brinco;
	}
	public void setBrinco(String brinco) {
		this.brinco = brinco;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	@Override
	public String toString() {
		return "Equino [id=" + id + ", raca=" + raca + ", nasc=" + nasc + ", cor=" + cor + ", brinco=" + brinco
				+ ", pai=" + pai + ", mae=" + mae + "]";
	}
	
	
	
	
}
