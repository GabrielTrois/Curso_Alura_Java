
public class TestaSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticar(g);
		si.autenticar(adm);
		si.autenticar(c);
	}

}
