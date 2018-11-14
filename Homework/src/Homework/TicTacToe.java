package Homework;

import java.util.Random;
import javax.swing.JOptionPane;

public class TicTacToe {
    
    public static char board[][] = new char[3][3];
    public static int counter = 1;
    public static String firstMove;
    public static boolean end = false;
    public static char win;
    
    
    
    

    public static void main(String[] args) throws InterruptedException
    {
        // TODO code application logic here
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }
        /*
        ---
        ---
        ---
        */
        
        String first = JOptionPane.showInputDialog("Who goes first?? the Human(Enter H) or Computer (Enter C)");
        
        //<editor-fold defaultstate="collapsed" desc="Computer Goes First">
        if(first.equals("C"))
        {
            System.out.println("Computer goes first");
            move();
            while(!end)
            {
                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                Thread.sleep(1000);
                
                String move = JOptionPane.showInputDialog("enter your next move");
                
                //<editor-fold defaultstate="collapsed" desc="moves of the Human">
                if(move.equals("00") && board[0][0] == '-')
                {
                    board[0][0] = 'O';
                }
                else if(move.equals("01") && board[0][1] == '-')
                {
                    board[0][1] = 'O';
                }
                else if(move.equals("02") && board[0][2] == '-')
                {
                    board[0][2] = 'O';
                }
                else if(move.equals("10") && board[1][0] == '-')
                {
                    board[1][0] = 'O';
                }
                else if(move.equals("11") && board[1][1] == '-')
                {
                    board[1][1] = 'O';
                }
                else if(move.equals("12") && board[1][2] == '-')
                {
                    board[1][2] = 'O';
                }
                else if(move.equals("20") && board[2][0] == '-')
                {
                    board[2][0] = 'O';
                }
                else if(move.equals("21") && board[2][1] == '-')
                {
                    board[2][1] = 'O';
                }
                else if(move.equals("22") && board[2][2] == '-')
                {
                    board[2][2] = 'O';
                }
                else
                {
                    System.out.println("That is not a valid move");
                }
                //</editor-fold>
                
                System.out.println();
                move();
                
            }
            
            if(win == 'o')
            {
                System.out.println("Human Won");
            }
            else if(win == 'X')
            {
                System.out.println("Computer Won");
            }
            else if(win == 'd' || win == 'D')
            {
                System.out.println("Game is a draw");
            }
            
        }
//</editor-fold>
        
        
        else if(first.equals("H"))
        {
            
            System.out.println("Human goes first");     
            String move = JOptionPane.showInputDialog("enter your next move");
            //<editor-fold defaultstate="collapsed" desc="moves of the Human">
            if(move.equals("00") && board[0][0] == '-')
            {
                board[0][0] = 'O';
            }
            else if(move.equals("01") && board[0][1] == '-')
            {
                board[0][1] = 'O';
            }
            else if(move.equals("02") && board[0][2] == '-')
            {
                board[0][2] = 'O';
            }
            else if(move.equals("10") && board[1][0] == '-')
            {
                board[1][0] = 'O';
            }
            else if(move.equals("11") && board[1][1] == '-')
            {
                board[1][1] = 'O';
            }
            else if(move.equals("12") && board[1][2] == '-')
            {
                board[1][2] = 'O';
            }
            else if(move.equals("20") && board[2][0] == '-')
            {
                board[2][0] = 'O';
            }
            else if(move.equals("21") && board[2][1] == '-')
            {
                board[2][1] = 'O';
            }
            else if(move.equals("22") && board[2][2] == '-')
            {
                board[2][2] = 'O';
            }
            else
            {
                System.out.println("That is not a valid move");
            }
            //</editor-fold>

            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            //</editor-fold>
            
            while(!end)
            {
                hMove();
                
                end = won();
                
                if(end)
                {
                    break;
                }
                
                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                
                move = JOptionPane.showInputDialog("enter your next move");

                //<editor-fold defaultstate="collapsed" desc="moves of the Human">
                if(move.equals("00") && board[0][0] == '-')
                {
                    board[0][0] = 'O';
                }
                else if(move.equals("01") && board[0][1] == '-')
                {
                    board[0][1] = 'O';
                }
                else if(move.equals("02") && board[0][2] == '-')
                {
                    board[0][2] = 'O';
                }
                else if(move.equals("10") && board[1][0] == '-')
                {
                    board[1][0] = 'O';
                }
                else if(move.equals("11") && board[1][1] == '-')
                {
                    board[1][1] = 'O';
                }
                else if(move.equals("12") && board[1][2] == '-')
                {
                    board[1][2] = 'O';
                }
                else if(move.equals("20") && board[2][0] == '-')
                {
                    board[2][0] = 'O';
                }
                else if(move.equals("21") && board[2][1] == '-')
                {
                    board[2][1] = 'O';
                }
                else if(move.equals("22") && board[2][2] == '-')
                {
                    board[2][2] = 'O';
                }
                else
                {
                    System.out.println("That is not a valid move");
                }
                //</editor-fold>

                System.out.println();
                                
                end = won();
                
            }
            
            
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            
            if(win == 'X')
            {
                System.out.println("Computer Won");
            }
            else if(win == 'o')
            {
                System.out.println("Human Won");
            }
            else if(win == 'd')
            {
                System.out.println("Game is a Draw");
            }
            
        }
        else
        {
              System.out.println("That is not a valid input program will close");  
        }
        
    }
    
    public static void move()
    {
        //<editor-fold defaultstate="collapsed" desc="first move">
        Random rand = new Random();
        int f = rand.nextInt(4) + 1;
        if(counter == 1)
        {
            //System.out.println(f);
            if(f == 1)
            {
                //then it is 00
                board[0][0] = 'X';
                firstMove = "00";
                //System.out.println("CHECK");
            }
            else if(f == 2)
            {
                //then it is 00
                board[0][2] = 'X';
                firstMove = "02";
                //System.out.println("CHECK");
            }
            else if(f == 3)
            {
                //then it is 00
                board[2][0] = 'X';
                firstMove = "20";
                //System.out.println("CHECK");
            }
            else if(f == 4)
            {
                //then it is 00
                board[2][2] = 'X';
                firstMove = "22";
                //System.out.println("CHECK");
            }
            else
            {
                //then it is 00
                board[2][2] = 'X';
                firstMove = "22";
                //System.out.println("CHECK");
            }
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="second move">
        if(counter == 2)
        {
            if(board[1][1] == '-')
            {
                board[1][1] = 'X';
            }
            else
            {
                if(firstMove.equals("00"))
                {
                    board[0][2] = 'X';
                }
                else if(firstMove.equals("02"))
                {
                    board[2][2] = 'X';
                }
                else if(firstMove.equals("20"))
                {
                    board[2][2] = 'X';
                }
                else if(firstMove.equals("22"))
                {
                    board[0][2] = 'X';
                }
            }
            end = won();
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="third move">
        if(counter == 3)
        {
            if(!end)
            {
                int second[] = thirdMove();
                if(second[0] != 5)
                {
                    //System.out.println("CHECK");
                    board[second[0]][second[1]] = 'X';
                }
                else
                {
                    int secondMy[] = thirdMyMove();
                    if(secondMy[0] != 5)
                    {
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                    else
                    {
                        secondMy = noOtherOption();
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                }
            }
            end = won();
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="fourth move">
        if(counter == 4)
        {
            if(!end)
            {
                int second[] = thirdMove();
                if(second[0] != 5)
                {
                    //System.out.println("CHECK");
                    board[second[0]][second[1]] = 'X';
                }
                else
                {
                    int secondMy[] = thirdMyMove();
                    if(secondMy[0] != 5)
                    {
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                    else
                    {
                        secondMy = noOtherOption();
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                }
            }
            end = won();
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="fifth move">
        if(counter == 3)
        {
            if(!end)
            {
                int second[] = thirdMove();
                if(second[0] != 5)
                {
                    //System.out.println("CHECK");
                    board[second[0]][second[1]] = 'X';
                }
                else
                {
                    int secondMy[] = thirdMyMove();
                    if(secondMy[0] != 5)
                    {
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                    else
                    {
                        secondMy = noOtherOption();
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                }
            }
            end = won();
        }
        //</editor-fold>
        

        counter++;
        
    }
    
    public static int[] thirdMove()
    {
        //check to see if the human can win in the next move
        //check to see if two of the corners are there first
        int[] ret = new int[2];
        ret[0] = 5;
        if(board[0][0] == 'O' && board[0][1]== 'O' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == '-')
        {
            ret[0] = 2;
            ret[1] = 1;
        }
        else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == '-')
        {
            ret[0] = 1;
            ret[1] = 2;
        }
        else if(board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[2][1] == 'O' && board[1][1] == 'O' && board[0][1] == '-')
        {
            ret[0] = 0;
            ret[1] = 1;
        }
        else if(board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] == '-')
        {
            ret[0] = 1;
            ret[1] = 0;
        }
        else if(board[2][2] == 'O' && board[1][2] == 'O' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == '-')
        {
            ret[0] = 0;
            ret[1] = 1;
        }
        else if(board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == '-')
        {
            ret[0] = 1;
            ret[1] = 0;
        }
        else if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == '-')
        {
            ret[0] = 1;
            ret[1] = 2;
        }
        else if(board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == '-')
        {
            ret[0] = 2;
            ret[1] = 1;
        }
        else if(board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        return ret;

    }
    
    public static int[] thirdMyMove()
    {
        int[] ret = new int[2];
        ret[0] = 5;
        if(board[0][0] == 'X' && board[0][1]== 'X' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == '-')
        {
            ret[0] = 2;
            ret[1] = 1;
        }
        else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == '-')
        {
            ret[0] = 1;
            ret[1] = 2;
        }
        else if(board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == '-')
        {
            ret[0] = 0;
            ret[1] = 1;
        }
        else if(board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == '-')
        {
            ret[0] = 0;
            ret[1] = 0;
        }
        else if(board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == '-')
        {
            ret[0] = 1;
            ret[1] = 0;
        }
        else if(board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == '-')
        {
            ret[0] = 0;
            ret[1] = 2;
        }
        else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == '-')
        {
            ret[0] = 2;
            ret[1] = 2;
        }
        else if(board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == '-')
        {
            ret[0] = 2;
            ret[1] = 0;
        }
        else if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == '-')
        {
            ret[0] = 0;
            ret[1] = 1;
        }
        else if(board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == '-')
        {
            ret[0] = 1;
            ret[1] = 0;
        }
        else if(board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-')
        {
            ret[0] = 1;
            ret[1] = 2;
        }
        else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-')
        {
            ret[0] = 2;
            ret[1] = 1;
        }
        else if(board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        else if(board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == '-')
        {
            ret[0] = 1;
            ret[1] = 1;
        }
        return ret;
    }
    
    public static int[] noOtherOption()
    {
        int[] ret = new int[2];
        ret[0] = 5;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == '-')
                {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }
            }
            if(ret[0] != 5)
            {
                break;
            }
            //System.out.println();
        }
        
        
        return ret;
    }
    
    public static boolean won()
    {
        boolean won  = false;
        
        //<editor-fold defaultstate="collapsed" desc="did O win">
        if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][1] == 'O' && board[1][1] == 'O' && board[0][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][2] == 'O' && board[1][2] == 'O' && board[0][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == 'O')
        {
            won = true; win = 'o';
        }
        else if(board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == 'O')
        {
            won = true; win = 'o';
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Did X won">
        if(board[0][0] == 'X' && board[0][1]== 'X' && board[0][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == 'X')
        {
            won = true; win = 'X';
        }
        else if(board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == 'X')
        {
            won = true; win = 'X';
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="is there a draw">
        boolean dash = true;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == '-')
                {
                    dash = false;
                }
            }
        }
        
        if(dash)
        {
            win = 'd'; won = true;
        }
//</editor-fold>

        return won;
    }
    
    public static void hMove()
    {
        //<editor-fold defaultstate="collapsed" desc="first move of the computer">
        if(counter == 1)
        {
            //if the human moved in the center
            if(board[1][1] == 'O')
            {
                Random rand = new Random();
                int f = rand.nextInt(4) + 1;
                if(f == 1)
                {
                    //then it is 00
                    board[0][0] = 'X';
                    firstMove = "00";
                    //System.out.println("CHECK");
                }
                else if(f == 2)
                {
                    //then it is 00
                    board[0][2] = 'X';
                    firstMove = "02";
                    //System.out.println("CHECK");
                }
                else if(f == 3)
                {
                    //then it is 00
                    board[2][0] = 'X';
                    firstMove = "20";
                    //System.out.println("CHECK");
                }
                else if(f == 4)
                {
                    //then it is 00
                    board[2][2] = 'X';
                    firstMove = "22";
                    //System.out.println("CHECK");
                }
                else
                {
                    //then it is 00
                    board[2][2] = 'X';
                    firstMove = "22";
                    //System.out.println("CHECK");
                }
            }
            else
            {
                board[1][1] = 'X';
                firstMove = "11";
            }
            
        }
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="second move of the computer">
if(counter == 2)
{
    int second[] = thirdMove();
    //if there is no defensice move
    if(second[0] == 5)
    {
        if(board[1][1] != 'X')
        {
            if(firstMove == "00" && board[0][2] == '-')
            {
                board[0][2] = 'X';
            }
            else if(firstMove == "00" && board[2][0] == '-')
            {
                board[2][0] = 'X';
            }
            else if(firstMove == "02" && board[0][0] == '-')
            {
                board[0][0] = 'X';
            }
            else if(firstMove == "02" && board[2][2] == '-')
            {
                board[2][2] = 'X';
            }
            else if(firstMove == "20" && board[0][0] == '-')
            {
                board[0][0] = 'X';
            }
            else if(firstMove == "20" && board[2][2] == '-')
            {
                board[2][2] = 'X';
            }
            else if(firstMove == "22" && board[2][0] == '-')
            {
                board[2][0] = 'X';
            }
            else if(firstMove == "22" && board[0][2] == '-')
            {
                board[0][2] = 'X';
            }
        }
        else
        {
            if(board[0][0] == '-')
            {
                board[0][0] = 'X';
            }
            else if(board[0][2] == '-')
            {
                board[0][2] = 'X';
            }
            else if(board[2][0] == '-')
            {
                board[2][0] = 'X';
            }
            else if(board[2][2] == '-')
            {
                board[2][2] = 'X';
            }
        }
        
        
        
    }
    //if there is a defensive move
    else
    {
        board[second[0]][second[1]] = 'X';
    }
    
}
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="third ">
if(counter == 3)
{
    if(!end)
    {
        int second[] = thirdMove();
        if(second[0] != 5)
        {
            //System.out.println("CHECK");
            board[second[0]][second[1]] = 'X';
        }
        else
        {
            int secondMy[] = thirdMyMove();
            if(secondMy[0] != 5)
            {
                board[secondMy[0]][secondMy[1]] = 'X';
            }
            else
            {
                secondMy = noOtherOption();
                board[secondMy[0]][secondMy[1]] = 'X';
            }
        }
    }
    if(!end)
    {
        end = true;
        win = 'd';
    }
    end = won();
}
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="fourth">
        if(counter == 4)
        {

            if(!end)
            {
                int second[] = thirdMove();
                if(second[0] != 5)
                {
                    //System.out.println("CHECK");
                    board[second[0]][second[1]] = 'X';
                }
                else
                {
                    int secondMy[] = thirdMyMove();
                    if(secondMy[0] != 5)
                    {
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                    else
                    {
                        secondMy = noOtherOption();
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                }
            }
            if(!end)
            {
                end = true;
                win = 'd';
            }
            won();
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="fifth">
        if(counter == 5)
        {
            
            
            won();
            
            if(!end)
            {
                int second[] = thirdMove();
                if(second[0] != 5)
                {
                    //System.out.println("CHECK");
                    board[second[0]][second[1]] = 'X';
                }
                else
                {
                    int secondMy[] = thirdMyMove();
                    if(secondMy[0] != 5)
                    {
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                    else
                    {
                        secondMy = noOtherOption();
                        board[secondMy[0]][secondMy[1]] = 'X';
                    }
                }
            }

            
        }
//</editor-fold>

        counter++;
    }
    
    
    
}