package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import M2_TD2_agile.Realisateur;
import M2_TD2_agile.Film;

public class StepsDefUS000AjouterFilmRealise {
    private Realisateur realisateur;
    private Film film;

    @Given("un nouveau realisateur et un film avec le titre {string} et l'année de sortie {int}")
    public void unNouveauRealisateurEtUnFilmAvecTitreEtAnneeSortie(String titre, int anneeSortie)
    {
        this.realisateur = new Realisateur();
        this.film = new Film();
        this.film.setTitre(titre);
        this.film.setAnneeSortie(anneeSortie);
    }

    @Then("le film doit être ajouté à la liste des films réalisés par ce réalisateur")
    public void leFilmDoitEtreAjouteALaListeDesFilmsRealisesParCeRealisateur()
    {
        this.realisateur.ajouterFilmRealise(this.film);
        int nb_film_realises = this.realisateur.getFilmsRealises().size();
        assert(nb_film_realises == 1);
    }
}