package lab7p2_evasalgado;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class main extends javax.swing.JFrame {

    public main() throws ParseException {
        initComponents();

        listaventa.setVisible(false);

        vehicle.setVisible(false);
        client.setVisible(false);
        sale.setVisible(false);
        seller.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        añadir = new javax.swing.JPanel();
        add_seller = new javax.swing.JButton();
        add_client = new javax.swing.JButton();
        add_vehicle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehicle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vh_marca = new javax.swing.JTextField();
        vh_model = new javax.swing.JTextField();
        vh_price = new javax.swing.JTextField();
        vh_añadir = new javax.swing.JButton();
        vh_color = new javax.swing.JButton();
        vh_year = new javax.swing.JTextField();
        seller = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vd_name = new javax.swing.JTextField();
        vd_add = new javax.swing.JButton();
        client = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cl_profesion = new javax.swing.JTextField();
        cl_money = new javax.swing.JTextField();
        cl_name = new javax.swing.JTextField();
        cl_age = new javax.swing.JSpinner();
        cl_añadir = new javax.swing.JButton();
        sale = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sv_seller = new javax.swing.JTextField();
        sv_vehicle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sv_vender = new javax.swing.JButton();
        sv_buyer = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaventa = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_seller.setText("Añadir Vendedor");
        add_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_sellerMouseClicked(evt);
            }
        });
        añadir.add(add_seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, 287, 90));

        add_client.setText("Añadir Cliente");
        add_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_clientMouseClicked(evt);
            }
        });
        añadir.add(add_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 348, 287, 90));

        add_vehicle.setText("Añadir Vehiculo");
        add_vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_vehicleMouseClicked(evt);
            }
        });
        añadir.add(add_vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, 287, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_evasalgado/representante.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        añadir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 120, 151, 151));

        jLabel2.setText("Carros Rayo McQueen");
        añadir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 83, 137, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese color de vehículo:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese marca de vehículo:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese modelo de vehículo:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingrese año de creación de vehículo:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingrese precio de compra de vehículo:");

        vh_añadir.setText("Añadir");
        vh_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vh_añadirMouseClicked(evt);
            }
        });

        vh_color.setBackground(new java.awt.Color(255, 51, 51));
        vh_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vh_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vehicleLayout = new javax.swing.GroupLayout(vehicle);
        vehicle.setLayout(vehicleLayout);
        vehicleLayout.setHorizontalGroup(
            vehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(vehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vh_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vh_color, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vh_model, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(vh_price, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vh_añadir)
                    .addComponent(vh_year, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        vehicleLayout.setVerticalGroup(
            vehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(vh_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(vh_color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(vh_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vh_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(vh_price, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(vh_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        añadir.add(vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 450, 540));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese el nombre del vendedor:");

        vd_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vd_add.setText("añadir");
        vd_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vd_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sellerLayout = new javax.swing.GroupLayout(seller);
        seller.setLayout(sellerLayout);
        sellerLayout.setHorizontalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(vd_add, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vd_name)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        sellerLayout.setVerticalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vd_name, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(vd_add, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(189, 189, 189))
        );

        añadir.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 550));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ingrese edad de cliente: ");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ingrese profesión de cliente: ");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ingrese cantidad de dinero disponible: ");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ingrese nombre completo de cliente: ");

        cl_añadir.setText("Añadir");
        cl_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cl_añadirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout clientLayout = new javax.swing.GroupLayout(client);
        client.setLayout(clientLayout);
        clientLayout.setHorizontalGroup(
            clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cl_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl_money, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        clientLayout.setVerticalGroup(
            clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(cl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cl_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cl_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cl_money, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cl_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        añadir.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 550));

        jTabbedPane1.addTab("Añadir", añadir);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingrese nombre de Comprador:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingrese nombre de Vendedor:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ingrese vehículo a comprar por comprador:");

        sv_vender.setText("Vender");
        sv_vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sv_venderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout saleLayout = new javax.swing.GroupLayout(sale);
        sale.setLayout(saleLayout);
        saleLayout.setHorizontalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleLayout.createSequentialGroup()
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saleLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(saleLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleLayout.createSequentialGroup()
                                .addComponent(sv_seller, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(522, 522, 522))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, saleLayout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(sv_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(saleLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(sv_vender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
            .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleLayout.createSequentialGroup()
                    .addContainerGap(600, Short.MAX_VALUE)
                    .addComponent(sv_buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)))
        );
        saleLayout.setVerticalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(sv_seller, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sv_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sv_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(saleLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(sv_buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Venta ", sale);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Vendedores");
        listaventa.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(listaventa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("listar", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Menu");

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jMenu1.add(modificar);

        eliminar.setText("Eliminar");
        jMenu1.add(eliminar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_vehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_vehicleMouseClicked
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        vehicle.setVisible(true);
        client.setVisible(false);
        sale.setVisible(false);
        seller.setVisible(false);
    }//GEN-LAST:event_add_vehicleMouseClicked

    private void vh_añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vh_añadirMouseClicked
        File vehiculos = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        double p = Double.parseDouble(vh_price.getText());
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy");

        try {
            vehiculos = new File("./vehiculos.txt/");
            fw = new FileWriter(vehiculos, true);
            bw = new BufferedWriter(fw);
            try {
                date = df.parse(vh_year.getText());
            } catch (ParseException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

            v = new vehiculo(vh_marca.getText(), vh_color.getBackground(), vh_model.getText(), date, p);

            System.out.println(v.toString());
            bw.write(v.toString());

            JOptionPane.showMessageDialog(this, "Archivos ingresados exitosamente");
            Vehiculos.add(v);

            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        vh_marca.setText("");
        vh_color.setBackground(Color.red);
        vh_model.setText("");
        vh_price.setText("");
    }//GEN-LAST:event_vh_añadirMouseClicked

    private void vh_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vh_colorMouseClicked
        vh_color.setBackground(JColorChooser.showDialog(this, "seleccione un color", Color.red));
    }//GEN-LAST:event_vh_colorMouseClicked

    private void add_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sellerMouseClicked
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        seller.setVisible(true);
        client.setVisible(false);
        vehicle.setVisible(false);
        sale.setVisible(false);

    }//GEN-LAST:event_add_sellerMouseClicked

    private void add_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_clientMouseClicked
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        seller.setVisible(false);
        client.setVisible(true);
        vehicle.setVisible(false);
        sale.setVisible(false);
    }//GEN-LAST:event_add_clientMouseClicked

    private void vd_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vd_addMouseClicked
        File vendedores = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            vendedores = new File("./vendedores.txt");
            fw = new FileWriter(vendedores, true);
            bw = new BufferedWriter(fw);
            s = new vendedor(vd_name.getText(), 0, 0);
            bw.write(s.toString());
            Vendedores.add(s);
            JOptionPane.showMessageDialog(this, "vendedor ingresado exitosamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
        vd_name.setText("");

    }//GEN-LAST:event_vd_addMouseClicked

    private void cl_añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cl_añadirMouseClicked
        File clientes = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            clientes = new File("./clientes.txt");
            double money = Double.parseDouble(cl_money.getText());
            c = new cliente(cl_name.getText(), (int) cl_age.getValue(), cl_profesion.getText(), 0, money);
            fw = new FileWriter(clientes, true);
            bw = new BufferedWriter(fw);
            bw.write(c.toString());
            bw.newLine();
            JOptionPane.showMessageDialog(this, "cliente ingresado exitosamente");
            Clientes.add(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        cl_name.setText("");
        cl_age.setValue(0);
        cl_profesion.setText("");
        cl_money.setText("");
    }//GEN-LAST:event_cl_añadirMouseClicked

    private void sv_venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sv_venderMouseClicked
        double costoV = 0;

        for (int i = 0; i < Vendedores.size() && i < Clientes.size() && i < Vehiculos.size(); i++) {
            if (Vendedores.get(i).getNombre().equals(sv_seller.getText())
                    && Clientes.get(i).getNombre().equals(sv_buyer.getText())
                    && Vehiculos.get(i).getMarca().equals(sv_vehicle.getText())) {
                if (Clientes.get(i).getSueldodisponible() <= Vehiculos.get(i).getPrecio()) {
                    costoV = Clientes.get(i).getSueldodisponible() - Vehiculos.get(i).getPrecio();
                    totventa += Vehiculos.get(i).getPrecio();
                    restsalario -= Vehiculos.get(i).getPrecio();
                    contVend++;
                    contClient++;
                    Vendedores.get(i).setCarrosvendidos(contVend);
                    Vendedores.get(i).setDinerogenerado(totventa);
                    Clientes.get(i).setSueldodisponible(restsalario);
                    Clientes.get(i).setCarroscomprados(contClient);

                    vh = new venta(sv_seller.getText(), sv_buyer.getText(), sv_vehicle.getText(), costoV);
                    JOptionPane.showMessageDialog(this, "Compra hecha correctamente");

                } else {
                    JOptionPane.showMessageDialog(this, "Salario Ingresado no es suficiente");
                }
                Ventas.add(vh);
            }
        }


    }//GEN-LAST:event_sv_venderMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed


    }//GEN-LAST:event_modificarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        listaventa.setVisible(true);
        if (listaventa.contains(null)) {
            System.out.println("Por ahora no hay nada");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy");
            double price = Double.parseDouble(vh_price.getText());
            DefaultTreeModel arbol = (DefaultTreeModel) listaventa.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
            DefaultMutableTreeNode seller;
            seller = new DefaultMutableTreeNode(Vendedores);
//            new vendedor(vd_name.getText(), contVend, totventa)
            DefaultMutableTreeNode buyer;
            buyer = new DefaultMutableTreeNode(Clientes);
//            new cliente(cl_name.getText(),
//                    (int) cl_age.getValue(), cl_profesion.getText(), contClient,
//                    Double.parseDouble(cl_money.getText()))
            DefaultMutableTreeNode vehicle = null;
            vehicle = new DefaultMutableTreeNode(Vehiculos);
//                new vehiculo(vh_marca.getText(), vh_color.getBackground(),
//                        vh_model.getText(), df.parse(vh_year.getText()), price)

            buyer.add(vehicle);
            seller.add(buyer);
            raiz.add(seller);
            arbol.reload();
        }

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    public static void main(String args[]) throws ParseException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    vehiculo v = new vehiculo();
    vendedor s = new vendedor();
    cliente c = new cliente();
    venta vh = new venta();//vh=venta hecha
    ArrayList<venta> Ventas = new ArrayList<>(); //
    ArrayList<vehiculo> Vehiculos = new ArrayList<>();
    ArrayList<vendedor> Vendedores = new ArrayList<>();
    ArrayList<cliente> Clientes = new ArrayList<>();
    int contVend = 0, contClient = 0;
    double totventa = 0, restsalario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_client;
    private javax.swing.JButton add_seller;
    private javax.swing.JButton add_vehicle;
    private javax.swing.JPanel añadir;
    private javax.swing.JSpinner cl_age;
    private javax.swing.JButton cl_añadir;
    private javax.swing.JTextField cl_money;
    private javax.swing.JTextField cl_name;
    private javax.swing.JTextField cl_profesion;
    private javax.swing.JPanel client;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree listaventa;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JPanel sale;
    private javax.swing.JPanel seller;
    private javax.swing.JTextField sv_buyer;
    private javax.swing.JTextField sv_seller;
    private javax.swing.JTextField sv_vehicle;
    private javax.swing.JButton sv_vender;
    private javax.swing.JButton vd_add;
    private javax.swing.JTextField vd_name;
    private javax.swing.JPanel vehicle;
    private javax.swing.JButton vh_añadir;
    private javax.swing.JButton vh_color;
    private javax.swing.JTextField vh_marca;
    private javax.swing.JTextField vh_model;
    private javax.swing.JTextField vh_price;
    private javax.swing.JTextField vh_year;
    // End of variables declaration//GEN-END:variables
}
