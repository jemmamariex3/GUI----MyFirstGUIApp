/*
Jemma Tiongson
Section #16031
App: Driver.java (MyFirstGUI App)
Purpose: Demonstrate GUI
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java MyFirstGUIApp.java
   Run: java Driver
_________________________________________________________________________
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

//abstract window toolkit (awt)
import java.awt.BorderLayout;
import java.awt.Dimension;

//awt events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstGUIApp {
   //member variables
   private JFrame frame;
   private JPanel panel;
   private JScrollPane scrollPane;
   private JDesktopPane desktop;
   private JSplitPane splitPane;
   private JPanel labelPanel;
   private JLabel statusLabel;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu helpMenu;
   private JMenuItem exitItem;
   private JMenuItem aboutItem;
   
   //constructor
   public MyFirstGUIApp() {
      initComponents();
      statusLabel.setText("Initialization Complete.");
   
   //create GUI and make it visible to user
   public void initComponents() {
      try {
         UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName()
         );
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      //new frame and title
      frame.setDefaultLookAndFeelDecorated(true);
      frame = new JFrame("Jemma's GUI Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      
      //buildDesktop()
      desktop = new JDesktopPane();
      scrollPane = new JScrollPane();
      statusLabel = new JLabel();
      panel = new JPanel();
      labelPanel = new JPanel();
      
      //set border size and layout
      labelPanel.setLayout(new BorderLayout());
      statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
      statusLabel.setMinimumSize(new Dimension(0, 18));
      statusLabel.setPreferredSize(new Dimension(0, 18));
   
      //buildMenu()
      menuBar = new JMenuBar();
      fileMenu = new JMenu("File");
      helpMenu = new JMenu("Help");
      exitItem = new JMenuItem("Exit");
      aboutItem = new JMenuItem("About");
      fileMenu.add(exitItem);
      helpMenu.add(aboutItem);
      menuBar.add(fileMenu);
      menuBar.add(helpMenu);
   
      //setup panel
      panel.setLayout(new BorderLayout());
      splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
      splitPane.setOneTouchExpandable(true);
      splitPane.setDividerLocation(200);
      splitPane.setContinuousLayout(true);
   
      splitPane.add(desktop, JSplitPane.RIGHT);
      splitPane.add(scrollPane, JSplitPane.LEFT);
   
      panel.add(splitPane, BorderLayout.CENTER);
      labelPanel.add(statusLabel, BorderLayout.CENTER);
   
      // setup and show frame
      frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
      frame.getContentPane().add(panel, BorderLayout.CENTER);
      
      // show GUI
      frame.setSize(1280, 800);
      frame.setJMenuBar(menuBar);
      frame.setVisible(true);
   } //end of initComponents
   
   // listener for exit menu item
   exitItem.addActionListener(
      new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            exitActionPerformed();
         }
      }
   );
   
   // add listener for about menu item
   aboutItem.addActionListener(
      new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            aboutActionPerformed();
         }
      }
   );
   public void exitActionPerformed(){
      frame.dispose();
   }
   
   public void aboutActionPerformed(){
      pane = new JOptionPane();
      pane.showMessageDialog(null, "thanks for using app!");
   }
} //end of MyFirstGUIApp
   
   