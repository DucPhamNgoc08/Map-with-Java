/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Waypoint;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Duc Pham Ngoc
 */
public class ButtonWaypoint extends JButton {
    
    public ButtonWaypoint() {
        setContentAreaFilled(false);
        setIcon(new ImageIcon(getClass().getResource("/icon/pin-png-25.png")));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(24, 24));
    }
}
