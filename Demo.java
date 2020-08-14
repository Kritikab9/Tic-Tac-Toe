
package demo;
import java.awt.*;
import javax.swing.*;

public class Demo {

     int arr[]= new int [9];
     JFrame frame = new JFrame();
      JButton []button = new JButton[9];
      
      
        
    public void check() 
    {
        
        button[0]= new JButton(" ");
        button[1]= new JButton(" ");
        button[2]= new JButton(" ");
        button[3]= new JButton(" ");
        button[4]= new JButton(" ");
        button[5]= new JButton(" ");
        button[6]= new JButton(" ");
        button[7]= new JButton(" ");
        button[8]= new JButton(" ");
        button[0].setBackground(Color.orange);
        button[1].setBackground(Color.yellow);
        button[2].setBackground(Color.orange);
        button[3].setBackground(Color.yellow);
        button[4].setBackground(Color.orange);
        button[5].setBackground(Color.yellow);
        button[6].setBackground(Color.orange);
        button[7].setBackground(Color.yellow);
        button[8].setBackground(Color.orange);
      
      
         button[0].addActionListener( ae->
        {
           
            
            button[0].setText("0");
            arr[0]=2;
            win();
            draw();
            if(match()!=0)
            {
                
            }
           else
            {
                win();
                  if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                  
                }
                  else
                  {
                
                for(int i=8;i>=0;i--)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                       
                          break;
                          
                      }
                  
                }
                  }
                   
            }
           
           
         
        });   
          button[1].addActionListener( ae->
        {
             button[1].setText("0");
             arr[1]=2;
              win();
             draw();
            if(match()!=0)
            {
               
            }
            else
            {win();
              if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                     
                }
                  else
                  {
           
                 
                      for(int i=0;i<9;i++)
                      {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                         
                          break;
                          
                      }
                  
                      }
                  
            }
            }
                  
            
            
             
       
        });
          button[2].addActionListener(ae->
          {
               button[2].setText("0");
               arr[2]=2;
                win();
               draw();
              if(match()!=0)
            {
            
                
            }
            else
            {win();
                if(arr[6]==0)
                {
                    arr[6]=1;
                    button[6].setText("X");
                    
                }
                else
                {
                 for(int i=8;i>=0;i--)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                        
                          break;
                          
                      }
                  
                }
                }    
            }
          });
        button[3].addActionListener(ae->
        {
             button[3].setText("0");
             arr[3]=2;
              win();
             draw();
              if(match()!=0)
            {
               
            }
            else
              {win();
                    if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                   
                }
                  else
                  {
             for(int i=0;i<9;i++)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                        
                          break;
                          
                      }
                  
                }
                  
                  }
                  }
           
        });
        button[4].addActionListener(ae->
          {
              button[4].setText("0");
               arr[4]=2;
                win();
               draw();
               if(match()!=0)
            {
               
            }
               else
               {win();
                 if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                    
                }
                  else
                  {
           
                 for(int i=8;i>=0;i--)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                        
                          break;
                          
                      }
                  
                }
                  }  
                  
            }
          });
         button[5].addActionListener(ae->
          {
               button[5].setText("0");
               arr[5]=2;
                win();
               draw();
           
               if(match()!=0)
               {
                   
               }
               else
               {win();
                if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                   
                }
                  else
                  {  
          
           
                   for(int i=0;i<9;i++)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                           
                          break;
                          
                      }
                  
                }
                  
                }
               }
          });
          button[6].addActionListener(ae->
          {
              button[6].setText("0");
              arr[6]=2;
               win();
              draw();
               if(match()!=0)
            {
               
            }
               else
               {win();
                 if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                    
                }
                  else
                  {
        
                  for(int i=8;i>=0;i--)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                         
                          break;
                          
                      }
                  
                }
                  
            }
               }
          });
           button[7].addActionListener(ae->
          {
              button[7].setText("0");
               arr[7]=2;
                win();
               draw();
               if(match()!=0)
            {
               
            }
               else
               {win();
                 if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                    
                }
                  else
                  {
          
                for(int i=0;i<9;i++)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                          
                          break;
                          
                      }
                  
                }
                  
            }
               }
          });
            button[8].addActionListener(ae->
          {
               button[8].setText("0");
               arr[8]=2;
                win();
               draw();
               if(match()!=0)
            {
               
            }
               else
               {win();
                 if(arr[4]==0)
                {
                    arr[4]=1;
                    button[4].setText("X");
                  
                }
                  else
                  {
          
                for(int i=8;i>=0;i--)
                {
                 
                      if(arr[i]==0)
                      {
                          arr[i]=1;
                          button[i].setText("X");
                         
                          break;
                          
                      }
                  
                }
                }
               }
                  
            });
         
            
        
        frame.add(button[0]);
        frame.add(button[1]);
        frame.add(button[2]);
        frame.add(button[3]);
        frame.add(button[4]);
        frame.add(button[5]);
        frame.add(button[6]);
        frame.add(button[7]);
        frame.add(button[8]); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(3,3));  
         
        frame.setSize(300,300);  
        frame.setVisible(true);  
        

    
   }
  
  public int match()
  {
     int f=0;
   
    
      if(f==0)
      {
      if(arr[0]==2&&arr[4]==2)
      {
          if( arr[8]==0)
          {
           button[8].setText("X");
          arr[8]=1;
       
          }
          
      }
     
      }
       if(f==0)
      {
       if(arr[4]==2 && arr[8]==2)
      {
          if(arr[0]==0)
          {
           button[0].setText("X");
           arr[0]=1;
           f=1;
          
          }
           
          
      }
      }
        if(f==0)
      {
      if(arr[0]==2 && arr[1]==2 )
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
           arr[2]=1;
           f=1;
       
          }
       }
      }
        if(f==0)
        {
         if(arr[1]==2 && arr[2]==2)
      {
          if(arr[0]==0)
          {
            button[0].setText("X");
           arr[0]=1;
           f=1;
         
          }
           
      }
        }
       if(f==0)
        {
       if(arr[3]==2&&arr[4]==2)
      {
          if(arr[5]==0)
          {
           button[5].setText("X");
           arr[5]=1;
            f=1;
        
          }
          
      }
        }
       if(f==0)
       {
       if(arr[4]==2 && arr[5]==2)
      {
          if(arr[3]==0)
          {
            button[3].setText("X");
           arr[3]=1;
           f=1;
        
          }
             
        
      }
       }
       if(f==0)
       {
      if(arr[6]==2&&arr[7]==2)
      {
          if(arr[8]==0)
          {
           button[8].setText("X");
           arr[8]=1;
           f=1;
    
          }
          
      }
       }
       if(f==0)
       {
        if(arr[7]==2&&arr[8]==2)
      {
          if(arr[6]==0)
          {
            button[6].setText("X");
           arr[6]=1;
           f=1;
       
          }
          
      }
       }
        if(f==0)
       {
        if(arr[0]==2&&arr[3]==2)
      {
          if(arr[6]==0)
          {
           button[6].setText("X");
           arr[6]=1;
           f=1;
        
          }
          
      }
       }
    
      
     if(f==0)
       {
        if(arr[3]==2&&arr[6]==2)
      {
          if(arr[0]==0)
          {
            button[0].setText("X");
           arr[0]=1;
           f=1;
        
          }
          
      }
       }
      
      if(f==0)
       {
        if(arr[1]==2&&arr[4]==2)
      {
          if(arr[7]==0)
          {
            button[7].setText("X");
           arr[7]=1;
           f=1;
          
            
          }
          
      }
       }
      if(f==0)
       {
        if(arr[4]==2&&arr[7]==2)
      {
          if(arr[1]==0)
          {
           button[1].setText("X");
           arr[1]=1;
           f=1;
          
          }
          
      }
       }
    
       if(f==0)
       {
        if(arr[2]==2&&arr[5]==2)
      {
          if(arr[8]==0)
          {
            button[8].setText("X");
           arr[8]=1;
           f=1;
          
          }
          
      }
       }
      
     
        if(f==0)
       {
        if(arr[5]==2&&arr[8]==2)
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
           arr[2]=1;
           f=1;
      
          }
          
      }
       }
      if(f==0)
       {
        if(arr[2]==2&&arr[4]==2)
      {
          if(arr[6]==0)
          {
            button[6].setText("X");
           arr[6]=1;
           f=1;
       
          }
          
      }
       }
      
     if(f==0)
       {
        if(arr[4]==2&&arr[6]==2)
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
           arr[2]=1;
           f=1;
          }
          
      }
       }
     if(f==0)
     {
         if(arr[0]==2 &&  arr[2]==2)
         {
             if(arr[1]==0)
             {
                  button[1].setText("X");
                 arr[1]=1;
                 f=1;
               
             }
         }
     }
     if(f==0)
     {
         if(arr[3]==2 &&  arr[5]==2)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                 arr[4]=1;
                 f=1;
              
             }
         }
     }
     if(f==0)
     {
         if(arr[6]==2 &&  arr[8]==2)
         {
             if(arr[7]==0)
             {
                  button[7].setText("X");
                 arr[7]=1;
                 f=1;
                
             }
         }
     }
     if(f==0)
     {
         if(arr[0]==2 &&  arr[6]==2)
         {
             if(arr[3]==0)
             {
                  button[3].setText("X");
                 arr[3]=1;
                 f=1;
               
             }
         }
     }
     if(f==0)
     {
         if(arr[1]==2 &&  arr[7]==2)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                 arr[4]=1;
                 f=1;
                 
             }
         }
     }
     if(f==0)
     {
         if(arr[2]==2 &&  arr[8]==2)
         {
             if(arr[5]==0)
             {
                  button[5].setText("X");
                 arr[5]=1;
                 f=1;
               
             }
         }
     }
     if(f==0)
     {
         if(arr[0]==2 &&  arr[8]==2)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                 arr[4]=1;
                 f=1;
               
             }
         }
     }
     if(f==0)
     {
         if(arr[2]==2 &&  arr[6]==2)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                 arr[4]=1;
                 f=1;
               
             }
         }
     }
     
      return f;
  }
  public void draw()
  {
      int k=0;
      for(int i=0;i<9;i++)
      {
          if(arr[i]!=0)
          {
              k++;
              
          }
      }
      if(k==9)
      {
      JOptionPane.showMessageDialog(frame,"match draw","Oops!",JOptionPane.ERROR_MESSAGE);
      System.exit(0);
      }
  }
  public void win()
  {
    
      if(arr[0]==1&&arr[4]==1)
      {
          if( arr[8]==0)
          {
           button[8].setText("X");
             JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
       
          }
          
      }
     
      
     
       if(arr[4]==1 && arr[8]==1)
      {
          if(arr[0]==0)
          {
           button[0].setText("X");
           JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        
          }
           
          
      }
      
      
      if(arr[0]==1 && arr[1]==1 )
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
         
          }
       }
      
      
         if(arr[1]==1 && arr[2]==1)
      {
          if(arr[0]==0)
          {
            button[0].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
      
          }
           
      }
        
      
       if(arr[3]==1&&arr[4]==1)
      {
          if(arr[5]==0)
          {
           button[5].setText("X");
           JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
         
          }
          
      }
        
    
       if(arr[4]==1 && arr[5]==1)
      {
          if(arr[3]==0)
          {
            button[3].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
    
          }
             
        
      }
       
     
      if(arr[6]==1&&arr[7]==1)
      {
          if(arr[8]==0)
          {
           button[8].setText("X");
           JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        
          }
          
      }
   
        if(arr[7]==1&&arr[8]==1)
      {
          if(arr[6]==0)
          {
            button[6].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
         
          }
          
      }
     
        if(arr[0]==1&&arr[3]==1)
      {
          if(arr[6]==0)
          {
           button[6].setText("X");
           JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        
          }
          
      }
   
        if(arr[3]==1&&arr[6]==1)
      {
          if(arr[0]==0)
          {
            button[0].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
     ;
          }
          
      }
     
        if(arr[1]==1&&arr[4]==1)
      {
          if(arr[7]==0)
          {
            button[7].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
     
          }
          
      }
    
        if(arr[4]==1&&arr[7]==1)
      {
          if(arr[1]==0)
          {
           button[1].setText("X");
           JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        
          }
          
      }
   
        if(arr[2]==1&&arr[5]==1)
      {
          if(arr[8]==0)
          {
            button[8].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
       
          }
          
      }
   
        if(arr[5]==1&&arr[8]==1)
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        
          }
          
      }
    
        if(arr[2]==1&&arr[4]==1)
      {
          if(arr[6]==0)
          {
            button[6].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
       
          }
          
      }
    
        if(arr[4]==1&&arr[6]==1)
      {
          if(arr[2]==0)
          {
            button[2].setText("X");
            JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
       
          }
          
      }
  
         if(arr[0]==1 &&  arr[2]==1)
         {
             if(arr[1]==0)
             {
                  button[1].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
             
             }
         }
   
         if(arr[3]==1 &&  arr[5]==1)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
           
             }
         }
   if(arr[6]==1 &&  arr[8]==1)
         {
             if(arr[7]==0)
             {
                  button[7].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
               
             }
         }
  
         if(arr[0]==1 &&  arr[6]==1)
         {
             if(arr[3]==0)
             {
                  button[3].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
               
             }
         }
   
         if(arr[1]==1 &&  arr[7]==1)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
             
             }
         }
  
         if(arr[2]==1 &&  arr[8]==1)
         {
             if(arr[5]==0)
             {
                  button[5].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
               
         }
   
         if(arr[0]==1 &&  arr[8]==1)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
               
             }
         }
  
         if(arr[2]==1 &&  arr[6]==1)
         {
             if(arr[4]==0)
             {
                  button[4].setText("X");
                  JOptionPane.showMessageDialog(frame,"comp wins","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
                
               
                
             }
         }
     }
     
    
  }
   public static void main(String[] args) {
        Demo ob = new Demo();
        ob.check();
    }
}
    

