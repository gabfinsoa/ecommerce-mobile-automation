package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class PdpPageElementMapper {

	public static By getCOMPRAR(){
		return By.xpath("//android.widget.TextView[@text='COMPRAR']");
	}

	public static By getFINALIZARCOMPRA(){
		return By.xpath("//android.widget.TextView[@text='FINALIZAR COMPRA']");
	}

	public static By getNOME(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]"); }
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

}
