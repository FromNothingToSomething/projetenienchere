package fr.eni.eniencheres.dal;

import java.util.List;

import fr.eni.eniencheres.bo.Article;

public interface ArticleDAO {
	public void creerArticle (Article article);
	public Article consulterDetailArticle(Integer noArticle);
	public List<Article> consulterLesArticles();
	public Article modifierArticle(Integer noArticle);
	public void supprimerArticle(Article article);
}
