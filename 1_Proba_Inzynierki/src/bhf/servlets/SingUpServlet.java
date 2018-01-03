package bhf.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bhf.controllers.ControllerRegister;

/**
 * Servlet implementation class SingUpServlet
 */
@WebServlet("/SingUpServlet")
public class SingUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		
		String rodzaj_konta = request.getParameter("rodzaj_konta");
		if (rodzaj_konta == null) {
			rodzaj_konta = "Uzytkownik";
		}
		
		ControllerRegister sr = new ControllerRegister();
		String imie=request.getParameter("imie");
		String nazwisko=request.getParameter("nazwisko");
		String login=request.getParameter("login");
		String haslo=request.getParameter("haslo");
		String numer_telefonu=request.getParameter("numer_telefonu");
		String email=request.getParameter("email");
		String haslo2=request.getParameter("haslo2");
		int blad=sr.uwierzytelnij(imie, nazwisko, email, numer_telefonu, login, haslo,haslo2);
		String wyswietl="";
		RequestDispatcher dispatcher;
		switch(blad) {
		case 17:
			wyswietl="BĹ‚Ä™dny adres email.";
			request.setAttribute("blad", wyswietl);
			dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
			dispatcher.forward(request, response);
			break;
			case 0 :	
				if(sr.zarejestruj(login, haslo2, imie, nazwisko, email, numer_telefonu, rodzaj_konta, null))
					wyswietl="Zarejestrowano pomyĹ›lnie.";
				else 
					wyswietl="BĹ‚Ä…d";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 18:
				wyswietl="Podaj imiÄ™.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 1:
				wyswietl="ImiÄ™ moĹĽe zawieraÄ‡ tylko litery.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;

			case 19:
				wyswietl="Podaj nazwisko.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 2:
				wyswietl="Nazwisko moĹĽe zawieraÄ‡ tylko litery.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 3:
				wyswietl="Numer telefonu moĹĽe zawieraÄ‡ tylko cyfry.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 4:
				wyswietl="BĹ‚Ä™dne znaki w loginie.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 5:
				wyswietl="ImiÄ™ moĹĽe zawieraÄ‡ maksymalnie 30 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 6:
				wyswietl="Nazwisko moĹĽe zawieraÄ‡ maksymalnie 30 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			
			case 15:
				wyswietl="Email juĹĽ istnieje.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 11:
				wyswietl="Numer telefonu musi zawieraÄ‡ 9 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 16:
				wyswietl="Numer telefonu juĹĽ istnieje.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 8:
				wyswietl="Login musi zawieraÄ‡ minimalnie 4 znaki.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 7:
				wyswietl="Login moĹĽe zawieraÄ‡ maksymalnie 16 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 14:
				wyswietl="Login juĹĽ istnieje.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 9:
				wyswietl="HasĹ‚o musi zawieraÄ‡ minimalnie 8 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 10:
				wyswietl="HasĹ‚o moĹĽe zawieraÄ‡ maksymalnie 18 znakĂłw.";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 12:
				wyswietl="HasĹ‚o za sĹ‚abe(Musi zawieraÄ‡ co najmniej jeden znak, jednÄ… cyfrÄ™, jednÄ… literÄ™ duĹĽÄ… oraz jednÄ… literÄ™ maĹ‚Ä….";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;
			case 13:
				wyswietl="HasĹ‚a siÄ™ nie zgadzajÄ….";
				request.setAttribute("blad", wyswietl);
				dispatcher =request.getRequestDispatcher("join_Now.jsp#singUpID"); 
				dispatcher.forward(request, response);
				break;		
		}	
	}
}
