package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.PedidoPage;
import cucumber.api.java.pt.Então;

public class PedidoSteps {

	public PedidoSteps() {
		
	}
	
	private Hook hook;
	
	PedidoPage pedido = new PedidoPage(hook);
	
	@Então("^Apresenta a página de pedido concluído$")
    public void pedidoConcluido() throws MalformedURLException {
    	pedido.pedidoConcluido();
    }
}
