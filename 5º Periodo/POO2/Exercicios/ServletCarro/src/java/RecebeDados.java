
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecebeDados extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            System.out.println("Modelo do carro: " + request.getParameter("modelo"));
            System.out.println("Placa: " + request.getParameter("placa"));
            System.out.println("Renavam: " + request.getParameter("renavam"));
            System.out.println("Ano: " + request.getParameter("ano"));
            System.out.println("Km: " + request.getParameter("km"));
            System.out.println("Acessórios: " + request.getParameter("acessorios"));
            System.out.println("Valor: " + request.getParameter("valor"));
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
