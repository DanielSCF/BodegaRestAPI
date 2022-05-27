package com.eduale.bodega.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lote")
public class Lote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loteID;
	
	@NotNull
	@Column
	private String fingreso;

	@NotNull
	@Column
	private String fvencimiento;
	
	@OneToMany(mappedBy ="lote")
	private Collection<Producto> p2= new ArrayList<>();
	
	public Lote(Long loteID, String fingreso, String fvencimiento) {
		super();
		this.loteID = loteID;
		this.fingreso = fingreso;
		this.fvencimiento = fvencimiento;
	}
	
	public Lote() {
		
	}
	
	public Long getLoteID() {
		return loteID;
	}
	public void setLoteID(Long loteID) {
		this.loteID = loteID;
	}
	public String getFingreso() {
		return fingreso;
	}
	public void setFingreso(String fingreso) {
		this.fingreso = fingreso;
	}
	public String getFvencimiento() {
		return fvencimiento;
	}
	public void setFvencimiento(String fvencimiento) {
		this.fvencimiento = fvencimiento;
	}	
	
}
