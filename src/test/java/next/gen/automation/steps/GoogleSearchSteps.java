package next.gen.automation.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import next.gen.automation.pages.GooglePage;

public class GoogleSearchSteps {

    private String bandName = "";
    private GooglePage googlePage = new GooglePage();

    @Dado("usuário na página inicial do Google")
    public void usuárioNaPáginaInicialDoGoogle() {
        googlePage.goToGoogleSearchPage();
        assert googlePage.googleSearchField.isDisplayed();
    }

    @Quando("pesquisar por {string}")
    public void pesquisarPor(String bandName) {
        this.bandName = bandName;
        googlePage.searchFor(bandName);
    }

    @Então("deverá ver resultados relacionados")
    public void deveráVerResultadosRelacionados() {
        assert googlePage.resultStats.isDisplayed();
        assert googlePage.dataContainerHasBandName(this.bandName);
    }
}
