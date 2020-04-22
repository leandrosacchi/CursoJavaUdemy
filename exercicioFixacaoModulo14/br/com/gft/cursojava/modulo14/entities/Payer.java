package br.com.gft.cursojava.modulo14.entities;

public abstract class Payer {
	
		private String name;
		private Double anualIncome;
		
		public Payer() {
			
		}

		public Payer(String name, Double anualIncome) {
			this.name = name;
			this.anualIncome = anualIncome;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getAnualIncome() {
			return anualIncome;
		}

		public void setAnualIncome(Double anualIncome) {
			this.anualIncome = anualIncome;
		}
		
		public abstract Double tax();
		

}