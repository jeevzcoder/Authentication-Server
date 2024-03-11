package com.example.demo;

import com.example.demo.Models.Role;
import com.example.demo.Models.Token;
import com.example.demo.Models.User;
import com.example.demo.Repository.RolesRepo;
import com.example.demo.Repository.TokenRepo;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Security.Repository.ClientRepository;
import com.example.demo.Security.Repository.JpaRegisteredClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
import org.springframework.test.annotation.Commit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
//	@Autowired
//	UserRepo repo;
//	@Autowired
//	TokenRepo tokenRepo;
//	//private Regi
	@Autowired
	private JpaRegisteredClientRepository  clientRepository;

	@Autowired
	private JpaRegisteredClientRepository registeredClientRepository;

	@Test
	void contextLoads() {
	}


	@Autowired UserRepo userRepo;
	@Autowired
	RolesRepo rolesRep;

//	@Test
//	@Commit
//	public void addUser(){
//		Role r=new Role();
//		r.setRole("ADMIN");
//		rolesRep.save(r);
//		List<Role> roles=new ArrayList<>();
//		roles.add(r);
//		User u = new User();
//		u.setName("user");
//		u.setEmail("xyz@gmail.com");
//		u.setPassword("xyz");
//		u.setRoles(roles);
//		User savedUser=userRepo.save(u);
//		assertEquals(u,savedUser);
//		System.out.println(savedUser.getName());
//	}

///	@Test
//	public void getUserByEmail(){
//		User u = new User();
//		u.setEmail("xyz@gmail.com");
//		u.setPassword("xyz");
//		User savedUser=repo.save(u);
//		assertEquals(u,savedUser);
//		System.out.println(savedUser.getName());
//
//	}

	/*public void testSignUp(){
		User u1=new User();


	}*/

//	@Test
//	public void TokenTest(){
//		Optional<Token> optToken=tokenRepo.findByTokenAndIsDeletedEquals("TaahusWrMHV5UJdPDxVnl5hDgVKDNbhwETH1nsH5HKbpL3xzQ6hAQ9gAjmhsa0hAhIVvc2ECZpMXrnlBaw97O2OQKsosCtojSuGGMoPCx2yOwcbV0HnecrEiPpVRq7xg",Boolean.FALSE);
//		if (optToken.isEmpty()){
//			System.out.println("Not present");
////		}
////		else{
////			Token token=optToken.get();
////			//System.out.println(token);
////			System.out.println(token.getToken());
////			System.out.println(token.getUser().getEmail());
////		}
////
////
////	}
//
//	@Test
//	@Commit
//	private void addUserToDb(){
//
//			RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
//					.clientId("oidc-client")
//					.clientSecret("$2a$16$ItVcd9PbcRp8XI52n6ZiXOKkExEnLlivZl6JfKD6i6KltqF3BnXsC")
//					.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//					.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//					.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//					.redirectUri("https://oauth.pstmn.io/v1/callback")
//					.postLogoutRedirectUri("https://oauth.pstmn.io/v1/callback")
//					.scope(OidcScopes.OPENID)
//					.scope(OidcScopes.PROFILE)
//					.scope("ADMIN")
//					.scope("USER")
//					.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build()).build();
//
//
//
//
//
//		clientRepository.save(oidcClient);
//		System.out.println(oidcClient.getClientName());
//		System.out.println(clientRepository.findByClientId("oidc-client").getClientName());
//
//
//		//assertEquals(oidcClient,clientRepository.findByClientId("oidc-client"));
//
//		}
//
//$2a$16$YivGauLB0n2rFFVU7D.Vju1jnnQTRfBSMHFFhNdG5vVpFE5Pa1VGC
	@Test
	@Commit
	void storeRegisteredClientIntoDB() {
		RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
				.clientId("oidc-client")
				.clientSecret("$2a$16$YivGauLB0n2rFFVU7D.Vju1jnnQTRfBSMHFFhNdG5vVpFE5Pa1VGC")
				.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
				.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
				.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
				.redirectUri("https://oauth.pstmn.io/v1/callback")
				.postLogoutRedirectUri("https://oauth.pstmn.io/v1/callback")
				.scope(OidcScopes.OPENID)
				.scope(OidcScopes.PROFILE)
				.scope("ADMIN")

				.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
				.build();

		registeredClientRepository.save(oidcClient);

		System.out.println(oidcClient.getClientName());
		System.out.println(registeredClientRepository.findByClientId("oidc-client").getClientName());

	}


}









