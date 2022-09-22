package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(1);
		sayiBulmaca(2);
		sayiBulmaca(3);
		sayiBulmaca(4);
		sayiBulmaca(5);
		sayiBulmaca(6);
	}
	
	public static void sayiBulmaca(int aranacak) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] == aranacak) {
				mesajVer("Aradığınız sayı listede vardır: ->",aranacak);
				return;
			}
		mesajVer("Aradığınız sayı listede yoktur: ->",aranacak);

	}
	
	public static void mesajVer(String mesaj,int sayi) {
	System.out.println(mesaj+sayi);
	}
}