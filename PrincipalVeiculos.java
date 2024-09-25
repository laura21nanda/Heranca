package Heranca;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		
		Veiculos veiculos = new Veiculos("Honda", "HR-V",2014,"Braco");
			System.out.println("Veiculo: ");
			System.out.println("Marca: " + veiculos.getMarca());
			System.out.println("Modelo: " + veiculos.getModelo());
			System.out.println("Ano: " + veiculos.getAno());
			System.out.println("Cor: " + veiculos.getCor());

			System.out.println("*************************************************************");
			
			Automovel automovel = new Automovel("Honda","HR-V",2018, "Preto", 4,"Motor");
			System.out.println("Automovel: ");
			System.out.println("Marca: " + automovel.getMarca());
			System.out.println("Modelo: " + veiculos.getModelo());
			System.out.println("Ano: " + veiculos.getAno());
			System.out.println("Cor: " + veiculos.getCor());
			System.out.println("Motor: " + automovel.getMotor());

			
			Moto moto = new Moto("honda","XRE 190",2018,"Preta",12345);
			System.out.println("Moto: ");
			System.out.println("Marca: " + moto.getMarca());
			System.out.println("Modelo: " + moto.getModelo());
			System.out.println("Ano: " + moto.getAno());
			System.out.println("Cor: " + moto.getCor());
			System.out.println("cilindrada: " + moto.getCilindrada());
			
		}

	}


