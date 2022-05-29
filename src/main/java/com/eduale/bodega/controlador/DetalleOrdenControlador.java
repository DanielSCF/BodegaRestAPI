package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.DetalleOrden;
import com.eduale.bodega.servicio.DetalleOrdenServicio;

@RestController
@RequestMapping("/detalleorden")
public class DetalleOrdenControlador {
    @Autowired
    private DetalleOrdenServicio detalleordenservicio;

    @GetMapping
    public List<DetalleOrden> listaOrden(){
        return detalleordenservicio.listardetalleorden();
    }

    @PostMapping
    public DetalleOrden guardarOrden(@RequestBody DetalleOrden t){
        return detalleordenservicio.guardardetalleorden(t);
    }
}
