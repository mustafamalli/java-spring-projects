
public class Yonetici extends Calisan { //Subclass

	private int sorumluKisi; // ekstra ozellik
	
	public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
		super(isim, maas, departman);
		
		this.sorumluKisi = sorumluKisi;
	}
	
	public void zamYap(int zamMiktari) {
		System.out.println("Calisanlara " + zamMiktari + " TL zam yapildi.");
	}
	
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Sorumlu Kisi Sayisi: " + this.sorumluKisi);
	}
}
