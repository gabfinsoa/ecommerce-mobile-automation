package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.HomePage;
import br.com.apparezzo.utils.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class HomeSteps {
	
	public HomeSteps() {
		
	}
	private Hook hook;
	HomePage home = new HomePage(hook);
	
	@Dado("^que acesso o App$")
	public void que_acesso_o_App_Arezzo() throws MalformedURLException, InterruptedException {
		if (Utils.AREZZO) {
			Thread.sleep(1000);
			home.clicaSair();}
	}

	@Dado("^que clico em Criar com Conta Arezzo$")
	public void que_clico_em_Entrar_Conta_Arezzo() throws MalformedURLException, InterruptedException {
		home.clicaCriarConta();
	}
	
	@Quando("^clico em Buscar$")
	public void clicaBuscar() throws MalformedURLException {
		home.clicaBuscar();
	}
	
	
	@Quando("^clico em Minha Conta$")
	public void clicarMinhaConta() throws MalformedURLException {
		home.clicaMinhaConta();
	}
	 
	@E("^clico em Criar Nova Conta$")
	public void clicarNovaConta() throws MalformedURLException {
		home.clicaCriarConta();
	}
	
	@E("^clico em Entrar com Conta Arezzo$")
	public void clicaEmEntrar() throws MalformedURLException, InterruptedException {
		if (Utils.AREZZO){
			Thread.sleep(1000);
			home.clicoEmEntrar();}
	}

	@E("^clico em Entrar com Facebook$")
	public void clicaEmEntraFace() throws MalformedURLException {
		home.clicoEmEntrarFace();
	}
}
