package br.com.apparezzo.elementMapper;


import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class LoginPageElementMapper {

	public static By getEMAIL(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='EMAIL']]//android.view.ViewGroup/android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");}
		return null;
	}

	public static By getEMAILLOGIN(){
		if (Utils.SCHUTZ) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='E-mail']]//android.view.ViewGroup/android.widget.EditText");}
		return null;
	}

	public static By getEMAILINVALIDO(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='EMAIL']]//android.view.ViewGroup/android.widget.TextView");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");}
		return null;
	}

	public static By getNOMECADASTROLOGIN(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='NOME']]//android.view.ViewGroup/android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");}
		return null;
	}

	public static By getSOBRENOMECADASTROLOGIN(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='SOBRENOME']]//android.view.ViewGroup/android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");}
		return null;
	}

	public static By getSENHA(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='SENHA']]//android.view.ViewGroup/android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");}
		return null;
	}

	public static By getSENHALOGIN(){
		if (Utils.SCHUTZ) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='Senha']]//android.view.ViewGroup/android.widget.EditText");}
		return null;
	}

	public static By getCONFIRMASENHA(){
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText");}
		return null;
	}

	public static By getCLICACADASTRAR(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='CADASTRAR']");}
		if (Utils.SCHUTZ) {return By.xpath("//*[@text='CADASTRAR']");}
		return null;
	}

	public static By getCLICAENTRAR(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ENTRAR']");}
		if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'ENVIAR')]");}
		return null;
	}

	public static By getCLICASEGUINTE(){
		if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'SEGUINTE')]");}
		return null;
	}

	public static By getINSIRAEMAILVALIDO(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='Insira um email válido']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

}