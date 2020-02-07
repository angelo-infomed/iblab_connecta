package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class HomePrestadorPage extends BasePage {

    /***********************Solicitações****************************/

    public void abrirMenuSolicitacao(){

        clickBtnByXpath("//i[contains(text(), 'assistant')]/../..");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }
    public void solicitacaoSPSADT(){

        explicitWaitText(By.xpath("//a[contains(text(), 'SP/SADT')]"), "SP/SADT");
        clickBtnByXpath("//a[contains(text(), 'SP/SADT')]");
    }

    public void solicitacaoInternacao(){
        explicitWaitText(By.xpath("//i[contains(text(), 'assistant')]/../..//li[5]//a[contains(text(), 'Internação')]"), "Internação");
        clickBtnByXpath("//i[contains(text(), 'assistant')]/../..//li[5]//a[contains(text(), 'Internação')]");
    }
}
