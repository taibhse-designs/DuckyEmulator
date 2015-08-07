package duckyemulator;

import static duckyemulator.Reader.read;
import static duckyemulator.RunScript.runScript;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.commons.codec.Charsets;

/**
 *
 * @author STARK
 */
public class DuckyEmulator
{

    static String instructions
            = "*******************************************************\n"
            + "                       INSTRUCTIONS                     \n"
            + "*******************************************************\n"
            + "\n"
            + "1) select choose script  \n"
            + "2) navigate to folder containing ducky script  \n"
            + "3) select and save desired script to be tested  \n"
            + "4) the script will appear in this box when loaded  \n"
            + "5) select run script, script will now run on this pc\n"
            + "\n";

    static String ducky
            = "              ,--' ~.)." + "\n"
            + "            ,'         `." + "\n"
            + "           ; (((__   __)))" + "\n"
            + "           ;  ( (#) ( (#)" + "\n"
            + "           |   \\_/___\\_/|" + "\n"
            + "         ,\"  ,-'    `__\". " + "\n"
            + "        (   ( ._   ____`.)--._        _" + "\n"
            + "         `._ `-.`-' \\(`-'  _  `-. _,-' `-/`." + "\n"
            + "          ,')   `.`._))  ,' `.   `.  ,','  ;" + "\n"
            + "       .'   .    `--'  /     ).   `.      ;" + "\n"
            + "      ;      `-       /     '  )         ;" + "\n"
            + "      \\                       ')       ,'" + "\n"
            + "       \\                     ,'       ;" + "\n"
            + "        \\               `~~~'       ,'" + "\n"
            + "         `.                      _,'" + "\n"
            + "           `.                ,--'" + "\n"
            + "            `-._________,--'" + "\n";
    static Robot robo;
    static int defaultDelay = 0;
    static String read, print, com, filename = "";
    static List list = new List();
    static JFrame frame;
    static JButton run, open;
    static JTextArea box;
    static JFileChooser fileChooser;

    static boolean con = true;
    static boolean editBoxText = false;  // for now box only displays script for reviewing,
    //so is not editable, change to true if later needs
    //to be used as a basic ducky script ide

    static int keyDelay = 0; //used to slow down keys presses and releases 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        
        
        
        locks();
        gui();
        controls();

    }

    public static void locks()
    {
        try
        {
            //numlock being on was found to mess with the shift
            //command of ducky scripts being run by this program
            //to ensure correct functionality numlock is auto turned off
            Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
            //and since im making sure numlock is off i may as well turn scroll and caps off too
            Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, false);
            Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
        } catch (UnsupportedOperationException e)
        {
            System.out.println("Falied to turn off num lock, caps lock and scroll lock....attempting to continue program...note this could cause errors with how the scripts work.....");
        }

    }

    public static void gui() throws IOException
    {
        //make ui look like other programs on native system
        //****************************************************************
        try
        {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            // handle exception
        }

        //*****************************************************************
        //setup ui frame
        frame = new JFrame("Rubber Ducky Simulator");
        frame.setSize(680, 600);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        Image icon = ImageIO.read(DuckyEmulator.class.getResource("icon.png"));
        frame.setIconImage(icon);

        //***************************************************************
        //create button that launches the ducky script
        run = new JButton("RUN SCRIPT");
        run.setBackground(Color.red);

        //***************************************************************
        //create button that opens file select window to choose ducky script
        open = new JButton("CHOOSE SCRIPT");
        open.setBackground(Color.CYAN.darker());

        //**********************************************************
        //create text area that will display script to allow easier reviewing
        box = new JTextArea();
        box = new JTextArea(28, 55);
        box.setText(instructions + ducky);
        JScrollPane scrollPane = new JScrollPane(box); //make scrollable, some scripts are pretty long......

        box.setBackground(new Color(200, 200, 255, 255));
        box.setEditable(false);
        box.setVisible(true);

        //***********************************************************
        //add all ui components to frame
        frame.add(open);
        frame.add(run);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    public static void controls()
    {

        frame.addWindowStateListener(new WindowStateListener()
        {
            public void windowStateChanged(WindowEvent e)
            {
                // minimized
                if ((e.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED)
                {
                    System.out.println("minimized");
                } // maximized
                else if ((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)
                {
                    System.out.println("maximized");
                }
            }

        });
//       //run selected script
//       run.addActionListener((ActionEvent e) ->
//        {
//            //Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
//            
//            try
//            {
//               
//                runScript();
//               
//            } catch (InterruptedException | AWTException | IOException ex)
//            {
//                Logger.getLogger(DuckyEmulator.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });

        run.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae)
            {
                try
                {

                    runScript();

                } catch (InterruptedException | AWTException | IOException ex)
                {
                    Logger.getLogger(DuckyEmulator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

//       open.addActionListener((ActionEvent e) ->
//        {
//            box.setText("\n\n\n" + ducky);
//            fileChooser = new JFileChooser(new File(filename));
//            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//            fileChooser.showSaveDialog(frame);
//            
//            
//            read = fileChooser.getSelectedFile().toString(); //save path and file to variable
//            
//            //System.out.println("reading " + read);
//            try
//            {
//                read();  //read selected file,
//                
//            } catch (IOException ex)
//            {
//                Logger.getLogger(DuckyEmulator.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });
        open.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae)
            {
                box.setText("\n\n\n" + ducky);
                fileChooser = new JFileChooser(new File(filename));
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.showSaveDialog(frame);

                read = fileChooser.getSelectedFile().toString(); //save path and file to variable

                //System.out.println("reading " + read);
                try
                {
                    read();  //read selected file,

                } catch (IOException ex)
                {
                    Logger.getLogger(DuckyEmulator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

}
