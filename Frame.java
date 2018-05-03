package NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    public JButton jbtnAdd = new JButton("Add");
    public JButton jbtnLess = new JButton("Less");
    public JButton EXIT = new JButton("EXIT");
    public int count = 0;

    public Frame() {
        suck();
    }
    public void suck() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);//**
        this.setLocation(100,50);
        this.setSize(800,600);

        jbtnAdd.setLocation(50,60);
        jbtnAdd.setSize(140,40);

        jbtnLess.setLocation(200,60);
        jbtnLess.setSize(140,40);

        EXIT.setLocation(350,60);
        EXIT.setSize(140,40);

        this.add(jbtnAdd);
        this.add(jbtnLess);
        this.add(EXIT);

        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                Frame.this.setTitle(Integer.toString(count));
            }
        });
        jbtnLess.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                Frame.this.setTitle(Integer.toString(count));
            }
        });
        EXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

