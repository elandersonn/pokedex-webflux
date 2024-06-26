package com.webflux.pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;

import com.webflux.pokedex.model.Pokemon;
import com.webflux.pokedex.repository.PokemonRepository;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}
	@Bean
	CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository) {
		return args -> {
			Flux<Pokemon> pokemonFlux = Flux.just(
				new Pokemon(null, "Cubone", "Normal", "Slash", "Lindo", 9.0),
				new Pokemon(null, "Marowak", "Normal", "Slash", "Mais Lindo", 10.0))
				.flatMap(repository::save);

				pokemonFlux
					.thenMany(repository.findAll())
					.subscribe(System.out::println);
		};
	}
}
