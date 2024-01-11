import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import M2_TD2_agile.Realisateur;
import M2_TD2_agile.Film;

/** Classe des Test unitaire sur la classe Realisateur*/

class RealisateurTest {

    private Realisateur tonyScott;

    /** Méthode appelée avant chaque appel de méthode de test. Permet de créer un réalisateur.*/
    @BeforeEach
    public void initialiseRealisateur()
    {
        tonyScott = new Realisateur();
    }

    /** Méthode appelée après chaque appel de méthode de test. Permet de supprimer le réalisateur*/
    @AfterEach
    public void supprimeRealisateur()
    {
        tonyScott = null;
    }

    @Test
    public void testGetNom()
    {
        assertEquals("Tony Scott",tonyScott.getNom());
    }

    @Test
    public void testSetNom()
    {
        tonyScott.setNom("Steven Spielberg");
        assertEquals("Steven Spielberg",tonyScott.getNom());
    }

    @Test
    public void testGetAnneeDeNaissance()
    {
        assert(tonyScott.getAnneeDeNaissance() == 1944);
    }

    @Test
    public void testSetAnneeDeNaissance()
    {
        tonyScott.setAnneeDeNaissance(1946);
        assert(tonyScott.getAnneeDeNaissance() == 1946);
    }

    @Test
    public void testAfficherFilm()
    {
        assertEquals("Le realisateur est Tony Scott qui est ne en 1944",tonyScott.afficherRealisateur());
    }

    @Test
    public void testGetFilmRealise() {
        Film topGun = new Film();
        tonyScott.ajouterFilmRealise(topGun);
        assertTrue(tonyScott.getFilmsRealises().contains(topGun));
        assertEquals(1, tonyScott.getFilmsRealises().size());
    }

}
