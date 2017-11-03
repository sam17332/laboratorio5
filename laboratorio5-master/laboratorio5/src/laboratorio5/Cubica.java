package laboratorio5;

public class Cubica extends Tanque {
	
	protected double lados;
	
	public Cubica(String id, double lados) {
		super(id);
		this.lados = lados;
	}
   
	public double dimensiones()
	{
		double resultado;
		resultado = lados*lados*lados;
		return resultado;
	}
}
