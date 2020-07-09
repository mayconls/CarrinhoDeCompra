package Carrinho;

public class Produto {
	public int codigo;
	public String descricao;
	public double precounit;

	public Produto (int codigo, String descricao, double precounit) {
		this.codigo=codigo;
		this.descricao=descricao;
		this.precounit=precounit;
	}

  public String toString () {
    return String.format(
        "%d %s Preço: %.2f",
        this.codigo,
        this.descricao,
        this.precounit
    );
  }
}
