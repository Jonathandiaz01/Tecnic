package com.cursojava.curso.dao;

import com.cursojava.curso.models.factura;

import java.util.List;

public interface facturaDao {

    List<Factura> getFacturas();

    void eliminar(Long id_factura);

    void registrar(Factura Factura);

    Factura obtenerFacturaPorCredenciales(Factura Factura);
}
