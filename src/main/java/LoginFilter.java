
//https://www.geeksforgeeks.org/java-servlet-filter-with-example/

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
	{
		System.out.println("REQUEST IN INGRESSO");
		
	}
}//chiusura Classe