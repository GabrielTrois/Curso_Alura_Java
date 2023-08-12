package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente(123, 321);
		
		c.deposita(200.0);
		
		try {
			c.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(c.getSaldo());

	}

}
