package com.xinlu.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by simon on 10/11/15.
 */
public class TestServlet2 extends HttpServlet {
    public void init() {

    }

    public void destroy() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.print("Hello World!");
        pw.close();
    }

}
