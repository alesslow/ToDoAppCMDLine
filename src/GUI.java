import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame implements ActionListener {

    GUI(String title) {

        super(title);
    }

    public void buildGUI() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(700, 600);
        this.getContentPane().setBackground(Color.WHITE);

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.YELLOW);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.DARK_GRAY));

        // MENU
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        // TOP
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        JPanel topPanel = new JPanel();
        topPanel.setBorder(new LineBorder(Color.BLACK,3));
        topPanel.setBackground(Color.yellow);
        topPanel.setLayout(new FlowLayout(5));
        topPanel.add(button1);
        topPanel.add(button2);
        topPanel.add(button3);
        topPanel.add(button4);
        mainContainer.add(topPanel, BorderLayout.NORTH);

        // WEST
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JPanel gridPanel = new JPanel();
        gridPanel.setBorder(new LineBorder(Color.YELLOW, 3));
        gridPanel.setBackground(Color.YELLOW);
        gridPanel.setLayout(new GridLayout(4,1,1,5));
        gridPanel.add(button5);
        gridPanel.add(button6);
        gridPanel.add(button7);
        gridPanel.add(button8);

        JPanel midPanel = new JPanel();
        midPanel.setLayout(new FlowLayout(4,4,4));
        midPanel.setBorder(new LineBorder(Color.BLACK, 3));
        midPanel.setBackground(Color.WHITE);
        midPanel.add(gridPanel);

        // CENTER
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");
        JButton button11 = new JButton("Button 11");

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.setBorder(new LineBorder(Color.BLACK));
        centerPanel.setBackground(Color.WHITE);


        JLabel label = new JLabel("Center Box", SwingConstants.CENTER);
        label.setOpaque(true);
        label.add(button9);
       // label.setBorder(new LineBorder(Color.BLACK, 3));

        mainContainer.add(centerPanel, BorderLayout.CENTER);
        mainContainer.add(midPanel,BorderLayout.WEST);

    }



    public void actionPerformed(ActionEvent e) {

    }
}
