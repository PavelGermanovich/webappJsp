import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/numberServlet")
public class NumberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number"));
        String messageResult;
        if (number % 2 == 0) {
            messageResult = "Factorial was used " + NumberUtils.getNumberFactorial(number);
        } else {
            messageResult = "Fibonacci was used " + NumberUtils.getNumberFib(number);
        }
        req.setAttribute("resultMes", messageResult);
        getServletContext().getRequestDispatcher("/taskFirstRes.jsp").forward(req, resp);
    }
}