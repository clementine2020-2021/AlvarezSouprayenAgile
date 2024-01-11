import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import M2_TD2_agile.Film;

/** Classe des Test unitaire sur la classe Film*/

class FilmTest {
    private Film topGun;

    /** Méthode appelée avant chaque appel de méthode de test. Permet de créer un film.*/
    @BeforeEach
    public void initialiseFilm()
    {
        topGun = new Film();
    }

    /** Méthode appelée après chaque appel de méthode de test. Permet de supprimer le film*/
    @AfterEach
    public void supprimeFilm()
    {
        topGun = null;
    }

    @Test
    public void testGetTitre()
    {
        assertEquals("Top Gun",topGun.getTitre());
    }

    @Test
    public void testSetTitre()
    {
        topGun.setTitre("Wonka");
        assertEquals("Wonka",topGun.getTitre());
    }

    @Test
    public void testGetAnneeSortie()
    {
        assert(topGun.getAnneeSortie() == 1986);
    }

    @Test
    public void testSetAnneeSortie()
    {
        topGun.setAnneeSortie(2023);
        assert(topGun.getAnneeSortie() == 2023);
    }

    @Test
    public void testAnneeSortieInferieurA()
    {
        assert(topGun.verifierAnneeSortieInferieurA(2023)== true);
    }

    @Test
    public void testAfficherFilm()
    {
        assertEquals("Le film Top Gun est sorti en 1986\nLe realisateur est Tony Scott qui est ne en 1944",topGun.afficherFilm());
    }
}
