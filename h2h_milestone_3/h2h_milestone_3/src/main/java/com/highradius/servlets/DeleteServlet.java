package com.highradius.servlets;

import com.highradius.connection.DatabaseConnection;
import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private InvoiceDao dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new InvoiceDaoImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int slNo = Integer.parseInt(req.getParameter("Sl_no"));

        dao.deleteInvoice(slNo);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("{\"message\": \"Invoice deleted successfully\"}");
    }
}
