package com.polyjava.controler;

import com.polyjava.poo.*;
import java.io.*;

public class TCPControler 
{
	private TCPClient client;
	
	public TCPControler() throws ClassNotFoundException, IOException
	{
		SetUp config = new SetUp();
		setServer(config.getConfig());
	}
	
	public void sendCheckInOut(CheckInOut check) 
	{
		new Thread(getServer()).start();
		//d�gager client pour faire communiquer les deux app
	}

	public TCPClient getClient() {
		return client;
	}

	public void setClient(TCPClient client) {
		this.client = client;
	}
}
