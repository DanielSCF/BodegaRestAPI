package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.DetalleOrden;
import com.eduale.bodega.repositorio.IDetalleOrden;

@Service
public class DetalleOrdenServicio {
    @Autowired
    private IDetalleOrden detalleOrden;

    public List<DetalleOrden> listardetalleorden(){
        return (List<DetalleOrden>) detalleOrden.findAll();
    }

    public DetalleOrden guardardetalleorden(DetalleOrden u) {
		return detalleOrden.save(u);
	}
    
}
