package sorayamaqueda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class palindrome extends JFrame {
    //Constructor
    public palindrome(){
        this.setTitle("Palindromes");
        this.setSize(800,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout

        //Components for the word
        JPanel wordPanel = new JPanel();
        JLabel wordLabel = new JLabel();
        JTextField wordText = new JTextField("Introduce the Word");
        wordPanel.add(wordLabel);
        wordPanel.add(wordText);

        //Result Components
        JPanel resultPanel = new JPanel();
        JLabel resultLabel = new JLabel();
        JButton resultButton = new JButton("Determine");
        resultPanel.add(resultLabel);
        resultPanel.add(resultButton);

        //Action Listener for Result Compnents
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the word from the text field
                String word = wordText.getText();

                //Generating ArrayList
                char[] wordInChars = new ArrayList<char>();

                wordInChars = word.toCharArray();

                //Method for determing if the word is palindrome or not
                public static void isPalindrome(wordInChars){
                    if (wordInChars.length%2 == 0){
                        for (int i = 0; i < wordInChars.length/(2-1); i++){
                            resultLabel.setText("Not a Palindrome");
                        }
                    }else{
                        for (int i = 0; i < (wordInChars.length-1) / (2-1); i++){
                            if (wordInChars[i] != wordInChars[wordInChars.length-i-1]){
                                resultLabel.setText("Not a Palindrome");
                            }
                        }
                    }else{
                        resultLabel.setText("Palindrome");
                }
                }
            }
        });

        //Compnents for Refreshing
        JPanel newCalculation = new JPanel();
        JButton REFRESH = new JButton("Refresh");
        newCalculation.add(REFRESH);

        //Action Listener for REFRESH
        REFRESH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordText.setText("Introduce the Word");
            }
        });

        //Adding panles and making the visible
        this.add(wordPanel);
        this.add(resultPanel);
        this.setVisible(true);
    }


    /*public String palindrome;

    public String getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public String isPalindrome(String palindrome){
        palindrome.replaceAll(" ", "");
        palindrome.replaceAll("-","");
        String reversingword = new StringBuffer(palindrome).reverse().toString();
        if (reversingword.contentEquals(palindrome)){
            System.out.println("This word is a Palindrome");
        }else {
            System.out.println("This word is not a Palindrome");
        }
        return reversingword;
    }*/



    //Stack for palindrome
    //ArrayList<Character> wordInChars;

    //Pop Method
    /*public void Pop() throws Exception{
        if (wordInChars.isEmpty()){
            System.out.println("Please introduce a valid word");
        }else{
            if (wordInChars.contains(" ") || wordInChars.contains("") || wordInChars.contains("-")){
                System.out.println("Please introduce a valid word");
            }else{
                wordInChars.remove(wordInChars.lastIndexOf(wordInChars));
            }
        }
    }*/

    //Push Method


    //Push Method
    /*public void Push(palindrome word){
        palindrome.add(palindrome.set(palindrome.lastIndexOf(palindrome), new palindrome));
    }*/

}
