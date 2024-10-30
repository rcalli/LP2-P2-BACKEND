package com.example.sysmat.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysmat.dao.AlumnoDAO;
import com.example.sysmat.entity.Facultad;
import com.example.sysmat.service.FacultadService;




@Service
public class FacultadServiceImpl implements FacultadService{
	

	@Autowired
	private AlumnoDAO dao;

	@Override
	public Facultad create(Facultad a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Facultad update(Facultad a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
