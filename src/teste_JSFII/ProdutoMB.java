package teste_JSFII;

import java.util.ArrayList;
import java.util.List;

import util.ConverterUnidade;

public class ProdutoMB {

	private Produto p1 = new Produto();
    private List<Produto> produtoLista = new ArrayList<Produto>();
	private List<Unidade> unidadeLista = new ArrayList<Unidade>();
	private ConverterUnidade converterUnidade;
		
	public ProdutoMB(){
		converterUnidade = new ConverterUnidade(unidadeLista);
	}

	public ConverterUnidade getConverterUnidade() {
		return converterUnidade;
	}

	public void setConverterUnidade(ConverterUnidade converterUnidade) {
		this.converterUnidade = converterUnidade;
	}

	public Produto getP1() {
		return p1;
	}

	public void setP1(Produto p1) {
		this.p1 = p1;
	}
	
	public List<Produto> getProdutoLista() {
		return produtoLista;
	}

	public void setProdutoLista(List<Produto> produtoLista) {
		this.produtoLista = produtoLista;
	}

	public String CadastroProduto(){
		return "cadastro";
	}
	
	public String ListarProdutos(){
		return "listarProdutos";
	}
	
	public String VoltarInicio(){
		return "voltar";
	}
	
	public String salvarProduto() {	
		produtoLista.add(p1);
		p1 = new Produto();
		return "salvo";
	}	
	
}
