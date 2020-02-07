package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class CadastroAlteracaoPerfisPage extends BasePage {
    /***************Clicar Botao************************/
    //Clicar no botâo administração
    public void clicarLinkAdm() {

        clickBtnByXpath("//*[@class='X']");
    }
    //Selecionar o campo Perfis
    public void clicarPerfis() {

        explicitWaitText(By.xpath("//a[contains(text(),'Perfis')]"), "Perfis");
        clickBtnByXpath("//a[contains(text(),'Perfis')]");
    }
    //Clicar no botâo novo "+"
    public void clicarBotaoNovo() {

        clickBtnByXpath("//*[@data-tooltip='Novo'or@title='Novo']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }
    //Selecionar o box de todos os serviços destinados a prestador
    public void clicarTodosServicos(){

        clickBtnByXpath("//label[contains(text(),'Todos os Serviços:')]");
    }
    //Clicar no botão salvar ( este passo é realizado duas vezes)
    public void clicarSalvar() {

        clickBtnByXpath("//*[@id='conteudo']//i[contains(text(),'save')]");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }
    //clicar no botão ok
    public void clicarOk(){

        explicitWaitBtnClickableByXpath("//*[@id='acoesFiltro']//a[contains(text(),'Ok')]");
    }
    //Selecionar perfil já existente criado
    public void clicarPerfilCriado(){
        explicitWaitBtnClickableByXpath("//*[@id='dtLista']//td[contains(text(),'prestadorteste')]");
        clickBtnByXpath("//*[@id='dtLista']//td[contains(text(),'prestadorteste')]");
    }
    //Apertar botão de alterar
    public void clicarAlterar(){

        clickBtnByXpath("//*[@data-tooltip='Alterar'or@title='Alterar']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }
    //Deselecionar o box Arquivo XML e ZIP
    public void desmarcarEnvioArquivoXmlZip(){

        clickBtnByXpath("//label[contains(text(),'Envio de Arquivos XML e ZIP')]");
    }

    public void clicarFiltra(){

        clickBtnByXpath("//*[@value='Filtrar']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void clicarLimpar(){

        clickBtnByXpath("//*[@value='Limpar']");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    /****************Escrever por Xpath***************/

    public void escreverCampoDescrição(String texto) {

        writeByXpath("//*[@title='Descrição']", texto);

    }

    public void escreverCampoFiltro(String texto){

        writeByXpath("//label[contains(text(),'Filtro')]//..//input",texto);

    }


    /***************DropDown******************/
    public void selecionarStatusAtivo(String valor) {

        selectClickDropDownByXpath("//label[contains(text(),'Status:')]/..//input",
                "//label[contains(text(),'Status:')]//..//ul/li/span", valor);

    }

    public void selecionarFiltroStatus(String valor){

        selectClickDropDownByXpath("//label[contains(text(),'Filtrar por')]//..//div",
                "//*[@id='conteudo']//option[@value='S']",valor);
    }
    public void selecionarFiltroCodigo(String valor){

        selectClickDropDownByXpath("//label[contains(text(),'Filtrar por')]//..//div",
                "//*[@id='conteudo']//option[@value='C']",valor);
    }

    public void selecionarFiltroNomeDescricao(String valor) {

        selectClickDropDownByXpath("//label[contains(text(),'Filtrar por')]//..//div",
                "//*[@id='conteudo']//option[@value='ND']", valor);

    }

    //Necessário expandir a quantidade de opções para poder clicar no perfil criado para alterar.
    public void selecionarRegistroPorPagina(String valor) {

        selectClickDropDownByXpath("//label[contains(text(),'Nº de registros por página:')]/..//input",
                "//label[contains(text(),'Nº de registros por página:')]//..//ul/li/span", valor);

    }


    /****************Validação***************/
    //validação do primeiro alert
    public String perfilInseridoSucesso(){
        return getTextByXpath("//p[contains(text(),'Perfil inserido com sucesso.')]");
    }
        //Perfil inserido com sucesso.
    //validação do perfil inserido
        public String perfilAlteradoSucesso(){
            return getTextByXpath("//p[contains(text(),'Perfil alterado com sucesso.')]");
        }
        //Perfil alterado com sucesso.

}
