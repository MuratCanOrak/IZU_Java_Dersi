package _01.primitiv;

public class Number {
	
	public static void main(String[] args) {
		
		int sayi = 5;
		int sayi2 = 4;
		
		double sayi3= 1.54;
		double sayi4= 15.15;
		
		int sonuc = sayi/sayi2;
		
		System.out.println(sonuc);
		System.out.println(sayi4*sayi3);
		
		int sonuc2= (int) (sayi2/sayi3);
		
		System.out.println(sayi2/sayi3);
		
		
		
		char karakter = 'M';
		
		System.out.println("konsola yaz . . . . . "+ karakter);
		System.out.println();
		
		
		for  ( int i=0; i<=100; i++) { // nereden baþla; nereye kadar; kaçar kaçar;
			System.out.print(i+" ");
		}
		System.out.println("");
		
		int sayici = 0;
		
		while (sayici<100) {
			System.out.print(sayici + " ");
			if (sayici==50) {
				System.out.println("tam ortasýndayým hayatýn.."+"sayici="+sayici);
			}
			
			sayici++;  
			
	}
		System.out.println("");
		
		String name= "Mehmet";
		 if (name=="ÖmeR") {
			 
			 System.out.println("beni ekrana yaz");
		 }
		 
		 else if (name=="Mehmet") {
			 System.out.println("Benim adým Mehmet");
		 }
		 else {
			 System.out.println("notOkey");
		 }
		
		
		
		
		
		
	}

}
