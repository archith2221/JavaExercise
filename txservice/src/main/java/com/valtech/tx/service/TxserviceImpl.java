package com.valtech.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.tx.entities.Tx;
import com.valtech.tx.repository.Repositorytx;

@Service
public class TxserviceImpl implements Txservice {

	@Autowired
	private Repositorytx repositorytx;

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#delete(com.valtech.tx.entities.Tx)
	 */
	@Override
	public void delete(Tx entity) {
		repositorytx.delete(entity);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#deleteAll()
	 */
	@Override
	public void deleteAll() {
		repositorytx.deleteAll();
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#deleteAllById(java.lang.Iterable)
	 */
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		repositorytx.deleteAllById(ids);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer id) {
		repositorytx.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#findAll()
	 */
	@Override
	public List<Tx> findAll() {
		return repositorytx.findAll();
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#findAllById(java.lang.Iterable)
	 */
	@Override
	public List<Tx> findAllById(Iterable<Integer> ids) {
		return repositorytx.findAllById(ids);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#getById(java.lang.Integer)
	 */
	@Override
	public Tx getById(Integer id) {
		return repositorytx.getById(id);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#save(S)
	 */
	@Override
	public <S extends Tx> S save(S entity) {
		return repositorytx.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.valtech.tx.service.Txservice#saveAll(java.lang.Iterable)
	 */
	@Override
	public <S extends Tx> List<S> saveAll(Iterable<S> entities) {
		return repositorytx.saveAll(entities);
	}

	@Override
	public Tx createTransaction(Tx ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tx getTransaction(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tx> getAllTx() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
