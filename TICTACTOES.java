/**
 * Created by L507FP5STU05 on 12/5/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Simple TicTacToe game to introduce JFrame.
 *
 * Created by dlu on 12/2/2016.
 */
public class TICTACTOES {
    public static void main(String[] args) {
        JButton spaces[];
        String title = "Simple Tic Tac Toe";
        int width = 20;
        int height = 20;

        JFrame jf = new JFrame(title);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(width, height));
        spaces = new JButton[width * height];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = new TTTButton();
            jp.add(spaces[i]);                  // Add button to panel.
        }
        jf.add(jp);                             // Add panel to frame.

        jf.pack();
        jf.setVisible(true);
    }

    private static class TTTButton extends JButton implements ActionListener {

        private static int turn = 0;

        public TTTButton() {
            super();
            setPreferredSize(new Dimension(200, 200));
            setForeground(Color.BLACK);
            setOpaque(true);
            setFont(new Font("Helvetica", Font.PLAIN, 60));
            setText(" ");
            addActionListener(this);
        }

        // Notice button clicks to record moves.
        public void actionPerformed(ActionEvent e) {
            if (turn % 2 == 0 && getText().equals(" ")) {
                setText("+");
            } else if (turn % 2 == 1 && getText().equals(" ")) {
                setText("*");
            }
            if (isThereAWinner()) {
                showWin();
                shallWePlayAgain();
            } else if (noPlaceLeftToPlay()) {
                shallWePlayAgain();
            } else {
                turn++;
            }
        }

        // Check if someone has won the game.
        private boolean isThereAWinner() {
            return false;
        }

        // Check if there is still space to play.
        private boolean noPlaceLeftToPlay() {
            return false;
        }

        // Prompt user for a new game. Else exit.
        private void shallWePlayAgain() {
            // Consider using JOptionPane().
        }

        // Mark the winning moves.
        private void showWin() {

        }

        // Reset the game so that it can be played again.
        private void newGame() {

        }
    }
}


