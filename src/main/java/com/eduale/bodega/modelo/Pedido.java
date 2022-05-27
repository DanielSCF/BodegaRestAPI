package com.eduale.bodega.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "pedido")
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pedidoID;
	
	private String fecha;
	private Double total;
	private String modalidad;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="clienteID", nullable=false, 
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(clienteID) references cliente(clienteID)"))
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="trabajadorID", nullable=true, 
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(trabajadorID) references trabajador(trabajadorID)"))
	private Trabajador trabajador;
	
	@OneToMany(mappedBy="DetallePedidoID.pedido")
	private Set<DetallePedido>itemsDetallePedido=new HashSet<>();
	
	public Pedido() {
		
	}
	
	public Pedido(Long pedidoID, String fecha, Double total, String modalidad, String estado,  Cliente cliente, Trabajador trabajador) {
		super();
		this.pedidoID = pedidoID;
		this.fecha = fecha;
		this.total = total;
		this.modalidad = modalidad;
		this.estado = estado;
		this.cliente = cliente;
		this.trabajador = trabajador;
	}

	public Long getPedidoID() {
		return pedidoID;
	}

	public void setPedidoID(Long pedidoID) {
		this.pedidoID = pedidoID;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
}
