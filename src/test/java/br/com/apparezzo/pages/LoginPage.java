package br.com.apparezzo.pages;

import java.net.MalformedURLException;

import br.com.apparezzo.elementMapper.LoginPageElementMapper;
import br.com.apparezzo.stepdef.Hook;
import br.com.apparezzo.utils.Utils;

public class LoginPage extends BasePage{
	
	public LoginPage(Hook hook) {
		super(hook);
	}

	public void preencherCadastro() {
		preencherEmailNovo();
		preencherNome("Douglas");
		preencherSobreNome("Golke");
		preencherSenha("zero123@");
		if(Utils.SCHUTZ) {
			preencherConfirmaSenha("zero123@");
		}
	}

	public void preencherEmail(String email){
		sendKeys(LoginPageElementMapper.getEMAIL(), email);
	}

	public void preencherEmailLogin(String email){
		sendKeys(LoginPageElementMapper.getEMAILLOGIN(), email);
	}

	public void preencherEmailNovo(){
		String email = emailnovo();
		sendKeys(LoginPageElementMapper.getEMAIL(), email);
	}

	public void preencherEmailFace(String email){
		sendKeys(LoginPageElementMapper.getEMAIL(), email);
	}
	
	public void preencherNome(String nome) {
		sendKeys(LoginPageElementMapper.getNOMECADASTROLOGIN(), nome);
	}
	
	public void preencherSobreNome(String sobrenome) {
		sendKeys(LoginPageElementMapper.getSOBRENOMECADASTROLOGIN(), sobrenome);
	}

	public void preencherSenha(String senha) {
		sendKeys(LoginPageElementMapper.getSENHA(), senha);
	}

	public void preencherSenhaLogin(String senha) {
		sendKeys(LoginPageElementMapper.getSENHALOGIN(), senha);
	}

	public void preencherConfirmaSenha(String senha) {
		sendKeys(LoginPageElementMapper.getCONFIRMASENHA(), senha);
	}
	
	public void clicaCadastrar() {
		click(LoginPageElementMapper.getCLICACADASTRAR());
	}

	public void clicarEntrar() {
		click(LoginPageElementMapper.getCLICAENTRAR());
	}

	public void clicarSeguinte() {
		click(LoginPageElementMapper.getCLICASEGUINTE());
	}

	public boolean verificaCamposinvalidos(String mensagem) throws MalformedURLException {
		switch (mensagem) {
			case "EMAILINVALIDO":
				return getDriver().findElement(LoginPageElementMapper.getEMAILINVALIDO()).getText().contains("E-mail inválido");
			case "NOMEINVALIDO":
				return getDriver().findElement(LoginPageElementMapper.getNOMECADASTROLOGIN()).getText().contains("Campo obrigatório");
			case "SOBRENOMEINVALIDO":
				return getDriver().findElement(LoginPageElementMapper.getSOBRENOMECADASTROLOGIN()).getText().contains("Campo obrigatório");
			case "SENHAINVALIDA":
				return getDriver().findElement(LoginPageElementMapper.getSENHA()).getText().contains("Campo obrigatório");
			default:
			return false;
	}
	}
}
