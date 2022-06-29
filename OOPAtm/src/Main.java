
public class Main {

	public static void main(String[] args) {
		// Object Oriented (Nesne Yonelimli) ATM Programi
		
		//Login Class'i Kullanici Girisini Kontrol Edecek
		
		// Hesap Class'i Hesap Islemlerini Yapacak
		
		// ATM ise Atmmizi Calistiracak
		
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("Mustafa Malli", "12345", 2000);
		atm.calis(hesap);
		System.out.println("Programdan cikiliyor...");

	}

}
