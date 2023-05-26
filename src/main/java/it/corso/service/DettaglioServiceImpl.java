package it.corso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.OperaDao;
import it.corso.model.Opera;

@Service
public class DettaglioServiceImpl implements DettaglioService{

	@Autowired
	OperaDao operaDao;
	
	@Override
	public Opera findOperaById(int id) {
		return operaDao.findById(id).get();
	}
}
