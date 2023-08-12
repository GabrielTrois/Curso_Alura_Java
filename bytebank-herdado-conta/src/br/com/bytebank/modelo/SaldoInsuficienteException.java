package br.com.bytebank.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException() {
		super();
	}
			
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
