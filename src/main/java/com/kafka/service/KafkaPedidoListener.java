package com.kafka.service;

import java.util.List;

import com.kafka.model.Pedido;

public interface KafkaPedidoListener {

	List<Pedido> getPedidos();
}
