package com.valtech.tx.service;

import java.util.List;

import com.valtech.tx.entities.Tx;

public interface Txservice {

	void delete(Tx entity);

	void deleteAll();

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteById(Integer id);

	List<Tx> findAll();

	List<Tx> findAllById(Iterable<Integer> ids);

	Tx getById(Integer id);

	<S extends Tx> S save(S entity);

	<S extends Tx> List<S> saveAll(Iterable<S> entities);

	Tx createTransaction(Tx ctx);

	Tx getTransaction(Long id);

	List<Tx> getAllTx();

}