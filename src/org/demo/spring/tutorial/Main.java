/**
 * 
 */
package org.demo.spring.tutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author abdul
 *
 */
public class Main {
    
    private static final String APP_FILE = "appcontext.xml";

    /**
     * @param args
     */
    public static void main(String[] args) {
        Main m = new Main();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(APP_FILE);
        WebServer server = (WebServer)context.getBean("webServer");
        m.display(server);

    }

    /**
     * 
     * @param server
     */
    private void display(WebServer server) {
        System.out.println("Port: " + server.getPort());
        System.out.println("Address: " + server.getAddress());
    }
}
