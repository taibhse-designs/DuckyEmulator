package duckyemulator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author STARK
 */
public class KeyBoard
{
    private static Robot robot;
    public static void main(String args[]) throws AWTException
    {
        
        keyString("[");
        
        
    }
    
    public static void keyCommand(String key) throws AWTException
    {
        robot = new Robot();
        
        switch (key)
                {
                   case "A":
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_A);
                        break;
                    case "B":
                        robot.keyPress(KeyEvent.VK_B);
                        robot.keyRelease(KeyEvent.VK_B);
                        break;
                    case "C":
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_C);
                        break;
                    case "D":
                        robot.keyPress(KeyEvent.VK_D);
                        robot.keyRelease(KeyEvent.VK_D);
                        break;
                    case "E":
                        robot.keyPress(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_E);
                        break;
                    case "F":
                        robot.keyPress(KeyEvent.VK_F);
                        robot.keyRelease(KeyEvent.VK_F);
                        break;
                    case "G":
                        robot.keyPress(KeyEvent.VK_G);
                        robot.keyRelease(KeyEvent.VK_G);
                        break;
                    case "H":
                        robot.keyPress(KeyEvent.VK_H);
                        robot.keyRelease(KeyEvent.VK_H);
                        break;
                    case "I":
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_I);
                        break;
                    case "J":
                        robot.keyPress(KeyEvent.VK_J);
                        robot.keyRelease(KeyEvent.VK_J);
                        break;
                    case "K":
                        robot.keyPress(KeyEvent.VK_K);
                        robot.keyRelease(KeyEvent.VK_K);
                        break;
                    case "L":
                        robot.keyPress(KeyEvent.VK_L);
                        robot.keyRelease(KeyEvent.VK_L);
                        break;
                    case "M":
                        robot.keyPress(KeyEvent.VK_M);
                        robot.keyRelease(KeyEvent.VK_M);
                        break;
                    case "N":
                        robot.keyPress(KeyEvent.VK_N);
                        robot.keyRelease(KeyEvent.VK_N);
                        break;
                    case "O":
                        robot.keyPress(KeyEvent.VK_O);
                        robot.keyRelease(KeyEvent.VK_O);
                        break;
                    case "P":
                        robot.keyPress(KeyEvent.VK_P);
                        robot.keyRelease(KeyEvent.VK_P);
                        break;
                    case "Q":
                        robot.keyPress(KeyEvent.VK_Q);
                        robot.keyRelease(KeyEvent.VK_Q);
                        break;
                    case "R":
                        robot.keyPress(KeyEvent.VK_R);
                        robot.keyRelease(KeyEvent.VK_R);
                        break;
                    case "S":
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_S);
                        break;
                    case "T":
                        robot.keyPress(KeyEvent.VK_T);
                        robot.keyRelease(KeyEvent.VK_T);
                        break;
                    case "U":
                        robot.keyPress(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_U);
                        break;
                    case "V":
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_V);
                        break;
                    case "W":
                        robot.keyPress(KeyEvent.VK_W);
                        robot.keyRelease(KeyEvent.VK_W);
                        break;
                    case "X":
                        robot.keyPress(KeyEvent.VK_X);
                        robot.keyRelease(KeyEvent.VK_X);
                        break;
                    case "Y":
                        robot.keyPress(KeyEvent.VK_Y);
                        robot.keyRelease(KeyEvent.VK_Y);
                        break;
                    case "Z":
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_Z);
                        break;
                    case "F1":
                        robot.keyPress(KeyEvent.VK_F1);
                        robot.keyRelease(KeyEvent.VK_F1);
                        break;
                    case "F2":
                        robot.keyPress(KeyEvent.VK_F2);
                        robot.keyRelease(KeyEvent.VK_F2);
                        break;
                    case "F3":
                        robot.keyPress(KeyEvent.VK_F3);
                        robot.keyRelease(KeyEvent.VK_F3);
                        break;
                    case "F4":
                        robot.keyPress(KeyEvent.VK_F4);
                        robot.keyRelease(KeyEvent.VK_F4);
                        break;
                    case "F5":
                        robot.keyPress(KeyEvent.VK_F5);
                        robot.keyRelease(KeyEvent.VK_F5);
                        break;
                    case "F6":
                        robot.keyPress(KeyEvent.VK_F6);
                        robot.keyRelease(KeyEvent.VK_F6);
                        break;
                    case "F7":
                        robot.keyPress(KeyEvent.VK_F7);
                        robot.keyRelease(KeyEvent.VK_F7);
                        break;
                    case "F8":
                        robot.keyPress(KeyEvent.VK_F8);
                        robot.keyRelease(KeyEvent.VK_F8);
                        break;
                    case "F9":
                        robot.keyPress(KeyEvent.VK_F9);
                        robot.keyRelease(KeyEvent.VK_F9);
                        break;
                    case "F10":
                        robot.keyPress(KeyEvent.VK_F10);
                        robot.keyRelease(KeyEvent.VK_F10);
                        break;
                    case "F11":
                        robot.keyPress(KeyEvent.VK_F11);
                        robot.keyRelease(KeyEvent.VK_F11);
                        break;
                    case "F12":
                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);
                        break;
                        case "ESCAPE":
                        robot.keyPress(KeyEvent.VK_ESCAPE);
                        robot.keyRelease(KeyEvent.VK_ESCAPE);
                        break;
                    case "ESC":
                        robot.keyPress(KeyEvent.VK_ESCAPE);
                        robot.keyRelease(KeyEvent.VK_ESCAPE);
                        break;
                        case "BREAK":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_PAGE_UP);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_PAGE_UP);
                        break;
                            case "PAUSE":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                        break;
                                case "END":
                        robot.keyPress(KeyEvent.VK_END);
                        robot.keyRelease(KeyEvent.VK_END);
                        break;
                                    case "TAB":
                        robot.keyPress(KeyEvent.VK_TAB);
                        robot.keyRelease(KeyEvent.VK_TAB);
                        break;
                    case "SPACE":
                        robot.keyPress(KeyEvent.VK_SPACE);
                        robot.keyRelease(KeyEvent.VK_SPACE);
                        break;
                        case "DELETE":
                        robot.keyPress(KeyEvent.VK_DELETE);
                        robot.keyRelease(KeyEvent.VK_DELETE);
                        break;
                    case "HOME":
                        robot.keyPress(KeyEvent.VK_HOME);
                        robot.keyRelease(KeyEvent.VK_HOME);
                        break;
                    case "INSERT":
                        robot.keyPress(KeyEvent.VK_INSERT);
                        robot.keyRelease(KeyEvent.VK_INSERT);
                        break;
                    case "PAGEUP":
                        robot.keyPress(KeyEvent.VK_PAGE_UP);
                        robot.keyRelease(KeyEvent.VK_PAGE_UP);
                        break;
                    case "PAGEDOWN":
                        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                        break;
                    case "WINDOWS":
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        break;
                    case "GUI":
                        robot.keyPress(KeyEvent.VK_WINDOWS);
                        robot.keyRelease(KeyEvent.VK_WINDOWS);
                        break;
                    case "UPARROW":
                        robot.keyPress(KeyEvent.VK_UP);
                        robot.keyRelease(KeyEvent.VK_UP);
                        break;
                    case "DOWNARROW":
                        robot.keyPress(KeyEvent.VK_DOWN);
                        robot.keyRelease(KeyEvent.VK_DOWN);
                        break;
                    case "LEFTARROW":
                        robot.keyPress(KeyEvent.VK_LEFT);
                        robot.keyRelease(KeyEvent.VK_LEFT);
                        break;
                    case "RIGHTARROW":
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);
                        break;
                    default:
                        break; 
                }
    }
    //note still needs #   and  ~  keys
    public static void keyString(String key) throws AWTException
    {
        robot = new Robot();
        robot.delay(2);
        
        switch (key)
                {
                    //test for blank
                     case "":
                        break;
                 //test for space, decimal, comma, symbols, etc
                    case " ":
                        robot.keyPress(KeyEvent.VK_SPACE);
                        break;
                        case "!":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_1);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_1);
                        break;
                    case ",":
                        robot.keyPress(KeyEvent.VK_COMMA);
                        break;
                    case ".":
                        robot.keyPress(KeyEvent.VK_DECIMAL);
                        break;
                    case "*":
                        robot.keyPress(KeyEvent.VK_ASTERISK);
                        break;
                    case "€":
                        robot.keyPress(KeyEvent.VK_EURO_SIGN);
                        break;
                    case "/":
                        robot.keyPress(KeyEvent.VK_SLASH);
                        break;
                    case "\\":
                        robot.keyPress(KeyEvent.VK_BACK_SLASH);
                        break;
                    case "(":

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case ")":

                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case "=":


                        robot.keyPress(KeyEvent.VK_EQUALS);

                        break;
                    case "-":


                        robot.keyPress(KeyEvent.VK_MINUS);

                        break;
                    case "_":


                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_MINUS);
                        robot.keyRelease(KeyEvent.VK_SHIFT);

                        break;
                    case ":":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "\"":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_2);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "&":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_7);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "|":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_BACK_SLASH);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                        case "?":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_SLASH);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                        case "'":
                       
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        break;
                            case "£":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_3);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_3);
                        break;
                                 case "$":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_4);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_4);
                        break;
                         case "%":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_5);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_5);
                        break;
                              case "^":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_6);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_6);
                        break;
                                   case "+":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_EQUALS);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_EQUALS);
                        break;
                                        case "[":
                       
                       // robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                       // robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        break;
                                             case "]":
                       
                      //  robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                     //   robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                                case "{":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        break;
                                         case "}":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                              case ";":
                       
                        //robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                       // robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_SEMICOLON);
                        break; 
                                    case "@":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        break; 
                                          case "<":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_COMMA);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_COMMA);
                        break;
                                                case ">":
                       
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_STOP);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_STOP);
                        break;
                                     
                    //test cases for lowercase letters first
                    case "a":
                        robot.keyPress(KeyEvent.VK_A);
                        break;
                    case "b":
                        robot.keyPress(KeyEvent.VK_B);
                        break;
                    case "c":
                        robot.keyPress(KeyEvent.VK_C);
                        break;
                    case "d":
                        robot.keyPress(KeyEvent.VK_D);
                        break;
                    case "e":
                        robot.keyPress(KeyEvent.VK_E);
                        break;
                    case "f":
                        robot.keyPress(KeyEvent.VK_F);
                        break;
                    case "g":
                        robot.keyPress(KeyEvent.VK_G);
                        break;
                    case "h":
                        robot.keyPress(KeyEvent.VK_H);
                        break;
                    case "i":
                        robot.keyPress(KeyEvent.VK_I);
                        break;
                    case "j":
                        robot.keyPress(KeyEvent.VK_J);
                        break;
                    case "k":
                        robot.keyPress(KeyEvent.VK_K);
                        break;
                    case "l":
                        robot.keyPress(KeyEvent.VK_L);
                        break;
                    case "m":
                        robot.keyPress(KeyEvent.VK_M);
                        break;
                    case "n":
                        robot.keyPress(KeyEvent.VK_N);
                        break;
                    case "o":
                        robot.keyPress(KeyEvent.VK_O);
                        break;
                    case "p":
                        robot.keyPress(KeyEvent.VK_P);
                        break;
                    case "q":
                        robot.keyPress(KeyEvent.VK_Q);
                        break;
                    case "r":
                        robot.keyPress(KeyEvent.VK_R);
                        break;
                    case "s":
                        robot.keyPress(KeyEvent.VK_S);
                        break;
                    case "t":
                        robot.keyPress(KeyEvent.VK_T);
                        break;
                    case "u":
                        robot.keyPress(KeyEvent.VK_U);
                        break;
                    case "v":
                        robot.keyPress(KeyEvent.VK_V);
                        break;
                    case "w":
                        robot.keyPress(KeyEvent.VK_W);
                        break;
                    case "x":
                        robot.keyPress(KeyEvent.VK_X);
                        break;
                    case "y":
                        robot.keyPress(KeyEvent.VK_Y);
                        break;
                    case "z":
                        robot.keyPress(KeyEvent.VK_Z);
                        break;

                    //test case for uppercase letters

                    case "A":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "B":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_B);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "C":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "D":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_D);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "E":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "F":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_F);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "G":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_G);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "H":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_H);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "I":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "J":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_J);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "K":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_K);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "L":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_L);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "M":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_M);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "N":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_N);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "O":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_O);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "P":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_P);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "Q":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_Q);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "R":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_R);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "S":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "T":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_T);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "U":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "V":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "W":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_W);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "X":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_X);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "Y":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_Y);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case "Z":
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    //test case for numbers

                    case "0":
                        robot.keyPress(KeyEvent.VK_NUMPAD0);
                        break;
                    case "1":
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        break;
                    case "2":
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        break;
                    case "3":
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        break;
                    case "4":
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        break;
                    case "5":
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        break;
                    case "6":
                        robot.keyPress(KeyEvent.VK_NUMPAD6);
                        break;
                    case "7":
                        robot.keyPress(KeyEvent.VK_NUMPAD7);
                        break;
                    case "8":
                        robot.keyPress(KeyEvent.VK_NUMPAD8);
                        break;
                    case "9":
                        robot.keyPress(KeyEvent.VK_NUMPAD9);
                        break;
                    default:
                        System.err.println("SYSMBOL NOT FOUND >>>  " + key);
                        break;
        }
    }
}
