import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class window extends JFrame {

  private JLabel heading;
  private JLabel clockLabel;

  private Font font = new Font("", Font.BOLD, 35);

  window() {
    setTitle("My Clock");
    super.setSize(400, 400);
    super.setLocation(300, 50);
    super.setVisible(true);
    this.createGui();
}

public void createGui() {
    heading = new JLabel("My Clock");
    clockLabel = new JLabel("Sameer Clock");
    
    heading.setFont(font);
    clockLabel.setFont(font);
    
    this.setLayout(new GridLayout(2, 1));
    this.add(heading);
    this.add(clockLabel);
    this.startClock();
}

  public void startClock() {
    Timer timer = new Timer( 1000,
 new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        //   String dateTime = new Date().toString();
          Date d = new Date();
          SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss");
          String dateTime = sfd.format(d);
          clockLabel.setText(dateTime);

        }
      }
    );
    timer.start();
  }
}

