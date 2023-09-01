package lab7p2_evasalgado;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {
    
    public main() {
        initComponents();
        vehicle.setVisible(false);
        client.setVisible(false);
        sale.setVisible(false);
        seller.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
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
        vh_year = new com.toedter.calendar.JDateChooser();
        seller = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vd_name = new javax.swing.JTextField();
        vd_add = new javax.swing.JButton();
        client = new javax.swing.JPanel();
        sale = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        listar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_seller.setText("Añadir Vendedor");
        add_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_sellerMouseClicked(evt);
            }
        });
        jPanel3.add(add_seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, 287, 90));

        add_client.setText("Añadir Cliente");
        add_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_clientMouseClicked(evt);
            }
        });
        jPanel3.add(add_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 348, 287, 90));

        add_vehicle.setText("Añadir Vehiculo");
        add_vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_vehicleMouseClicked(evt);
            }
        });
        jPanel3.add(add_vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, 287, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_evasalgado/representante.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 120, 151, 151));

        jLabel2.setText("Carros Rayo McQueen");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 83, 137, -1));

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

        vh_year.setDateFormatString("yyyy\n");

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
                    .addComponent(vh_year, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(vh_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(vh_price, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(vh_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        jPanel3.add(vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 450, 540));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese el nombre del vendedor:");

        vd_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vd_add.setText("añadir");

        javax.swing.GroupLayout sellerLayout = new javax.swing.GroupLayout(seller);
        seller.setLayout(sellerLayout);
        sellerLayout.setHorizontalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(vd_add, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vd_name)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel3.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 550));

        javax.swing.GroupLayout clientLayout = new javax.swing.GroupLayout(client);
        client.setLayout(clientLayout);
        clientLayout.setHorizontalGroup(
            clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        clientLayout.setVerticalGroup(
            clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 540));

        javax.swing.GroupLayout saleLayout = new javax.swing.GroupLayout(sale);
        sale.setLayout(saleLayout);
        saleLayout.setHorizontalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        saleLayout.setVerticalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        jMenu1.setText("Archivos");

        eliminar.setText("Eliminar");
        jMenu1.add(eliminar);

        modificar.setText("Modificar ");
        jMenu1.add(modificar);

        listar.setText("Venta");
        jMenu1.add(listar);

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
        v = new vehiculo(vh_marca.getText(), vh_color.getBackground(), vh_model.getText(), vh_year.getDate(), p);
        
        try {
            vehiculos = new File("./vehiculos.txt");
            fw = new FileWriter(vehiculos, true);
            bw = new BufferedWriter(fw);
            bw.write(v.toString());
            JOptionPane.showMessageDialog(this, "Archivos ingresados exitosamente");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        vh_marca.setText("");
        vh_color.setBackground(Color.red);
        vh_model.setText("");
        vh_year.setDateFormatString("");
        vh_price.setText("");
    }//GEN-LAST:event_vh_añadirMouseClicked

    private void vh_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vh_colorMouseClicked
        vh_color.setBackground(JColorChooser.showDialog(this, "seleccione un color", Color.red));
    }//GEN-LAST:event_vh_colorMouseClicked

    private void add_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sellerMouseClicked
        seller.setVisible(true);
        client.setVisible(false);
        vehicle.setVisible(false);
        sale.setVisible(false);
        
    }//GEN-LAST:event_add_sellerMouseClicked

    private void add_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_clientMouseClicked
        seller.setVisible(false);
        client.setVisible(true);
        vehicle.setVisible(false);
        sale.setVisible(false);
    }//GEN-LAST:event_add_clientMouseClicked
    
    public static void main(String args[]) {
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
                new main().setVisible(true);
            }
        });
    }
    vehiculo v = new vehiculo();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_client;
    private javax.swing.JButton add_seller;
    private javax.swing.JButton add_vehicle;
    private javax.swing.JPanel client;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem listar;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JPanel sale;
    private javax.swing.JPanel seller;
    private javax.swing.JButton vd_add;
    private javax.swing.JTextField vd_name;
    private javax.swing.JPanel vehicle;
    private javax.swing.JButton vh_añadir;
    private javax.swing.JButton vh_color;
    private javax.swing.JTextField vh_marca;
    private javax.swing.JTextField vh_model;
    private javax.swing.JTextField vh_price;
    private com.toedter.calendar.JDateChooser vh_year;
    // End of variables declaration//GEN-END:variables
}
