package br.com.fiap.main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Produto;

public class Main {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int textoInteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double textoDouble(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal (List<Produto> lp, Produto p) {
		double total = 0;
		for (Produto produto : lp) {
			total += produto.getValor()*produto.getQtd();
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		//interfaces que possuem contratos
		List<Produto> p = new ArrayList<Produto>();
		
		Produto p1;
		do {
			
			p1 = new Produto();
			p1.setId(textoInteiro("Digite o id:"));
			p1.setTipo(texto("Digite tipo de produto:"));
			p1.setMarca(texto("Digite a marca:"));
			p1.setQtd(textoInteiro("Digite a qtd:"));
			p1.setValor(textoDouble("Digite o valor:"));
			
			p.add(p1);
		} while (JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "CARRINHO DE COMPRA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
	
		for (Produto produto : p) {
			System.out.println(produto.getId());
			System.out.println(produto.getValor());
		}
		System.out.println(valorTotal(p, p1));
	}
	
}
