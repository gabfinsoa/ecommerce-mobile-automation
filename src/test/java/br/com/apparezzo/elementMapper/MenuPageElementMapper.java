package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class MenuPageElementMapper {

	public static By getSAPATOS(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='Sapatos']"); }
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='Sapatos']");}
		return null;
	}

	public static By getVERTODOS(){
		if (Utils.AREZZO || Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='Ver todos']"); }
		return null;
	}

}
