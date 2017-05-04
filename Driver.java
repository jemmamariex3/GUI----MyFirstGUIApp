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
class Driver{
      public static void main(String[] args) {
         // build and show app using the event-dispatching thread
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               MyFirstGUIApp gui = new MyFirstGUIApp();
            }
         });
         
      }
} //end of Driver
