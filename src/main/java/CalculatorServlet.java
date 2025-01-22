import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Получаем параметр “a” и “b” из запроса
        String a = request.getParameter("a");
        String b = request.getParameter("b");

        try {
            // Преобразовываем строки в числа и считаем сумму
            int sum = Integer.parseInt(a) + Integer.parseInt(b);

            // Печатаем HTML в качестве ответа для браузера
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head> <title> CalculatorServlet </title> </head>");
            out.println("<body>");
            out.println("<h1> Sum == " + sum + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}