package myfirstproject;
import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculator implements ActionListener {
	String expression="";
	JFrame jf;
	JLabel displaylabel;
	
	
	
	

	CircleButton divButton=new CircleButton("÷"),multipleButton=new CircleButton("×");CircleButton abstractButton=new CircleButton("-"),aditionButton=new CircleButton("+"),zerozeroButton=new CircleButton("00"),backspaceButton=new CircleButton("⌫");
	CircleButton sevenButton =new CircleButton("7"),sixButton=new CircleButton("6"),oneButton=new CircleButton("1"),twoButton=new CircleButton("2"),threeButton=new CircleButton("3"),clearButton=new CircleButton("AC");
	CircleButton eightButton =new CircleButton("8"),nineButton=new CircleButton("9"),fourButton=new CircleButton("4"),fiveButton=new CircleButton("5"),dotButton=new CircleButton("."),zeroButton=new CircleButton("0"),equalButton=new CircleButton("=");
	
		
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500,700);
		jf.setLocation(300, 150);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30,50, 400, 60);
		displaylabel.setFont(new Font("Sego UI",Font.BOLD,28));
		displaylabel.setBackground(Color.gray);
        displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(JTextField.RIGHT);
		displaylabel.setForeground(Color.white);
		displaylabel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		jf.add(displaylabel);
		
		
		
		
		
		

		
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setBackground(Color.WHITE);
		sevenButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(sevenButton);
		
		
		eightButton.setBounds(130,130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setBackground(Color.WHITE);
		eightButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(eightButton);
		
		
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setBackground(Color.WHITE);
		nineButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(nineButton);
		
		
		
		
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setBackground(Color.WHITE);
		fourButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(fourButton);
		
		
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setBackground(Color.WHITE);
		fiveButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(fiveButton);
		
		
		
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setBackground(Color.WHITE);
	    sixButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(sixButton);
		
		
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setBackground(Color.WHITE);
		oneButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(oneButton);
		
		
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setBackground(Color.WHITE);
		twoButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(twoButton);
		
		
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setBackground(Color.WHITE);
		threeButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(threeButton);
		
		
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setBackground(Color.WHITE);
		dotButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(dotButton);
		
		
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(zeroButton);
		
	
		equalButton.setBounds(230, 530, 190, 80);
		
		equalButton.addActionListener(this);
		equalButton.setBackground(Color.RED);
		equalButton.setForeground(Color.WHITE);
		equalButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(equalButton);
		
		
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setBackground(Color.LIGHT_GRAY);
		divButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(divButton);
		
		
		multipleButton.setBounds(330, 230, 80, 80);
		multipleButton.addActionListener(this);
		multipleButton.setBackground(Color.LIGHT_GRAY);
		multipleButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(multipleButton);
		


		abstractButton.setBounds(330, 330, 80, 80);
		abstractButton.addActionListener(this);
		abstractButton.setBackground(Color.LIGHT_GRAY);
		abstractButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(abstractButton);
		
		

		aditionButton.setBounds(330,430, 80, 80);
		aditionButton.addActionListener(this);
		aditionButton.setBackground(Color.LIGHT_GRAY);
		
		aditionButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(aditionButton);
		
		
		clearButton.setBounds(30, 530, 95, 80);
		clearButton.addActionListener(this);
		clearButton.setForeground(Color.BLACK);
		clearButton.setBackground(Color.LIGHT_GRAY);

		clearButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(clearButton);
		

		backspaceButton.setBounds(130, 530, 95, 80);
		backspaceButton.addActionListener(this);
		backspaceButton.setForeground(Color.WHITE);
		backspaceButton.setBackground(Color.DARK_GRAY);

		backspaceButton.setFont(new Font("Arial",Font.BOLD,40));
		jf.add(backspaceButton);
		
		
		zerozeroButton.setBounds(230, 430, 80, 80);
		zerozeroButton.addActionListener(this);
		zerozeroButton.setBackground(Color.white);
		zerozeroButton.setFont(new Font("Arial",Font.BOLD,32));
		jf.add(zerozeroButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String ag[]) {
		new Calculator();
	} 
	
	
	@Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			displaylabel.setText(displaylabel.getText()+"7");
		}else if (e.getSource()==eightButton) {
			
			displaylabel.setText(displaylabel.getText()+"8");
			
	    }else if (e.getSource()==nineButton) {
			displaylabel.setText(displaylabel.getText()+"9");
		}else if (e.getSource()==fourButton) {
			displaylabel.setText(displaylabel.getText()+"4");
		}else if (e.getSource()==fiveButton) {
			displaylabel.setText(displaylabel.getText()+"5");
		}else if (e.getSource()==sixButton) {
			displaylabel.setText(displaylabel.getText()+"6");
		}else if (e.getSource()==oneButton) {
			displaylabel.setText(displaylabel.getText()+"1");
		}else if (e.getSource()==twoButton) {
			displaylabel.setText(displaylabel.getText()+"2");
		}else if (e.getSource()==threeButton) {
			displaylabel.setText(displaylabel.getText()+"3");
		}else if (e.getSource()==zeroButton) {
			displaylabel.setText(displaylabel.getText()+"0");
		}else if (e.getSource()==zerozeroButton) {
			displaylabel.setText(displaylabel.getText()+"00");
		}else if (e.getSource()==dotButton) {
			displaylabel.setText(displaylabel.getText()+".");
		}else if (e.getSource()==divButton) {
			displaylabel.setText(displaylabel.getText()+"/");
		}else if (e.getSource()==multipleButton) {
			displaylabel.setText(displaylabel.getText()+"*");
		}else if (e.getSource()==abstractButton) {
			displaylabel.setText(displaylabel.getText()+"-");
		}else if (e.getSource()==aditionButton) {
			displaylabel.setText(displaylabel.getText()+"+");
		}else if (e.getSource()==equalButton) {
			try {
				String exp=displaylabel.getText();
				
				double result=evaluate(exp);
				
				displaylabel.setText(result+"");
			}catch (Exception ex) {
				displaylabel.setText("ERROR");
			}
		
		}else if(e.getSource()==clearButton) {
			displaylabel.setText("");
		}else if(e.getSource()==backspaceButton) {
			String text=displaylabel.getText();
			if(text.length()>0) {
			displaylabel.setText(text.substring(0,text.length()-1));
			}
		}
  }
	public double evaluate(String exp){

	    java.util.Stack<Double> numbers = new java.util.Stack<>();
	    java.util.Stack<Character> ops = new java.util.Stack<>();

	    for(int i=0;i<exp.length();i++){

	        char ch = exp.charAt(i);

	        if(Character.isDigit(ch) || ch=='.'){

	            String num="";

	            while(i<exp.length() &&
	                 (Character.isDigit(exp.charAt(i)) || exp.charAt(i)=='.')){
	                num += exp.charAt(i);
	                i++;
	            }

	            i--;
	            numbers.push(Double.parseDouble(num));
	        }

	        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){

	            while(!ops.isEmpty() &&
	                  precedence(ops.peek()) >= precedence(ch)){

	                double b = numbers.pop();
	                double a = numbers.pop();
	                char op = ops.pop();

	                numbers.push(apply(a,b,op));
	            }

	            ops.push(ch);
	        }
	    }

	    while(!ops.isEmpty()){

	        double b = numbers.pop();
	        double a = numbers.pop();
	        char op = ops.pop();

	        numbers.push(apply(a,b,op));
	    }

	    return numbers.pop();
	}
	public int precedence(char op){

	    if(op=='+' || op=='-') return 1;
	    if(op=='*' || op=='/') return 2;

	    return 0;
	}
	public double apply(double a,double b,char op){

	    if(op=='+') return a+b;
	    if(op=='-') return a-b;
	    if(op=='*') return a*b;
	    if(op=='/') return a/b;

	    return 0;
	}
	

}
	


	
	





