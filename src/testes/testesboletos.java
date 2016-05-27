package testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;




public class testesboletos {

	@Test
	public void test() {

		List <Boleto> boletos = new ArrayList <Boleto> ();
		Boleto b1 = new Boleto ();
		Boleto b2 = new Boleto ();
		Boleto b3 = new Boleto ();
		b1.setValor (500);
		b2.setValor (400);
		b3.setValor (600);
		boletos.add(b1);
		boletos.add(b2);
		boletos.add(b3);
		Fatura  fatura = new Fatura ();
		fatura.setValor(1500.0);
		
		Util.processadorBoletos (boletos, fatura);
		Assert.assertEquals(fatura.getSituacao(), "PAGA"); 

		
	}

}
