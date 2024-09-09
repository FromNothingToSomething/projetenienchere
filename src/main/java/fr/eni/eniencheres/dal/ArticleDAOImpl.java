package fr.eni.eniencheres.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.bo.Utilisateur;

public class ArticleDAOImpl implements ArticleDAO{
	//Dependance avec Autowired pour le jdbcTemplate
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void creerArticle(Article article) {
//TODO
		
	}

	@Override
	public Article consulterDetailArticle(Integer noArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article modifierArticle(Integer noArticle) {
		var sql ="select * from ARTICLES_VENDUS where no_article=?;";
		//jdbcTemplate.    
		
		return null;
	}

	@Override
		public void supprimerArticle(Article article){
			var sql = "DELETE FROM ARTICLE WHERE noArticle=?;";
			jdbcTemplate.update(sql, Utilisateur.class);
			return;
		
	}

	@Override
	public List<Article> consulterLesArticles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
