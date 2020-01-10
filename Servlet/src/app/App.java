package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class App extends HttpServlet{
    
    //private static final long serialVersionUID = -3967314453512919811L;
    public static void main(String[] args) throws Exception {
        System.out.println("Servlet Contatore!");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        HttpSession Sessione = req.getSession();     
        res.setContentType("text/html");   //visualizzare il tutto su una pagina web.      
        PrintWriter out = res.getWriter(); 
    if(Sessione.getAttribute("Contatore")==null){
        Sessione.setAttribute("Contatore",1);
        out.println("<h1>Ciao, Questa è la prima volta che effettui l'accesso al sito!!</h1>");
    }
    else{
        int Contatore=(int)Sessione.getAttribute("Contatore");
        Contatore++;
        Sessione.setAttribute("Contatore", Contatore);
        out.println("<h1>Ciao, felice di rivederti, hai effettuato "+Contatore+" Accessi oggi, buona permanenza!</h1>");
        }
    }
}