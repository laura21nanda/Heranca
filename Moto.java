package Heranca;

public class Moto extends Veiculos{

		private int cilindrada;
		public Moto(String marca, String modelo, int ano, String cor, int cilindrada) {
			super(marca,modelo,ano,cor); //herdando atributos de superclasse
			this.cilindrada=cilindrada;
		}
		public int getCilindrada() {
			return cilindrada;
		}
		public void setCilindrada(int cilindrada) {
			this.cilindrada= cilindrada;
		}
	}

