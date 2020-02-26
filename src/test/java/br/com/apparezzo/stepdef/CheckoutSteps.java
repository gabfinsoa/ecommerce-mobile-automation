package br.com.apparezzo.stepdef;

import br.com.apparezzo.pages.CheckoutPage;
import br.com.apparezzo.utils.Utils;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

import java.net.MalformedURLException;

public class CheckoutSteps {

	public CheckoutSteps() {

	}
	private Hook hook;
	
	CheckoutPage checkout = new CheckoutPage(hook);
	
	@Quando("^apresenta modal para realizar cadastro$")
	public void modalCadastro() throws InterruptedException, MalformedURLException {
        Thread.sleep(1000);
	    checkout.clicaCriarConta();
	}
	
    @E("^realizado o cadastro$")
    public void cadastrar() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
    	checkout.cadastrarUser();
    	Thread.sleep(4000);
    }
    
    @E("^preencho data de nascimento$")
    public void preenchoDataNascimento() {
    	checkout.preenchoDataNascimento();
    }
    
    @E("^preencho cpf$")
    public void preenchoCPF() {
    	checkout.preenchoCPF();
    }

    @E("^preencho o telefone$")
    public void preenchoTELEFONE() {
	    if(Utils.SCHUTZ) {checkout.preenchoTELEFONE();}
    }
    
    @E("^clico em Enviar$")
    public void clicoEnviar() {
    	checkout.clicoEnviar();
    }

    @Quando("^preencho o endereço$")
    public void preencherEndereco() throws MalformedURLException, InterruptedException {
    	checkout.preencherEndereco();
    }
    
    @E("^clico em ir para pagamento$")
    public void formaDePagamento() throws InterruptedException{
    	checkout.formaDePagamento();
    }
    
    @E("^escolho cartão de crédito$")
    public void preenchoCT() throws MalformedURLException, InterruptedException {
	    if(Utils.SCHUTZ){checkout.preenchoCTSCHUTZ();}
	    if(Utils.AREZZO){checkout.preenchoCT();}
    }
    
    @E("^escolho boleto$")
    public void clicoBoleto() {
    	checkout.clicaBoleto();
    }
    
    @E("^clico em Continuar$")
    public void clicoContinuar() {
	    checkout.clicaContinuar();
    }

    @E("^clico em Continuar em Arezzo$")
    public void clicoContinuarEmArezzo() {
	    if(Utils.AREZZO) {checkout.clicaContinuar();}
    }
    
    @E("^Finalizo o pedido$")
    public void finalizarPedido() {
    	checkout.finalizarPedido();
    }
    
}
