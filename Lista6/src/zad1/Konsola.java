package zad1;

public class Konsola extends Urz¹dzenie{
	
	int rok;
	
	@Override
	public int rokProdukcji() {
		return rok;
	}
	
	String nazwa;
	String kolor;
	
	public Konsola()
	{
	
	}

	public Konsola(int rok, String kolor)
	{
		this.rok = rok;
		this.kolor = kolor;
	}
	
	public void Info() 
	{
		System.out.println("rok produkcji: " + rok);
		System.out.println("kolor: " + kolor);
	}
}
