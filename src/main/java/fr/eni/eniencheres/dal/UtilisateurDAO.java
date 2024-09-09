package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Utilisateur;

public interface UtilisateurDAO {
	public void creerUtilisateur(Utilisateur utilisateur);
	public Utilisateur consulterUtilisateur(Utilisateur utilisateur);
	public Utilisateur modifierUtilisateur (Utilisateur utilisateur);
	public void supprimerUtilisateur(Utilisateur utilisateur);

}
