package br.com.infomed.pages;

import br.com.infomed.core.BasePage;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import br.com.infomed.pages.LoginPage;
import br.com.infomed.utils.GeradorStringRandom;

import static br.com.infomed.core.SystemConst.*;

public class CadastroDeUsuarioPage extends BasePage {
    /********* Textos ************/

    public Boolean isVoidTextField(String text) {

        if (!"".equals(text)) {

            //digite aqui a instrução se o campo for NÃO vazio e NÃO nulo.
            return true;
        } else {

            //digite aqui a intrução para quando o campo FOR vazio ou FOR nulo
            return false;
        }
    }


    /***************Clicar Botao************************/
    //Clicar no botâo administração
    public void clicarLinkAdm() {

        clickBtnByXpath("//*[@class='X']");
    }

    //Clicar no botão Usuários
    public void clicarLinkUser() {
        explicitWaitText(By.xpath("//a[contains(text(),'Usuários')]"), "Usuários");
        clickBtnByXpath("//a[contains(text(),'Usuários')]");


    }

    //Clicar no botão Novo "+"
    public void clicarBotaoNovo() {

        clickBtnByXpath("//*[@data-tooltip='Novo'or@title='Novo']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    //Clicar no botão Ok
    public void clicarOk() {
        explicitWaitBtnClickableByXpath("//*[@id='ModalAlertaUsuarioEdicao']//a[contains(text(),'Ok')]");
    }

    //Selecionar perfil prestador
    public void selecionarPerfilPrestador() {

        clickBtnByXpath("//*[@title='Perfil']//tbody//tr[5]//*[text() = 'Prestador']");
    }

    //Escolher guia  de beneficiário(Qualquer opção: SP/SADT,Internação,Prorrogação)
    public void guiaBeneficiario() {

        clickBtnByXpath("//label[contains(text(),'SP/SADT')]");
    }

    public void guiaInternacao() {

        clickBtnByXpath("//label[contains(text(),'Internação')]");
    }

    public void guiaProrrogacao() {

        clickBtnByXpath("//label[contains(text(),'Prorrogação')]");
    }

    //Clicar em adicionar
    public void clicarAdicionar() {

        clickBtnByXpath("//div[@id='valorDeContexto']//input[@value='Adicionar']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
        explicitWaitVisibilityElement(".checkedRow");
    }

    //Clicar no botão de salvar
    public void clicarSalvar() {
        clickBtnByXpath("//*[@id='conteudo']//i[contains(text(),'save')]");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }


    // Sair do perfil admin
    public void clicarMenu() {

        clickBtnByXpath("//*[@class='modalBemvindo']//i");
        explicitWaitVisibilityElement("a[title='Sair']");
        explicitWaitBtnClickableByXpath("/html/body/form/header/ul[2]/li[3]/a");
    }

    /****************Escrever por Xpath***************/

    public void escreverCampoNome(String texto) {

        writeByXpath("//*[@title='Nome']", texto);

    }

    public void escreverEmail(String texto) {

        writeByXpath("//*[@type='email']", texto);
    }

    public String escreverLogin(String texto) {

        writeByXpath("//*[@title='Login']", texto);
        explicitWaitTillTextPresentInTextField("//*[@title='Login']");
        return getTextByXpath("//*[@title='Login']");
    }

    public String obterLogin() {

        return getAttributeValueByXpath(By.xpath("//*[@title='Login']"), "value");
    }

    public void escreverSenha(String texto) {

        writeByXpath("//*[@title='Senha']", texto);
        //senha deve ter mínimo 8 maximo 15 caracteres
    }

    public void validarSenha(String texto) {

        writeByXpath("//label[contains(text(),'Confirma senha:')]/..//input", texto);
    }

    //   Preencher o campo Cod de prestador com 87210409
    public void codPrestador(String texto) {

        writeByXpath("//*[@title='Valor de Contexto']", texto);
    }

    /***************DropDown******************/
    // Selecionar papel prestador
    public void selecionarPapelPrestador(String valor) {

        selectClickDropDownByXpath("//label[contains(text(),'Papel:')]//..//input",
                "//label[contains(text(),'Papel:')]//..//ul/li/span", valor);
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading']//section[@id='loading']"));

    }

    public void trocarSenha(String valor) {

        selectClickDropDownByXpath("//*[@id='conteudoFormulario']//label[contains(text(),'Trocar Senha:')]/..//input",
                "//*[@id='conteudoFormulario']//label[contains(text(),'Trocar Senha:')]/..//span[contains(text(),'N')]", valor);
    }


    //Escolher "não" no campo de Registro da execução
    public void naoRegistroDeExecucao(String valor) {

        selectClickDropDownByXpath("//label[contains(text(),'Registro da Execução:')]/..//input",
                "//label[contains(text(),'Registro da Execução:')]//..//ul/li/span", valor);
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void utilizarBiometria(String valor) {

        selectComboBy(By.xpath("//*[@id='conteudoFormulario']//label[contains(text(),'Utiliza Biometria:')]/..//input"), valor);
    }


    public void tipoBiometria(String valor) {

        selectComboBy(By.xpath("//*[@id='conteudoFormulario']//label[contains(text(),'Tipo Biometria:')]/..//input"), valor);
    }

    public void permitirDigitacaoCarteiraBeneficiario(String valor) {

        selectComboBy(By.xpath("//*[@id='conteudoFormulario']//label[contains(text(),'Permitir digitação da carteira do beneficiário:')]/..//input"), valor);
    }

    public void permitirGeracaoTokenPrestador(String valor) {

        selectComboBy(By.xpath("//*[@id='conteudoFormulario']//label[contains(text(),'Permitir geração do token prestador:')]/..//input"), valor);
    }

    public void tipoBeneficiario(String valor) {

        selectComboBy(By.xpath("//*[@id='conteudoFormulario']//label[contains(text(),'Tipo de Beneficiário:')]/..//input"), valor);
    }

    /****************Validação***************/

    public String bemVindoTestador() {
        return getTextByXpath("//*[@class='modalBemvindo']//li");
    }


}