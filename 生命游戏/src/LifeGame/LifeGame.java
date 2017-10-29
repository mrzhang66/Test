package LifeGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class LifeGame extends JFrame
{
private final World world;
public LifeGame(int rows, int columns)
   {
world = new World(rows, columns);
new Thread(world).start();
         add(world);
     }
 public static void main(String[] args) 
     {
 LifeGame frame = new LifeGame(40, 50);
 JMenuBar menu = new JMenuBar();
         frame.setJMenuBar(menu);
 JMenu options = new JMenu("Options");
         menu.add(options);
 JMenuItem triangle = options.add("triangle");
 triangle.addActionListener(frame.new TriangleActionListener());
 JMenuItem word_three = options.add("word_three");
 word_three.addActionListener(frame.new Word_threeActionListener());        
 
 frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(550, 500);
 frame.setTitle("Game of Life");
 frame.setVisible(true);
 frame.setResizable(false);
     }    
 class TriangleActionListener implements ActionListener
     {
 public void actionPerformed(ActionEvent e) 
         {
             world.settriangle();
         }
     }
 class Word_threeActionListener implements ActionListener
     {
 public void actionPerformed(ActionEvent e) 
         {
             world.setword_three();
         }
     }    
 }
