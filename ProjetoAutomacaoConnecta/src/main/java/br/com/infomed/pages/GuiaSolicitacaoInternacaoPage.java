package br.com.infomed.pages;

import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class GuiaSolicitacaoInternacaoPage extends BasePage {

    /****************** Dados Guia ************************/

    public void registroANS(String texto){
        writeByXpath("//legend[contains(text(), 'Dados Guia')]/..//..//*[@title='Registro ANS']", texto);
    }

    public void numeroGuia(String texto){
        writeByXpath("//*[@title='Número da Guia']", texto);
    }

    public void dataSolicitacao(String texto){
        writeByXpath("//legend[contains(text(), 'Dados Guia')]/..//..//*[@title='Data da Solicitação']/../div/input", texto);
    }

    /****************** Dados Beneficiário **********************/
    public void numeroCarteira(String texto){
        writeByXpath("//*[@title='Número da Carteira do beneficiário']", texto);
        clickTabByXpath("//*[@title='Número da Carteira do beneficiário']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void nome(String texto){
        writeByXpath("//*[@title='Nome']", texto);
    }

    public void tipoCNS(String texto){
        writeByXpath("//*[@title='Cartão Nacional de Saúde']", texto);
    }

    public void validadeCarteira(String texto){
        writeByXpath("//*[@title='Validade da Carteira']", texto);
    }

    public void atendimentoRN(){
        clickBtnByXpath("//fieldset[2]//input[@type='checkbox']");
    }

    /****************** Dados do Contradado Solicitante **********************/

    public void codigoNome(String texto){
        writeByXpath("//legend[contains(text(), 'Dados do Contratado Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]", texto);
    }

    //botao X
    public void editButtonCodigoNome(){
        clickBtnByXpath("//legend[contains(text(), 'Dados do Contratado Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCodigoNome(){
        clickBtnByXpath("//legend[contains(text(), 'Dados do Contratado Solicitante')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[4]");
    }

    public void nomeContratante(String texto){
        writeByXpath("//legend[contains(text(),'Dados do Contratado Solicitante')]/..//..//input[@title='Nome Contratado']", texto);
    }

    public void nomeProfissional(String texto){
        writeByXpath("//*[@title='Nome Profissional']", texto);
    }

    //botao X
    public void editButtonNomeProfissional(){
        clickBtnByXpath("//legend[contains(text(), 'Dados do Contratado Solicitante')]/../..//*[@title='Nome Profissional']//table[2]//td[3]");
    }

    public void conselhoProfissional(String texto){
        writeByXpath("//label[contains(text(), 'Conselho Profissional:')]//..//input", texto);
    }

    public void numeroConselho(String texto){
        writeByXpath("//*[@title='Número Conselho']", texto);
    }

    public void ufConselho(String texto){
        selectComboBy(By.xpath("//label[contains(text(), 'UF Conselho:')]//..//input"), texto.toUpperCase());
    }

    public void codigoCBO(String texto){
        writeByXpath("//label[contains(text(),'Código CBO:')]/../div/input", texto);
    }

    /****************** Dados do Hospital/Local Solicitado **********************/

    public void codNomeHospital(String texto){
        writeByXpath("//legend[contains(text(), 'Dados do Hospital / Local Solicitado')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[2]/input", texto);
        clickEnterByXpath("//legend[contains(text(), 'Dados do Hospital / Local Solicitado')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[2]/input");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    //botao X
    public void editButtonCodNome(){
        clickBtnByXpath("//legend[contains(text(), 'Dados do Hospital / Local Solicitado')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCodNome(){
        clickBtnByXpath("//legend[contains(text(), 'Dados do Hospital / Local Solicitado')]/..//..//label[contains(text(), 'Código/Nome:')]/../../table[2]//td[4]");
    }

    public void nomeHospital(String texto){
        writeByXpath("//*[@title='Nome Hospital / Local solicitado']", texto);
    }

    public void dataInternacao(String texto){
        writeByXpath("//legend[contains(text(), 'Dados do Hospital / Local Solicitado')]/..//..//*[@title='Data Sugerida para internação']/../div/input", texto);
    }

    /****************** Dados da Internação **********************/

    public void caraterAtendimento(String valor){
        selectClickDropDownByXpath("//label[contains(text(), 'Caráter do Atendimento:')]//..//input",
                "//label[contains(text(), 'Caráter do Atendimento:')]//..//ul/li/span",
                valor);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void tipoInternacao(String texto){
        selectClickDropDownByXpath("//label[contains(text(),'Tipo Internação:')]/../div/input",
                "//label[contains(text(),'Tipo Internação:')]//..//ul/li/span",
                texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void regimeInternacao(String texto){
        selectClickDropDownByXpath("//label[contains(text(),'Regime Internação:')]/../div/input",
                "//label[contains(text(),'Regime Internação:')]//..//ul/li/span",
                texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void acomodacaoSolicitada(String texto){
        selectClickDropDownByXpath("//label[contains(text(),'Acomodação Solicitada:')]/../div/input",
                "//label[contains(text(),'Acomodação Solicitada:')]//..//ul/li/span",
                texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void quantidadeAS(String texto){
        writeByXpath("//label[contains(text(),'Acomodação Solicitada:')]/../../div//*[@title='Quantidade']", texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void acomodacaoSolicitadaSec(String texto){
        selectComboBy(By.xpath("//label[contains(text(),'Acomodação Solicitada Secundária:')]/../div/input"), texto);
    }

    public void quantidadeASS(String texto){
        writeByXpath("//label[contains(text(),'Acomodação Solicitada Secundária:')]/../../div//*[@title='Quantidade']", texto);
    }

    public void previsaoUsoOPME(){
        clickBtnByXpath("//label[contains(text(),'Previsão de uso de OPME')]/..//input");
    }

    public void previsaoUsoQuimio(){
        clickBtnByXpath("//label[contains(text(),'Previsão de uso de quimioterápico')]/..//input");
    }

    public void indicacaoClinica(String texto){
        writeByXpath("//*[@title='Indicação Clínica']", texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    /****************** Hipóteses Diagnósticos **********************/

    public void cidPrincipal(String texto){
        writeByXpath("//label[contains(text(),'CID Principal:')]/../../table[2]", texto);
    }

    //botao X
    public void editButtonCidPrincipal(){
        clickBtnByXpath("//label[contains(text(),'CID Principal:')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCidPrincipal(){
        clickBtnByXpath("//label[contains(text(),'CID Principal:')]/../../table[2]//td[4]");
    }

    public void cid2(String texto){
        writeByXpath("//label[contains(text(),'CID (2):')]/../../table[2]", texto);
    }

    //botao X
    public void editButtonCid2(){
        clickBtnByXpath("//label[contains(text(),'CID (2):')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCid2(){
        clickBtnByXpath("//label[contains(text(),'CID (2):')]/../../table[2]//td[4]");
    }

    public void cid3(String texto){
        writeByXpath("//label[contains(text(),'CID (3):')]/../../table[2]", texto);
    }

    //botao X
    public void editButtonCid3(){
        clickBtnByXpath("//label[contains(text(),'CID (3):')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCid3(){
        clickBtnByXpath("//label[contains(text(),'CID (3):')]/../../table[2]//td[4]");
    }

    public void cid4(String texto){
        writeByXpath("//label[contains(text(),'CID (4):')]/../../table[2]", texto);
    }

    //botao X
    public void editButtonCid4(){
        clickBtnByXpath("//label[contains(text(),'CID (4):')]/../../table[2]//td[3]");
    }

    //autoCompletePrestador
    public void dropDownCid4(){
        clickBtnByXpath("//label[contains(text(),'CID (4):')]/../../table[2]//td[4]");
    }

    public void indicacaoAcidente(String texto){
        selectClickDropDownByXpath("//label[contains(text(),'Indicação Acidente:')]/../div/input",
                "//label[contains(text(),'Indicação Acidente:')]//..//ul/li/span",
                texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    /****************** Procedimentos Solicitados **********************/

    public void tipoProcSolicitado(String texto){
        selectClickDropDownByXpath("//label[contains(text(),'Tipo:')]/../div/input",
                "//label[contains(text(),'Tipo:')]//..//ul/li/span",
                texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void tipoDespesa(String texto){
        selectComboBy(By.xpath("//label[contains(text(),'Tipo despesa:')]/../div/input"), texto);
    }

    public void tabela(String texto){
        writeByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//label[contains(text(), 'Tabela')]/../div/input", texto);
    }

    public void codDescricaoPS(String texto){
        writeByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[3]//input", texto);
        clickEnterByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[3]//input");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    //botao X
    public void editButtonCodDescricao(){
        clickBtnByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[4]");
    }

    public void descricao(String texto){
        writeByXpath("//*[@title='Descrição do Procedimento']", texto);
    }

    public void quantidadePS(String texto){
        writeByXpath("//*[@title='Quantidade solicitada do Procedimento']", texto);
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    //botao Adicionar
    public void botaoAdd(){
        clickBtnByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//*[@value='Adicionar']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
        explicitWaitVisibilityElement(".grid_row");
    }

    public void observacao(String texto){
        writeByXpath("//legend[contains(text(),'Procedimentos Solicitados')]/../..//label[contains(text(), 'Observação')]/../textarea", texto);
    }

    /****************** Anexo - OPME **********************/

    public void preencherAnexo(String texto){
        clickBtnByXpath("//legend[contains(text(), 'Anexo - OPME')]/../span/input");
    }

    public void nomeContratado(String texto){
        writeByXpath("//legend[contains(text(),'Anexo - OPME')]/..//input[@title='Nome Contratado']", texto);
    }

    public void telefone(String texto){
        writeByXpath("//*[@title='Telefone']", texto);
    }

    public void email(String texto){
        writeByXpath("//*[@title='E-mail']", texto);
    }

    public void justificativaTecnica(String texto){
        writeByXpath("//*[@title='Justificativa Técnica']", texto);
    }

    public void tabelaOPME(String texto){
        selectComboBy(By.xpath("//legend[contains(text(),'Anexo - OPME')]/..//label[contains(text(), 'Tabela')]/../div/input"), texto);
    }

    public void codDescicaoOPME(String texto){
        writeByXpath("//legend[contains(text(),'Anexo - OPME')]/..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[3]//input", texto);
    }

    //botao X
    public void editButtonCodDescicaoOPME(){
        clickBtnByXpath("//legend[contains(text(),'Anexo - OPME')]/..//span[contains(text(), 'Código/Descrição:')]/..//table[2]//td[4]");
    }

    public void descricaoOPME(String texto){
        writeByXpath("//*[@title='Descrição do Material']", texto);
    }

    public void opcao(String texto){
        selectComboBy(By.xpath("//label[contains(text(), 'Opção:')]/..//input"), texto);
    }

    public void quantidadeOPME(String texto){
        writeByXpath("//*[@title='Quantidade Solicitada']", texto);
    }

    public void valorUnitario(String texto){
        writeByXpath("//*[@title='Valor Unitário Solicitado']", texto);
    }

    public void registroANVISA(String texto){
        writeByXpath("//*[@title='Registro ANVISA Material']", texto);
    }

    public void refFabricante(String texto){
        writeByXpath("//*[@title='Referência do Material no Fabricante']", texto);
    }

    public void autorizacaoFuncionamento(String texto){
        writeByXpath("//*[@title='Autorização de Funcionamento']", texto);
    }

    //botao Adicionar
    public void botaoAddPS(){
        clickBtnByXpath("//legend[contains(text(),'Anexo - OPME')]/..//*[@value='Adicionar']");
    }

    public void especificacaoMaterial(String texto){
        writeByXpath("//*[@title='Especificação do Material']", texto);
    }

    public void observacaoPS(String texto){
        writeByXpath("//legend[contains(text(),'Anexo - OPME')]/..//label[contains(text(), 'Observação')]/../textarea", texto);
    }

    /****************** Anexar Arquivo **********************/

    public void anexarArquivo(){
        clickBtnByXpath("//legend[contains(text(), 'Anexar Arquivo')]/../span/input");
    }

    public void selecione(){
        clickBtnByXpath("//legend[contains(text(), 'Anexar Arquivo')]/..//span[contains(text(), 'Selecione')]/../input");
    }

    public void justificativa(String texto){
        writeByXpath("//textArea[@title= 'Justificativa']", texto);
    }

    /*************************************Button Menu********************************/

    public void menu(){
        clickBtnByXpath("//i[contains(text(), 'menu')]");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    public void carregarModelo(){
        clickBtnByXpath("//a[@data-tooltip='Carregar Modelo']");
    }

    public void salvarModelo(){
        clickBtnByXpath("//a[@data-tooltip='Salvar Modelo']");
    }

    public void enviar(){
        clickBtnByXpath("//a[@data-tooltip='Enviar']");
        explicitWaitInvisibilityElementBy(SpinnerLoading2);
    }

    /*************************************Campos para Validação********************************/
    public String statusAutorizado(){
        return getAttributeValueByXpath(By.xpath("//*[@title='Status']"), "value");
    }

    public String quantidadeSolicitada(){
        return getTextByXpath("//fieldset[@class='bloco paraCima itens']//table//td[3]");
    }

    public String quantidadeAutorizada(){
        return getTextByXpath("//fieldset[@class='bloco paraCima itens']//table//td[4]");
    }
}