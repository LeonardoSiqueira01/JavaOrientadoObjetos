package cursojava.interfaces;
/*Essa interface ser� nosso contrato de autentica��o*/
public interface PermitirAcesso {
	
	
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
