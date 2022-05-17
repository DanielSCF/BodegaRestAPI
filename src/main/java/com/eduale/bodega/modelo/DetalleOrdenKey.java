package com.eduale.bodega.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DetalleOrdenKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private OrdenCompra orden_compra;
	
	@ManyToOne
	private Producto producto;

	public DetalleOrdenKey() {
		
	}

	public DetalleOrdenKey(OrdenCompra orden_compra, Producto producto) {
		super();
		this.orden_compra = orden_compra;
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orden_compra, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleOrdenKey other = (DetalleOrdenKey) obj;
		return Objects.equals(orden_compra, other.orden_compra) && Objects.equals(producto, other.producto);
	}

	public OrdenCompra getOrden_compra() {
		return orden_compra;
	}

	public void setOrden_compra(OrdenCompra orden_compra) {
		this.orden_compra = orden_compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}	

}
