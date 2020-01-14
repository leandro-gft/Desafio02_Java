package br.com.gft.model;

public class Veiculo {
	private String modelo;
	private int velocidade;
	private int passageiros;
	private int combustivel;
	
	public Veiculo (String _modelo, int _velocidade, int _passageiros, int _combustivel) {
		this.modelo = _modelo;
		this.velocidade = _velocidade;
		this.passageiros = _passageiros;
		this.combustivel = _combustivel;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
}



