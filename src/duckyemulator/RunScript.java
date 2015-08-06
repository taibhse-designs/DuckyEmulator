package duckyemulator;

import static duckyemulator.DuckyEmulator.com;
import static duckyemulator.DuckyEmulator.con;
import static duckyemulator.DuckyEmulator.defaultDelay;
import static duckyemulator.DuckyEmulator.list;
import static duckyemulator.DuckyEmulator.print;
import static duckyemulator.DuckyEmulator.robo;
import static duckyemulator.KeyBoard.keyCommand;
import static duckyemulator.KeyBoard.keyString;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author STARK
 */
public class RunScript
{
   public static void runScript() throws InterruptedException, AWTException, IOException
    {

        robo = new Robot();
        con = true;  //used as a switch later in order to only allow testing and
                     //setting a default delay once
        
        //loop through all lines of ducky script
        for (int i = 0; i < list.getItemCount(); i++)
        {
            //**********************************************
            if(con == true) //will only be tested on first loop run,
            {               //con set to false after
                //test for default delay on first line
            if (list.getItem(0).startsWith("DEFAULT_DELAY") || list.getItem(0).startsWith("DEFAULTDELAY"))
            {   
                //clean line to extract time 
                String delay = list.getItem(0);
                delay = delay.replace("DEFAULT_DELAY ", "");
                delay = delay.replace("DEFAULTDELAY ", "");
                //set default delay
                defaultDelay = parseInt(delay);
            }
              con = false;  //con is made false in order to prevent
                           //this section of code needlessy running
                           //on every loop,
            }
            
                
                System.out.println("DefDelay " + defaultDelay);
                TimeUnit.MILLISECONDS.sleep(defaultDelay);   //add a delay on every loop
                                                             //if default delay is not specified
                                                             //on line one then delay here will 
                                                             //be zero, ie no delay at all

            //***********************************************
                
            if (list.getItem(i).startsWith("REM")) //test if line is a comment, if comment do nothing
            {
                System.out.println("COMMENT FOUND");

            }else if(list.getItem(i).startsWith("ENTER")) //test for enter key, 
            {                                             //use robot class to press enter
                robo.keyPress(KeyEvent.VK_ENTER);
               robo.keyRelease(KeyEvent.VK_ENTER);   
            }
            else if (list.getItem(i).startsWith("DELAY")) //test for delay command
            {
                //clean text to get number
                com = list.getItem(i);
                com = com.replace("DELAY ", "");
                
                System.out.println("delaying for " + com + " milliseconds");
                //delay further script running for set delay time
                TimeUnit.MILLISECONDS.sleep(parseInt(com)); //parse delay to int 
                
                System.out.println("DELAY COMPLETE");

            } else if (list.getItem(i).startsWith("STRING")) //test for string to type
            {
                 //remove command STRING from line (ie cleaning)
                 print = list.getItem(i).replace("STRING ", ""); 
                 
                System.out.println(print);
                //loop through all characters in line in order 
                //to decide correct key to type
                for(int x = 0; x <= print.length() -1; x++)
                {
                    //save current character to string
                    com = Character.toString(print.charAt(x));
                    keyString(com); //method to test current character and decide correct key
                                    //to press
                }
            } else if (list.getItem(i).startsWith("GUI") || list.getItem(i).startsWith("WINDOWS")) //test for windows
            {   //clean line in order to check for second key to press in combo                    //or super key being pressed
                com = list.getItem(i).replace("WINDOWS ", "");                                     //ie key to left of alt
                com = com.replace("GUI ", "");
                com = com.toUpperCase(); //change to uppercase to prevent case sensitivity
                
                robo.keyPress(KeyEvent.VK_WINDOWS); //press and hold windows key
                keyCommand(com); //test for second key to press (will auto release)
                robo.keyRelease(KeyEvent.VK_WINDOWS); //release windows key
                
            } else if (list.getItem(i).startsWith("MENU") || list.getItem(i).startsWith("APP")) //menu test, ie similiar to right click
            {
                //use robot mouse to simulate this
                robo.mousePress(InputEvent.BUTTON3_MASK);
                robo.mouseRelease(InputEvent.BUTTON3_MASK);
                
            } else if (list.getItem(i).startsWith("SHIFT")) //test for shift command
            {
                //clean line to test for secondary key to press
                com = list.getItem(i).replace("SHIFT ", "");
                com = com.toUpperCase(); //prevent case sensitivity
                
                robo.keyPress(KeyEvent.VK_SHIFT); //hold shift
                keyCommand(com); //test and execute second key if found (releases itself)
                robo.keyRelease(KeyEvent.VK_SHIFT); //release shift
                
            } else if (list.getItem(i).startsWith("ALT")) //test for alt
            {
                //clean line to find second command
                com = list.getItem(i).replace("ALT ", "");
                com = com.toUpperCase();
                
                robo.keyPress(KeyEvent.VK_ALT); //hold alt
                keyCommand(com); //find and execute second key command (releases itself)
                robo.keyRelease(KeyEvent.VK_ALT); //release alt
                
            }else if(list.getItem(i).startsWith("CONTROL") || list.getItem(i).startsWith("CTRL")) //test for control command
            {
                //clean line to find second button to press
                com = list.getItem(i).replace("CONTROL ", "");
                com = com.replace("CTRL ","");
                com = com.toUpperCase();
                
                robo.keyPress(KeyEvent.VK_CONTROL);  //hold control
                keyCommand(com); //find and execute second button (self releases)
                robo.keyRelease(KeyEvent.VK_CONTROL); //releae control
                
            }
            //***********************************************************************************
            //test for arrow key commands
            else if(list.getItem(i).startsWith("DOWNARROW") || list.getItem(i).startsWith("DOWN"))
            {
                        robo.keyPress(KeyEvent.VK_DOWN);
                        robo.keyRelease(KeyEvent.VK_DOWN);
                         
            }else if(list.getItem(i).startsWith("UPARROW") || list.getItem(i).startsWith("UP"))
            {
                        robo.keyPress(KeyEvent.VK_UP);
                        robo.keyRelease(KeyEvent.VK_UP);
                         
            }else if(list.getItem(i).startsWith("LEFTARROW") || list.getItem(i).startsWith("LEFT"))
            {
                        robo.keyPress(KeyEvent.VK_LEFT);
                        robo.keyRelease(KeyEvent.VK_LEFT);
                         
            }else if(list.getItem(i).startsWith("RIGHTARROW") || list.getItem(i).startsWith("RIGHT"))
            {
                        robo.keyPress(KeyEvent.VK_RIGHT);
                        robo.keyRelease(KeyEvent.VK_RIGHT);
                         
            }
            //*************************************************************************************
           
            //note code for extended commands is still needed

        }
        //********************************************
        System.out.println("Running Script Complete.............");
        //********************************************
    } 
}
