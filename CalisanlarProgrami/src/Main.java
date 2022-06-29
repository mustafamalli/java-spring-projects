import java.util.Scanner;

/*
 Calisanlar Programi
 Calisanlar Sinifi Seklinde Bir Ust Sinif
 
 Calisan Sinifindan Tureyen Yazilimci Adinda Bir Alt Sinif
 Calisan Sinifindan Tureyen Yonetici Adinda Bir Alt Sinif
 
 */




public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calisanlar programina hosgeldiniz");
		
		String islemler = "Islemler...\n" + "1. Yazilimci islemleri\n" + "2. Yonetici Islemleri/n" + "Cikis icin Q ya basin..";
		System.out.println("****************************************");
		System.out.println(islemler);
		System.out.println("****************************************");
		
		while(true) {
			System.out.println("Islemi seciniz: ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q" )) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			
			else if(islem.equals("1")){
					Yazilimci yazilimci = new Yazilimci("Mustafa", "Malli", 1, "HTML, CSS, JavaScript, Java");
					String yazilimciIslemleri = "1. Format at\n" + "2. Bilgileri Goster\n" + "Cikis icin Q ya basin..";
					System.out.println(yazilimciIslemleri);
					while(true) {
						System.out.println("Islemi seciniz: ");
						String yIslem = scanner.nextLine();
						  if(yIslem.equals("q")) {
							  System.out.println("Yazilimci islemlerinden cikiliyor...");
							  break;
						  }
						  else if(yIslem.equals("1")) {
							  	System.out.println("Isletim sistemi: ");
							  	String isletimSistemi = scanner.nextLine();
							  	yazilimci.formatAt(isletimSistemi);
						  }
						  else if(yIslem.equals("2")) {
							  yazilimci.bilgileriGoster();
						  }
						  else {
							  System.out.println("Gecersiz yazilimci islemi...");
						  }
					}
			}
			
			else if(islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);
				String yoneticiIslem = "Yonetici Islemleri/n" + "1. Zam Yap/n" + "2. Bilgileri Goster\n" + "Cikis icin Q ya basin..";
				System.out.println(yoneticiIslem);
				while(true) {
					System.out.println("Islem seciniz: ");
					String yonIslem = scanner.nextLine();
					
					if(yonIslem.equals("q")) {
						System.out.println("Yonetici islemlerinden cikiliyor...");
						break;
					}
					
					else if(yonIslem.equals("1")) {
						System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz?");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();
						yonetici.zamYap(zamMiktari);
					}
					
					else if(yonIslem.equals("2")) {
						yonetici.bilgileriGoster();
					}
					else {
						System.out.println("Gecersiz yonetici islemi...");
					}
				}
			}
			
			else {
				System.out.println("Gecersiz islem..");
			}
			
		}

	}

}
