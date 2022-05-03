package com.eduale.bodega.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productoid;
	
	private String nombre;
	private String descripcion;
	private Double preciocompra;
	private Double precioventa;
	private Integer stock;
	private String estado;
	private String marca;
	private String imagen;
	
	public Producto() {
	}
	
	public Producto(Long productoid, String nombre, String descripcion, Double preciocompra, Double precioventa,
			Integer stock, String estado, String marca, String imagen) {
		this.productoid = productoid;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.stock = stock;
		this.estado = estado;
		this.marca = marca;
		this.imagen = imagen;
	}
	public Long getProductoid() {
		return productoid;
	}
	public void setProductoid(Long productoid) {
		this.productoid = productoid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(Double preciocompra) {
		this.preciocompra = preciocompra;
	}
	public Double getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(Double precioventa) {
		this.precioventa = precioventa;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
