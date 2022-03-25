package com.alexsantos.api.Resources;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.alexsantos.api.entities.Passagem;
	import com.alexsantos.api.Servicies.PassagemService;

	@RestController
	@RequestMapping ("/passagem")
	public class PassagemResource {
		@Autowired
		private PassagemService Service;
		@GetMapping
		public List<Passagem> findALL (){
			return Service.findALL();
		}
		

	}


