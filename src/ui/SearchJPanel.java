/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import model.CarDetails;
import model.CarHistory;

/**
 *
 * @author ajay09
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    CarHistory history;
    
    public SearchJPanel(CarHistory history) {
        initComponents();
        
        this.history = history;
        lblLastUpdatedTimeOP.setText(history.getLastUpdatedTime());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnFirstCar = new javax.swing.JButton();
        btnManufacturer = new javax.swing.JButton();
        btnManufacturedYear = new javax.swing.JButton();
        btnMaxSeats = new javax.swing.JButton();
        btnMinSeats = new javax.swing.JButton();
        txtManufacturer = new javax.swing.JTextField();
        txtManufacturedYear = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        btnModelNumber = new javax.swing.JButton();
        txtModelNumber = new javax.swing.JTextField();
        btnSerialNumber = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        btnLocation = new javax.swing.JButton();
        txtLocation = new javax.swing.JTextField();
        lblCarsAvailable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCarsNotAvailable = new javax.swing.JLabel();
        lblNoOfCarsAvailable = new javax.swing.JLabel();
        lblNoOfCarsNotAvailable = new javax.swing.JLabel();
        btnAvailabilityOfCars = new javax.swing.JButton();
        lblLastUpdatedTime = new javax.swing.JLabel();
        lblLastUpdatedTimeOP = new javax.swing.JLabel();
        btnUniqueManufacturers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUberUse = new javax.swing.JTable();
        btnCertExpiration = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 700));

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblTitle.setText("Search Car Details");
        lblTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTitleActionPerformed(evt);
            }
        });

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Model", "Cars Available", "Seats", "Location", "Year", "Manufacturer", "Serial Number", "License Number", "Model Number"
            }
        ));
        tblCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnFirstCar.setBackground(new java.awt.Color(153, 153, 153));
        btnFirstCar.setText("First Available Car");
        btnFirstCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstCarActionPerformed(evt);
            }
        });

        btnManufacturer.setBackground(new java.awt.Color(153, 153, 153));
        btnManufacturer.setText("Manufacturer");
        btnManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturerActionPerformed(evt);
            }
        });

        btnManufacturedYear.setBackground(new java.awt.Color(153, 153, 153));
        btnManufacturedYear.setText("Manufactured Year");
        btnManufacturedYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturedYearActionPerformed(evt);
            }
        });

        btnMaxSeats.setBackground(new java.awt.Color(153, 153, 153));
        btnMaxSeats.setText("Max Seats");
        btnMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxSeatsActionPerformed(evt);
            }
        });

        btnMinSeats.setBackground(new java.awt.Color(153, 153, 153));
        btnMinSeats.setText("Min Seats");
        btnMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinSeatsActionPerformed(evt);
            }
        });

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        txtMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxSeatsActionPerformed(evt);
            }
        });

        btnModelNumber.setBackground(new java.awt.Color(153, 153, 153));
        btnModelNumber.setText("Model Number");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });

        btnSerialNumber.setBackground(new java.awt.Color(153, 153, 153));
        btnSerialNumber.setText("Serial Number");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        btnLocation.setBackground(new java.awt.Color(153, 153, 153));
        btnLocation.setText("Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        lblCarsAvailable.setText("No. Of Cars Available :");

        lblCarsNotAvailable.setText("No.Of Cars Not Available :");

        lblNoOfCarsAvailable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNoOfCarsNotAvailable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAvailabilityOfCars.setBackground(new java.awt.Color(153, 153, 153));
        btnAvailabilityOfCars.setText("Availability Of Cars");
        btnAvailabilityOfCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailabilityOfCarsActionPerformed(evt);
            }
        });

        lblLastUpdatedTime.setText("Last Updated Time");

        lblLastUpdatedTimeOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUniqueManufacturers.setBackground(new java.awt.Color(153, 153, 153));
        btnUniqueManufacturers.setText("Manufacturer");
        btnUniqueManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniqueManufacturersActionPerformed(evt);
            }
        });

        tblUberUse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane2.setViewportView(tblUberUse);

        btnCertExpiration.setBackground(new java.awt.Color(153, 153, 153));
        btnCertExpiration.setText("Certificate Expiration");
        btnCertExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertExpirationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnManufacturer)
                                            .addComponent(btnManufacturedYear)
                                            .addComponent(btnMaxSeats)
                                            .addComponent(btnMinSeats)
                                            .addComponent(btnModelNumber)
                                            .addComponent(btnLocation)
                                            .addComponent(btnSerialNumber))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirstCar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnCertExpiration)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(btnAvailabilityOfCars))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCarsNotAvailable)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(lblCarsAvailable)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNoOfCarsAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblNoOfCarsNotAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(btnUniqueManufacturers))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(lblLastUpdatedTime)
                                        .addGap(57, 57, 57)
                                        .addComponent(lblLastUpdatedTimeOP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLocation, txtManufacturedYear, txtManufacturer, txtMaxSeats, txtMinSeats, txtModelNumber, txtSerialNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblNoOfCarsAvailable, lblNoOfCarsNotAvailable});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirstCar)
                            .addComponent(btnCertExpiration))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManufacturer)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManufacturedYear)
                            .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMaxSeats)
                            .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinSeats)
                            .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModelNumber)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSerialNumber)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAvailabilityOfCars)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarsAvailable)
                            .addComponent(lblNoOfCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNoOfCarsNotAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCarsNotAvailable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUniqueManufacturers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblLastUpdatedTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLastUpdatedTimeOP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLocation)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblNoOfCarsAvailable, lblNoOfCarsNotAvailable});

    }// </editor-fold>//GEN-END:initComponents

    private void lblTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitleActionPerformed

    private void tblCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCarsMouseClicked

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void btnFirstCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstCarActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        
        //boolean firstAvailable = chkboxAvailibility.isSelected();
        for(CarDetails cd : history.getHistory())
        {
        if(cd.isAvailability()==true)
        {
        Object[] row = new Object[10];
        //row[0] = cd;
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        break;
        }
        }
    }//GEN-LAST:event_btnFirstCarActionPerformed

    private void btnMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxSeatsActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        
        int maxSeats = Integer.parseInt(txtMaxSeats.getText());
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getSeats() <= maxSeats)
        {
       Object[] row = new Object[10];
        //row[0] = cd;
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);

        
        // break;
        }
        }
    }//GEN-LAST:event_btnMaxSeatsActionPerformed

    private void btnMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinSeatsActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        
        int minSeats = Integer.parseInt(txtMaxSeats.getText());
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getSeats() >= minSeats)
        {
        Object[] row = new Object[10];
        //row[0] = cd;
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        }
        }
    }//GEN-LAST:event_btnMinSeatsActionPerformed

    private void btnManufacturedYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturedYearActionPerformed
       DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        int manufacturedYear = Integer.parseInt(txtManufacturedYear.getText());
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getYear()==(manufacturedYear))
        {
        Object[] row = new Object[10];
        //row[0] = cd;
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        // break;
        }
        }
    }//GEN-LAST:event_btnManufacturedYearActionPerformed

    private void btnManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturerActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        String manufacturerList = txtManufacturer.getText();
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getManufacturer().equals(manufacturerList))
        {
        Object[] row = new Object[10];
        //row[0] = cd;
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();

        model.addRow(row);
        // break;
        }
        }
    }//GEN-LAST:event_btnManufacturerActionPerformed

    private void txtMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxSeatsActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        int modelNumber = Integer.parseInt(txtModelNumber.getText());
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getModelNumber().equals(modelNumber))
        {
        Object[] row = new Object[10];
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        // break;
        }
        }
    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        String serialNumber = txtSerialNumber.getText();
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getSerialNumber().equals(serialNumber))
        {
        Object[] row = new Object[10];
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        // break;
        }
        }
    }//GEN-LAST:event_btnSerialNumberActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
       
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        String Location = txtLocation.getText();
        for(CarDetails cd : history.getHistory())
        {
        if(cd.getLocation()== (Location))
        {
        Object[] row = new Object[10];
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        // break;
        }
        }
    }//GEN-LAST:event_btnLocationActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnAvailabilityOfCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailabilityOfCarsActionPerformed
        int available = 0;
        int notAvailable = 0;
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        for(CarDetails cd : history.getHistory())
        {
        if(cd.isAvailability()==true)
        {
        available++;
        }else{
        notAvailable++;
        }
        }
        lblNoOfCarsAvailable.setText(Integer.toString(available));
        lblNoOfCarsNotAvailable.setText(Integer.toString(notAvailable));
    }//GEN-LAST:event_btnAvailabilityOfCarsActionPerformed

    private void btnUniqueManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniqueManufacturersActionPerformed
        Set<String> uniqueManufacturer = new HashSet<>();
        for(CarDetails cd : history.getHistory()) {
        uniqueManufacturer.add(cd.getManufacturer());
        }

        DefaultTableModel model = (DefaultTableModel) tblUberUse.getModel();
        model.setRowCount(0);

         for(String c : uniqueManufacturer){

         Object[] row = new Object[1];
         row[0] = c;

         model.addRow(row);
         }
    }//GEN-LAST:event_btnUniqueManufacturersActionPerformed

    private void btnCertExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertExpirationActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        //boolean firstAvailable = chkboxAvailibility.isSelected();
        for(CarDetails cd : history.getHistory())
        {
        if(cd.isMaintenanceCert()==true)
        {
        
        Object[] row = new Object[10];
        row[0] = cd.getModel();
        row[1] = cd.isAvailability();
        row[2] = cd.getSeats();
        row[3] = cd.getLocation();
        row[4] = cd.getYear();
        row[5] = cd.getManufacturer();
        row[6] = cd.getSerialNumber();
        row[7] = cd.getLicenseNumber();
        row[8] = cd.getModelNumber();
        model.addRow(row);
        
        // break;
        }
        }
    }//GEN-LAST:event_btnCertExpirationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailabilityOfCars;
    private javax.swing.JButton btnCertExpiration;
    private javax.swing.JButton btnFirstCar;
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnManufacturedYear;
    private javax.swing.JButton btnManufacturer;
    private javax.swing.JButton btnMaxSeats;
    private javax.swing.JButton btnMinSeats;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnUniqueManufacturers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCarsAvailable;
    private javax.swing.JLabel lblCarsNotAvailable;
    private javax.swing.JLabel lblLastUpdatedTime;
    private javax.swing.JLabel lblLastUpdatedTimeOP;
    private javax.swing.JLabel lblNoOfCarsAvailable;
    private javax.swing.JLabel lblNoOfCarsNotAvailable;
    private javax.swing.JTextField lblTitle;
    private javax.swing.JTable tblCars;
    private javax.swing.JTable tblUberUse;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtManufacturedYear;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
