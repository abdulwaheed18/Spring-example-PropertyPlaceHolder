/**
 * 
 */
package org.demo.spring.tutorial;

/**
 * @author abdul
 *
 */
public class WebServer {

    private String address = "0.0.0.0";

    private int port = 8080;

    /**
     * @return address of the webServer
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return port of the webserver
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port
     *        the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

}
