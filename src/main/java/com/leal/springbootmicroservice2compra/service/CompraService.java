package com.leal.springbootmicroservice2compra.service;

import com.leal.springbootmicroservice2compra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
