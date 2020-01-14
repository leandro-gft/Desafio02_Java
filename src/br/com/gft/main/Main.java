package br.com.gft.main;

import br.com.gft.model.Aviao;
import br.com.gft.model.Carro;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro("Palio", 60, 4, 100, "Fiat", 4, 2005);
		System.out.println("Veja como os atributos foram preenchidos para carro: ");
		System.out.println("Modelo: " +c1.getModelo());
		System.out.println("Marca: " +c1.getMarca());
		System.out.println("Ano: " +c1.getAno());
		System.out.println("Numero de portas: " +c1.getPortas());
		System.out.println("Velocidade: " +c1.getVelocidade()+ " km/h");
		System.out.println("Numero de passageiros: " +c1.getPassageiros());
		System.out.println("Combustível: " +c1.getCombustivel() + " litros de combustível");
			
		System.out.println ("");
		System.out.println ("");
		
		Aviao a1 = new Aviao("Boeing 747", 800, 585, 300000, "American Airlines", "Comercial");
		System.out.println("Veja como os atributos foram preenchidos para avião: ");
		System.out.println("Modelo: " +a1.getModelo());
		System.out.println("Companhia Aerea: " +a1.getCia());
		System.out.println("Uso: " +a1.getUso());
		System.out.println("Velocidade: " +a1.getVelocidade()+ " km/h");
		System.out.println("Numero de passageiros: " +a1.getPassageiros());
		System.out.println("Combustível: " +a1.getCombustivel() + " litros de combustível");
		
		
	}
}
