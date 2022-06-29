import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman programina hosgeldiniz...");
		
		String idmanlar = "Gecerli hareketler...\n" + "Burpee\n" + "Pushup\n" + "Situp\n" + "Squat";
		System.out.println(idmanlar);
		System.out.println("Bir idman olusturun...");
		
		System.out.println("Burpee sayisi: ");
		int burpee = scanner.nextInt();

		System.out.println("Pushup sayisi: ");
		int pushup = scanner.nextInt();
		
		System.out.println("Situp sayisi: ");
		int situp = scanner.nextInt();
		
		System.out.println("Squat sayisi: ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("Idmaniniz basliyor...");
		
		while(idman.idmanBittMi() == false) {
			System.out.println("Hareket Turu(Burpee, Pushup, Situp, Squat)");
			String tur = scanner.nextLine();
			
			System.out.println("Bu hareketten kac tane yapacaksiniz?");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
		
		System.out.println("Idmanini basari ile bitirdin!..");
		

	}

}
