package br.com.infomed.test;

import br.com.infomed.core.BaseTestPrest;
import br.com.infomed.pages.GuiaSolicitacaoSPSADTPage;
import br.com.infomed.pages.HomePrestadorPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

//CT-60:Cria��o de guia SADT Local - Negado
public class CT_60 extends BaseTestPrest {

    GuiaSolicitacaoSPSADTPage pageSPSADT = new GuiaSolicitacaoSPSADTPage();
    HomePrestadorPage pageHome = new HomePrestadorPage();

    @Test
    public void criarGuiaSADTLocalNegadoTotal() throws InterruptedException, IOException {

        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoSPSADT();
        pageSPSADT.numeroDaCarteira("1001000021000");
        pageSPSADT.codigoNomeSolicitante("87210409");
        pageSPSADT.selectEletiva("1-Eletiva");
        pageSPSADT.selectComboTipoDoItem("Procedimento");
        pageSPSADT.codigoDescricao("20104200");
        pageSPSADT.textFieldQuantidade("2");
        pageSPSADT.btnAdicinarItensSolicitacao();

        pageSPSADT.btnMenu();
        pageSPSADT.btnEnviar();

        //System.out.println(pageSPSADT.obterValorColunaDescricao());
        //System.out.println(pageSPSADT.verificarConteudoDescricao());

        Assert.assertEquals("Negado", pageSPSADT.obterStatus());
        Assert.assertEquals("0", pageSPSADT.obterValorQtdeAutorizada());
        Assert.assertTrue(pageSPSADT.verificarConteudoDescricao());
    }
}
