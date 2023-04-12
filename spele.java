package spele;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class spele {
    
    public int computer(int left) {
       int computerchoice = (int) (Math.random()*2)+1;//Datora(Player 1)gājiens, izvēlas noņemt 1 vai 2 monētas
         return computerchoice; }
    
    
    public static void main(String args[]) {
        spele newgame = new spele();
        newgame.nims(); //tiek definēta jauna spēle "Nims"
        }
    
    
    JFrame window;
    Container con;
    JPanel titleCoins;
    JPanel titleCoins2;
    JPanel titleCoins3;
    JPanel titleCoins4;
   
   
    JPanel txt;
    JPanel choice1;
    JPanel ninecoins;
    JLabel titleCoinsLabel;
    JLabel totalcoins;
    JLabel titleCoinsLabel2;
    JLabel titleCoinsLabel3;
    JLabel titleCoinsLabel4;
    JTextField textfield;
   JPanel f;
   JButton b;
 
   

   
    
    
    JLabel totalcoins2;
   
    Font titleCoinsFont= new Font("Times New Roman", Font.PLAIN,45);

    
   
    
   
 
    
    
  
    	
    
   
  
    
    public void nims() { 
    	 window=new JFrame();
    		window.setSize(600,600);
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //iespēja aizvērt logu
    		window.getContentPane().setBackground(Color.white);
    		window.setLayout(null);//noņemt defolt layout
    		window.setVisible(true);//parādās logs, citādi neredzams
    		con = window.getContentPane();//Spēle "Nims"
    		
    		
    		titleCoins2= new JPanel();
        	titleCoins2.setBounds(0, 100, 300, 100);//uzraksta lielums
        	titleCoins2.setBackground(Color.red);
        	titleCoinsLabel2 = new JLabel("Total:9");//uzraksts
        	titleCoinsLabel2.setForeground(Color.blue);
        	titleCoinsLabel2.setFont(titleCoinsFont);
        	titleCoins2.add(titleCoinsLabel2);
        	con.add(titleCoins2);
    		
    		
    		titleCoins= new JPanel();
        	titleCoins.setBounds(200, 100, 300, 100);//uzraksta lielums
        	titleCoins.setBackground(Color.red);
        	int coins = 9; //Spēles sākumā ir dotas 9 monētas
        	titleCoinsLabel = new JLabel("Left:"+ coins);//uzraksts
        	 while (coins > 0) {  
        		   int minimizer = computer(coins);//Dators izdara gājienu
        		   
        		   coins = coins - minimizer;
        		   if (coins <= 0) {// Ja Datoram izdarot gājienu vairs nav atlikušas monētas, tad Dators uzvar
        			   titleCoinsLabel3 = new JLabel("Player1 wins!");//uzraksts 
        			   return ;}
        		   
        		  
  
        		   titleCoinsLabel = new JLabel("Left:"+ coins);//uzraksts
        		  
        	titleCoinsLabel.setForeground(Color.blue);
        	titleCoinsLabel.setFont(titleCoinsFont);
        	titleCoins.add(titleCoinsLabel);
        	con.add(titleCoins);
        	
        	
        	titleCoins3= new JPanel();
        	titleCoins3.setBounds(100, 200, 300, 100);//uzraksta lielums
        	titleCoins3.setBackground(Color.red);
        	titleCoinsLabel3 = new JLabel("Player1 takes:" + minimizer);//uzraksts 
        	titleCoinsLabel3.setForeground(Color.blue);
        	titleCoinsLabel3.setFont(titleCoinsFont);
        	titleCoins3.add(titleCoinsLabel3);
        	con.add(titleCoins3);
        	
        
         
           
        
        	 
        	
    

   
        	
        	
        	 }}}
        	

        	
        	
        	
        	
        	
        	
        	
   
        	
        	
        	
        	
        	    
        	
   
        	
        	
        	
 
    
    

   
 
    
    
    
    
    
    


    
    
    
    

        
    

