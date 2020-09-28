package org.oauth.social.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.csrf().disable();
 
        // Pages do not require login
        http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();
        
        //http.authorizeRequests().antMatchers("/userInfo").access("hasRole('" + AppRole.ROLE_USER + "')");
        //http.authorizeRequests().antMatchers("/admin").access("hasRole('" + AppRole.ROLE_ADMIN + "')");
 
        // AccessDeniedException will be thrown.
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
 
        // Form Login config
		/*
		 * http.authorizeRequests().and().formLogin()
		 * .loginProcessingUrl("/j_spring_security_check") .loginPage("/login")
		 * .defaultSuccessUrl("/userInfo") .failureUrl("/login?error=true")
		 * .usernameParameter("username") .passwordParameter("password");
		 */
 
        // Logout Config
        http.authorizeRequests().and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
 
        // Spring Social Config.
		/*
		 * http.apply(new SpringSocialConfigurer()) .postLoginUrl("/userInfo")
		 * .defaultFailureUrl("/login?error=true") .signupUrl("/signup");
		 */ 
    }
 
}
