package weekTwo;

import javax.swing.JOptionPane;

public class ActivityOneDialog {
        // shortcut main + tab
        public static void main(String[] args) {
            // P - principal amount
            // r - annual interest rate
            // n - number of times the interest is compounded annually
            // t - specified number of years
            // A - the amount of money in the account after the specified number of years

            // declare
            double P, r, A;
            int n, t;

            P = Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount: "));
            r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: ")) / 100;
            n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times compounded: "));
            t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of years: "));

            // A = P(1 + r/n)^nt
            A = P * Math.pow((1 + r/n), n*t);
            JOptionPane.showMessageDialog(null, String.format("The balance of the account after %d years will be $%.2f", t,A));

        }
    }

