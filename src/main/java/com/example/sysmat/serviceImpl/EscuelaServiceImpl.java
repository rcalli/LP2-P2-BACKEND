package com.example.sysmat.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysmat.dao.MatriculaDAO;
import com.example.sysmat.entity.Escuela;
import com.example.sysmat.service.EscuelaService;




@Service
public class EscuelaServiceImpl implements EscuelaService{
	

	@Autowired
	private MatriculaDAO dao;

	@Override
	public Escuela create(Escuela a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Escuela update(Escuela a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
