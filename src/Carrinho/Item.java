package Carrinho;

import Carrinho.Produto;

public class Item {
	public int numItem;
	public Produto produto;
	public int qtd;

	public Item (int numItem, Produto produto, int qtd) {
    this.numItem = numItem;
    this.produto = produto;
    this.qtd = qtd;
	}

  public double precoTotalItem() {
    return produto.precounit * qtd;
  }

  public String toString() {
    return String.format(
        "%d - %s, qtd: %d, preço total: %.2f",
        this.numItem,
        this.produto.descricao,
        this.qtd,
        this.precoTotalItem()
    );
  }
}

