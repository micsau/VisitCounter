<%@ page import = "java.io.*,java.util.*"%>
<html>
    <head>
        <title>Sessione in JSP!</title>
    </head>
<body>
    <%
        Integer Contatore = (Integer) session.getAttribute("Contatore");
        if (Contatore==null){
            session.setAttribute("Contatore", 1);  
            out.println("Ciao, Benvenuto nella nostra pagina!");
        }
        else{
            Contatore++;
            session.setAttribute("Contatore", Contatore);
            out.println("Ciao, felice di rivederti, hai effettuato "+Contatore+" Accessi oggi, buona permanenza!");
        }
    %>
</body>
</html>