package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		ekle();
		sil();
		guncelle();
		System.out.println(topla(5,6));
		System.out.println(topla2(1,2,3,4,5,6));
	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}
	
	public static int topla(int x, int y) {
		return x+y;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}

}
