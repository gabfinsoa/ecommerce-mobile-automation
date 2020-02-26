package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.MinhaContaPage;
import cucumber.api.java.pt.Então;

public class MinhaContaSteps {
	
	public MinhaContaSteps() {}
	private Hook hook;
	MinhaContaPage minhaConta = new MinhaContaPage(hook);
	
	@Então("^deve apresentar Minha Conta$")
	public void verificarCadastro() throws MalformedURLException {
		minhaConta.verificaNomeCadastradoLogin();
	}
}
