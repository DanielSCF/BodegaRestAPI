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
@Table(name="detalle_orden")
@AssociationOverrides({
	@AssociationOverride(name="DetalleOrdenID.orden_compra",
			joinColumns = @JoinColumn(name="orden_compraid", nullable=false,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(orden_compraid) references orden_compra(orden_compraid)"))),
	@AssociationOverride(name="DetalleOrdenID.producto",
			joinColumns = @JoinColumn(name="productoid", nullable=false,
			foreignKey = @ForeignKey(foreignKeyDefinition ="foreign key(productoid) references producto(productoid)" )))
})
public class DetalleOrden implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DetalleOrdenKey DetalleOrdenID =new DetalleOrdenKey();
	
	@Column
	private Double precio;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double subtotal;

	public DetalleOrdenKey getDetalleOrdenID() {
		return DetalleOrdenID;
	}

	public void setDetalleOrdenID(DetalleOrdenKey detalleOrdenID) {
		DetalleOrdenID = detalleOrdenID;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	public OrdenCompra getOrden_compra() {
		return DetalleOrdenID.getOrden_compra();
	}

	public void setPedido(OrdenCompra orden_compra) {
		this.DetalleOrdenID.setOrden_compra(orden_compra);;
	}

	public Producto getProducto() {
		return DetalleOrdenID.getProducto();
	}

	public void setProducto(Producto producto) {
		this.DetalleOrdenID.setProducto(producto);
	}
	
	public DetalleOrden() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(DetalleOrdenID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleOrden other = (DetalleOrden) obj;
		return Objects.equals(DetalleOrdenID, other.DetalleOrdenID);
	}	
	
}
