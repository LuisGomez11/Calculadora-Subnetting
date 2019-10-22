/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    Tabla tab = new Tabla();

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora Subnetting ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Identificador de red");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 30));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 220, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Menor de 32.748 hots");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 230, 30));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, 30));

        btnCalcular.setBackground(new java.awt.Color(0, 153, 0));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 110, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Host", "Msk", "Id-Red", "Broadcast", "Rango"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 590, 120));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Hosts necesarios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        int mask = 0;
        int broadcast = 0;
        String id_red;
        int primera;
        int ultima;
        String rango;

        String string = txtDireccion.getText();
        String[] parts = string.split("\\.");
        if (parts.length != 4) {
            JOptionPane.showMessageDialog(null, "Direccion invalida, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];
            String part4 = parts[3];
            
            int par1 = Integer.parseInt(part1);
            int par2 = Integer.parseInt(part2);
            int par3 = Integer.parseInt(part3);
            int par4 = Integer.parseInt(part4);
            
            if(par1 > 255 || par2 > 255 || par3 > 255 || par4 > 255){
                JOptionPane.showMessageDialog(null, "Direccion invalida, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

            id_red = part1 + "." + part2 + "." + part3 + "." + part4;
            primera = Integer.parseInt(part4) + 1;
            String primerRango = part3 + "." + primera;
            for (int i = 0; i < tab.lista.size(); i++) {
                if ((tab.lista.get(i) - 2) >= Integer.parseInt(txtCantidad.getText())) {
                    mask = 32 - i;
                    broadcast = tab.lista.get(i) - 1;
                    broadcast = Integer.parseInt(part4) + broadcast;

                    if (i >= 8) {
                        int h = i - 8;
                        broadcast = 255;
                        part3 = "" + (Integer.parseInt(part3) + tab.lista.get(h) - 1);
                    }

                    if (broadcast > 255) {
                        int r = broadcast - 255;
                        broadcast = r;
                        part3 = "" + (Integer.parseInt(part3) + 1);
                    }

                    break;
                }
            }

            ultima = broadcast - 1;

            rango = primerRango + " - " + part3 + "." + ultima;

            Object[] fila = new Object[5];

            fila[0] = txtCantidad.getText();
            fila[1] = "/" + mask;
            fila[2] = id_red;
            fila[3] = part1 + "." + part2 + "." + part3 + "." + broadcast;
            fila[4] = rango;

            modelo.addRow(fila);

            tabla.setModel(modelo);
            
            }

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables
}
