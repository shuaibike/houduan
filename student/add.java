import com.Dao.dadd;
import com.Dao.student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String no = request.getParameter("stdNumber");
        String major = request.getParameter("major");
        int i=Integer.parseInt(age);
        student s = new student(name,sex,i,no,major);
        dadd a=new dadd();
        int result = a.add(s);
        if (result > 0) {
            response.sendRedirect("success.jsp");
        }
        else {
            response.sendRedirect("error.jsp");
        }
    }
}
