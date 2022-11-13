package zad1;

public class Konsola extends Urz¹dzenie implements DlaKonsoli{
	
	int rok;
	String kolor;
	String nazwa;
	int sprzedaz;
	
	@Override
	public int rokProdukcji() {
		return rok;
	}
	@Override
	public String nazwa() {
		return nazwa;
	}
	
	public Konsola(int rok, String kolor,String nazwa,int sprzedaz)
	{
		this.rok = rok;
		this.kolor = kolor;
		this.nazwa = nazwa;
		this.sprzedaz = sprzedaz;
	}
	
	public void Info() 
	{
		System.out.println("Urzadzenie: " + nazwa);
		System.out.println("rok produkcji: " + rok);
		System.out.println("kolor: " + kolor);
	}
	@Override
	public int sprzedaz() {
		// TODO Auto-generated method stub
		return sprzedaz;
	}
}
