package org.gaocl.demo.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.print.attribute.standard.Media;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class FailLogin implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setStatus(400);
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);;
        PrintWriter printWriter = response.getWriter();
//        log.info(response.getWriter().toString());
//        printWriter.write(response.getStatus());
        printWriter.write(exception.getMessage());
//        printWriter.write("username error or password error!!!");
//        printWriter.write(exception.getMessage().toLowerCase());
        printWriter.flush();
        printWriter.close();
    }
}
