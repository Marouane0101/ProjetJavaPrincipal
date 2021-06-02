package com.polyjava.controler;

import java.awt.EventQueue;

import com.polyjava.graphics.JGraphicMainClient;

public class MainControler {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGraphicMainClient window = new JGraphicMainClient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
