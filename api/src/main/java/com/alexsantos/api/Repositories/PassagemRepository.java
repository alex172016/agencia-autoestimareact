package com.alexsantos.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsantos.api.entities.Passagem;


public interface PassagemRepository  extends JpaRepository<Passagem, Long>{

}
