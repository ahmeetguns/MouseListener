import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
   JLabel label;
   ImageIcon angry ;
   ImageIcon excited ;
   ImageIcon happy ;
   ImageIcon meme ;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);


        angry= new ImageIcon("angry.png");
        excited = new ImageIcon("excited.png");
        happy = new ImageIcon("happy.png");
        meme = new ImageIcon("meme.png");


        label.setIcon(angry);



        this.add(label);
        this.setVisible(true);
        this.setLayout(null);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(happy);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       label.setIcon(meme);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
          label.setIcon(happy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       label.setIcon(excited);
    }

    @Override
    public void mouseExited(MouseEvent e) {
     label.setIcon(angry);
    }
}
