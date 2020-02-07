package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class HomeAutoAuditMPage extends BasePage {

    /****************** Menu de opções ******************/

    public void abrirMenuAuditoria(){

        clickBtnByXpath("//*[@class='T']//i");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void selecionaPedidosDeAutorizacao(){

        explicitWaitText(By.xpath("//a[contains(text(),'Pedidos de Autorização')]"), "Pedidos de Autorização");
        clickBtnByXpath("//a[contains(text(),'Pedidos de Autorização')]");

    }
}
