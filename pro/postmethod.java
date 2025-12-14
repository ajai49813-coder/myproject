import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/student/add")
public class postmethod extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)
    throws IOException{
        String name=req.getParameter("name");
        String dept=req.getParameter("dept");
        res.setContentType("text/plain");
        if(name=="" || dept==""){
            res.setStatus(400);
            res.getWriter().write("Students details missing");
            return;
        }
        else{
            res.setStatus(200);
            res.getWriter().write("Students name: " + name + " Dept is: " + dept);
        }
        
        
    }
}
