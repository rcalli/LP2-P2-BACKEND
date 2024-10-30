package com.example.sysmat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysmat.entity.Facultad;
import com.example.sysmat.entity.Escuela;


@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long>{

}
