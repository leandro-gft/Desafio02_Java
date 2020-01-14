package br.com.gft.model;


public class Carro extends Veiculo {

	public Carro(String _modelo, int _velocidade, int _passageiros, int _combustivel, String _marca, int _portas,
			int _ano) {
		super(_modelo, _velocidade, _passageiros, _combustivel);
		this.marca = _marca;
		this.portas = _portas;
		this.ano = _ano;
	}
	private String marca;
	private int portas;
	private int ano;
	 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}