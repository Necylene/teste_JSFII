package teste_JSFII;

public class Produto {
	
	private int codigo;
	private String nome;
	private int estoque;
	private double preco;
	private Unidade u1;

	public Produto(){
		u1 = new Unidade();
	}

	public Unidade getU1() {
		return u1;
	}

	public void setU1(Unidade u1) {
		this.u1 = u1;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
