package Loterias;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LoteriasPrincipal extends JFrame implements ActionListener {
	JButton B1, B2, B3, B4,B5;
	public static void main(String args[])
	{JFrame JPrincipal= new
	LoteriasPrincipal();
	JPrincipal.setVisible(true);
	}
	LoteriasPrincipal()
	{
	setTitle("Principal Loterias");
	setSize(450,300);
	setLocation(350,200);
	B1=new JButton("MegaSena");
	B1.addActionListener(this);
	B2=new JButton("Quina");
	B2.addActionListener(this);
	B3=new JButton("DuplaSena");
	B3.addActionListener(this);
	B4=new JButton("LotoFacil");
	B4.addActionListener(this);
	B5=new JButton("Sair");
	B5.addActionListener(this);
	getContentPane().setLayout(new BorderLayout(5,15));
	getContentPane().add("North",B1);
	getContentPane().add("South",B2);
	getContentPane().add("West",B3);
	getContentPane().add("East",B4);
	getContentPane().add("Center",B5);
	}
	public void actionPerformed(ActionEvent e)
	{ if(e.getSource()==B1)
	{ JFrame JMS= new MegaSena();
	JMS.setVisible(true);}
	
	if(e.getSource()==B2)
	{ JFrame JQ= new Quina();
	JQ.setVisible(true);}
	
	if(e.getSource()==B3)
	{ JFrame JDP= new DuplaSena();
	JDP.setVisible(true);}
	
	if(e.getSource()==B4)
	{ JFrame JLF= new Lotofacil();
	JLF.setVisible(true);}
	
	if(e.getSource()==B5)
	{
	System.exit(0);
	} }}
	

