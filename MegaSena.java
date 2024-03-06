package Loterias;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MegaSena extends JFrame implements ActionListener
{
	JLabel L1;
	JButton B1,B2,B3;
	JTextField T1;
	
	MegaSena()	
{
		setTitle("MegaSena");
		setSize(350,120);
		setLocation(150,50);
		L1 = new JLabel ("Pode ter numeros repetidos");
		L1.setForeground(Color.black);// config.cor do fundo
		L1.setFont(new Font("",Font.BOLD,14));//config. a fonte
		B1 = new JButton("MegaSena");
		B1.addActionListener(this);
		B2 = new JButton("Limpar");
		B2.addActionListener(this);
		B3 = new JButton("Sair");
		B3.addActionListener(this);
		T1 = new JTextField(30);
		getContentPane().setBackground(Color.cyan);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==B3)
	System.exit(0);
	if(e.getSource()==B2)
	{
	T1.setText("");
	}
	if(e.getSource()==B1)
	{
	String msg = "";
	int vetor[]=new int[6];
	for (int i=0;i<6;i++)
	{ int nr = (int)(Math.random()*61);
	while(nr==0)
	nr=nr+1;
	vetor[i]= nr;
	msg = vetor[i] + "/ "+ msg;
	}
	T1.setText(msg);
	}
	}}