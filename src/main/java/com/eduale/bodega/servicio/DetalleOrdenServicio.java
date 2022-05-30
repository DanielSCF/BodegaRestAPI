package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.DetalleOrden;
import com.eduale.bodega.repositorio.IDetalleOrden;

@Service
public class DetalleOrdenServicio {
    @Autowired
    private IDetalleOrden detalleOrden;

    public List<DetalleOrden> listarDetalleOrden() {
        return (List<DetalleOrden>) detalleOrden.findAll();
    }
    
    public Optional<DetalleOrden> buscarid(Long id) {
        return detalleOrden.findById(id);
    }
    
    public DetalleOrden guardarDetalleOrden(DetalleOrden u) {
        return detalleOrden.save(u);
    }
    
    public DetalleOrden editarDetalleOrden(DetalleOrden u) {
        return detalleOrden.save(u);
    }
    
    public void eliminarDetalleOrden(DetalleOrden u) {
        detalleOrden.delete(u);
    }

    public List<DetalleOrden> listarSegunOrdenId(Long ordenId){
    	return (List<DetalleOrden>) detalleOrden.detallesOrdenId(ordenId);
    }
    
}
