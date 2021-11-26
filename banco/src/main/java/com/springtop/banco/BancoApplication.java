package com.springtop.banco;

import com.springtop.banco.model.Agencia;
import com.springtop.banco.model.Clientes;
import com.springtop.banco.repository.AgenciaRepository;
import com.springtop.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	// private ClienteRepository repository;
	private AgenciaRepository repository2;

	// public BancoApplication(ClienteRepository repository){
	// 	this.repository = repository;
	// }

	public BancoApplication(AgenciaRepository repository2){
		this.repository2 = repository2;
	}	
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	Clientes model = new Clientes();

	// 	model.setNome("Peppa");
	// 	model.setSobrenome("Pig");
	// 	model.setIdade(20);
	// 	model.setStream_favorito("Netflix");

	// 	repository.save(model);

	// 	repository.findAll().forEach(f -> System.out.printf("Id: %d - Nome: %s %s - Idade: %d - Streaming Favorito: %s", f.getId(), f.getNome(), f.getSobrenome(), f.getIdade(), f.getStream_favorito()));	
	// }

	@Override
	public void run(String... args) throws Exception {
		Agencia model = new Agencia();

		model.setId(1);
		model.setNome("CVC Nacional");
		model.setBairro("Ipanema");
		

		repository2.deleteById(1);

		repository2.findAll().forEach(a -> System.out.printf("Id: %d - Agencia: %s - Bairro: %s", a.getId(), a.getNome(), a.getBairro()));	
	}
}
