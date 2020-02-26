package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class PedidoPageElementMapper {

	public static By getPEDIDOCONCLUIDO(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]");}
		return null;
	}

}
