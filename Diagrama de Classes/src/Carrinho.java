import java.util.Date;
import java.util.ArrayList;

public class Carrinho {
	private Date criacao;
	private ArrayList<Produto> itens = new ArrayList<Produto> ();
	
	public Carrinho(Date criacao) {
		this.criacao = criacao;
	}
	
	public Carrinho(Date criacao, ArrayList<Produto> itens) {
		this.criacao = criacao;
		this.itens.addAll(itens);
	}
	
	public Date getCriacao() {
		return this.criacao;
	}
	
	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
	
	public ArrayList<Produto> getItens() {
		return this.itens;
	}
	
	public void setItens(ArrayList<Produto> itens) {
		this.itens.addAll(itens);
	}
	
	// ToString
	// TODO
	
	// Equals
	// TODO
	
	// HashCode
	// TODO
}
