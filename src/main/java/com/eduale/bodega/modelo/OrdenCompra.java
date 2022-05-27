package com.eduale.bodega.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orden_compra")
public class OrdenCompra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orden_compraID;
	
	@Column
	private String fecha;

	@Column
	private String total;

	@Column
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="proveedorID",nullable=true,unique=false,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(proveedorID) references proveedor(proveedorID)"))
	private Proveedor proveedor;
	
	@ManyToOne
	@JoinColumn(name="trabajadorID",nullable=true,unique=false,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(trabajadorID) references trabajador(trabajadorID)"))
	private Trabajador trabajador;

	@OneToMany(mappedBy="DetalleOrdenID.orden_compra")
	private Set<DetalleOrden>itemsDetalleOrden=new HashSet<>();
	
	public OrdenCompra() {
		
	}

	public OrdenCompra(Long orden_compraID, String fecha, String total, String estado, Proveedor proveedor,
			Trabajador trabajador) {
		super();
		this.orden_compraID = orden_compraID;
		this.fecha = fecha;
		this.total = total;
		this.estado = estado;
		this.proveedor = proveedor;
		this.trabajador = trabajador;
	}

	public Long getOrden_compraID() {
		return orden_compraID;
	}

	public void setOrden_compraID(Long orden_compraID) {
		this.orden_compraID = orden_compraID;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
}
