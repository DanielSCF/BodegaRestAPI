package com.eduale.bodega.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DetallePedidoKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Producto producto;

	public DetallePedidoKey() {
		
	}

	public DetallePedidoKey(Pedido pedido, Producto producto) {
		this.pedido = pedido;
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedido, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetallePedidoKey other = (DetallePedidoKey) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(producto, other.producto);
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
