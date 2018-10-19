package ozet_Week01;

public class Ders_1 {

	public static void main(String[] args) {
	notHesapla(50);
	notHesapla2(45);
	}
	public static void notHesapla(int puan ){	
		if (puan == 0) {
			System.out.println("Seneye gel"); 
		}
		else if (puan >= 1 &&puan<=29) {
			System.out.println("FF");
		}
		else if (puan >= 30 &&puan<=40) {
			System.out.println("DD");
		}
		else if (puan >= 41 &&puan<=50) {
			System.out.println("CC");
		}
		else if (puan >= 51 &&puan<=70) {
			System.out.println("BB");
		}
		else if (puan >= 71 &&puan<=90) {
			System.out.println("BA");
		}
		else if (puan >= 91 && puan<=100 ) {
			System.out.println("AA");
		}
		else
			System.out.println("Yanlýþ puan girdiniz:");
		
			}
	
	
	public static void notHesapla2(int puan ){	
		if (puan == 100) {
			System.out.println("AA"); 
		}
		else if (puan>90) {
			System.out.println("BA");
		}
		else if (puan>85) {
			System.out.println("BB");
		}
		else if (puan >70) {
			System.out.println("CB");
		}
		else if (puan >50) {
			System.out.println("CC");
		}
		else if (puan >40) {
			System.out.println("DC");
		}
		else if (puan >30 ) {
			System.out.println("FF");
		}
		else
			System.out.println("Yanlýþ puan girdiniz:");
		
			}

}
