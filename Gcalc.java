package graphicCalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gcalc extends JFrame{
	
	private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, add, div, mul, sub, Clear, Solve, Equals;
	private double TEMP;
	private double SolveTEMP;
	private JTextField jtfResult;
	String display = "";
	boolean addb = false;
	boolean subb = false;
	boolean mulb = false;
	boolean divb = false;
	//constructor
	public Gcalc() {
		//panel 1
		JPanel p1= new JPanel();
		p1.setLayout(new GridLayout(4,3));
		p1.add(num1 = new JButton("1"));
		p1.add(num2 = new JButton("2"));
		p1.add(num3 = new JButton("3"));
		p1.add(num4 = new JButton("4"));
		p1.add(num5 = new JButton("5"));
		p1.add(num6 = new JButton("6"));
		p1.add(num7 = new JButton("7"));
		p1.add(num8 = new JButton("8"));
		p1.add(num9 = new JButton("9"));
		p1.add(num0 = new JButton("0"));
		p1.add(Clear = new JButton("C"));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(jtfResult = new JTextField(20));
		jtfResult.setHorizontalAlignment(JTextField.RIGHT);
		jtfResult.setEditable(false);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(5,1));
		p3.add(add = new JButton("+"));
		p3.add(sub = new JButton("-"));
		p3.add(mul = new JButton("*"));
		p3.add(div = new JButton("/"));
		p3.add(Solve = new JButton("="));

		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.add(p2, BorderLayout.NORTH);
		p.add(p1, BorderLayout.SOUTH);
		p.add(p3, BorderLayout.EAST);
		
		add(p);
		
		num1.addActionListener(new ListenToOne());
		num2.addActionListener(new ListenToTwo());
		num3.addActionListener(new ListenToThree());
		num4.addActionListener(new ListenToFour());
		num5.addActionListener(new ListenToFive());
		num6.addActionListener(new ListenToSix());
		num7.addActionListener(new ListenToSeven());
		num8.addActionListener(new ListenToEight());
		num9.addActionListener(new ListenToNine());
		num0.addActionListener(new ListenToZero());
		Clear.addActionListener(new ListenToClear());
		
		add.addActionListener(new ListenToAdd());
		sub.addActionListener(new ListenToSub());
		mul.addActionListener(new ListenToMul());
		div.addActionListener(new ListenToDiv());
		Solve.addActionListener(new ListenToSolve());
		
	}
		class ListenToOne implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "1");
			}
		}
		class ListenToTwo implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "2");
			}
		}
		class ListenToThree implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "3");
			}
		}
		class ListenToFour implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "4");
			}
		}
		class ListenToFive implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "5");
			}
		}
		class ListenToSix implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "6");
			}
		}
		class ListenToSeven implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "7");
			}
		}
		class ListenToEight implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "8");
			}
		}
		class ListenToNine implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "9");
			}
		}
		class ListenToZero implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText(display + "0");
			}
		}
		class ListenToClear implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				display = jtfResult.getText();
				jtfResult.setText("");
				addb = false;
				subb = false;
				mulb = false;
				divb = false;
				
				TEMP = 0;
				SolveTEMP = 0;
			}
		}
		class ListenToAdd implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				TEMP = Double.parseDouble(jtfResult.getText());
				jtfResult.setText("");
				addb = true;
			}
		}
		class ListenToSub implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				TEMP = Double.parseDouble(jtfResult.getText());
				jtfResult.setText("");
				subb = true;
			}
		}
		class ListenToMul implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				TEMP = Double.parseDouble(jtfResult.getText());
				jtfResult.setText("");
				mulb = true;
			}
		}
		class ListenToDiv implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				TEMP = Double.parseDouble(jtfResult.getText());
				jtfResult.setText("");
				divb = true;
			}
		}
		class ListenToSolve implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				SolveTEMP = Double.parseDouble(jtfResult.getText());
				if(addb) {
					SolveTEMP = TEMP + SolveTEMP;
					jtfResult.setText(Double.toString(SolveTEMP));
				}else if(subb) {
					SolveTEMP = TEMP - SolveTEMP;
					jtfResult.setText(Double.toString(SolveTEMP));
				}else if(mulb){
					SolveTEMP = TEMP * SolveTEMP;
					jtfResult.setText(Double.toString(SolveTEMP));
				}else if(divb) {
					SolveTEMP = TEMP / SolveTEMP;
					jtfResult.setText(Double.toString(SolveTEMP));
				}
			}
		}
	public static void main (String[] args) {
		Gcalc calc = new Gcalc();
		calc.pack();
		calc.setLocationRelativeTo(null);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
		
	}
}
