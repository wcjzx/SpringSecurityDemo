package org.example.springsecuritydemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //authorizeRequests()：开启授权保护
        //anyRequest()：对所有请求开启授权保护
        //authenticated()：已认证请求会自动被授权
        http.authorizeRequests(
                authorize -> authorize
                        .anyRequest()
                        .authenticated())
                .formLogin( form -> {
    form.loginPage("/login").permitAll() //登录页面无需授权即可访问
        .usernameParameter("username") //自定义表单用户名参数，默认是username
        .passwordParameter("password") //自定义表单密码参数，默认是password
        .successHandler(new MyAuthenticationSuccessHandler())//认证成功时的处理
        .failureHandler(new MyAuthenticationFailureHandler()); //认证失败时的处理

}); //使用表单授权方式

//        http.logout(logout -> {
//    logout.logoutSuccessHandler(new MyLogoutSuccessHandler()); //注销成功时的处理
//});

        return http.build();
    }
}
