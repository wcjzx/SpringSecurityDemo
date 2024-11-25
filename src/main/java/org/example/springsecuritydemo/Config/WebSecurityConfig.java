package org.example.springsecuritydemo.Config;

import com.alibaba.fastjson2.JSON;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.InMemoryReactiveClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

import java.util.HashMap;

import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class WebSecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        //authorizeRequests()：开启授权保护
//        //anyRequest()：对所有请求开启授权保护
//        //authenticated()：已认证请求会自动被授权
//        http.authorizeRequests(
//                        authorize -> authorize
//                                .requestMatchers("/user/**").hasRole("ADMIN")
////                                .requestMatchers("/user/list").hasAuthority("USER_LIST")
////                                .requestMatchers("/user/add").hasAuthority("USER_ADD")
//                                .anyRequest()
//                                .authenticated())
//                .formLogin(form -> {
//                    form.loginPage("/login").permitAll() //登录页面无需授权即可访问
//                            .usernameParameter("username") //自定义表单用户名参数，默认是username
//                            .passwordParameter("password") //自定义表单密码参数，默认是password
//                            .successHandler(new MyAuthenticationSuccessHandler())//认证成功时的处理
//                            .failureHandler(new MyAuthenticationFailureHandler()); //认证失败时的处理
//                }); //使用表单授权方式
//
//        http.exceptionHandling(exception  -> {
//    exception.authenticationEntryPoint(new MyAuthenticationEntryPoint());//请求未认证的接口
//});
//        //错误处理
//http.exceptionHandling(exception  -> {
//    exception.authenticationEntryPoint(new MyAuthenticationEntryPoint());//请求未认证的接口
//    exception.accessDeniedHandler((request, response, e)->{ //请求未授权的接口
//
//        //创建结果对象
//        HashMap result = new HashMap();
//        result.put("code", -1);
//        result.put("message", "没有权限");
//
//        //转换成json字符串
//        String json = JSON.toJSONString(result);
//
//        //返回响应
//        response.setContentType("application/json;charset=UTF-8");
//        response.getWriter().println(json);
//    });
//});
//        //跨域
//http.cors(withDefaults());
//
////        http.logout(logout -> {
////    logout.logoutSuccessHandler(new MyLogoutSuccessHandler()); //注销成功时的处理
////});
//        return http.build();
//    }
// @Bean
//         public OAuth2AuthorizedClientService authorizedClientService() {
//             return new InMemoryOAuth2AuthorizedClientService(
//                 new InMemoryReactiveClientRegistrationRepository(
//                     ClientRegistration.withRegistrationId("client1")
//                         .clientId("your-client-id")
//                         .clientSecret("your-client-secret")
//                         .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                         .redirectUri("{baseUrl}/login/oauth2/code/{registrationId}")
//                         .scope("read", "write")
//                         .authorizationUri("https://your-provider.com/oauth2/authorize")
//                         .tokenUri("https://your-provider.com/oauth2/token")
//                         .userInfoUri("https://your-provider.com/userinfo")
//                         .userNameAttributeName("sub")
//                         .build()
//                 )
//             );
//         }
}
