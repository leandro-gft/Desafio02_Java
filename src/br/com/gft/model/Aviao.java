package br.com.gft.model;

public class Aviao extends Veiculo {

	public Aviao(String _modelo, int _velocidade, int _passageiros, int _combustivel, String _cia, String _uso) {
		super(_modelo, _velocidade, _passageiros, _combustivel);
		this.cia = _cia;
		this.uso = _uso;
				
	}
	
	private String cia;
	private String uso;
	
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
		
}
