import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Screen extends JFrame{
	
	JPanel menu;
	JComboBox [] boxes = new JComboBox[3];
	JTextArea text;
	
	private String [] questionChoices = {"Multiple Choice", "Fill in the Blank", "Objective Based"};
	private String [] difficulties = {"1","2","3","4","5"};
	private String [] amounts = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25", "26","27","28","29","30"};
	
	
	public Screen(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.BLACK);
		Toolkit tool = Toolkit.getDefaultToolkit();
		this.setSize((int)tool.getScreenSize().getWidth(),(int)tool.getScreenSize().getHeight());
        setLocationRelativeTo(null);
        setResizable(true);
        

        initiate();
        
        setVisible(true);
        
	}
	
	public void initiate(){
		menu = new JPanel();
        menu.setLayout(new BorderLayout());
        menu.setBackground(Color.gray);
        
        JLabel welcome = new JLabel("Welcome");
        welcome.setHorizontalAlignment(JLabel.CENTER);
        welcome.setForeground(Color.white);
        welcome.setFont(new Font("Bell MT", Font.BOLD, 48));
        menu.add(welcome, BorderLayout.NORTH);
        
        JPanel west = new JPanel(new GridLayout(10,1));
        west.setPreferredSize(new Dimension(getWidth()/4,400));
        west.setBackground(Color.gray);
        
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(((3*getWidth())/4)-50, getHeight()));
        east.setBackground(Color.gray);
        
        
        // Set West Panel
        JButton add = new JButton("Add");
        add.setPreferredSize(new Dimension(150,150));
        add.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
        	    addButtonPressed();
        	  } 
        	} );
        west.add(add);
        
        JLabel choiceLabel = new JLabel("Type Of Question");
        choiceLabel.setVerticalAlignment(JLabel.BOTTOM);
        west.add(choiceLabel);
		boxes[0] = new JComboBox(questionChoices);
		west.add(boxes[0]);
		
		JLabel difficultyLabel = new JLabel("Difficulty of Question");
		difficultyLabel.setVerticalAlignment(JLabel.BOTTOM);
		west.add(difficultyLabel);
		boxes[1] = new JComboBox(difficulties);
		west.add(boxes[1]);
		
		JLabel amountLabel = new JLabel("Number of Question");
		amountLabel.setVerticalAlignment(JLabel.BOTTOM);
		west.add(amountLabel);
		boxes[2] = new JComboBox(amounts);
		west.add(boxes[2]);
        
        
		// Set East Panel
		text = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(text);
		scrollPane.setPreferredSize(new Dimension(300,getHeight()-200));
		
		
		east.add(scrollPane);
		
		
		menu.add(east, BorderLayout.EAST);
		menu.add(west, BorderLayout.WEST);
		
        add(menu);
	}
	
	public void addButtonPressed(){
		text.append(boxes[0].getSelectedItem().toString() + '\n');
		text.append(boxes[1].getSelectedItem().toString() + '\n');
		text.append(boxes[2].getSelectedItem().toString() + '\n');
		
	}
	
	
	public void waitFor(int i ){
		
			try {
				TimeUnit.MICROSECONDS.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void main(String [] args){
		Screen screen = new Screen();
	}
}
