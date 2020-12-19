package entities;

public class Pessoa {
	private Marcha marcha;
	
	public Pessoa (Marcha marcha) {
		this.marcha = marcha;
	}
	
	public void passarmarcha() {
		marcha.passarmarcha(this);
	}
	
	public void setMarcha(Marcha marcha) {
		this.marcha = marcha;
	}
}
