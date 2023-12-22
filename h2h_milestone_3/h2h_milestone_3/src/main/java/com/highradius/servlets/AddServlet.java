package com.highradius.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;
import com.google.gson.Gson;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private InvoiceDao dao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		dao = new InvoiceDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter writer = response.getWriter();
//		String JsonResponceToSend = new String();
//		List<Invoice> userToShowOnUi = dao.getInvoice();
//
//		Gson gson = new Gson();
//		JsonResponceToSend = gson.toJson(userToShowOnUi);
//
//		response.setContentType("application/json");
//		writer.append(JsonResponceToSend);
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.getWriter().append("Served at: ").append(JsonResponceToSend);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// System.out.println("hello to post");
		Invoice inv = new Invoice();
		// invoice.setSL_NO(Integer.parseInt(request.getParameter("Sl_no")));
		
		inv.setSl_no(Integer.parseInt(request.getParameter("Sl_no")));
        inv.setCUSTOMER_ORDER_ID(Integer.parseInt(request.getParameter("CUSTOMER_ORDER_ID")));
        inv.setSALES_ORG(Integer.parseInt(request.getParameter("SALES_ORG")));
        inv.setDISTRIBUTION_CHANNEL(request.getParameter("DISTRIBUTION_CHANNEL"));
        inv.setDIVISION(request.getParameter("DIVISION"));
        inv.setRELEASED_CREDIT_VALUE(Double.parseDouble(request.getParameter("RELEASED_CREDIT_VALUE")));
        inv.setPURCHASE_ORDER_TYPE(request.getParameter("PURCHASE_ORDER_TYPE"));
        inv.setCOMPANY_CODE(Integer.parseInt(request.getParameter("COMPANY_CODE")));
        
        inv.setORDER_CREATION_DATE(request.getParameter("ORDER_CREATION_DATE"));
        inv.setORDER_CREATION_TIME(request.getParameter("ORDER_CREATION_TIME"));
        inv.setCREDIT_CONTROL_AREA(request.getParameter("CREDIT_CONTROL_AREA"));
        
        inv.setSOLD_TO_PARTY(Integer.parseInt(request.getParameter("SOLD_TO_PARTY")));
        inv.setORDER_AMOUNT(Double.parseDouble(request.getParameter("ORDER_AMOUNT")));
        
        inv.setREQUESTED_DELIVERY_DATE(request.getParameter("REQUESTED_DELIVERY_DATE"));
        inv.setORDER_CURRENCY(request.getParameter("ORDER_CURRENCY"));
        inv.setCREDIT_STATUS(request.getParameter("CREDIT_STATUS"));
        
        inv.setCUSTOMER_NUMBER(Integer.parseInt(request.getParameter("CUSTOMER_NUMBER")));
        inv.setAMOUNT_IN_USD(Double.parseDouble(request.getParameter("AMOUNT_IN_USD")));
        inv.setUNIQUE_CUST_ID(request.getParameter("UNIQUE_CUST_ID"));
		
		
		boolean isdataInserted = dao.insertInvoice(inv);

		if (isdataInserted) {
			response.getWriter().append("user inserted succesfully");
		} else {
			response.getWriter().append("user insertion failed");
		}
	}

}
