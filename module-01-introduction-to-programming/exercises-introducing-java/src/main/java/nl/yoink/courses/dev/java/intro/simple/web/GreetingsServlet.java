package nl.yoink.courses.dev.java.intro.simple.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * The GreetingsServlet provides a very basic HTTP request handler for the /greet path on the server. It accepts and
 * handles requests to /greet and if you specify a parameter with ?name=[yourname], it will render the name back to the
 * user.
 *
 * Note: we are extending HttpServlet. This is a class that any Servlet-compatible server can use to handle incoming
 * HTTP requests. We are only overriding a method called `doGet` here, but the HttpServlet has many many more methods we
 * can override.
 */
public class GreetingsServlet extends HttpServlet {

    /**
     * Handles the GET request on the /greet endpoint. It will attempt to load a value from the `name` parameter. If it
     * gets a valid value, it will return a small HTML-page saying your name. If it does not get a value, it will
     * return a basic, generic page.
     *
     * A `doGet`-method is able to read incoming data from the HttpServletRequest-object and is eventually responsible
     * for writing a response through the HttpServerResponse-object.
     *
     * @param req the JeTTY Server passes the incoming HTTP Request in through this parameter
     * @param resp the JeTTY Server passes the outgoing HTTP Response in through this parameter
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        resp.setContentType("text/html");
        resp.setStatus(HttpServletResponse.SC_OK);

        // Decide which response to send back
        if (name == null) {
            printGenericWelcome(resp);
        } else {
            printGreeting(resp, name);
        }
    }

    // Prints the anonymous message
    private void printGenericWelcome(HttpServletResponse resp) throws IOException {
        resp.getWriter().println("""
                <html>
                <head>
                  <title>Hello there nameless user!</title>
                </head>
                <body>
                  <h1>Hello there!</h1>
                </body>
                </html>
                """);
    }

    // Prints the named message
    private void printGreeting(HttpServletResponse resp, String name) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("""
                <html>
                <head>
                  <title>Hello there """);
        writer.println(name);
        writer.println("""
                !</title>
                </head>
                <body>
                  <h1>Hello """);
        writer.println(name);
        writer.println("""
                </h1>
                </body>
                </html>
                """);
    }
}
