package M2_TD2_agile;

/** Classe Film regroupant toutes les fonctionnalites et caracteristiques liees au films
 * @author Clementine et Meganne
 * @version 1
 */
public class Film {

    /** Les caracteristiques liees au films */
    private String titre = "Top Gun";
    private int anneeSortie= 1986;
    private Realisateur realisateur = new Realisateur();

    /** Cette fonction permet de renvoyer le titre du film
     * @return titre du film
     */
    public String getTitre()
    {
        return this.titre;
    }

    /** Cette fonction permet de renvoyer l'annee de sortie du film
     * @retun annee de sortie
     */
    public int getAnneeSortie()
    {
        return this.anneeSortie;
    }

    /** Cette fonction permet de modifier le titre du film
     * @param titre : nouveau titre du film
     */
    public void setTitre(String titre)
    {
        this.titre = titre;
    }

    /** Cette fonction permet de modifier l'annee de sortie du film
     * @param anneeSortie : nouvelle annee de sortie du film
     */
    public void setAnneeSortie(int anneeSortie)
    {
        this.anneeSortie = anneeSortie;
    }

    /** Cette fonction permet de verifier que l'annee de sortie du film
     * est inferieur a l'annee entree en parametre.
     * @param  annee
     * @return true si annee_sortie est inferieur a annee et false sinon
     */
    public boolean verifierAnneeSortieInferieurA(int annee)
    {
        return this.anneeSortie < annee ;
    }

    /** Cette fonction permet de renvoyer une description du film
     * @return une description du film
     */
    public String afficherFilm()
    {
        return "Le film " + this.titre + " est sorti en " + this.anneeSortie + "\n" + realisateur.afficherRealisateur();
    }

}

