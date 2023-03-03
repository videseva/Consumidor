package com.kafka.controller;

import org.springframework.http.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Pedido;
import com.kafka.service.KafkaPedidoListener;

@CrossOrigin("*")
@RestController
public class VentasController {
	@Autowired
	KafkaPedidoListener listener;
	@GetMapping(value = "ventas", produces=MediaType.APPLICATION_JSON_VALUE)	
	public List<Pedido> pedidos(){
		return listener.getPedidos();
	}
	

}
