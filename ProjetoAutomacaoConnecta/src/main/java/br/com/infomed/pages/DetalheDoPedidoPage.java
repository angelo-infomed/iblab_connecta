package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class DetalheDoPedidoPage extends BasePage {

    /****************** Detalhe do Pedido - Geral **********************/

    public void voltar(){
        explicitWaitBtnClickableByXpath("//span[text()='Voltar']//..//i//..");
    }

    public void iniciarAuditoria(){
        explicitWaitBtnClickableByXpath("//span[text()='Iniciar Auditoria']//..//i//..");
    }

    /****************** Iniciar Auditoria **********************/

    public void clicarBtnIniciar(){

        explicitWaitBtnClickableByXpath("//span[text()='Iniciar']/..");
        explicitWaitInvisibilityElementBy(By.xpath("//div[text()='Inicia a auditoria do pedido.']"));
        explicitWaitInvisibilityElementBy(SpinnerLoadingAudit);
        explicitWaitInvisibilityElementBy(SpinnerLoadingAudit2);

    }

    /****************** Detalhe do Pedido - Geral **********************/

    public void salvar(){
        explicitWaitBtnClickableByXpath("//span[text()='Salvar']//..//i//..");
    }

    public void encerrar(){
        explicitWaitBtnClickableByXpath("//span[text()='Encerrar']//..//i//..");
    }

    public void encaminhar(){
        explicitWaitBtnClickableByXpath("//span[text()='Encaminhar']//..//i//..");
    }

    public void adicionarInformacoes(){
        explicitWaitBtnClickableByXpath("//span[text()='Adicionar Informações']//..//i//..");
    }

    public void enviarparaUnimed(){
        explicitWaitBtnClickableByXpath("//span[text()='Enviar para Unimed']//..//i//..");
    }

    public void decursoDePrazo(){
        explicitWaitBtnClickableByXpath("//span[text()='Decurso de Prazo']//..//i//..");
    }

    public void solicitarDocumentacao(){
        explicitWaitBtnClickableByXpath("//span[text()='Solicitar Documentação']//..//i//..");
    }

    public void pedidosVinculados(){
        explicitWaitBtnClickableByXpath("//span[text()='Pedidos Vinculados']//..//i//..");
    }

    public void imprimirSolicitacao(){
        explicitWaitBtnClickableByXpath("//span[text()='Imprimir Solicitação']//..//i//..");
    }

    public void adicionar(){
        explicitWaitBtnClickableByXpath("//*[@class='el-icon-plus']/../..//button//i[@class='el-icon-plus']/..");
    }

    public void editar(){
        explicitWaitBtnClickableByXpath("//*[@class='el-icon-edit']/../..//button//i[@class='el-icon-edit']/..");
    }

    public void marcarItemAuditado(String codigo){

        //div[@class='el-table__fixed']//span[text()='40101010']/../../../../td[1]//input[@type='checkbox']
        explicitWaitBtnClickableByXpath("//div[@class='el-table__fixed']//span[text()='"+codigo+"']/../../../..//label");
    }

    public void desmarcarItemAuditado(String codigo){

        //div[@class='el-table__fixed']//span[text()='40101010']/../../../../td[1]//input[@type='checkbox']
        explicitWaitBtnClickableByXpath("//div[@class='el-table__fixed']//span[text()='"+codigo+"']/../../../..//label");
    }

    /****************** Auditoria de Item **********************/

    public void status(String texto){

                    selectClickDropDownByXpathTest("//span[text()='Auditoria de Item']/../..//*[@placeholder='Selecione...']",
                                                "//span[text()='Negado']/../..//span",
                                                texto,
                                                "//span[text()='Negado']/../..");
    }

    public  void motivoDaNegativa(String motivo){

                    //explicitWaitVisibilityElementByXpath("//label[text()='Motivo da Negativa']/../..//*[@placeholder='Selecione...']");
                    selectClickDropDownByXpath("//label[text()='Motivo da Negativa']/../..//*[@placeholder='Selecione...']",
                                               "//span[text()='1208 - SOLICITAÇÃO ANTERIOR À INCLUSÃO DO CREDENCIADO']/../..//span",
                                                motivo);
    }

    public void  justificativaDaNegativa(String justificativa){

        writeByXpath("//span[text()='Auditoria de Item']/../..//textarea", justificativa);
    }

    public void confirmar(){
        explicitWaitBtnClickableByXpath("//span[text()='Confirmar']/..");
    }

    /****************** Encerrar Auditoria **********************/

    public void escreverMensagem(String texto){
        explicitWaitBtnClickableByXpath("//*[@class='el-form-item__label']/..//textarea");
        writeByXpath("//*[@class='el-form-item__label']/..//textarea", texto);
    }

    public void enviar(){
        explicitWaitBtnClickableByXpath("//*[@aria-label='Encerrar auditoria']//span[text()='Enviar']/..");
    }

    public String alertSucesso(){

        explicitWaitVisibilityElementByXpath("//span[text()='Infomed Connecta']/..");
        return getTextByXpath("//span[text()='Infomed Connecta']/..//p");
    }
    
    /******************* Assertivas ***************************/

    public String obterColunaStatus(String codigo){

        //div[@class='el-table__fixed']//span[text()='40101010']/../../../..//td[3]
        return getTextByXpath("//div[@class='el-table__body-wrapper is-scrolling-left']//span[text()='"+codigo+"']/../../../..//td[3]");
    }

    public String obterColunaAutorizados(String codigo){

        return getTextByXpath("//div[@class='el-table__body-wrapper is-scrolling-left']//span[text()='"+codigo+"']/../../../..//td[11]");
    }
}