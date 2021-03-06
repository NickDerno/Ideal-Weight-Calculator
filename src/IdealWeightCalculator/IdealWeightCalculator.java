/*
 * Nick Dernovsek
 * idealweightcalculator.java
 * This program will calculate the ideal weight of a person by their height
 */

package IdealWeightCalculator;

import java.text.DecimalFormat;

/**
 *
 * @author nider6687
 */
public class IdealWeightCalculator extends javax.swing.JFrame {

    /**
     * Creates new form IdealWeightCalculator
     */
    public IdealWeightCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        systemOfMeasurementLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        MorILabel = new javax.swing.JLabel();
        baseUnitTextField = new javax.swing.JTextField();
        smallUnitTextField = new javax.swing.JTextField();
        systemOfMeasurementTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        baseUnitLabel = new javax.swing.JLabel();
        smallUnitLabel = new javax.swing.JLabel();
        idealWeightButton = new javax.swing.JButton();
        sentenceLabel = new javax.swing.JLabel();
        bmiButton = new javax.swing.JButton();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        enteredWeightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Name:");

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Ideal Weight/BMI Calculator");

        systemOfMeasurementLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        systemOfMeasurementLabel.setText("System of Measurement:");

        heightLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        heightLabel.setText("Height:");

        MorILabel.setText("Metric (M) or Imperial (I)");

        baseUnitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseUnitTextFieldActionPerformed(evt);
            }
        });

        smallUnitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallUnitTextFieldActionPerformed(evt);
            }
        });

        baseUnitLabel.setText("feet/meters");

        smallUnitLabel.setText("inches/cm");

        idealWeightButton.setText("Calculate Ideal Weight");
        idealWeightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idealWeightButtonActionPerformed(evt);
            }
        });

        sentenceLabel.setFont(new java.awt.Font("ZurichGreek BT", 0, 18)); // NOI18N
        sentenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bmiButton.setText("Calculate BMI");
        bmiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiButtonActionPerformed(evt);
            }
        });

        weightLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weightLabel.setText("Weight:");

        weightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextFieldActionPerformed(evt);
            }
        });

        enteredWeightLabel.setText("kg/pounds");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sentenceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(idealWeightButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MorILabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(heightLabel)
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(baseUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(baseUnitTextField)))
                            .addComponent(systemOfMeasurementLabel)
                            .addComponent(nameLabel)
                            .addComponent(weightLabel))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enteredWeightLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(smallUnitLabel)
                                .addComponent(smallUnitTextField)
                                .addComponent(weightTextField)
                                .addComponent(systemOfMeasurementTextField)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemOfMeasurementLabel)
                    .addComponent(systemOfMeasurementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MorILabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(baseUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(smallUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baseUnitLabel)
                    .addComponent(smallUnitLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enteredWeightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idealWeightButton)
                    .addComponent(bmiButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sentenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baseUnitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseUnitTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseUnitTextFieldActionPerformed

    private void smallUnitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallUnitTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallUnitTextFieldActionPerformed

    private void idealWeightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idealWeightButtonActionPerformed
        String name;
        String systemOfMeasurement;
        double baseUnit;
        double smallUnit;
        double height;
        double idealWeight;
        //declaring all the string and double values
        
        DecimalFormat x = new DecimalFormat("#");
        //making the decimal format to only whole numbers because it's more practical
        
        name = nameTextField.getText();
        systemOfMeasurement = systemOfMeasurementTextField.getText();
        baseUnit = Double.parseDouble(baseUnitTextField.getText());
        smallUnit = Double.parseDouble(smallUnitTextField.getText());
        //receiving the values from the text fields then making them into double and string values
        
        if (systemOfMeasurement.equals("I") || systemOfMeasurement.equals("i") || systemOfMeasurement.equals("imperial")) {
            System.out.println("Imperial");
            //shows that the system knows it's imperial
            
            height = baseUnit * 12 + smallUnit;
            //calculating the total amount of inches
            
            idealWeight = height * height * 25 / 703;
            //Weight (pounds) = height (inches) × height (inches) × 25 ÷ 703
            
            Double.toString(idealWeight);
            sentenceLabel.setText(name + "'s ideal weight is: " + x.format(idealWeight) + " pounds.");
            //converts it to a string then outputs the string to a sentence
        }
        else if (systemOfMeasurement.equals("M") || systemOfMeasurement.equals("m") || systemOfMeasurement.equals("metric")) {
            System.out.println("Metric");
            //shows that the system knows it's metric
            
            height = baseUnit  + smallUnit / 100;
            //calculating the total amount of meters
            
            idealWeight = height * height * 25;
             //Weight (kg) = height (metres) × height (metres) × 25
            
            sentenceLabel.setText(name + "'s ideal weight is: " + x.format(idealWeight) + " kgs.");
        }
        else { 
            sentenceLabel.setText("That is not a valid system of measuement.");
            //If someone doesn't put a valid measurement
        }
    }//GEN-LAST:event_idealWeightButtonActionPerformed

    private void bmiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiButtonActionPerformed
        String name;
        String systemOfMeasurement;
        double baseUnit;
        double smallUnit;
        double height;
        double weight;
        double bmi;
        //declaring all the string and double values
        
        DecimalFormat x = new DecimalFormat("#.00");
        //making the decimal format to only two decimals because BMI is smaller than Ideal weight
        
        name = nameTextField.getText();
        systemOfMeasurement = systemOfMeasurementTextField.getText();
        baseUnit = Double.parseDouble(baseUnitTextField.getText());
        smallUnit = Double.parseDouble(smallUnitTextField.getText());
        weight = Double.parseDouble(weightTextField.getText());
        //receiving the values from the text fields then making them into double and string values
        
        if (systemOfMeasurement.equals("I") || systemOfMeasurement.equals("i") || systemOfMeasurement.equals("imperial")) {
            System.out.println("Imperial");
            //shows that the system knows it's imperial
            
            height = baseUnit * 12 + smallUnit;
            //calculating the total amount of inches
            
            bmi = weight / height / height * 703;
            //calculating the body mass index using this equation
            
            Double.toString(bmi);
            sentenceLabel.setText(name + "'s BMI: " + x.format(bmi) + " pound/meter^2.");
            //converts it to a string then outputs the string to a sentence
        }
        else if (systemOfMeasurement.equals("M") || systemOfMeasurement.equals("m") || systemOfMeasurement.equals("metric")) {
            System.out.println("Metric");
            //shows that the system knows it's imperial
            
            height = baseUnit + smallUnit / 100;
            //calculating the total amount of inches
            
            bmi = weight / height / height;
            //calculating the body mass index using this equation
            
            Double.toString(bmi);
            sentenceLabel.setText(name + "'s BMI: " + x.format(bmi) + " kg/meter^2.");
            //converts it to a string then outputs the string to a sentence
        }
        else { 
            sentenceLabel.setText("That is not a valid system of measuement.");
            //If someone doesn't put in a valid measurement
        }
    }//GEN-LAST:event_bmiButtonActionPerformed

    private void weightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdealWeightCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MorILabel;
    private javax.swing.JLabel baseUnitLabel;
    private javax.swing.JTextField baseUnitTextField;
    private javax.swing.JButton bmiButton;
    private javax.swing.JLabel enteredWeightLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton idealWeightButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel sentenceLabel;
    private javax.swing.JLabel smallUnitLabel;
    private javax.swing.JTextField smallUnitTextField;
    private javax.swing.JLabel systemOfMeasurementLabel;
    private javax.swing.JTextField systemOfMeasurementTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
