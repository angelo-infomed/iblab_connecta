package br.com.infomed.utils;

import br.com.infomed.core.DriverFactory;
import br.com.infomed.pages.GuiaSolicitacaoInternacaoPage;
import br.com.infomed.pages.GuiaSolicitacaoSPSADTPage;
import br.com.infomed.pages.HomePrestadorPage;
import br.com.infomed.core.BaseTestPrest;
import org.openqa.selenium.By;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public List<String> returnGuiaSolicitacaoSADTEmAnalise(List<String> tipo, String QtdSolicitada) {

        GuiaSolicitacaoSPSADTPage pageSPSADT = new GuiaSolicitacaoSPSADTPage();
        HomePrestadorPage pageHome = new HomePrestadorPage();
        BaseTestPrest login = new BaseTestPrest();

        List<String> value = new ArrayList<String>();

        login.inicializa();

        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoSPSADT();
        pageSPSADT.numeroDaCarteira("1001000021000");

        //System.out.println(pageSPSADT.getAttributeValueByXpath(By.xpath("//*[@title='Número da Guia']"), "value"));
        //Armazenar o número da guia de solicitação
        value.add(0, pageSPSADT.getAttributeValueByXpath(By.xpath("//*[@title='Número da Guia']"), "value"));

        pageSPSADT.codigoNomeSolicitante("87210409");
        pageSPSADT.selectEletiva("1-Eletiva");

        //Armazenar a data da solicitação
        value.add(1, pageSPSADT.getAttributeValueByXpath(By.xpath("//*[@title='Data da Solicitação']/..//input"), "value"));
        //System.out.println(pageSPSADT.getAttributeValueByXpath(By.xpath("//*[@title='Data da Solicitação']/..//input"), "value"));

        pageSPSADT.selectComboTipoDoItem("Procedimento");

        for (int i = 0; i < tipo.size(); i++) {

            if(i%2 != 0){

                pageSPSADT.codigoDescricao(tipo.get(i));
                pageSPSADT.textFieldQuantidade(QtdSolicitada);
                pageSPSADT.btnAdicinarDoisItensSolicitacao();
            }
            pageSPSADT.codigoDescricao(tipo.get(i));
            pageSPSADT.textFieldQuantidade(QtdSolicitada);
            pageSPSADT.btnAdicinarItensSolicitacao();
        }

        for (String teste: value){

            //System.out.println(value.set(i, pageSPSADT.getAttributeValueByXpath(By.xpath("//*[@title='Número Guia Prestador']"), "value")));
            System.out.println(teste);
        }

        pageSPSADT.btnMenu();
        pageSPSADT.btnEnviar();
        DriverFactory.killDriver();

        return value;
    }
}