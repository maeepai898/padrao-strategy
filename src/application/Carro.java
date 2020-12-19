package application;

import entities.MarchingFor;
import entities.MarchingOne;
import entities.MarchingRe;
import entities.Pessoa;

public class Carro {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(new MarchingOne());
		
		pessoa.passarmarcha();
		pessoa.setMarcha(new MarchingFor());
		pessoa.passarmarcha();
		pessoa.setMarcha(new MarchingRe());
		pessoa.passarmarcha();
		
		

	}

}
