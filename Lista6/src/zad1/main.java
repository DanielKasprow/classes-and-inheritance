package zad1;

public class main {
	public static void main(String[] args) {
		DreamCast d = new DreamCast(2005,"bialy","DreamCast",15,143,300);
		d.Info();
		System.out.println("Sprzedane kopie: " + d.sprzedaz +"m");
		System.out.println();
		GameBoy g = new GameBoy(2030,"Szary","GameBoy 2",20,4,50);
		g.Info();
		System.out.println("Sprzedane kopie: " + g.sprzedaz +"m");
		System.out.println();
		Commodore64 c = new Commodore64(1989,"Commodore64","ma","CBM",250);
		c.Info();
		System.out.println("Producent: " + c.producent);
		System.out.println();
		Atari a = new Atari(1993,"Atari 7800","6052c","Atari",300);
		c.Info();
		System.out.println("Producent: " + c.producent);
		System.out.println();
	}
}
