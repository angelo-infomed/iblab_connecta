package br.com.infomed.test;

import br.com.infomed.core.BaseTestAuditM;
import br.com.infomed.pages.DetalheDoPedidoPage;
import br.com.infomed.pages.HomeAutoAuditMPage;
import br.com.infomed.pages.PedidosDeAutorizacaoPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CT_379 extends BaseTestAuditM {
    HomeAutoAuditMPage pageHomeAudit = new HomeAutoAuditMPage();
    PedidosDeAutorizacaoPage pageAuditGuia = new PedidosDeAutorizacaoPage();
    DetalheDoPedidoPage pageDetalhePedido = new DetalheDoPedidoPage();
    ArrayList<String> tipos = new ArrayList<String>();

    public CT_379() {
        //ArrayList<String> tipos = new ArrayList<String>();
        tipos.add("40101010");
        super.parseTipos(tipos, "2");
    }

    @Test
    public void auditoriaGuiaSPSADTTissAutorizada() throws InterruptedException {
        pageHomeAudit.abrirMenuAuditoria();
        pageHomeAudit.selecionaPedidosDeAutorizacao();
        pageAuditGuia.numeroDaGuiaTransacao(data.get(0));
        pageAuditGuia.dataSolicitacao(data.get(1), (String) data.get(1));
        pageAuditGuia.statusAuditoria("EA - Em análise");
        pageAuditGuia.clicarBtnAdicionar();
        pageAuditGuia.clicarAcessarAuditoria();
        pageDetalhePedido.iniciarAuditoria();
        pageDetalhePedido.clicarBtnIniciar();
        pageDetalhePedido.marcarItemAuditado(tipos.get(0));
        pageDetalhePedido.editar();
        pageDetalhePedido.status("Autorizado");
        pageDetalhePedido.confirmar();
        pageDetalhePedido.encerrar();
        pageDetalhePedido.escreverMensagem("Situação normal");
        pageDetalhePedido.enviar();
        Assert.assertEquals("Operação realizada com sucesso",pageDetalhePedido.alertSucesso());
        pageAuditGuia.numeroDaGuiaTransacao(data.get(0));
        pageAuditGuia.apagarData();
        pageAuditGuia.dataSolicitacao(data.get(1), (String) data.get(1));
        pageAuditGuia.excluirStatus();
        pageAuditGuia.statusAuditoria("AT - Autorizado");
        pageAuditGuia.clicarBtnAdicionar();
        Assert.assertEquals("Autorizado", pageAuditGuia.obterValorTitleGridAutorizado());
        Assert.assertEquals(data.get(0), pageAuditGuia.obterNumeroGuiaGrid(data.get(0)));
    }
}