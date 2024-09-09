package fr.eni.eniencheres.bll;

import fr.eni.eniencheres.bo.Utilisateur;

public interface UtilisateurManager {
	public void creerUtilisateur(Utilisateur utilisateur);
	public Utilisateur consulterUtilisateur(Utilisateur utilisateur);
	public Utilisateur modifierUtilisateur (Utilisateur utilisateur);
	public void supprimerUtilisateur(Utilisateur utilisateur);
}
