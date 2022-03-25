package com.alexsantos.api.Servicies;
	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexsantos.api.Repositories.PassagemRepository;
import com.alexsantos.api.entities.Passagem;

	
	@Service
	public class PassagemService {
		@Autowired
		private PassagemRepository Repository;
		
		@Transactional (readOnly = true)
		public List<Passagem> findALL(){
			List<Passagem> resultado = Repository.findAll();
			return resultado;
		}

	}
