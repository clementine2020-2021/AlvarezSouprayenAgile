package M2_TD2_agile;

import java.util.*;

/** Classe Realisateur regroupant toutes les fonctionnalites et caracteristiques liees au realisateur
 * @author Clementine et Meganne
 * @version 1
 */

public class Realisateur {

    /** Les caracteristiques du realisateur */
    private String nom = "Tony Scott";
    private int anneeDeNaissance = 1944;
    private List<Film> filmsRealises = new ArrayList<>();

    /** Cette fonction permet de renvoyer le nom du realisateur
     * @return nom du realisateur
     */
    public String getNom()
    {
        return this.nom;
    }

    /** Cette fonction permet de modifier le nom du realisateur
     * @param nom : nouveau nom du realisateur
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /** Cette fonction permet de renvoyer l'annee de naissance du realisateur
     * @return annee de naissance du realisateur
     */
    public int getAnneeDeNaissance()
    {
        return this.anneeDeNaissance;
    }

    /** Cette fonction permet de modifier l'annee de naissance du realisateur
     *  @param  anneeDeNaissance : nouvelle annee de naissance du realisateur
     */
    public void setAnneeDeNaissance(int anneeDeNaissance)
    {
        this.anneeDeNaissance = anneeDeNaissance;
    }

    /** Cette fonction permet de renvoyer une description du realisateur
     * @return une description du realisateur
     */
    public String afficherRealisateur()
    {
        return "Le realisateur est " + this.nom + " qui est ne en " + this.anneeDeNaissance;
    }

    /** Cette fonction renvoie la liste des films realises par ce realisateur
     * @return liste des films realises par ce realisateur
     */
    public List<Film> getFilmsRealises()
    {
        return this.filmsRealises;
    }

    /** Cette fonction permet d'ajouter un film realise par ce realisateur
     * @param film : nouveau film realise
     */
    public void ajouterFilmRealise(Film film)
    {
        this.filmsRealises.add(film);
    }

}

