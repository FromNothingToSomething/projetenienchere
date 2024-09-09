package fr.eni.eniencheres.bll;

import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.UtilisateurDAO;

public class UtilisateurManagerImpl implements UtilisateurManager{
	//Dependance avec Constructeur
	private UtilisateurDAO utilisateurDAO;

	/**
	 * @param utilisateurDAO
	 */
	public UtilisateurManagerImpl(UtilisateurDAO utilisateurDAO) {
		super();
		this.utilisateurDAO = utilisateurDAO;
	}

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		// ICI LES REGLES METIER
		
	}

	@Override
	public Utilisateur consulterUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

}
