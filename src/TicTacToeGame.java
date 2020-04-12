import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener {
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    String str;
    int count = 0;
    boolean win = false;
    JFrame jf;

    TicTacToeGame() {
        jf = new JFrame("Tic Tac Toe Game");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridLayout(3, 3));
        jb1 = new JButton();
        jb1.addActionListener(this::actionPerformed);
        jf.add(jb1);
        jb2 = new JButton();
        jb2.addActionListener(this::actionPerformed);
        jf.add(jb2);
        jb3 = new JButton();
        jb3.addActionListener(this::actionPerformed);
        jf.add(jb3);
        jb4 = new JButton();
        jb4.addActionListener(this::actionPerformed);
        jf.add(jb4);
        jb5 = new JButton();
        jb5.addActionListener(this::actionPerformed);
        jf.add(jb5);
        jb6 = new JButton();
        jb6.addActionListener(this::actionPerformed);
        jf.add(jb6);
        jb7 = new JButton();
        jb7.addActionListener(this::actionPerformed);
        jf.add(jb7);
        jb8 = new JButton();
        jb8.addActionListener(this::actionPerformed);
        jf.add(jb8);
        jb9 = new JButton();
        jb9.addActionListener(this::actionPerformed);
        jf.add(jb9);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeGame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count = count + 1;
        if (count % 2 == 0) {
            str = "0";
        } else {
            str = "X";
        }

        if (e.getSource() == jb1) {
            jb1.setText(str);
            jb1.setBackground(Color.PINK);
            jb1.setFont(new Font("Arial", 1, 50));
            jb1.setEnabled(false);
        }
        if (e.getSource() == jb2) {
            jb2.setText(str);
            jb2.setBackground(Color.PINK);
            jb2.setFont(new Font("Arial", 1, 50));
            jb2.setEnabled(false);
        }
        if (e.getSource() == jb3) {
            jb3.setText(str);
            jb3.setBackground(Color.PINK);
            jb3.setFont(new Font("Arial", 1, 50));
            jb3.setEnabled(false);
        }
        if (e.getSource() == jb4) {
            jb4.setText(str);
            jb4.setBackground(Color.PINK);
            jb4.setFont(new Font("Arial", 1, 50));
            jb4.setEnabled(false);
        }
        if (e.getSource() == jb5) {
            jb5.setText(str);
            jb5.setBackground(Color.PINK);
            jb5.setFont(new Font("Arial", 1, 50));
            jb5.setEnabled(false);
        }
        if (e.getSource() == jb6) {
            jb6.setText(str);
            jb6.setBackground(Color.PINK);
            jb6.setFont(new Font("Arial", 1, 50));
            jb6.setEnabled(false);
        }
        if (e.getSource() == jb7) {
            jb7.setText(str);
            jb7.setBackground(Color.PINK);
            jb7.setFont(new Font("Arial", 1, 50));
            jb7.setEnabled(false);
        }
        if (e.getSource() == jb8) {
            jb8.setText(str);
            jb8.setBackground(Color.PINK);
            jb8.setFont(new Font("Arial", 1, 50));
            jb8.setEnabled(false);
        }
        if (e.getSource() == jb9) {
            jb9.setText(str);
            jb9.setBackground(Color.PINK);
            jb9.setFont(new Font("Arial", 1, 50));
            jb9.setEnabled(false);
        }
        winPossibilities();
    }
        void winPossibilities() {

            //Row Wise Winning Possibilities.

            if (jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb3.getText() != "") {
                win = true;

            } else if (jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb6.getText() != "") {
                win = true;

            } else if (jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb9.getText() != "") {
                win = true;

            }

            //Column Wise Winning Possibilities.

            else if (jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb7.getText() != "") {
                win = true;

            } else if (jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb8.getText() != "") {
                win = true;

            } else if (jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb9.getText() != "") {
                win = true;

            }

            //Diagonal Wise Winning Possibilities.

            else if (jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb9.getText() != "") {
                win = true;

            }
            else if (jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb7.getText() != "") {
                win = true;

            }
            else {
                win = false;

            }
                whoWins();
        }
        void whoWins() {
            if (win == true)
            {
                JOptionPane.showMessageDialog(jf, str+"Wins");
                restartGame();
            }
            else if (win == false && count == 9) {
                JOptionPane.showMessageDialog(jf,str+"Match Draw");
                restartGame();
            }
    }
    void restartGame() {
        int i = JOptionPane.showConfirmDialog(jf,"Do you want to play again?");
        if(i == 0) {

            str = "";
            count = 0;
            win = false;

            jb1.setText("");
            jb1.setBackground(Color.orange);
            jb1.setEnabled(true);

            jb2.setText("");
            jb2.setBackground(Color.orange);
            jb2.setEnabled(true);

            jb3.setText("");
            jb3.setBackground(Color.orange);
            jb3.setEnabled(true);

            jb4.setText("");
            jb4.setBackground(Color.orange);
            jb4.setEnabled(true);

            jb5.setText("");
            jb5.setBackground(Color.orange);
            jb5.setEnabled(true);

            jb6.setText("");
            jb6.setBackground(Color.orange);
            jb6.setEnabled(true);

            jb7.setText("");
            jb7.setBackground(Color.orange);
            jb7.setEnabled(true);

            jb8.setText("");
            jb8.setBackground(Color.orange);
            jb8.setEnabled(true);

            jb9.setText("");
            jb9.setBackground(Color.orange);
            jb9.setEnabled(true);
        }
        else if (i == 1) {
            System.exit(0);
        }
        else {
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
        }
    }
}