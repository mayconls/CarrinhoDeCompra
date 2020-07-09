package Carrinho;

import Carrinho.Item;
import Carrinho.Produto;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;

public class Carrinho {
	public String dataCompra;
	public String nomeCliente;
  public ArrayList<Item> listaDeItems;

	public Carrinho (String nome) {
SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		this.nomeCliente=nome;
		this.dataCompra=format.format(new Date());
    this.listaDeItems = new ArrayList<Item>();
	}

  public void addItem(Produto produto, int qtd) {
    listaDeItems.add(new Item(listaDeItems.size(), produto, qtd));
  }

  public double precoTotal() {
    double preco = 0;

    Iterator<Item> i = listaDeItems.iterator();

    while(i.hasNext()) {
      preco += i.next().precoTotalItem();
    }

    return preco;
  }

  public String toString() {
    Iterator i;
    String retorno = String.format(
        "Compra de: %s em %s\n",
        this.nomeCliente,
        this.dataCompra
    );

    i = listaDeItems.iterator();

    while (i.hasNext()){
      retorno += i.next().toString() + "\n";
    }

    retorno += String.format("Preço total: %.2f", this.precoTotal());

    return retorno;
  }
}
