package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class PedidosDeAutorizacaoPage extends BasePage {

    public void numeroDaGuiaTransacao(String codigoGuia){

        explicitWaitBtnClickableByXpath("//label[contains(text(), 'Guia / Transação')]/..//input");
        writeByXpath("//label[contains(text(), 'Guia / Transação')]/..//input", codigoGuia);
    }

    public void apagarNumeroDaGuiaTransacao(){

        explicitWaitBtnClickableByXpath("//label[contains(text(), 'Guia / Transação')]/..//input");
        writeByXpath("//label[contains(text(), 'Guia / Transação')]/..//input", "");
    }

    public void apagarData(){

        explicitWaitBtnClickableByXpath("//input[@placeholder='06/02/2020']/..//i[2]");
    }

    public void dataSolicitacao(String dataInicio, String dataFinal){

        explicitWaitBtnClickableByXpath("//*[@placeholder='Data Início']");
        writeByXpath("//*[@placeholder='Data Início']", dataInicio);
        explicitWaitBtnClickableByXpath("//*[@placeholder='Data Final']");
        writeByXpath("//*[@placeholder='Data Final']", dataFinal);
        clickTabByXpath("//*[@placeholder='Data Final']");
    }

    public void statusAuditoria(String status){

        /*
        selectClickDropDownByXpath("//label[contains(text(), 'Status Auditoria')]/..//input",
                                   "//span[contains(text(), 'AT - Autorizado')]/../..//span",
                                    status);
        */

        selectClickDropDownByXpathTest("//label[contains(text(), 'Status Auditoria')]/..//input",
                                    "//span[contains(text(), 'AT - Autorizado')]/../..//span",
                                    status,
                                    "//span[contains(text(), 'AT - Autorizado')]/../..//..//ul");

        clickTabByXpath("//label[contains(text(), 'Status Auditoria')]/..//input");
    }

    public void excluirStatus(){

        explicitWaitBtnClickableByXpath("//label[text()='Status Auditoria']/..//i");
    }

    public void clicarBtnAdicionar(){

        explicitWaitInvisibilityElementBy(SpinnerLoadingAudit);
        explicitWaitBtnClickableByXpath("//span[text() ='Confirmar']/..");
        explicitWaitInvisibilityElementBy(SpinnerLoadingAudit);
        explicitWaitVisibilityElement("tr.el-table__row");
    }

    public void clicarAcessarAuditoria(){

        explicitWaitBtnClickableByXpath("//*[@class='el-table__fixed']//i[@class='el-icon-edit']");
        explicitWaitInvisibilityElementBy(SpinnerLoadingAudit);
    }


    /******************** Assertiva ********************/

    public String obterValorTitleGrid(){

        return getAttributeValueByXpath(By.xpath("//*[@class='el-table__fixed']//*[@title='Autorizado parcialmente']"),"title");
    }

    public String obterNumeroGuiaGrid(String numGuia){

        return getTextByXpath("//div[text()='"+numGuia+"']");
    }

    public String obterValorTitleGridAutorizado(){

        return getAttributeValueByXpath(By.xpath("//*[@class='el-table__fixed']//*[@title='Autorizado']"),"title");
    }
}
