package Carrinho;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import Carrinho.Produto;


public class App {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    FileWriter arquivo;
    int action = 0;
    int produtoAAdicionar;
    int qtd;

    Produto[] listaDeProdutos=new Produto[5];
    listaDeProdutos[0] = new Produto(0,"Nescau",10.00);
    listaDeProdutos[1] = new Produto(1,"Toddy",7.00);
    listaDeProdutos[2] = new Produto(2,"Iogurte",6.00);
    listaDeProdutos[3] = new Produto(3,"Danone",12.00);
    listaDeProdutos[4] = new Produto(4,"Yakult",17.00);
    String nome;
    Carrinho carrinho;

    System.out.println("Bem vindo ao Carrinho do Maycon");
    System.out.println("Qual o Nome do cliente?");

    nome = leitor.next();
    carrinho = new Carrinho(nome);

    while(action != 2) {
      System.out.println("");
      System.out.println("O que deseja fazer?");
      System.out.println("1 - Adicionar item ao carrinho?");
      System.out.println("2 - Sair");
      action = leitor.nextInt();

      if (action == 1) {
        System.out.println("Digite o codigo do produto");
        for(int i = 0; i< 5; i++){
          System.out.println(listaDeProdutos[i].toString());
        }
        produtoAAdicionar = leitor.nextInt();

        System.out.println("Digite a quantidade");
        qtd = leitor.nextInt();

        carrinho.addItem(listaDeProdutos[produtoAAdicionar], qtd);
        System.out.println("Item adicionado");
      }
    }

    System.out.println(carrinho.toString());

    try{
      arquivo = new FileWriter("compra.txt");

      arquivo.write(carrinho.toString());
      arquivo.close();
    } catch (IOException e) {
      System.out.println("Erro ao salvar arquivo");
    }

    System.out.println("Compra salva em compra.txt");
  }
}
