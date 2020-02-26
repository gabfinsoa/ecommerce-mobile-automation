package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class HomePageElementMapper {

	public static By getAGORANAO(){
		if (Utils.AREZZO) {return By.xpath("//*[contains(@text,'AGORA NÃO')]");}
		return null;
	}

	public static By getBUSCAR(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Categorias']");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='Categorias']");}
		return null;
	}

	public static By getMINHACONTA(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Minha conta']");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='Perfil']");}
		return null;
	}

	public static By getENTRARCONTAAREZZO(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ENTRAR COM\nCONTA AREZZO']");}
		return null;
	}

	public static By getCRIARCONTAAREZZO(){
		if (Utils.AREZZO) {return By.xpath("//*[contains(@text,'CRIAR NOVA CONTA')]");}
		if (Utils.SCHUTZ) {return By.xpath("//*[@text='CADASTRE-SE']");}
		return null;
	}

	public static By getENTRARFACEBOOK(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ENTRAR COM FACEBOOK']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getINICIO(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Início']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getSACOLA(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Sacola']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getLOJAS(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Lojas']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

}
