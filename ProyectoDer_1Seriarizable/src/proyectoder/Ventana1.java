/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoder;

import controlador.Controlador;
import proyectoder.Cliente;
import proyectoder.Juegos;
import proyectoder.Disco;
import proyectoder.Consola;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author Patricia Burgos
 */
public class Ventana1 extends javax.swing.JFrame {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Juegos> listaJuegos;
    private ArrayList<Disco> listaDiscos;
    private ArrayList<Consola> listaConsola;

 

   

    /**
     * Creates new form Ventana1
     */
    public Ventana1() throws IOException, FileNotFoundException, ClassNotFoundException, NotSerializableException, SAXException {
        initComponents();
        
        
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_ciudad = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ciudad = new javax.swing.JTable();
        jButton_aniadir_ciudad = new javax.swing.JButton();
        jButton_modificar_ciudad = new javax.swing.JButton();
        jButton_borrar_ciudad = new javax.swing.JButton();
        jLabel_nombre_ciudad = new javax.swing.JLabel();
        jLabel_pais = new javax.swing.JLabel();
        jLabel_num_habitantes = new javax.swing.JLabel();
        jTextField_nombre_ciudad = new javax.swing.JTextField();
        jTextField_pais = new javax.swing.JTextField();
        jTextField_num_habitantes = new javax.swing.JTextField();
        jButton_guardar_ciudad = new javax.swing.JButton();
        jButton_cancelar_ciudad = new javax.swing.JButton();
        jLabel_num_habitantes1 = new javax.swing.JLabel();
        jTextField_num_habitantes1 = new javax.swing.JTextField();
        jPanel_biblioteca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_biblioteca = new javax.swing.JTable();
        jLabel_nombre_biblioteca = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_nombre_biblioteca = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jButton_guardar_biblioteca = new javax.swing.JButton();
        jButton_cancelar_biblioteca = new javax.swing.JButton();
        jButton_aniadir_biblioteca = new javax.swing.JButton();
        jButton_modificar_biblioteca = new javax.swing.JButton();
        jButton_borrar_biblioteca = new javax.swing.JButton();
        jLabel_ciudades_bibliotecas = new javax.swing.JLabel();
        jTextField_direccion1 = new javax.swing.JTextField();
        jPanel_libro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_libro = new javax.swing.JTable();
        jLabel_nombre_libro = new javax.swing.JLabel();
        jLabel_autor = new javax.swing.JLabel();
        jTextField_nombre_libro = new javax.swing.JTextField();
        jTextField_autor = new javax.swing.JTextField();
        jButton_guardar_libro = new javax.swing.JButton();
        jButton_cancelar_libro = new javax.swing.JButton();
        jButton_borrar_libro = new javax.swing.JButton();
        jButton_modificar_libro = new javax.swing.JButton();
        jButton_aniadir_libro = new javax.swing.JButton();
        jPanel_persona = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_persona = new javax.swing.JTable();
        jLabel_nombre_persona = new javax.swing.JLabel();
        jLabel_DNI = new javax.swing.JLabel();
        jLabel_edad_persona = new javax.swing.JLabel();
        jTextField_edad_persona = new javax.swing.JTextField();
        jTextField_nombre_persona = new javax.swing.JTextField();
        jTextField_DNI = new javax.swing.JTextField();
        jButton_guardar_persona = new javax.swing.JButton();
        jButton_cancelar_persona = new javax.swing.JButton();
        jButton_borrar_persona = new javax.swing.JButton();
        jButton_modificar_persona = new javax.swing.JButton();
        jButton_aniadir_persona = new javax.swing.JButton();
        jLabel_ciudad_natal = new javax.swing.JLabel();
        jTextField_ciudad_natal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                //formWindowClosing(evt);
            }
        });

        jTable_ciudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "Nombre", "Apellidos", "Anio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ciudadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_ciudad);
        if (jTable_ciudad.getColumnModel().getColumnCount() > 0) {
            jTable_ciudad.getColumnModel().getColumn(1).setResizable(false);
            jTable_ciudad.getColumnModel().getColumn(2).setResizable(false);
            jTable_ciudad.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton_aniadir_ciudad.setText("Añadir");
        jButton_aniadir_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_ciudadActionPerformed(evt);
            }
        });

        jButton_modificar_ciudad.setText("Modificar");
        jButton_modificar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_ciudadActionPerformed(evt);
            }
        });

        jButton_borrar_ciudad.setText("Borrar");
        jButton_borrar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_ciudadActionPerformed(evt);
            }
        });

        jLabel_nombre_ciudad.setText("IdCliente");

        jLabel_pais.setText("Nombre");

        jLabel_num_habitantes.setText("Apellidos");

        jTextField_nombre_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_ciudadActionPerformed(evt);
            }
        });

        jTextField_num_habitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_num_habitantesActionPerformed(evt);
            }
        });

        jButton_guardar_ciudad.setText("Guardar");
        jButton_guardar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_ciudadActionPerformed(evt);
            }
        });

        jButton_cancelar_ciudad.setText("Cancelar");
        jButton_cancelar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_ciudadActionPerformed(evt);
            }
        });

        jLabel_num_habitantes1.setText("Año");

        jTextField_num_habitantes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_num_habitantes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ciudadLayout = new javax.swing.GroupLayout(jPanel_ciudad);
        jPanel_ciudad.setLayout(jPanel_ciudadLayout);
        jPanel_ciudadLayout.setHorizontalGroup(
            jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_ciudad)
                            .addComponent(jLabel_pais)
                            .addComponent(jLabel_num_habitantes)
                            .addComponent(jLabel_num_habitantes1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombre_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_pais)
                            .addComponent(jTextField_num_habitantes)
                            .addComponent(jTextField_num_habitantes1))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_guardar_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                    .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ciudadLayout.setVerticalGroup(
            jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_ciudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_ciudad))
                    .addGroup(jPanel_ciudadLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre_ciudad)
                    .addComponent(jTextField_nombre_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pais)
                    .addComponent(jTextField_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar_ciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cancelar_ciudad)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_num_habitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_num_habitantes)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_num_habitantes1)
                    .addComponent(jTextField_num_habitantes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Cliente", jPanel_ciudad);

        jTable_biblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id juego", "Nombre", "Pegi", "Empresa desarrollo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_bibliotecaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_biblioteca);
        if (jTable_biblioteca.getColumnModel().getColumnCount() > 0) {
            jTable_biblioteca.getColumnModel().getColumn(0).setResizable(false);
            jTable_biblioteca.getColumnModel().getColumn(1).setResizable(false);
            jTable_biblioteca.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel_nombre_biblioteca.setText("Id juego");

        jLabel_telefono.setText("Nombre");

        jLabel_direccion.setText("Pegi");

        jTextField_nombre_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_bibliotecaActionPerformed(evt);
            }
        });

        jTextField_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonoActionPerformed(evt);
            }
        });

        jTextField_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direccionActionPerformed(evt);
            }
        });

        jButton_guardar_biblioteca.setText("Guardar");
        jButton_guardar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_bibliotecaActionPerformed(evt);
            }
        });

        jButton_cancelar_biblioteca.setText("Cancelar");
        jButton_cancelar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_bibliotecaActionPerformed(evt);
            }
        });

        jButton_aniadir_biblioteca.setText("Añadir");
        jButton_aniadir_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_bibliotecaActionPerformed(evt);
            }
        });

        jButton_modificar_biblioteca.setText("Modificar");
        jButton_modificar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_bibliotecaActionPerformed(evt);
            }
        });

        jButton_borrar_biblioteca.setText("Borrar");
        jButton_borrar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_bibliotecaActionPerformed(evt);
            }
        });

        jLabel_ciudades_bibliotecas.setText("Empresa desarrollo");

        jTextField_direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direccion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bibliotecaLayout = new javax.swing.GroupLayout(jPanel_biblioteca);
        jPanel_biblioteca.setLayout(jPanel_bibliotecaLayout);
        jPanel_bibliotecaLayout.setHorizontalGroup(
            jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_biblioteca)
                            .addComponent(jLabel_telefono)
                            .addComponent(jLabel_direccion)
                            .addComponent(jLabel_ciudades_bibliotecas))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombre_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_telefono)
                            .addComponent(jTextField_direccion)
                            .addComponent(jTextField_direccion1))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_guardar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_bibliotecaLayout.setVerticalGroup(
            jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_biblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_biblioteca))
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre_biblioteca)
                    .addComponent(jTextField_nombre_biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_telefono)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar_biblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar_biblioteca))
                .addGap(18, 18, 18)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ciudades_bibliotecas)
                    .addComponent(jTextField_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Juegos", jPanel_biblioteca);

        jTable_libro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id disco", "Capacidad"
            }
        ));
        jTable_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_libroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_libro);
        if (jTable_libro.getColumnModel().getColumnCount() > 0) {
            jTable_libro.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel_nombre_libro.setText("Id disco");

        jLabel_autor.setText("Capacidad");

        jTextField_nombre_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_libroActionPerformed(evt);
            }
        });

        jTextField_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_autorActionPerformed(evt);
            }
        });

        jButton_guardar_libro.setText("Guardar");
        jButton_guardar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_libroActionPerformed(evt);
            }
        });

        jButton_cancelar_libro.setText("Cancelar");
        jButton_cancelar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_libroActionPerformed(evt);
            }
        });

        jButton_borrar_libro.setText("Borrar");
        jButton_borrar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_libroActionPerformed(evt);
            }
        });

        jButton_modificar_libro.setText("Modificar");
        jButton_modificar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_libroActionPerformed(evt);
            }
        });

        jButton_aniadir_libro.setText("Añadir");
        jButton_aniadir_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_libroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_libroLayout = new javax.swing.GroupLayout(jPanel_libro);
        jPanel_libro.setLayout(jPanel_libroLayout);
        jPanel_libroLayout.setHorizontalGroup(
            jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_libroLayout.createSequentialGroup()
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_libro)
                            .addComponent(jLabel_autor))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_nombre_libro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_autor, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_guardar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_libroLayout.setVerticalGroup(
            jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_libroLayout.createSequentialGroup()
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_libro))
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_guardar_libro)
                    .addComponent(jTextField_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombre_libro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar_libro)
                    .addComponent(jTextField_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_autor))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Disco", jPanel_libro);

        jTable_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id consola", "nombre", "marca", "memoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_persona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_personaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_persona);
        if (jTable_persona.getColumnModel().getColumnCount() > 0) {
            jTable_persona.getColumnModel().getColumn(0).setResizable(false);
            jTable_persona.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel_nombre_persona.setText("IdConsola");

        jLabel_DNI.setText("Nombre:");

        jLabel_edad_persona.setText("Marca");

        jTextField_edad_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_edad_personaActionPerformed(evt);
            }
        });

        jTextField_nombre_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_personaActionPerformed(evt);
            }
        });

        jTextField_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DNIActionPerformed(evt);
            }
        });

        jButton_guardar_persona.setText("Guardar");
        jButton_guardar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_personaActionPerformed(evt);
            }
        });

        jButton_cancelar_persona.setText("Cancelar");
        jButton_cancelar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_personaActionPerformed(evt);
            }
        });

        jButton_borrar_persona.setText("Borrar");
        jButton_borrar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_personaActionPerformed(evt);
            }
        });

        jButton_modificar_persona.setText("Modificar");
        jButton_modificar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_personaActionPerformed(evt);
            }
        });

        jButton_aniadir_persona.setText("Añadir");
        jButton_aniadir_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_personaActionPerformed(evt);
            }
        });

        jLabel_ciudad_natal.setText("Memoria");

        jTextField_ciudad_natal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ciudad_natalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_personaLayout = new javax.swing.GroupLayout(jPanel_persona);
        jPanel_persona.setLayout(jPanel_personaLayout);
        jPanel_personaLayout.setHorizontalGroup(
            jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personaLayout.createSequentialGroup()
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_persona)
                            .addComponent(jLabel_DNI)
                            .addComponent(jLabel_edad_persona)
                            .addComponent(jLabel_ciudad_natal))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombre_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_DNI)
                            .addComponent(jTextField_edad_persona)
                            .addComponent(jTextField_ciudad_natal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_guardar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_personaLayout.setVerticalGroup(
            jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personaLayout.createSequentialGroup()
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_persona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_persona))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre_persona)
                    .addComponent(jTextField_nombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DNI)
                    .addComponent(jTextField_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar_persona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_edad_persona)
                    .addComponent(jTextField_edad_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar_persona))
                .addGap(18, 18, 18)
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ciudad_natal)
                    .addComponent(jTextField_ciudad_natal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Consola", jPanel_persona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Ciudad");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_aniadir_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aniadir_libroActionPerformed
        String idDisco = jTextField_nombre_libro.getText();
        if (existeIdDisco(idDisco)) {
            JOptionPane.showMessageDialog(this, "El id del disco ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }     
        int capacidad;
        
        try {
             capacidad = Integer.parseInt(jTextField_autor.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La capacidad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        
        DefaultTableModel disquete = (DefaultTableModel) jTable_libro.getModel();
        disquete.addRow(new Object[] { idDisco, capacidad});

        jTextField_nombre_libro.setText("");
        jTextField_autor.setText("");
        
        
        ArrayList<Disco> listaDisco = obtenerDatosTablaDisco(disquete);        
        Controlador DiscosXML = new Controlador();       
        DiscosXML.EscribirDiscoXML(listaDisco);
    }//GEN-LAST:event_jButton_aniadir_libroActionPerformed
    private ArrayList<Disco> obtenerDatosTablaDisco(DefaultTableModel disquitos){
    ArrayList<Disco> listaDiscos = new ArrayList<>();
    
    for (int row = 0; row < disquitos.getRowCount(); row++){
        String idDisco = disquitos.getValueAt(row, 0).toString();
        int capacidad = Integer.parseInt(disquitos.getValueAt(row, 1).toString());
        
        Disco disco = new Disco(idDisco, capacidad);
        listaDiscos.add(disco);
    }
    return listaDiscos;
    }
    private void jButton_modificar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_modificar_libroActionPerformed

    private void jButton_borrar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_libroActionPerformed
        int selectedRow = jTable_libro.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel disquillo = (DefaultTableModel) jTable_libro.getModel();
            String idDiscoEliminar = (String) disquillo.getValueAt(selectedRow, 0); 
            System.out.println("Aqui peta");
            Controlador DiscoXML = new Controlador();
            listaDiscos = DiscoXML.inicializarDiscosDesdeXML();
            DiscoXML.eliminarDiscoDelXML(listaDiscos, idDiscoEliminar);

            disquillo.removeRow(selectedRow);
            System.out.println("Aqui peta 2");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_jButton_borrar_libroActionPerformed

    private void jButton_cancelar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelar_libroActionPerformed

    private void jButton_guardar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_guardar_libroActionPerformed

    private void jTextField_nombre_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombre_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombre_libroActionPerformed

    private void jTable_libroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_libroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_libroMouseClicked

    private void jButton_borrar_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_bibliotecaActionPerformed
        int selectedRow = jTable_biblioteca.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable_biblioteca.getModel();
            String idJuegoEliminar = (String) tableModel.getValueAt(selectedRow, 0); 
            System.out.println("Aqui peta");
            Controlador juegosXML = new Controlador();
            listaJuegos = juegosXML.inicializarJuegosDesdeXML();
            juegosXML.eliminarJuegoDelXML(listaJuegos, idJuegoEliminar);

            tableModel.removeRow(selectedRow);
            System.out.println("Aqui peta 2");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }            
    }//GEN-LAST:event_jButton_borrar_bibliotecaActionPerformed

    private void jButton_modificar_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_bibliotecaActionPerformed
        int selectedRow = jTable_biblioteca.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable_biblioteca.getModel();
            String idJuegoModificar = (String) tableModel.getValueAt(selectedRow, 0); 

            String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
            String nuevaEmpresa = JOptionPane.showInputDialog("Nueva empresa:");
            int nuevoPegi = Integer.parseInt(JOptionPane.showInputDialog("Nuevo PEGI:"));

            Juegos juegoModificado = new Juegos(idJuegoModificar, nuevoNombre, nuevaEmpresa, nuevoPegi);

            Controlador controlador = new Controlador();
            controlador.modificarJuegosEnXML(listaJuegos, juegoModificado);

            tableModel.setValueAt(nuevoNombre, selectedRow, 1); 
            tableModel.setValueAt(nuevaEmpresa, selectedRow, 2); 
            tableModel.setValueAt(nuevoPegi, selectedRow, 3); 
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un juego para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_modificar_bibliotecaActionPerformed

    private void jButton_aniadir_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aniadir_bibliotecaActionPerformed
        String idJuego = jTextField_nombre_biblioteca.getText();
        if (existeIdJuego(idJuego)) {
            JOptionPane.showMessageDialog(this, "El id del juego ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }     
        String nombre = jTextField_telefono.getText();
        int pegi;
        String empresaDesarrollo = jTextField_direccion1.getText();

        try {
             pegi = Integer.parseInt(jTextField_direccion.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El pegi debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable_biblioteca.getModel();
        tableModel.addRow(new Object[] { idJuego, nombre, pegi, empresaDesarrollo });

        jTextField_nombre_biblioteca.setText("");
        jTextField_telefono.setText("");
        jTextField_direccion.setText("");
        jTextField_direccion1.setText("");
        
        ArrayList<Juegos> listaJuegos = obtenerDatosDeTablaJuegos(tableModel);        
        Controlador juegosXML = new Controlador();       
        juegosXML.EscribirJuegosXML(listaJuegos);
    }//GEN-LAST:event_jButton_aniadir_bibliotecaActionPerformed

    private ArrayList<Juegos> obtenerDatosDeTablaJuegos(DefaultTableModel juegosi) {
    ArrayList<Juegos> listaJuegos = new ArrayList<>();

    for (int row = 0; row < juegosi.getRowCount(); row++) {
        String idJuego = juegosi.getValueAt(row, 0).toString();
        String nombre = juegosi.getValueAt(row, 1).toString();
        String empresaDesarrollo = juegosi.getValueAt(row, 3).toString();
        int pegi = Integer.parseInt(juegosi.getValueAt(row, 2).toString());

        Juegos juego = new Juegos(idJuego, nombre, empresaDesarrollo, pegi);
        listaJuegos.add(juego);
    }

    return listaJuegos;
}
    
    private void jButton_cancelar_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_bibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelar_bibliotecaActionPerformed

    private void jButton_guardar_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_bibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_guardar_bibliotecaActionPerformed

    private void jTextField_nombre_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombre_bibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombre_bibliotecaActionPerformed

    private void jTable_bibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_bibliotecaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_bibliotecaMouseClicked

    private void jButton_cancelar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelar_ciudadActionPerformed

    private void jButton_guardar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_ciudadActionPerformed
        
    }//GEN-LAST:event_jButton_guardar_ciudadActionPerformed
    private boolean existeIdCliente(String idCliente) {
    DefaultTableModel tableModel = (DefaultTableModel) jTable_ciudad.getModel();
    int rowCount = tableModel.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        String existingIdCliente = (String) tableModel.getValueAt(i, 0);
        if (idCliente.equals(existingIdCliente)) {
            return true; 
        }
    }
    return false; 
}

    private boolean existeIdJuego(String idJuego) {
    DefaultTableModel juegosi = (DefaultTableModel) jTable_biblioteca.getModel();
    int rowCount = juegosi.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        String existingIdJuegos = (String) juegosi.getValueAt(i, 0);
        if (idJuego.equals(existingIdJuegos)) {
            return true; 
        }
    }
    return false; 
}
    
    private boolean existeIdDisco(String idDisco){
        DefaultTableModel disquete = (DefaultTableModel) jTable_libro.getModel();
    int rowCount = disquete.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        String existingIdDisco = (String) disquete.getValueAt(i, 0);
        if (idDisco.equals(existingIdDisco)) {
            return true; 
        }
    }
    return false; 
    }
    private void jTextField_nombre_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombre_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombre_ciudadActionPerformed

    private void jButton_borrar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_ciudadActionPerformed
        int selectedRow = jTable_ciudad.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable_ciudad.getModel();
            String idClienteEliminar = (String) tableModel.getValueAt(selectedRow, 0); 
            System.out.println("Aqui peta");
            Controlador clienteXML = new Controlador();
            listaClientes = clienteXML.inicializarClientesDesdeXML();
            clienteXML.eliminarClienteDelXML(listaClientes, idClienteEliminar);

            tableModel.removeRow(selectedRow);
            System.out.println("Aqui peta 2");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_jButton_borrar_ciudadActionPerformed

    private void jButton_modificar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_ciudadActionPerformed
        int selectedRow = jTable_ciudad.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable_ciudad.getModel();
            String idClienteModificar = (String) tableModel.getValueAt(selectedRow, 0); 

            String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
            String nuevosApellidos = JOptionPane.showInputDialog("Nuevos apellidos:");
            int nuevoAnio = Integer.parseInt(JOptionPane.showInputDialog("Nuevo año de nacimiento:"));
 
            Cliente clienteModificado = new Cliente(idClienteModificar, nuevoNombre, nuevosApellidos, nuevoAnio);

            Controlador controlador = new Controlador();
            controlador.modificarClienteEnXML(listaClientes, clienteModificado);

            tableModel.setValueAt(nuevoNombre, selectedRow, 1); 
            tableModel.setValueAt(nuevosApellidos, selectedRow, 2); 
            tableModel.setValueAt(nuevoAnio, selectedRow, 3); 
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un cliente para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_modificar_ciudadActionPerformed

    private void jButton_aniadir_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aniadir_ciudadActionPerformed
    
        String idCliente = jTextField_nombre_ciudad.getText();
        if (existeIdCliente(idCliente)) {
            JOptionPane.showMessageDialog(this, "El idCliente ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = jTextField_pais.getText();
        String apellidos = jTextField_num_habitantes.getText();
        int anio;

        try {
            anio = Integer.parseInt(jTextField_num_habitantes1.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El año debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable_ciudad.getModel();
        tableModel.addRow(new Object[] { idCliente, nombre, apellidos, anio });

        jTextField_nombre_ciudad.setText("");
        jTextField_pais.setText("");
        jTextField_num_habitantes.setText("");
        jTextField_num_habitantes1.setText("");

        ArrayList<Cliente> listaClientes = obtenerDatosDeTablaCliente(tableModel);
        Controlador controlador = new Controlador();
        controlador.escribirClienteXML(listaClientes);
    
}
    
private ArrayList<Cliente> obtenerDatosDeTablaCliente(DefaultTableModel tableModel) {
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    for (int row = 0; row < tableModel.getRowCount(); row++) {
        String idCliente = tableModel.getValueAt(row, 0).toString();
        String nombre = tableModel.getValueAt(row, 1).toString();
        String apellidos = tableModel.getValueAt(row, 2).toString();
        int anio = Integer.parseInt(tableModel.getValueAt(row, 3).toString());

        Cliente cliente = new Cliente(idCliente, nombre, apellidos, anio);
        listaClientes.add(cliente);
    }
    return listaClientes;
    }//GEN-LAST:event_jButton_aniadir_ciudadActionPerformed

    private void jTable_ciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ciudadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ciudadMouseClicked

    private void jButton_aniadir_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aniadir_personaActionPerformed
        String idConsola = jTextField_nombre_persona.getText();
        /*if (existeIdCliente(idCliente)) {
            JOptionPane.showMessageDialog(this, "El idCliente ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }*/
        String nombre = jTextField_DNI.getText();
        String marca = jTextField_edad_persona.getText();
        int memoria;

        try {
            memoria = Integer.parseInt(jTextField_ciudad_natal.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La memoria debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel consolilla = (DefaultTableModel) jTable_persona.getModel();
        consolilla.addRow(new Object[] { idConsola, nombre, marca, memoria });

        jTextField_nombre_persona.setText("");
        jTextField_DNI.setText("");
        jTextField_edad_persona.setText("");
        jTextField_ciudad_natal.setText("");

        ArrayList<Consola> listaConsola = obtenerDatosTablaConsola(consolilla);
        Controlador consolaXML = new Controlador();
        consolaXML.EscribirConsola(listaConsola);
    }//GEN-LAST:event_jButton_aniadir_personaActionPerformed
    private ArrayList<Consola> obtenerDatosTablaConsola(DefaultTableModel consolilla){
    ArrayList<Consola> listaConsola = new ArrayList<>();
        for (int row = 0; row < consolilla.getRowCount(); row++){
            String idConsola = consolilla.getValueAt(row, 0).toString();
            String nombre = consolilla.getValueAt(row, 1).toString(); // Debe ser la columna 1
            String marca = consolilla.getValueAt(row, 2).toString(); // Debe ser la columna 2
            int memoria = Integer.parseInt(consolilla.getValueAt(row, 3).toString()); // Aquí se intenta convertir la columna 1 a entero

            Consola consola = new Consola(idConsola, nombre, marca, memoria);
            listaConsola.add(consola);
        }
        return listaConsola;
    
    
    }
    private void jButton_modificar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_modificar_personaActionPerformed

    private void jButton_borrar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_personaActionPerformed
        int selectedRow = jTable_persona.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel disquillo = (DefaultTableModel) jTable_persona.getModel();
            String idConsolaEliminar = (String) disquillo.getValueAt(selectedRow, 0); 
            System.out.println("Aqui peta");
            Controlador ConsolaXML = new Controlador();
            listaConsola = ConsolaXML.inicializarConsolaDesdeXML();
            ConsolaXML.eliminarConsolaDelXML(listaConsola, idConsolaEliminar);

            disquillo.removeRow(selectedRow);
            System.out.println("Aqui peta 2");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_jButton_borrar_personaActionPerformed

    private void jButton_cancelar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelar_personaActionPerformed

    private void jButton_guardar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_guardar_personaActionPerformed

    private void jTextField_nombre_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombre_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombre_personaActionPerformed

    private void jTable_personaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_personaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_personaMouseClicked

    private void jTextField_num_habitantes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_num_habitantes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_num_habitantes1ActionPerformed

    private void jTextField_num_habitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_num_habitantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_num_habitantesActionPerformed

    private void jTextField_direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccion1ActionPerformed

    private void jTextField_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionActionPerformed

    private void jTextField_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoActionPerformed

    private void jTextField_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_autorActionPerformed

    private void jTextField_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DNIActionPerformed

    private void jTextField_edad_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_edad_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_edad_personaActionPerformed

    private void jTextField_ciudad_natalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ciudad_natalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ciudad_natalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aniadir_biblioteca;
    private javax.swing.JButton jButton_aniadir_ciudad;
    private javax.swing.JButton jButton_aniadir_libro;
    public javax.swing.JButton jButton_aniadir_persona;
    private javax.swing.JButton jButton_borrar_biblioteca;
    private javax.swing.JButton jButton_borrar_ciudad;
    private javax.swing.JButton jButton_borrar_libro;
    public javax.swing.JButton jButton_borrar_persona;
    private javax.swing.JButton jButton_cancelar_biblioteca;
    private javax.swing.JButton jButton_cancelar_ciudad;
    public javax.swing.JButton jButton_cancelar_libro;
    private javax.swing.JButton jButton_cancelar_persona;
    private javax.swing.JButton jButton_guardar_biblioteca;
    private javax.swing.JButton jButton_guardar_ciudad;
    public javax.swing.JButton jButton_guardar_libro;
    private javax.swing.JButton jButton_guardar_persona;
    private javax.swing.JButton jButton_modificar_biblioteca;
    private javax.swing.JButton jButton_modificar_ciudad;
    private javax.swing.JButton jButton_modificar_libro;
    public javax.swing.JButton jButton_modificar_persona;
    private javax.swing.JLabel jLabel_DNI;
    private javax.swing.JLabel jLabel_autor;
    private javax.swing.JLabel jLabel_ciudad_natal;
    private javax.swing.JLabel jLabel_ciudades_bibliotecas;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_edad_persona;
    private javax.swing.JLabel jLabel_nombre_biblioteca;
    private javax.swing.JLabel jLabel_nombre_ciudad;
    private javax.swing.JLabel jLabel_nombre_libro;
    private javax.swing.JLabel jLabel_nombre_persona;
    private javax.swing.JLabel jLabel_num_habitantes;
    private javax.swing.JLabel jLabel_num_habitantes1;
    private javax.swing.JLabel jLabel_pais;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JPanel jPanel_biblioteca;
    private javax.swing.JPanel jPanel_ciudad;
    private javax.swing.JPanel jPanel_libro;
    private javax.swing.JPanel jPanel_persona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable_biblioteca;
    private javax.swing.JTable jTable_ciudad;
    private javax.swing.JTable jTable_libro;
    public javax.swing.JTable jTable_persona;
    private javax.swing.JTextField jTextField_DNI;
    private javax.swing.JTextField jTextField_autor;
    private javax.swing.JTextField jTextField_ciudad_natal;
    public javax.swing.JTextField jTextField_direccion;
    public javax.swing.JTextField jTextField_direccion1;
    private javax.swing.JTextField jTextField_edad_persona;
    public javax.swing.JTextField jTextField_nombre_biblioteca;
    public javax.swing.JTextField jTextField_nombre_ciudad;
    private javax.swing.JTextField jTextField_nombre_libro;
    private javax.swing.JTextField jTextField_nombre_persona;
    public javax.swing.JTextField jTextField_num_habitantes;
    public javax.swing.JTextField jTextField_num_habitantes1;
    public javax.swing.JTextField jTextField_pais;
    public javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
    //private ArrayList<Ciudad> ciudades;
   // private Ciudad ciudad_modificar;
    private DefaultTableModel table_model_ciudad;    
    private Boolean modif_ciudad;
    private int id_ciudad;
    
    //private ArrayList<Biblioteca> bibliotecas;
   // private Biblioteca biblioteca_modificar;
    private DefaultTableModel table_model_biblioteca;    
    private Boolean modif_biblioteca;
    private int id_biblioteca;
    
    //private ArrayList<Libro> libros;
    //private Libro libro_modificar;
    private DefaultTableModel table_model_libro;    
    private Boolean modif_libro;
    private int id_libro;
    
    //private ArrayList<Persona> personas;
    //private Persona persona_modificar;
    private DefaultTableModel table_model_persona;    
    private Boolean modif_persona;
    private int id_persona;
}
