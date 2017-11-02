package laboratorio5;

public class Tanque 
{
	protected String id;
	protected Valvulas valvulas[];
	
	public Tanque(String id)
	{
		this.id = id;
		valvulas = new Valvulas[10];
	}
	
	public String Dimensiones()
	{
		return "Las dimensiones son..";
	}
	
	public void encenderValvula(int NoValvula, String Fecha)
	{
		
	}
	
	public void ApagarValvula(int NoValvula, String Fecha)
	{
		
	}
	
	//public String CantidadAgua()
	{
		
	}
	
	public void RestablecerAgua()
	{
		
	}
	
	//public int CantidadValculas()
	{
		
	}
	
	//public String InfoMunicipio()
	{
		
	}
}
