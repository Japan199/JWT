package com.example.springjwt.config;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import javax.print.attribute.standard.MediaTray;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import com.fasterxml.jackson.databind.ObjectMapper;

// This is our custom jwt authentication entry point class in which if the token time expired we display the message accordingly
@Component
public class JwtAuthenticatioEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		
		String message;
		
		Exception exception = (Exception) request.getAttribute("exception");
		
		if(exception != null) 
		{
			if(exception.getCause() != null) {
				message = exception.getCause().toString() + "" + exception.getMessage();
			}else {
				message = exception.getMessage();
			}
			byte[] body = new ObjectMapper().writeValueAsBytes(Collections.singletonMap("error", message));
			response.getOutputStream().write(body);
		}
		else {
		if(authException.getCause() != null) {
			message = authException.getCause().toString() + "" + authException.getMessage();
		}else {
			message = authException.getMessage();
		}
		byte[] body = new ObjectMapper().writeValueAsBytes(Collections.singletonMap("error", message));
		response.getOutputStream().write(body);
	}
	}

}
