
package com.ws.quigley.zabbixj.examples;

import java.net.InetAddress;

import com.quigley.zabbixj.agent.ZabbixAgent;
import com.quigley.zabbixj.providers.JVMMetricsProvider;

/**
 * A simple active Zabbix agent implementation.
 * 
 * @author zkf Quigley
 */
public class ExampleActiveAgent {
	public static void main(String[] args) throws Exception {
		System.out.println("begin...");
		if(args.length < 3) {
			System.out.println("Usage: ExampleActiveAgent <hostName> <serverAddress> <serverPort>");	
			return;
		}
		
		String hostName = args[0];
		String serverAddress = args[1];
		int serverPort = Integer.parseInt(args[2]);
		
		ZabbixAgent agent = new ZabbixAgent();
		agent.setEnableActive(true);
		agent.setEnablePassive(false);
		agent.setHostName(hostName);
		agent.setServerAddress(InetAddress.getByName(serverAddress));
		agent.setServerPort(serverPort);
		
        agent.addProvider("example", new ExampleMetricsProvider());
		agent.addProvider("java", new JVMMetricsProvider());

		agent.start();
		
		while(true) {
			Thread.sleep(10000);
		}
	}
}