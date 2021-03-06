package com.eduale.bodega.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import com.eduale.bodega.modelo.DetallePedido;

public interface IDetallePedido extends CrudRepository<DetallePedido, Long> {
	@Query(value = "select * from detalle_pedido dp inner join producto pr on pr.productoid=dp.productoid inner join pedido p on p.pedidoid=dp.pedidoid inner join cliente c on c.clienteid=p.clienteid where c.clienteid =:cliente ORDER BY STR_TO_DATE(p.fecha, '%d/%m/%Y %h:%i:%s') DESC", nativeQuery = true)
	Optional<List<DetallePedido>> findPedidoByCliente(@Param("cliente") Long clienteID);

	@Query(value = "select * from detalle_pedido dp inner join producto pr on pr.productoid=dp.productoid inner join pedido p on p.pedidoid=dp.pedidoid inner join cliente c on c.clienteid=p.clienteid where c.clienteid =:cliente and p.estado =:estado ORDER BY STR_TO_DATE(p.fecha, '%d/%m/%Y %h:%i:%s') DESC", nativeQuery = true)
	Optional<List<DetallePedido>> findPedidoByClienteYEstado(@Param("cliente") Long clienteID, @Param("estado") String estado);

	@Query(value = "SELECT * FROM detalle_pedido WHERE pedidoid = :id", nativeQuery = true)
	public List<DetallePedido> detallesPedidoId(@Param("id") Long id);

}
