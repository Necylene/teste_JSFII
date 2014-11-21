package teste_JSFII;

import java.util.ArrayList;
import java.util.List;

public class UnidadeMB {
	
	private Unidade u1 = new Unidade();
	private List<Unidade> unidadeLista = new ArrayList<Unidade>();


	public UnidadeMB(){	

	}
	
	public Unidade getU1() {
		return u1;
	}

	public void setU1(Unidade u1) {
		this.u1 = u1;
	}

	public List<Unidade> getUnidadeLista() {
		return unidadeLista;
	}

	public void setUnidadeLista(List<Unidade> unidadeLista) {
		this.unidadeLista = unidadeLista;
	}
	
	public String CadastroUnidade(){
		return "cadastroUnidade";
	}	
	
	public String ListarUnidades(){
		return "listarUnidades";
	}	
	
	public String VoltarInicio(){
		return "voltar";
	}
	
	public String salvarUnidade() {
		unidadeLista.add(u1);
		u1 = new Unidade();
		return "salvo";
	}
}
