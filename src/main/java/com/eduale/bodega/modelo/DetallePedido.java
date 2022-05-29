package com.eduale.bodega.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
@AssociationOverrides({
		@AssociationOverride(name = "DetallePedidoID.pedido", joinColumns = @JoinColumn(name = "pedidoID", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(pedidoID) references pedido(pedidoID)"))),
		@AssociationOverride(name = "DetallePedidoID.producto", joinColumns = @JoinColumn(name = "productoid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(productoid) references producto(productoid)")))
})
public class DetallePedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetallePedidoKey DetallePedidoID = new DetallePedidoKey();

	@Column
	private Integer cantidad;

	@Column
	private Double precio_venta;

	@Column
	private Double subtotal;

	public DetallePedido() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(DetallePedidoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetallePedido other = (DetallePedido) obj;
		return Objects.equals(DetallePedidoID, other.DetallePedidoID);
	}

	public DetallePedidoKey getDetallePedidoID() {
		return DetallePedidoID;
	}

	public void setDetallePedidoID(DetallePedidoKey detallePedidoID) {
		DetallePedidoID = detallePedidoID;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Pedido getPedido() {
		return DetallePedidoID.getPedido();
	}

	public void setPedido(Pedido pedido) {
		this.DetallePedidoID.setPedido(pedido);
	}

	public Producto getProducto() {
		return DetallePedidoID.getProducto();
	}

	public void setProducto(Producto producto) {
		this.DetallePedidoID.setProducto(producto);
	}
}
