package fr.eni.eniencheres.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	UserDetailsManager getUsers(DataSource source) {

		var manager = new JdbcUserDetailsManager(source);
		
		manager.setUsersByUsernameQuery("select pseudo,password,1 from utilisateur where pseudo=?");
		manager.setAuthoritiesByUsernameQuery("select pseudo,role from roles where pseudo=?");

		return manager;
	}

	@Bean
	SecurityFilterChain getFilterChain(HttpSecurity security) throws Exception {
		security.authorizeHttpRequests(auth -> {
//			auth.requestMatchers(HttpMethod.GET, "/film/edit").hasAnyRole("ROLE_ADMIN", "ROLE_MEMBRE");
//			auth.requestMatchers(HttpMethod.GET, "/film/creer").hasAnyRole("ROLE_ADMIN","ROLE_MEMBRE");
//			auth.requestMatchers(HttpMethod.POST, "/film/creer").hasAnyRole("ROLE_ADMIN","ROLE_MEMBRE");
//			auth.requestMatchers(HttpMethod.GET, "/avis/creer").hasAnyRole("ROLE_ADMIN","ROLE_MEMBRE");
//			auth.requestMatchers(HttpMethod.POST, "/avis/creer").hasAnyRole("ROLE_ADMIN","ROLE_MEMBRE");
//			auth.requestMatchers(HttpMethod.GET, "/*").permitAll();//Affichage /film et /avis
//			auth.requestMatchers(HttpMethod.GET, "/film/detail").permitAll();
//			auth.requestMatchers(HttpMethod.GET, "/css/*").permitAll();
//			auth.requestMatchers(HttpMethod.GET, "/images/*").permitAll();
//			auth.anyRequest().denyAll();
		});
		
		security.formLogin(Customizer.withDefaults());
		
		return security.build();
	}

}
