package zad1;

public class DreamCast extends Konsola {
	
	int iloscGier;
	int poborPradu;
	
	public DreamCast()
	{
		
	}
	
	public DreamCast(int rok, String kolor, int iloscGier, int poborPradu)
	{
		super(rok, kolor);
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
