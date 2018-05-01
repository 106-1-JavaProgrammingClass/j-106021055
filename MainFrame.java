import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    public JButton jbtnAdd = new JButton("<--");
    public JButton jbtnLess = new JButton("-->");
    public JButton bye = new JButton("EXIT");
    public JLabel label = new JLabel("~_~");
    public int x = 20;

    public MainFrame(){
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

        label.setBounds(x,200,200,200);

        bye.setBounds(350,60,140,40);

        this.add(jbtnAdd);
        this.add(jbtnLess);
        this.add(label);
        this.add(bye);

        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=10;
                label.setLocation(x,200);
            }
        });

        jbtnLess.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=10;
                label.setLocation(x,200);
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
