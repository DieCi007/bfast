package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String cognome;

	@Temporal(TemporalType.DATE)
	@Column(name="`Data di nascita`")
	private Date data_di_nascita;

	@Id
	private String email;

	@Temporal(TemporalType.DATE)
	private Date nascit�;

	private String nome;

	private String password;

	private int telefono;

	//bi-directional many-to-one association to Ordine
	@OneToMany(mappedBy="utente")
	private List<Ordine> ordines;

	//bi-directional many-to-one association to Sceglie
	@OneToMany(mappedBy="utente")
	private List<Sceglie> sceglies;

	//bi-directional many-to-one association to Chiedeu
	@OneToMany(mappedBy="utente")
	private List<Chiedeu> chiedeus;

	public Utente() {
	}


	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public Date getData_di_nascita() {
		return this.data_di_nascita;
	}

	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Date getNascit�() {
		return this.nascit�;
	}

	public void setNascit�(Date nascit�) {
		this.nascit� = nascit�;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Ordine> getOrdines() {
		return this.ordines;
	}

	public void setOrdines(List<Ordine> ordines) {
		this.ordines = ordines;
	}

	public Ordine addOrdine(Ordine ordine) {
		getOrdines().add(ordine);
		ordine.setUtente(this);

		return ordine;
	}

	public Ordine removeOrdine(Ordine ordine) {
		getOrdines().remove(ordine);
		ordine.setUtente(null);

		return ordine;
	}

	public List<Sceglie> getSceglies() {
		return this.sceglies;
	}

	public void setSceglies(List<Sceglie> sceglies) {
		this.sceglies = sceglies;
	}

	public Sceglie addScegly(Sceglie scegly) {
		getSceglies().add(scegly);
		scegly.setUtente(this);

		return scegly;
	}

	public Sceglie removeScegly(Sceglie scegly) {
		getSceglies().remove(scegly);
		scegly.setUtente(null);

		return scegly;
	}

	public List<Chiedeu> getChiedeus() {
		return this.chiedeus;
	}

	public void setChiedeus(List<Chiedeu> chiedeus) {
		this.chiedeus = chiedeus;
	}

	public Chiedeu addChiedeus(Chiedeu chiedeus) {
		getChiedeus().add(chiedeus);
		chiedeus.setUtente(this);

		return chiedeus;
	}

	public Chiedeu removeChiedeus(Chiedeu chiedeus) {
		getChiedeus().remove(chiedeus);
		chiedeus.setUtente(null);

		return chiedeus;
	}

}