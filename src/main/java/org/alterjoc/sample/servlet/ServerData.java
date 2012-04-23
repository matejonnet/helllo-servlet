/**
 *
 */
package org.alterjoc.sample.servlet;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class ServerData
{
	/**
	 *
	 */
	public ServerData()
	{

	}

	public String getData(HttpServletRequest request) throws UnknownHostException {
		String data = "";
		InetAddress ia = InetAddress.getLocalHost();
		data += "local address: " + request.getLocalAddr() + "(" + request.getLocalName() +  ")" + ":" + request.getLocalPort() + "\n";
		data += "local address IA: " + ia.getHostAddress() + "(" + ia.getHostName() + ")" + "\n";
		data += "TS:" + System.currentTimeMillis() + "\n";
		return data;
	}
}
