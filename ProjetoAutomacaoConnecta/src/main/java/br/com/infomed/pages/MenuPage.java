package br.com.infomed.pages;

import br.com.infomed.core.BasePage;

public class MenuPage extends BasePage {

    public void clicarMenuItemDashboardExpandido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[2]/a/span");
    }

    public void clicarMenuItemDashboardRecolhido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[2]/a/i");
    }

    public void clicarMenuItemRegistroDeOcorrenciaExpandido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[3]/a/span[1]");
    }

    public void clicarMenuItemRegistroDeOcorrenciaRecolhido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[3]/a");
    }

    public void clicarSubMenuItemCadastrarOcorrencia() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[3]/ul/li[1]/a");
    }

    public void clicarSubMenuItemListarOcorrencias() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[3]/ul/li[2]/a");
    }

    public void clicarMenuItemOficioDocumentoExpandido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[4]/a/span[1]");
    }

    public void clicarMenuItemOficioDocumentoRecolhido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[4]/a/i");
    }

    public void clicarSubMenuItemListarOficiosDocumentos() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[4]/ul/li/a");
    }

    public void clicarMenuItemPesquisarExpandido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[5]/a/span[1]");
    }

    public void clicarMenuItemPesquisarRecolhido() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[5]/a/i");
    }

    public void clickSubMenuItemPesquisarOcorrencia() {
        clicarBotao("/html/body/div/aside[1]/section/ul/li[5]/ul/li/a");
    }
}
