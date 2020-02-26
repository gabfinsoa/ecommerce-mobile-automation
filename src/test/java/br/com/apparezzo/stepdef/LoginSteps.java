package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.LoginPage;
import br.com.apparezzo.utils.Utils;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
public LoginSteps() {}
	private Hook hook;
	LoginPage login = new LoginPage(hook);
	
    @Quando("^preencho o cadastro$")
    public void preencheCadastroLogin() throws MalformedURLException {
    	login.preencherCadastro();
    }
    
    @E("^clico em Cadastrar$")
    public void clicarCadastrar() throws MalformedURLException{
    	login.clicaCadastrar();
    }
    
    @E("^preencho o email (.*)$")
    public void preencherEmail(String email) throws MalformedURLException {
        if (Utils.SCHUTZ){login.preencherEmailLogin(email);}
        if (Utils.AREZZO){login.preencherEmail(email);}
    }

    @E("^clico em Seguinte$")
    public void clicarSeguinte() throws MalformedURLException {
        if (Utils.SCHUTZ){
        login.clicarSeguinte();}
    }
    
    @E("^preencho a senha (.*)$")
    public void preencherSenha(String senha) throws MalformedURLException {
        if (Utils.SCHUTZ){login.preencherSenhaLogin(senha);}
        if (Utils.AREZZO){login.preencherSenha(senha);}
    }
    
    @Quando("^clico em Entrar$")
    public void clicarEntrar() {
    	login.clicarEntrar();
    }

    @Quando("^eu preencho os dados (.*), (.*), (.*) e (.*) incorretamente$")
    public void preencherCadastro(String email, String nome, String sobrenome, String senha) throws MalformedURLException {
        login.preencherEmail(email);
        login.preencherNome(nome);
        login.preencherSobreNome(sobrenome);
        login.preencherSenha(senha);
        if (Utils.SCHUTZ){
        login.preencherConfirmaSenha(senha);}
    }

    @Então("^devo ser informado que (.*)$")
    public void informarCamposInvalidos(String mensagem) throws MalformedURLException{
        login.verificaCamposinvalidos(mensagem);
    }

}
