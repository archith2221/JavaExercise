package com.valtech.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.tx.entities.Tx;
import com.valtech.tx.service.Txservice;

@RestController
public class Txrestcontrollers {

	
	@Autowired
	private Txservice txservice;
	
    @PostMapping("/api/tx/")
    public Tx createTransaction(Tx ctx) {
        return txservice.createTransaction(ctx);
    }
@GetMapping("/api/tx/{id}")
    public Tx getTransaction(Long id) {
        return txservice.getTransaction(id);
    }
@GetMapping("api/tx/")
    public List<Tx> getAllTx() {
        return txservice.getAllTx();
}

}