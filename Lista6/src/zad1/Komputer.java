package zad1;

public class Komputer extends Urz¹dzenie implements DlaKomputera{
	
	int rok;
	String nazwa;
	String producent;
	
	@Override
	public int rokProdukcji() {
		return rok;
	}
	@Override
	public String nazwa() {
		return nazwa;
	}
	
	public Komputer(int rok, String nazwa,String producent)
	{
		this.rok = rok;
		this.nazwa = nazwa;
		this.producent = producent;
	}
	
	public void Info() 
	{
		System.out.println("Urzadzenie: " + nazwa);
		System.out.println("rok produkcji: " + rok);
	}
	@Override
	public String producent() {
		// TODO Auto-generated method stub
		return producent;
	}
}