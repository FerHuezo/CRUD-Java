/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Vista.frmProductos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
        
public class ctrlProducto implements MouseListener {
    private frmProductos vista;
    private Producto modelo;
    
    public ctrlProducto (frmProductos Vista, Producto Modelo){
        this.vista = Vista;
        this.modelo = Modelo;
        vista.btnGuardar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnGuardar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            modelo.setCategoria(vista.txtCategoria.getText());
        }
        modelo.Guardar();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
