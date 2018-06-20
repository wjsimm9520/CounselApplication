package counselorapplication;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Font;

public class Drawing extends JPanel{

    String z, x, c, v, b, n;
    
    public void paintComponent(Graphics g)
    {
        z = Module1.gg4.getText();
        x = Module1.gg3.getText();
        c = Module1.gg5.getText();
        v = Module1.gg1.getText();
        b = Module1.gg2.getText();
        
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(516, 335, 175, 175);
        g.setFont(new Font("Serif", Font.BOLD, 16));
        g.setColor(Color.BLACK);
        g.drawLine(518, 400, 372, 300);
        g.drawLine(519, 401, 373, 301);
        g.drawLine(517, 399, 371, 299);
        
        g.drawString(z, 352, 290);        
        
        g.drawLine(691, 401, 821, 322);
        g.drawLine(691, 400, 820, 322);
        g.drawLine(691, 402, 822, 322);
        
        g.drawString(v, 806, 310);       
        
        g.drawLine(604, 335, 604, 210);
        
        g.drawString(c, 585, 200);
        
        g.drawLine(530, 475, 394, 590);
        g.drawLine(530, 476, 395, 590);
        g.drawLine(530, 477, 396, 590);
        
        g.drawString(x, 375, 610);
        
        g.drawLine(662, 489, 820, 590);
        g.drawLine(662, 490, 821, 590);
        g.drawLine(662, 488, 822, 590);
        g.drawLine(662, 487, 819, 590);
        
        g.drawString(b, 815, 610);
        
        g.setFont(new Font("Serif", Font.BOLD, 48));
        g.drawString("YOU", 555, 435);
    } 
}
