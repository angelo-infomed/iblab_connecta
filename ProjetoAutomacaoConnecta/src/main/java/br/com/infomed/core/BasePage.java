package br.com.infomed.core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

//Classe base para a construção dos Page Object do sistema Connecta_Automação.
public class BasePage {


    /*********** ClickKeyBoard *************/
    //Clicar no botão "TAB" do teclado via Xpath.
    public void clickTabByXpath(String xpath) {

        WebElement webElement = DriverFactory.getDriver().findElement(By.xpath(xpath));
        webElement.sendKeys(Keys.TAB);
    }

    //Clicar no botão "ENTER" do teclado via Xpath.
    public void clickEnterByXpath(String xpath) {

        WebElement webElement = DriverFactory.getDriver().findElement(By.xpath(xpath));
        webElement.sendKeys(Keys.ENTER);
    }

    /********************* ExplicitWait *****************/
    // É a espera de um elemento não interagível.
    public void explicitWaitInvisibilityElementBy(By by) {

        DriverFactory.getDriverwait(30).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //É a espera por um determinado texto a ser apresentado.
    public void explicitWaitText(By by, String valor) {

        DriverFactory.getDriverwait(30).until(ExpectedConditions.textToBe(by, valor));
    }

    //É a espera por um elemento interagível.
    public void explicitWaitVisibilityElement(String selector) {

        DriverFactory.getDriverwait(30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
    }

    //É a espera até que o botão desejado esteja clicável.
    public void explicitWaitBtnClickableByXpath(String xpath) {

        WebElement webElement = DriverFactory.getDriverwait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        webElement.click();
    }

    //É a espera até que um determinado campo de texto seja preenchido por um texto esperado.
    public void explicitWaitTillTextPresentInTextField(String xpath) {

        DriverFactory.getDriverwait(30).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver m) {

                return DriverFactory.getDriver().findElement(By.xpath(xpath)).getAttribute("value").length() != 0;
            }
        });
    }
    // É a espera até que um determinado elemento seja visivel.
    public void explicitWaitUntilVisibilityElement(String xpath){

        DriverFactory.getDriverwait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    
    public void explicitWaitBtnClickableBySelector(String selector) {

        WebElement webElement = DriverFactory.getDriverwait(60).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
        webElement.click();
    }

    public void explicitWaitVisibilityElementByXpath(String xpath){

        DriverFactory.getDriverwait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    /********* TextField/TextArea ************/
    //Escrever de forma genérica.
    public void writeBy(By by, String texto) {

        DriverFactory.getDriver().findElement(by).clear();
        DriverFactory.getDriver().findElement(by).sendKeys(texto);
    }

    //Escrever pelo ID identificado na página web.
    public void writeByID(String id_field, String text) {

        writeBy(By.id(id_field), text);
    }

    //Escrever por Xpath montado em cada página web.
    public void writeByXpath(String xpath, String text) {

        writeBy(By.xpath(xpath), text);
    }

    //Escrever por Selector montado em cada página web.
    public void writeBySelector(String selector, String text) {

        writeBy(By.cssSelector(selector), text);
    }

    //Acessar um "value" de um campo de texto por ID.
    public String getFieldValueByID(String id_field, String attribute) {

        return DriverFactory.getDriver().findElement(By.id(id_field)).getAttribute(attribute);
    }

    /********* Radio/Check ************/
    //Clicar em um botão do tipo rádio.
    public void clickRadioBy(By by) {

        DriverFactory.getDriver().findElement(by).click();
    }

    //Clicar em um botão do tipo rádio por Xpath.
    public void clickRadioByXpath(String xpath) {

        clickRadioBy(By.xpath(xpath));
    }

    //Verificar se o botão rádio está selecionado.
    public boolean isSelectedRadioBy(By by) {

        return DriverFactory.getDriver().findElement(by).isSelected();
    }

    //Clicar em um check box pelo ID da página web.
    public void clickCheckByID(String id) {

        DriverFactory.getDriver().findElement(By.id(id)).click();
    }

    //Verificar se o botão check box está selecionado.
    public boolean isSelectedCheckBy(By by) {

        return DriverFactory.getDriver().findElement(by).isSelected();
    }

    /********* Combo ************/
    //Clicar no campo de selecionar um combo box.
    public void selectComboBy(By by, String value) {

        WebElement element = DriverFactory.getDriver().findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(value);
    }

    //Clicar em deselecionar um combo box.
    public void deselectComboBy(By by, String value) {

        WebElement element = DriverFactory.getDriver().findElement(By.id(value));
        Select combo = new Select(element);
        combo.deselectByVisibleText(value);
    }

    //Pegar o value do combo box.
    public String getValueComboBy(By by) {

        WebElement element = DriverFactory.getDriver().findElement(by);
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    //Pegar todos os values do combo box e retornar uma lista.
    public List<String> getAllValuesComboBy(By by) {

        WebElement element = DriverFactory.getDriver().findElement(by);
        Select combo = new Select(element);
        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        List<String> values = new ArrayList<String>();
        for (WebElement option : allSelectedOptions) {
            values.add(option.getText());
        }
        return values;
    }

    //Pegar a quantidade de opções que aparecem no combo box.
    public int getQuantityComboOptionsBy(By by) {

        WebElement element = DriverFactory.getDriver().findElement(by);
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        return options.size();
    }

    //Verificar que a opção escolhida no combo box é a desejada pelo sistema.
    public boolean checkOptionCombo(By by, String option) {

        WebElement element = DriverFactory.getDriver().findElement(by);
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        for (WebElement optionCheck : options) {
            if (optionCheck.getText().equals(optionCheck)) {
                return true;
            }
        }
        return false;
    }

    //Selecionar opções de combo box do framework Prime.
    public void selectComboPrime(String radical, String value) {

        clickRadioBy(By.xpath("//*[@id='" + radical + "_input']/../..//span"));
        clickRadioBy(By.xpath("//*[@id='" + radical + "_items']//li[.='" + value + "']"));
    }

    /********* ClickButton ************/
    //Clicar em um botão através do Xpath.
    public void clickBtnByXpath(String xpath) {

        DriverFactory.getDriver().findElement(By.xpath(xpath)).click();
    }

    //Clicar em um botão de forma genérica.
    public void clickBtnBy(By by) {

        DriverFactory.getDriver().findElement(by).click();
    }

    //Clicar em um botão que possua um texto correspondente.
    public void clickBtnByText(String text) {

        clickBtnBy(By.xpath("//button[.='" + text + "']"));
    }

    //Pegar o value de um elemento da página web através do ID.
    public String getValueElementByID(String id, String attribute) {

        return DriverFactory.getDriver().findElement(By.id(id)).getAttribute(attribute);
    }

    /********* Link ************/
    //Clicar em um link que possua o texto correspondente ao desejado.
    public void clickLinkByText(String link) {

        DriverFactory.getDriver().findElement(By.linkText(link)).click();
    }

    /********* Textos ************/
    //Verificar se um campo de texto está vazio.
    public Boolean isVoidTextField(String text) {

        if (!"".equals(text)) {

            //digite aqui a instrução se o campo for NÃO vazio e NÃO nulo.
            return true;
        } else {

            //digite aqui a intrução para quando o campo FOR vazio ou FOR nulo
            return false;
        }
    }

    //Acessar um texto de forma genérica.
    public String getTextBy(By by) {

        return DriverFactory.getDriver().findElement(by).getText();
    }

    //Acessar o value de um atributo através do Xpath.
    public String getAttributeValueByXpath(By by, String attribute) {

        return DriverFactory.getDriver().findElement(by).getAttribute(attribute);
    }

    //Acessar o texto através do Xpath.
    public String getTextByXpath(String xpath) {

        return getTextBy(By.xpath(xpath));
    }

    /********* Alerts ************/
    //Acessar o texto do Alerta.
    public String getAlertText() {

        Alert alert = DriverFactory.getDriver().switchTo().alert();
        return alert.getText();
    }

    //Acessar o texto do alert e clicar em aceitar.
    public String getAlertTextAndAccept() {

        Alert alert = DriverFactory.getDriver().switchTo().alert();
        String value = alert.getText();
        alert.accept();
        return value;
    }

    //Acessar texto do alert e clicar em negar.
    public String getAlertTextAndDenie() {
        Alert alert = DriverFactory.getDriver().switchTo().alert();
        String valor = alert.getText();
        alert.dismiss();
        return valor;

    }

    //Escrever no alert.
    public void alertWrite(String valor) {
        Alert alert = DriverFactory.getDriver().switchTo().alert();
        alert.sendKeys(valor);
        alert.accept();
    }

    /********* Frames e Janelas ************/
    //Entrar no Frame.
    public void enterFrame(String id) {
        DriverFactory.getDriver().switchTo().frame(id);
    }

    //Sair do Frame.
    public void exitFrame() {
        DriverFactory.getDriver().switchTo().defaultContent();
    }

    //Trocar de janela.
    public void changeWindow(String id) {

        DriverFactory.getDriver().switchTo().window(id);
    }

    /************** JS *********************/
    //Executar o JavaScript
    public Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
        return js.executeScript(cmd, param);
    }

    /************** Tables/Grids *********************/
    //Acessar a célula de uma tabela.
    public WebElement getCellFromTable(String colunaBusca, String valor, String colunaBotao, String idTabela) {

        //procurar coluna do registro
        WebElement tabela = DriverFactory.getDriver().findElement(By.xpath("//*[@id='" + idTabela + "']"));
        int idColuna = getColumnIndex(colunaBusca, tabela);

        //encontrar a linha do registro
        int idLinha = getLineIndex(valor, tabela, idColuna);

        //procurar coluna do botao
        int idColunaBotao = getColumnIndex(colunaBotao, tabela);

        //clicar no botao da celula encontrada
        WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
        return celula;

    }
    //Clicar em um botão de uma tabela.
    public void clickBtnFromTable(String colunaBusca, String valor, String colunaBotao, String idTabela) {

        WebElement celula = getCellFromTable(colunaBusca, valor, colunaBotao, idTabela);
        celula.findElement(By.xpath(".//input")).click();

    }
    //Acessar a linha de um índice.
    protected int getLineIndex(String valor, WebElement tabela, int idColuna) {

        List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td[" + idColuna + "]"));
        int idLinha = -1;
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getText().equals(valor)) {
                idLinha = i + 1;
                break;
            }
        }
        return idLinha;
    }
    //Acessar a coluna de um índice.
    protected int getColumnIndex(String coluna, WebElement tabela) {

        List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
        int idColuna = -1;
        for (int i = 0; i < colunas.size(); i++) {
            if (colunas.get(i).getText().equals(coluna)) {
                idColuna = i + 1;
                break;
            }
        }
        return idColuna;
    }

    /**************** DropDown *********************/
    //Clicar na opção desejada de um drop down através do Xpath.
    public void selectClickDropDownByXpath(String xpathDropDown, String xpathDropDownValues, String value) {

        clickBtnByXpath(xpathDropDown);
        List<WebElement> myElements = DriverFactory.getDriver().findElements(By.xpath(xpathDropDownValues));
        for (WebElement e : myElements) {
            if (e.getText().equalsIgnoreCase(value)) {
                e.click();
            }
        }
    }
    //Selecionar um drop down através do Xpath.
    public void selectDropDownByXpath(String xpathDropDownValues, String value) {

        List<WebElement> myElements = DriverFactory.getDriver().findElements(By.xpath(xpathDropDownValues));
        for (WebElement e : myElements) {
            if (e.getText().equalsIgnoreCase(value)) {
                e.click();
            }
        }
    }

    public void selectClickDropDownByXpathTest(String xpathDropDown, String xpathDropDownValues, String value, String ul) {

        clickBtnByXpath(xpathDropDown);
        explicitWaitVisibilityElementByXpath(ul);
        List<WebElement> myElements = DriverFactory.getDriver().findElements(By.xpath(xpathDropDownValues));
        for (WebElement e : myElements) {
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase(value)) {
                e.click();
            }
        }
    }

    /**************************** SpinnerLoadingXpath *****************************/
    //Mapeamento por Xpath dos elementos de espera.
    
	//Prestador
    public final static By SpinnerLoading = By.xpath("//*[@id='updLoading']//section[@id='loading']");
    public final static By SpinnerLoading2 = By.xpath("//*[@id='updLoading2']//section[@id='loading']");

    //Auditor Médico
    public final static By SpinnerLoadingAudit = By.xpath("//*[@class='el-loading-mask']");
    public final static By SpinnerLoadingAudit2 = By.xpath("/html/body/div/div/svg/circle");
}
