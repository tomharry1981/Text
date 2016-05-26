package com.Demo1;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import com.Demo1.*;

public class MyFrame extends JFrame {  
      
        /** 
         * @param args 
         */  
        char charA;  
        public MyFrame(){  
            this.setSize(500,100);  
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            this.setTitle("my jframe");  
            this.setVisible(true);  
            this.addKeyListener(new MyKeyListener());  
              
              
        }  
          
          
          
        public static void main(String[] args) {  
            // TODO Auto-generated method stub  
            new MyFrame();  
        }  
      
    }  
    //监听键盘类  
    class MyKeyListener extends KeyAdapter{  
        public void keyPressed(KeyEvent e){  
           // char charA=e.getKeyChar();  
            System.out.println("你按了《"+e.getKeyCode()+"》键"); 
            if(e.getKeyCode()%5==0)
            {
            	System.out.println("取值的模是0");
            	
						try {
							Runtime.getRuntime().exec("cmd /k start ./date/1.wav");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				
			
            	
            }
            else if(e.getKeyCode()%5==1)
            {
            	System.out.println("取值的模是1");
            	try {
					Runtime.getRuntime().exec("cmd /k  start ./date/2.wav");
					Runtime.getRuntime().exec("taskkill /IM wmplayer.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
            else if(e.getKeyCode()%5==2)
            {
            	System.out.println("取值为2");
            }
            else if(e.getKeyCode()%5==3)
            {
            	System.out.println("取值为3");
            	
            }
            else if(e.getKeyCode()%5==4)
            {
            	System.out.println("取值为4");
            	
            }
            
        }  
    }  