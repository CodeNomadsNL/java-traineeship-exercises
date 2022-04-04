package nl.yoink.courses.dev.java.intro.simple.web;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * The SimpleWeb program demonstrates an application with a Web interface. On startup, this application will start a
 * small webserver on port 8080. It will then register a Servlet to respond to requests coming in at the URL
 * http://localhost:8080/greet and http://localhost:8080/greet?name=[yourname]
 *
 * Note that this sample is the first one that needs an external library. We are using Jetty to handle the HTTP traffic
 * for us. While this is one of the ways that uses the least number of dependencies, it is not the easiest way to
 * setup an HTTP server. In a later module, we will learn about Spring Boot and use it to create HTTP services.
 *
 * What makes an application a Web-app:
 *  - It interacts with a user through HTTP requests (typically from a browser)
 *  - It might not interact with a user directly, but instead interact with other services
 *  - It listens to network requests
 *  - It can service multiple users at the same time
 */
public class SimpleWeb {

    // A private instance of a JeTTy server
    private Server server;

    /**
     * The main method delegates the startup to the start() method.
     */
    public static void main(String[] args) {
        try {
            new SimpleWeb().start();
        } catch (Exception e) {
            System.out.println("Failed to start the webserver!");
            e.printStackTrace();
        }
    }

    /**
     * The start method creates a JeTTy server, opens a port and enables it to interact with GreetingsServlet on the
     * /greet path on the server. This means, if you are navigating to http://localhost:8060/greet, your request will
     * be handled by the GreetingsServer
     *
     * @throws Exception if anything goes wrong during initialization, the program aborts
     */
    public void start() throws Exception {
        this.server = new Server();
        ServerConnector serverConnector = new ServerConnector(server);
        serverConnector.setPort(8080);
        server.setConnectors(new Connector[] {serverConnector});

        ServletHandler servletHandler = new ServletHandler();
        servletHandler.addServletWithMapping(GreetingsServlet.class, "/greet");

        server.insertHandler(servletHandler);
        server.start();
    }



}
