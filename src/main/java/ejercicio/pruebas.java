package ejercicio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class pruebas {
	  private  String frase;
	    private  boolean esperado;

		public pruebas(String frase, boolean esperado) {
			this.frase = frase;
			this.esperado = esperado;
		}
	@Parameters
	public static Collection<Object[]> datos(){
		 return Arrays.asList(new Object[][] {
	            {"¡arriba la birra!", true},
	            {"Repartir", false},
	            {"reconocer", true},
	            {"Isaac no ronca así", true}
	        });
	}
	
	@Test
	public void testPalindromo() {
		 String fraseLimpia = ExtraOrdinariaENDE.quitarCaracteresEspeciales(frase.toLowerCase().replaceAll("\\s+", ""));
	        assertEquals(esperado, ExtraOrdinariaENDE.esPalindromo(fraseLimpia));
	}
}
