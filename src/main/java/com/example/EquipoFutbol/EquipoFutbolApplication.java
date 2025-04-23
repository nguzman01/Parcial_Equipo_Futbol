package com.example.EquipoFutbol;

import com.example.EquipoFutbol.Model.Jugador;
import com.example.EquipoFutbol.Repository.JugadorRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class EquipoFutbolApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(EquipoFutbolApplication.class, args);
	}

	public static void loadEnv(){
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

	}



}
