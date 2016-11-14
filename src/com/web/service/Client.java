package com.web.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

public class Client {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		
		
		URL U = null;
		try {
			U = new URL("");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		Service s = new Service();
		
		CallServiceSoapBindingStub cs = new CallServiceSoapBindingStub(U,s);
		
		
int resilt=		cs.add(2, 3);
System.out.println(resilt);

	}

}
