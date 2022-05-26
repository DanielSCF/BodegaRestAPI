package com.eduale.bodega.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

import com.eduale.bodega.modelo.DetallePedido;

public interface IDetallePedido extends CrudRepository<DetallePedido, Long>{
	Optional<List<DetallePedido>> findPedidoByCliente(Long clienteID);


	/*
	public static final String sql="select dp.precio_venta, p.pedidoid,po.productoid,po.nombre,po.descripcion,po.imagen, dp.cantidad,dp.subtotal,p.total, p.fecha  from pedido p inner join cliente c on c.clienteid=p.clienteid inner join detalle_pedido dp ON dp.pedidoid=p.pedidoid inner join producto po ON po.productoid=dp.productoid where c.clienteid=:cliente";
	@Query(value=sql, nativeQuery=true)
	public List<DetallePedido> findDetallePedido(@Param("cliente") Long cliente);
	*/
}
