package br.com.infomed.test;

import br.com.infomed.pages.Dashboard;
import br.com.infomed.pages.MenuPage;
import br.com.infomed.pages.RegistroOcorrenciaPage;
import br.com.infomed.utils.enums.OcorrenciaTipoEnum;
import org.junit.Test;

public class CadastrarOcorrenciaTest {

    Dashboard dashboard = new Dashboard();
    MenuPage menu = new MenuPage();
    RegistroOcorrenciaPage registroOcorrencia = new RegistroOcorrenciaPage();

//    @Test
//    public void cadastrarOcorrenciaMenuExpandidoComSucesso() {
//
//        menu.clicarMenuItemRegistroDeOcorrenciaExpandido();
//        menu.clicarSubMenuItemCadastrarOcorrencia();
//        registroOcorrencia.setTipoOcorrencia(OcorrenciaTipoEnum.ODST);
//        registroOcorrencia.setDataOcorrencia("16/11/2019 15:06:00");
//        registroOcorrencia.setNome("João Pedro Albuquerque");
//        registroOcorrencia.setCPF("03400021425");
//        registroOcorrencia.setTelefone("83988881214");
//        registroOcorrencia.setEnderecoCep("58045080");
//        registroOcorrencia.setEnderecoLogradouro("Avenida Adolfo Loureiro França");
//        registroOcorrencia.setEnderecoNumero("2018");
//        registroOcorrencia.setEnderecoBairro("Cabo Branco");
//        registroOcorrencia.setEnderecoComplemento("Apt 34");
//        registroOcorrencia.setQuantidadeAdultos(2);
//        registroOcorrencia.setQuantidadeCriancas(1);
//        registroOcorrencia.setQuantidadeIdosos(0);
//        registroOcorrencia.setQuantidadeEspeciais(1);
//        registroOcorrencia.setDescricaoRegistroOcorrencia("Apartamento apresenta rachaduras");
//        registroOcorrencia.clicarBotaoSalvar();
//    }

    @Test
    public void cadastrarOcorrenciaMenuRecolhidoComSucesso() {

        dashboard.clicarBotaoCollapse();
        menu.clicarMenuItemRegistroDeOcorrenciaRecolhido();
        menu.clicarSubMenuItemCadastrarOcorrencia();
        registroOcorrencia.setTipoOcorrencia(OcorrenciaTipoEnum.ODST);
        registroOcorrencia.setDataOcorrencia("16/11/2019 15:06:00");
        registroOcorrencia.setNome("João Pedro Albuquerque");
        registroOcorrencia.setCPF("03400021425");
        registroOcorrencia.setTelefone("83988881214");
        registroOcorrencia.setEnderecoCep("58045080");
        registroOcorrencia.setEnderecoLogradouro("Avenida Adolfo Loureiro França");
        registroOcorrencia.setEnderecoNumero("2018");
        registroOcorrencia.setEnderecoBairro("Cabo Branco");
        registroOcorrencia.setEnderecoComplemento("Apt 34");
        registroOcorrencia.setQuantidadeAdultos(2);
        registroOcorrencia.setQuantidadeCriancas(1);
        registroOcorrencia.setQuantidadeIdosos(0);
        registroOcorrencia.setQuantidadeEspeciais(1);
        registroOcorrencia.setDescricaoRegistroOcorrencia("Apartamento apresenta rachaduras");
        registroOcorrencia.clicarBotaoSalvar();
    }
}
