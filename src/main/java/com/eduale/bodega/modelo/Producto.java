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
@Table(name = "producto")
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productoid;
	
	private String nombre;
	private String descripcion;
	private Double preciocompra;
	private Double precioventa;
	private Integer stock;
	private String estado;
	private String imagen;
	
	@ManyToOne
	@JoinColumn(name="categoriaID", nullable=false, 
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(categoriaID) references categoria(categoriaID)"))
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="marcaID", nullable=false, 
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(marcaID) references marca(marcaID)"))
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="loteID", nullable=false, 
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(loteID) references lote(loteID)"))
	private Lote lote;
	
	@OneToMany(mappedBy="DetallePedidoID.producto")
	private Set<DetallePedido>itemsDetallePedido=new HashSet<>();

	@OneToMany(mappedBy="DetalleOrdenID.producto")
	private Set<DetalleOrden>itemsDetalleOrden=new HashSet<>();
	
	public Producto() {
	}
	
	public Producto(Long productoid, String nombre, String descripcion, Double preciocompra, Double precioventa,
			Integer stock, String estado, String imagen, Categoria categoria, Marca marca, Lote lote) {
		super();
		this.productoid = productoid;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.stock = stock;
		this.estado = estado;
		this.imagen = imagen;
		this.categoria = categoria;
		this.marca = marca;
		this.lote = lote;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
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
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
