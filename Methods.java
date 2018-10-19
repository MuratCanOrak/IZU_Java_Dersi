package _02;

public class Methods {
	
// 	System.out.println("");           //YANLIÞ!
	

	public static void main(String[] args) { 
	
	
		double degisken=hesapYap(3.2,5.3,7.5);
double sonuc2 = 	hesapYap(6.1, 10.1,9.3);
double sonuc3= 	hesapYap(45.32, 32.15,10.45);
double sonuc4 = 	hesapYap(17.45, 28.12,15);

	System.out.println("sonuc =    "+ degisken);
	System.out.println("sonuc2="+ sonuc2);
	System.out.println("sonuc3="+ sonuc3);
	System.out.println("sonuc4="+ sonuc4);
	}
	
	public static double  hesapYap(double sayi1, double sayi2, double sayi3) {
		double sonuc;
		sonuc=sayi1+sayi2+sayi3 ;
	return sonuc;
	}
	

}
