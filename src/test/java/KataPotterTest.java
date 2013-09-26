import static org.junit.Assert.*;

import org.junit.Test;

import KataPotter.KataPotter;


public class KataPotterTest {

	@Test
	public void ElCostoDeCeroLibrosEnCanastaEsIgualCero() {
		KataPotter kp = new KataPotter();
		kp.Canasta = 0;
		assertEquals(0, kp.PrecioCanasta());
	}

}
