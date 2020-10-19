/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.*;

/**
 *
 * @author Adolfo
 */
public class ImagenPrincipal extends Container {

    public Image imagen;
    public ImageIcon icono;
    public JLabel labelTitulo;

    public ImagenPrincipal() {
        
        imagen = new ImageIcon("C:\\Users\\Adolfo\\Pictures\\spotify\\Screenshot (6).jpg").getImage();
        icono = new ImageIcon(imagen);
        
        /*
        labelTitulo = new JLabel();
        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("IMAGEN DE FONDO");
        labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        labelTitulo.setBounds(20, 10, 300, 40);
        add(labelTitulo);
         */
    }

    public void paint(Graphics g) {
        Rectangle r = g.getClipBounds();
        g.setColor(this.getBackground());
        g.fillRect(r.x, r.y, r.width, r.height);
        g.drawImage(icono.getImage(), 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
        super.paint(g);
    }
}
