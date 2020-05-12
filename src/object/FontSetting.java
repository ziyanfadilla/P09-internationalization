/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

/**
 *
 * @author asus
 */
public class FontSetting {
    private final Font font;
    
    public FontSetting(String fontName, int fontStyle, int fontSize){
        this.font =  new  Font(fontName, fontStyle, fontSize);
    }
    
    private boolean isContainer (Component comp){         
        return comp instanceof JPanel ||                 
                comp instanceof JTabbedPane ||                 
                comp instanceof JSplitPane ||                 
                comp instanceof JScrollPane ||                 
                comp instanceof JToolBar ||                
                comp instanceof JDesktopPane ||                 
                comp instanceof JInternalFrame ||                 
                comp instanceof JLayeredPane;     
    }
    
    public void changeFont(Container con) {         
        Component[] comp = con.getComponents();         
        for (Component component : comp) {             
            if(isContainer(component)){                  
                changeFont2(component);              
            }else{                 
                component.setFont(font);             
            }         
        }             
    } 
    
    
    private void changeFont2(Component c){         
        Component[] comp = ((Container) c).getComponents();         
        for (Component component : comp) {             
            if(isContainer(component)){                 
                changeFont2(component);              
            }else{                 
                component.setFont(font);             
            }         
        }     
    }

    public void selectContainer(Container contentPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
