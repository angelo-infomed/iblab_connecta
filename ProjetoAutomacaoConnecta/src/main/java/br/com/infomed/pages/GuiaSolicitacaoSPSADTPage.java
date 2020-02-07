package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GuiaSolicitacaoSPSADTPage extends BasePage {

    /********************* Dados Guia ************************/

    public void registroANS(String texto) {

        writeByXpath("//*[@title='Registro ANS']", texto);
    }

    public void numeroDaGuia(String texto) {

        writeByXpath("//*[@title='Número da Guia']", texto);
    }

    public void numeroDaGuiaPrincipal(String texto) {

        writeByXpath("//*[@title='Número da Guia Principal']", texto);
    }

    /****************** Dados Beneficiário **********************/

    public void numeroDaCarteira(String texto) {

        writeByXpath("//*[@title='Número da Carteira do beneficiário']", texto);
        clickTabByXpath("//*[@title='Número da Carteira do beneficiário']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void nomeBeneficiario(String texto) {

        writeByXpath("//*[@title='Nome']", texto);
    }

    public void CNS(String texto) {

        writeByXpath("//*[@title='Cartão Nacional de Saúde']", texto);
    }

    public void validadeDaCarteira(String texto) {

        writeByXpath("//*[@title='Validade da Carteira']", texto);
    }

    public void checkBoxRN(String texto) {

        clickBtnByXpath("//fieldset[2]//input[@type='checkbox']");
    }

    /****************** Dados do Solicitante **********************/

    public void codigoNomeSolicitante(String texto) {

        editButtonNomeSolicitante();

        writeByXpath("//legend[contains(text(), 'Dados do Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[2]/input", texto);
        clickEnterByXpath("//legend[contains(text(), 'Dados do Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[2]/input");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
        //explicitWaitInvisibilityElement(By.xpath("//*[@id='updLoading']//section[@id='loading']"));
    }

    //botao X
    public void editButtonNomeSolicitante() {

        clickBtnByXpath("//legend[contains(text(), 'Dados do Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownNomeSolicitante() {

        clickBtnByXpath("//legend[contains(text(), 'Dados do Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[4]");
    }

    public void nomeContratado(String texto) {

        writeByXpath("//legend[contains(text(), 'Dados do Solicitante')]/../..//*[@title='Nome Contratado']", texto);
    }

    public void nomeProfissional(String texto) {
        writeByXpath("//legend[contains(text(), 'Dados do Solicitante')]/../..//*[@title='Nome Profissional']//table[2]//td[2]//input", texto);
    }

    public void editButtonNomeProfissional() {

        clickBtnByXpath("//legend[contains(text(), 'Dados do Solicitante')]/../..//*[@title='Nome Profissional']//table[2]//td[3]");
    }

    /**********************************Combo Conselho Profissional****************************************/

    public void selectCRAS() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRAS");
    }

    public void selectCOREN() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "COREN");
    }

    public void selectCRF() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRF");
    }

    public void selectCRFA() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRFA");
    }

    public void selectCREFITO() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CREFITO");
    }

    public void selectCRM() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRM");
    }

    public void selectCRN() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRN");
    }

    public void selectCRO() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRO");
    }

    public void selectCRP() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "CRP");
    }

    public void selectOUT() {

        selectComboBy(By.xpath("//label[contains(text(), 'Conselho Profissional:')]//..//input"), "OUT");
    }

    /****************************************FIM DO COMBO******************************************/

    public void numeroConselho(String texto) {

        writeByXpath("//*[@title='Número Conselho']", texto);
    }

    public void selectComboUFConselho(String texto) {

        selectComboBy(By.xpath("//label[contains(text(), 'UF Conselho:')]//..//input"), texto.toUpperCase());
    }

    public void nomeCodigoCBO(String texto) {

        writeByXpath("//label[contains(text(), 'Código CBO:')]/..//input", texto);
    }

    /********************************** Dados Executante ********************************/

    public void codigoNomeExecutante(String texto) {

        writeByXpath("//legend[contains(text(), 'Dados do Executante')]/..//..//label[contains(text(), 'Código/Nome')]/../../table[2]//td[2]/input", texto);
    }

    //botao X
    public void editButtonNomeExecutante() {

        clickBtnByXpath("//legend[contains(text(), 'Dados do Executante')]/..//..//label[contains(text(), 'Código/Nome')]/../../table[2]//td[3]");
    }

    public void dropDownNomeExecutante() {

        clickBtnByXpath("//legend[contains(text(), 'Dados do Executante')]/..//..//label[contains(text(), 'Código/Nome')]/../../table[2]//td[4]");
    }

    public void nomeContratadoExecutante(String texto) {

        writeByXpath("//*[@title='Nome Contratado Executante']", texto);
    }

    public void selectComboCodigoCNES(String texto) {

        selectComboBy(By.xpath("//label[contains(text(), 'Código CNES:')]//..//input"), texto.toUpperCase());
    }

    /**************************Dados da Solicitação / Procedimentos e Exames Solicitados***************************/

    public void selectComboCaraterDoAtendimento(String valor) {

        selectComboBy(By.xpath("//label[contains(text(), 'Caráter do Atendimento:')]//..//input/../ul"), valor);
    }

    public void selectEletiva(String valor) {

        selectClickDropDownByXpath("//label[contains(text(), 'Caráter do Atendimento:')]//..//input",
                "//label[contains(text(), 'Caráter do Atendimento:')]//..//ul/li/span",
                valor);
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
        explicitWaitUntilVisibilityElement("//label[contains(text(), 'Tipo:')]//..//input");

    }
        /*
        public void dataSolicitacao(){

        }*/

    public void indicacaoClinica(String texto) {

        writeByXpath("//legend[contains(text(), 'Dados da Solicitação / Procedimentos e Exames Solicitados')]/../..//*[@title='Indicação Clínica']", texto);
    }

    public void selectComboTipoDoItem(String valor) {


        selectClickDropDownByXpath("//label[contains(text(), 'Tipo:')]//..//input",
                "//label[contains(text(), 'Tipo:')]//..//ul/li/span",
                valor);
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void selectComboTipoDespesa(String valor) {

        selectComboBy(By.xpath("//label[contains(text(), 'Tipo despesa:')]//..//input"), valor);
    }

    public void selectComboTabela(String valor) {

        selectComboBy(By.xpath("//legend[contains(text(),'Dados da Solicitação / Procedimentos e Exames Solicitados')]/../..//label[contains(text(), 'Tabela')]/../div/input"), valor);
    }

    public void codigoDescricao(String texto) {

        writeByXpath("//legend[contains(text(),'Dados da Solicitação / Procedimentos e Exames Solicitados')]/../..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[3]//input", texto);
        clickEnterByXpath("//legend[contains(text(),'Dados da Solicitação / Procedimentos e Exames Solicitados')]/../..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[3]//input");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void textFieldDescricao(String texto) {

        writeByXpath("//*[@title='Descrição do Procedimento']", texto);
    }

    public void textFieldQuantidade(String texto) {

        writeByXpath("//*[@title='Quantidade solicitada do Procedimento']", texto);
        //explicitWaitInvisibilityElement(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void btnAdicinarItensSolicitacao() {

        clickBtnByXpath("//div[@id='itensSolicitacao']//input[@value='Adicionar']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
        explicitWaitVisibilityElement(".grid_row");
    }

    public void textAreaObservacao(String texto) {

        writeByXpath("//legend[contains(text(),'Dados da Solicitação / Procedimentos e Exames Solicitados')]/../..//textArea[@title='Observação']", texto);
    }

    public void btnAdicinarDoisItensSolicitacao(){

        clickBtnByXpath("//div[@id='itensSolicitacao']//input[@value='Adicionar']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
        explicitWaitVisibilityElement(".grid_alternating_row");
    }
    /************************************ Anexar OPME *****************************/

    public void selectComboOpcao(String valor) {

        selectComboBy(By.xpath("//label[contains(text(), 'Opção:')]/..//input"), valor);
    }

    public void btnAdicinarOPME() {

        clickBtnByXpath("//section[@title='Adicionar OPME']//section/input");
    }

    /************************************ Anexar Arquivo *****************************/

    public void checkBoxAnexarArquivo() {

        clickBtnByXpath("//legend[contains(text(), 'Anexar Arquivo')]/../span/input");
    }

    public void btnSelecione() {

        clickBtnByXpath("//legend[contains(text(), 'Anexar Arquivo')]/..//span[contains(text(), 'Selecione')]/../input");
    }

    public void textAreaJustificativa(String texto) {

        writeByXpath("//textArea[@title= 'Justificativa']", texto);
    }

    /*************************************Button Menu********************************/

    public void btnMenu() {


        clickBtnByXpath("//i[contains(text(), 'menu')]");
        //explicitWaitInvisibilityElement(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void btnCarregarModelo() {

        clickBtnByXpath("//a[@data-tooltip='Carregar Modelo']");
    }

    public void btnSalvarModelo() {

        clickBtnByXpath("//a[@data-tooltip='Salvar Modelo']");
    }

    public void btnEnviar() {

        explicitWaitInvisibilityElementBy(By.xpath("*[@id='updLoading2']//section[@id='loading']"));
        clickBtnByXpath("//a[@data-tooltip='Enviar']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    /******************************** Recibo Envio Guia *********************************/

    public String obterStatus() {

        return getAttributeValueByXpath(By.xpath("//*[@title='Status']"), "value");
    }

    public String obterValorQtdeSolicitada() {

        return getTextByXpath("//fieldset[@class='bloco paraCima itens']//table//td[3]");
    }

    public String obterValorQtdeAutorizada() {

        return getTextByXpath("//fieldset[@class='bloco paraCima itens']//table//td[4]");
    }

    public String obterValorColunaDescricao() {

        return getTextByXpath("//fieldset[@class='bloco paraCima itens']//table//td[6]");
    }

    public Boolean verificarConteudoDescricao() {

        return isVoidTextField(obterValorColunaDescricao());
    }

    /******************************** Anexo Quimioterapia *********************************/

    public void clicarBtnOk(){

        clickBtnByXpath("//*[@id='acoesFiltro']//a");
    }

    public void escreverPeso(String texto) {

        writeByXpath("//*[@title='Peso do Beneficiário']", texto);
    }

    public void escreverAltura(String texto) {

        writeByXpath("//*[@title='Altura do Beneficiário']", texto);
    }

    public void escreverTelefone(String texto) {

        writeByXpath(".//fieldset//a//legend[contains(text(),'Anexo - Quimioterapia')]//..//..//input[@title='Telefone']", texto);
    }

    public void selectComboEstadiamento(String valor) {

        selectClickDropDownByXpath("//span[text()='I']//..//..//..//input",
                "//span[text()='I']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboFinalidade(String valor) {

        selectClickDropDownByXpath("//span[text()='Curativa']//..//..//..//input",
                "//span[text()='Curativa']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboEcog(String valor) {

        selectClickDropDownByXpath("//span[text()='Totalmente ativo']//..//..//..//input",
                "//span[text()='Totalmente ativo']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboTipoQuimioterapia(String valor) {

        selectClickDropDownByXpath("//span[text()='1ª linha']//..//..//..//input",
                "//span[text()='1ª linha']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboTumor(String valor) {

        selectClickDropDownByXpath("//span[text()='1-T1']//..//..//..//input",
                "//span[text()='1-T1']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboNódulo(String valor) {

        selectClickDropDownByXpath("//span[text()='1-N1']//..//..//..//input",
                "//span[text()='1-N1']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboMetástase(String valor) {

        selectClickDropDownByXpath("//span[text()='1-M1']//..//..//..//input",
                "//span[text()='1-M1']//..//..//..//input//..//ul//span",
                valor);

    }

    public void escreverPlanoTerapeutico(String texto) {

        writeByXpath("//textarea[@title='Plano Terapêutico']", texto);
    }

    public void escreverData(String texto) {

        writeByXpath("//input[@title='Data Prevista Administração']//..//div//input", texto);

    }

    public void escreverCodMedicamento(String texto) {

        writeByXpath("//*[@id='dvGuiaAnexoMed']//*[@class='dxic']//input", texto);
        clickEnterByXpath("//*[@id='dvGuiaAnexoMed']//*[@class='dxic']//input");
        explicitWaitInvisibilityElementBy(By.xpath("//*[@id='updLoading2']//section[@id='loading']"));
    }

    public void escreverDosagem(String texto) {

        writeByXpath("//*[@title='Dosagem total do medicamento no ciclo atual']//..//..//input", texto);
    }

    public void selectComboViaAdm(String valor) {

        selectClickDropDownByXpath("//span[text()='Bucal']//..//..//..//input",
                "//span[text()='Bucal']//..//..//..//input//..//ul//span",
                valor);

    }

    public void selectComboUnidadeMedida(String valor) {

        selectClickDropDownByXpath("//span[text()='(AMP) Ampola']//..//..//..//input",
                "//span[text()='(AMP) Ampola']//..//..//..//input//..//ul//span",
                valor);

    }

    public void escreverFrequencia(String texto) {

        writeByXpath("//*[@title='Frequência']", texto);
    }

    public void btnAdicinarMedicamento() {

        clickBtnByXpath("//*[@id='dvGuiaAnexoMed']//..//..//..//div//section[@class='right']//input");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
        explicitWaitText(By.xpath("//span[text()='SULBAMOX']"), "SULBAMOX");
    }

    public void escreverNumeroCiclos(String texto) {

        writeByXpath("//*[@title='Número de Ciclos Previstos']", texto);
    }

    public void escreverCicloAtual(String texto) {

        writeByXpath("//*[@title='Ciclo Atual']", texto);
    }

    public void escreverNumDiasDoCiclo(String texto) {

        writeByXpath("//*[@title='Número de dias do ciclo atual']", texto);
    }

    public void escreverIntervaloCiclos(String texto) {

        writeByXpath("//*[@title='Intervalo entre Ciclos (em dias)']", texto);
    }

    public String validarProcedimento() {

        return getTextByXpath("//span[text()='30307147']");

    }

    public String validarMedicamento() {

        return getTextByXpath("//span[text()='90285050']");

    }
}

