package servlet;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = "/ServletCustomer")
public class ServletCustomer extends HttpServlet {
    List<Customer> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        list.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội"));
        list.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang"));
        list.add(new Customer("Nguyễn Thái Hoà", "1983-08-22", "Nam Định"));
        list.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây"));
        list.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        request.setAttribute("listCustomer", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/home.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
