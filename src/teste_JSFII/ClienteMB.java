package teste_JSFII;

import java.util.ArrayList;

public class ClienteMB {
	
	private Cliente cliente = new Cliente();
    private List<Cliente> clienteLista = new ArrayList<Cliente>();
		
	public ClienteMB(){
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Cliente> getClienteLista() {
		return clienteLista;
	}

	public void setClienteLista(List<Cliente> clienteLista) {
		this.clienteLista = clienteLista;
	}

	public String CadastroCliente(){
		return "cadastroCliente";
	}
	
	public String ListarClientes(){
		return "listarClientes";
	}
	
	public String VoltarInicio(){
		return "voltar";
	}
	
	public String salvarCliente() {	
		clienteLista.add(cliente);
		cliente = new Cliente();
		return "salvo";
	}	

}
