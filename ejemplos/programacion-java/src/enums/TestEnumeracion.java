package enums;

public class TestEnumeracion {

	public static void main(String[] args) {
//		System.out.println("Dia 1: " + Dias.LUNES);
		indicarDiaSemana(Dias.MARTES);
		System.out.println("Continente nº 4: " + Continentes.AMERICA);
		System.out.println("Nº paises en el 4º contienente: " 
				+ Continentes.AMERICA.getPaises());
		
		System.out.println("Continente nº 1: " + Continentes.AFRICA);
		System.out.println("Nº paises en el 1º contienente: " 
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
