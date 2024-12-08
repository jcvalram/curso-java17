package enums;

public class TestEnumeracion {

	public static void main(String[] args) {
//		System.out.println("Dia 1: " + Dias.LUNES);
		indicarDiaSemana(Dias.MARTES);
		System.out.println("Continente n� 4: " + Continentes.AMERICA);
		System.out.println("N� paises en el 4� contienente: " 
				+ Continentes.AMERICA.getPaises());
		
		System.out.println("Continente n� 1: " + Continentes.AFRICA);
		System.out.println("N� paises en el 1� contienente: " 
				+ Continentes.AFRICA.getPaises());
	}
	
	private static void indicarDiaSemana(Dias dias) {
		switch(dias) {
			case LUNES:
				System.out.println("Primer dia de la semana");
				break;
			case MARTES:
				System.out.println("Segundo dia de la semana");
				break;
			default:
				break;
		}
	}

}
