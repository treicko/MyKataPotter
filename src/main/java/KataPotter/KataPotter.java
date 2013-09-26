package KataPotter;

public class KataPotter {

	private int[] Canasta;
	private int PrecioTotal;

	public Object PrecioCanasta() 
	{
		return PrecioTotal;
	}

	public void AniadirLibroACanastaDeCompras(int libro) 
	{
		Canasta = new int[10];
		
		if(Canasta.length == 0)
		{
			PrecioTotal = 0;
		}
		else
		{
			Canasta[0]=libro;
			PrecioTotal = 8;
		}
	}

}
