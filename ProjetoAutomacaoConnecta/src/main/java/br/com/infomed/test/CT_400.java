package br.com.infomed.test;

import br.com.infomed.core.BaseTestAuditM;
import br.com.infomed.pages.DetalheDoPedidoPage;
import br.com.infomed.pages.HomeAutoAuditMPage;
import br.com.infomed.pages.PedidosDeAutorizacaoPage;
import org.junit.Assert;
import org.junit.Test;
import br.com.infomed.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class CT_400 extends BaseTestAuditM {

    HomeAutoAuditMPage pageHomeAudit = new HomeAutoAuditMPage();
    PedidosDeAutorizacaoPage pageAuditGuia = new PedidosDeAutorizacaoPage();
    DetalheDoPedidoPage pageDetalhe = new DetalheDoPedidoPage();
    ArrayList<String> tipos = new ArrayList<String>();


    public CT_400() {

        tipos.add("40101010");
        tipos.add("20104200");
        super.parseTipos(tipos, "5");
    }


    @Test
    public void auditoriaGuiaSPSADTTissAutorizadaParcialmente() throws InterruptedException {

        pageHomeAudit.abrirMenuAuditoria();
        pageHomeAudit.selecionaPedidosDeAutorizacao();


        pageAuditGuia.numeroDaGuiaTransacao(data.get(0));
        pageAuditGuia.dataSolicitacao(data.get(1), (String) data.get(1));
        pageAuditGuia.statusAuditoria("EA - Em análise");
        pageAuditGuia.clicarBtnAdicionar();
        pageAuditGuia.clicarAcessarAuditoria();


        pageDetalhe.iniciarAuditoria();
        pageDetalhe.clicarBtnIniciar();
        pageDetalhe.marcarItemAuditado(tipos.get(0));
        pageDetalhe.editar();
        pageDetalhe.status("Autorizado");
        pageDetalhe.confirmar();

        Assert.assertEquals("Autorizado", pageDetalhe.obterColunaStatus(tipos.get(0)));
        Assert.assertEquals("5", pageDetalhe.obterColunaAutorizados(tipos.get(0)));

        pageDetalhe.desmarcarItemAuditado(tipos.get(0));
        pageDetalhe.marcarItemAuditado(tipos.get(1));
        pageDetalhe.editar();
        pageDetalhe.status("Negado");
        pageDetalhe.motivoDaNegativa("1005 - ATENDIMENTO ANTERIOR À INCLUSÃO DO BENEFICIÁRIO");
        pageDetalhe.justificativaDaNegativa("Birobirobiro");
        pageDetalhe.confirmar();
        pageDetalhe.encerrar();
        pageDetalhe.escreverMensagem("Birbirobiro");
        pageDetalhe.enviar();

        System.out.println(pageDetalhe.alertSucesso());
        Assert.assertEquals("Operação realizada com sucesso", pageDetalhe.alertSucesso());

        pageAuditGuia.apagarNumeroDaGuiaTransacao();
        pageAuditGuia.excluirStatus();
        pageAuditGuia.statusAuditoria("AP - Autorizado parcialmente");
        pageAuditGuia.apagarData();
        pageAuditGuia.dataSolicitacao(data.get(1), data.get(1));
        pageAuditGuia.clicarBtnAdicionar();

        System.out.println(pageAuditGuia.obterValorTitleGrid());

        Assert.assertEquals("Autorizado parcialmente", pageAuditGuia.obterValorTitleGrid());
        Assert.assertEquals(data.get(0), pageAuditGuia.obterNumeroGuiaGrid(data.get(0)));
    }
}
