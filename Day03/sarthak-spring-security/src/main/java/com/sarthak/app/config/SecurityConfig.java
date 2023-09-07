package com.sarthak.app.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/getstudent").hasAnyRole("USER")
                .and().csrf().disable().headers()
                .frameOptions().disable();

        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.PUT, "/updatestudent").hasAnyRole("ADMINROLE")
                .and().csrf().disable().headers()
                .frameOptions().disable();

        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.DELETE, "/updatestudent").hasAnyRole("ADMINROLE")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user123").password("{noop}password").roles("USER");
        auth.inMemoryAuthentication().withUser("admin123").password("{noop}password").roles("ADMINROLE");
        auth.inMemoryAuthentication().withUser("sarthak123").password("{noop}123xyz").roles("ADMINROLE");
    }


}
