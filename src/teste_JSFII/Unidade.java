package teste_JSFII;

public class Unidade {
	
	private String codigo;
	private String descricao;
	
	public Unidade(){		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString(){
		return descricao;
	}
}
