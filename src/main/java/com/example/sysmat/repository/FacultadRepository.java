package com.example.sysmat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysmat.entity.Facultad;


@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{

}
