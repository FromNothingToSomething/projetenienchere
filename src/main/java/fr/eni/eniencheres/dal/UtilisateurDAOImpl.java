package fr.eni.eniencheres.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import fr.eni.eniencheres.bo.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO{
	//Dependance avec l'autowired
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		var sql ="INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES ('?','?','?','?','?','?','?','?','?',?, ?);";
		jdbcTemplate.update(sql);
		
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
	public void supprimerUtilisateur(Utilisateur utilisateur){
		var sql = "DELETE FROM UTILISATEUR WHERE noUtilisateur=?;";
		jdbcTemplate.update(sql, Utilisateur.class);
		return;
	}

}
