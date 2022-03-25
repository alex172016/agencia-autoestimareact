package com.alexsantos.api.entities;
	

	import java.util.Objects;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	
	@Entity
	public class Passagem {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nome;
		private long bilhete;
		private String preco;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public long getBilhete() {
			return bilhete;
		}
		public void setBilhete(long bilhete) {
			this.bilhete = bilhete;
		}
		public String getPreco() {
			return preco;
		}
		public void setPreco(String preco) {
			this.preco = preco;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Passagem other = (Passagem) obj;
			return id == other.id;
		}
		public Passagem(long id, String nome, long bilhete, String preco) {
			super();
			this.id = id;
			this.nome = nome;
			this.bilhete = bilhete;
			this.preco = preco;
		}
	}



