
public class Idman {
	private int burpeeSayisi;
	private int pushupSayisi;
	private int situpSayisi;
	private int squatSayisi;
	
	public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
		this.burpeeSayisi = burpeeSayisi;
		this.pushupSayisi = pushupSayisi;
		this.situpSayisi = situpSayisi;
		this.squatSayisi = squatSayisi;
	}

	public int getBurpeeSayisi() {
		return burpeeSayisi;
	}

	public void setBurpeeSayisi(int burpeeSayisi) {
		this.burpeeSayisi = burpeeSayisi;
	}

	public int getPushupSayisi() {
		return pushupSayisi;
	}

	public void setPushupSayisi(int pushupSayisi) {
		this.pushupSayisi = pushupSayisi;
	}

	public int getSitupSayisi() {
		return situpSayisi;
	}

	public void setSitupSayisi(int situpSayisi) {
		this.situpSayisi = situpSayisi;
	}

	public int getSquatSayisi() {
		return squatSayisi;
	}

	public void setSquatSayisi(int squatSayisi) {
		this.squatSayisi = squatSayisi;
	}
		
	public void hareketYap(String hareketTuru, int sayi) {
		if(hareketTuru.equals("Burpee")){
			burpeeYap(sayi);
	}	 else if(hareketTuru.equals("Pushup")) {
			pushupYap(sayi);
	} else if(hareketTuru.equals("Situp")) {
			situpYap(sayi);
	} else if(hareketTuru.equals("Squat")) {
			squatYap(sayi);
	} else {
		System.out.println("Yanlis hareket turu girdiniz...");
	}
		
	}
		
		public void burpeeYap(int sayi) {
			if(burpeeSayisi == 0) {
				System.out.println("Yapacak burpee kalmadi...");
			}
			
			if(burpeeSayisi - sayi < 0) {
				System.out.println("Hedefledigin burpee sayisini gectin, tebrikler!");
				burpeeSayisi = 0;
				System.out.println("Kalan burpee: " + burpeeSayisi);
			} else {
				burpeeSayisi -= sayi;
				
				System.out.println("Kalan burpee: " + burpeeSayisi);
			}
		}
			
			
				
				public void pushupYap(int sayi) {
					if(pushupSayisi == 0) {
						System.out.println("Yapacak pushup kalmadi...");
					}
					
					if(pushupSayisi - sayi < 0) {
						System.out.println("Hedefledigin pushup sayisini gectin, tebrikler!");
						pushupSayisi = 0;
						System.out.println("Kalan pushup: " + pushupSayisi);
					} else {
						pushupSayisi -= sayi;
						
						System.out.println("Kalan pushup: " + pushupSayisi);
					}
				}
				
				public void situpYap(int sayi) {
					if(situpSayisi == 0) {
						System.out.println("Yapacak situp kalmadi...");
					}
					
					if(situpSayisi - sayi < 0) {
						System.out.println("Hedefledigin situp sayisini gectin, tebrikler!");
						situpSayisi = 0;
						System.out.println("Kalan situp: " + situpSayisi);
					} else {
						situpSayisi -= sayi;
						
						System.out.println("Kalan situp: " + situpSayisi);
					}
				}
					
					public void squatYap(int sayi) {
						if(squatSayisi == 0) {
							System.out.println("Yapacak squat kalmadi...");
						}
						
						if(squatSayisi - sayi < 0) {
							System.out.println("Hedefledigin squat sayisini gectin, tebrikler!");
							squatSayisi = 0;
							System.out.println("Kalan squat: " + squatSayisi);
						} else {
							squatSayisi -= sayi;
							
							System.out.println("Kalan squat: " + squatSayisi);
						}
		}
		
					public boolean idmanBittMi() {
						return(burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0) ;
					}
	
	
}
