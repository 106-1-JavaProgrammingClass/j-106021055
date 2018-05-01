import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame{
    public JButton jbtnAdd = new JButton("Add");
    public JButton jbtnLess = new JButton("Sub");
    public JButton bye = new JButton("EXIT");

    public int count = 0 ;

    public Frame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbtnAdd.setLocation(50,60);
        jbtnAdd.setSize(140,40);

        jbtnLess.setLocation(200,60);
        jbtnLess.setSize(140,40);



        bye.setBounds(350,60,140,40);

        this.add(jbtnAdd);
        this.add(jbtnLess);

        this.add(bye);

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

        bye.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
