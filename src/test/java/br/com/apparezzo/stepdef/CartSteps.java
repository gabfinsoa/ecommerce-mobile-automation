package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.CartPage;
import br.com.apparezzo.utils.Utils;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CartSteps {
	
	public CartSteps() {
		
	}
	private Hook hook;
	CartPage cart = new CartPage(hook);
	
	@E("^clico em Concluir Compra$")
	public void clicarEmConcluirCompra() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		if(Utils.AREZZO) {
			cart.clicaConcluirCompra();
		}
	}

	@E("^clico em Concluir Compra Arezzo$")
	public void clicarEmConcluirCompraArezzo() throws MalformedURLException, InterruptedException {
		if(Utils.AREZZO) {
			cart.clicaConcluirCompra();
		}
	}
	
	@Quando("^clico em aumentar a quantidade de itens$")
	public void clicarEmAumentarQtd() throws MalformedURLException, InterruptedException {
		Thread.sleep(1000);
		cart.clicaAumentarQtd();
	}
	
    @Quando("^clico em diminuir a quantidade de itens$")
    public void clicarEmDiminuirQtd() throws MalformedURLException, InterruptedException {
		Thread.sleep(1000);
		cart.clicaDiminuirQtd();
    }
    
    @Então("^verifico se apresenta a quantidade (.*)$")
    public void verificoQtdUm(String qtd) throws MalformedURLException {
    	cart.getQtdProdutos().equals(qtd);
    }
}
