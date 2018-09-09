import com.Dao.loginDao;
import com.Dao.manager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("uuid");
        String pwd = request.getParameter("passwd");
        manager m = new manager(name, pwd);
        int result = loginDao.login(m);
        if (result > 0) {
            response.sendRedirect("index.jsp");
        }
        else {
            response.sendRedirect("index.jsp");
        }
    }
}
