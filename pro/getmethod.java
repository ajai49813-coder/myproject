import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sts")

public class getmethod extends HttpServlet{
    @Override
       public void doGet(HttpServletRequest req,HttpServletResponse res)
       throws IOException{
        res.setStatus(200);
        res.setContentType("text/plain");
        res.getWriter().write("API Rate Limiter & Quote Manager is Running");
       }
}
