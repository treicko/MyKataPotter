import static org.junit.Assert.*;

import org.junit.Test;

import KataPotter.KataPotter;


public class KataPotterTest {

	@Test
	public void ElCostoDeCeroLibrosEnCanastaEsIgualCero() {
		KataPotter kp = new KataPotter();
		assertEquals(0, kp.PrecioCanasta());
	}
	
	@Test 
	public void AniadirUnLibroACanastaConPrecioIgualAOcho()
	{
		KataPotter kp = new KataPotter();
		kp.AniadirLibroACanastaDeCompras(0); //"0" representa al primer libro
		assertEquals(8, kp.PrecioCanasta());
	}

}
