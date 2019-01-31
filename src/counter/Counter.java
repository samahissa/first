package counter;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JPanel;
 import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
 import java.util.ArrayList;
 import javax.swing.JTextField;
 import java.awt.Rectangle;
 import java.awt.Font;
 import java.awt.FontMetrics;
 import java.awt.event.MouseAdapter;
 import java.awt.event.*;
 import java.util.*;
public class Counter extends JFrame{

	
	
	private JLabel l1;
	private JTextField f;
	MyThread t;
	int x;
	int y=0;
	public Counter() {
		x=0;
		l1=new JLabel();
		l1.setText("     x="+x);
		add(l1);
		f=new JTextField();
		add(f,BorderLayout.NORTH);
		t=new MyThread("test");
		f.setText(""+0);
		t.start();
		setSize(200,200);
		setVisible(true);
		f.setText(""+4);
		f.setText(""+77);
		
		
	}
	class MyThread extends Thread{
		public MyThread (String n) {
			super(n);
		}
		
		public void run() {
			while (true) {
				try {
				Thread.sleep(1000);
				x++;
				x=x%100;
				l1.setText("x="+x);
				}
				catch(InterruptedException e) {
					System.err.println(e.toString());
				}
			}
			
			
			
		}
		
	}
	
	public static void main(String args[]) {
		Counter app=new Counter();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
