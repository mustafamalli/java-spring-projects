
public class Kopek extends Hayvan {
	private int disSayisi;
	public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
		
		super(isim, kilo, boy, bacakSayisi);
		this.disSayisi = disSayisi;
	}
	public int getDisSayisi() {
		return disSayisi;
	}
	public void setDisSayisi(int disSayisi) {
		this.disSayisi = disSayisi;
	}
	
	public void hareketeGec(int hiz) {
		System.out.println("Kopek " + " hiz ile hareket ediyor...");
	}
	
	public void kos(int hiz) {
		System.out.println("Kopek kosuyor...");
		
		hareketeGec(hiz);
	}
	
}
