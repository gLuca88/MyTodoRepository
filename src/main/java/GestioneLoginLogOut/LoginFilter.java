package GestioneLoginLogOut;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("REQUEST IN INGRESSO");
		HttpSession session = ((HttpServletRequest) request).getSession();

		boolean isLoginPage = ((HttpServletRequest) request).getRequestURI().endsWith("/ServletLogin")
				|| ((HttpServletRequest) request).getRequestURI().endsWith("/login.jsp");
		Object user = session.getAttribute("userObj");
		System.out.println("USER: " + user);
		if (isLoginPage) {
			chain.doFilter(request, response);
		} else if (user != null) {

			System.out.println("L'utente è loggato");
			chain.doFilter(request, response);
			return;
		} else {
			System.out.println("L'utente deve effettuare la login");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			return;
		}

	}

}