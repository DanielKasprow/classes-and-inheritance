package zad1;

public class GameBoy extends Konsola{
	
	int iloscGier;
	int poborPradu;
	
	public GameBoy(int rok, String kolor,String nazwa,int sprzedaz, int iloscGier, int poborPradu)
	{
		super(rok, kolor,nazwa,sprzedaz);
		this.iloscGier = iloscGier;
		this.poborPradu = poborPradu;
	}
	
	public void Info()
	{
		super.Info();
		System.out.println("iloscGier: " + iloscGier);
		System.out.println("poborPradu: " + poborPradu + "V");
	}
}
