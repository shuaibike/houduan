import com.Dao.ddelete;
import com.Dao.student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String no = request.getParameter("stdNumber");
        student s=new student(no);
        ddelete dd=new ddelete();
        int result = dd.ddelete(s);
        if (result > 0) {
            response.sendRedirect("success.jsp");
        }
        else {
            response.sendRedirect("error.jsp");
        }
    }
}
