
import converter.LengthConverter;
import converter.WeightConverter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x4
 */
public class Main extends javax.swing.JFrame {

    public static String[] weight = {
        "Граммы",
        "Киллограммы",
        "Тонны",
        "Квитал",
        "Квартер",
        "Стоун",
        "Лот",
        "Золотник",
        "Доля"
    };
    public static String[] length = {
        "Сантиметры",
        "Метры",
        "Киллометры",
        "Мили",
        "Фут",
        "Ярд",
        "Вертса",
        "Сажень",
        "Аршин"
    };
    
    public Main() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbConverter = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbSystem1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbSystem2 = new javax.swing.JComboBox();
        tfValue = new javax.swing.JTextField();
        tfResult = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Конвертер");

        cbConverter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Масса", "Длина" }));
        cbConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConverterActionPerformed(evt);
            }
        });

        jLabel2.setText("Из");

        jLabel3.setText("В");

        tfResult.setText("Результат");
        tfResult.setEnabled(false);

        btnConvert.setText("Перевести");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(cbConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConvert)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConverterActionPerformed
        String item = (String) cbConverter.getItemAt(cbConverter.getSelectedIndex());
        switch(item) {
            case "Масса": {
                initSystems(0);
                
            } break;
            case "Длина": {
                initSystems(1);
            } break;
        }
        tfValue.setText("");
        tfResult.setText("Результат");
    }//GEN-LAST:event_cbConverterActionPerformed
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String val = tfValue.getText();
        if(val.equals("")) {
            JOptionPane.showMessageDialog(this, "Укажите значение");
        } else {
            try {
                double buf = Double.parseDouble(val);
                String item = (String) cbConverter.getItemAt(cbConverter.getSelectedIndex());
                switch(item) {
                    case "Масса": {
                        double result = WeightConverter.convert(
                                buf, 
                                cbSystem1.getSelectedIndex(),
                                cbSystem2.getSelectedIndex());
                        tfResult.setText(String.valueOf(result));
                    } break;
                    case "Длина": {
                        double result = LengthConverter.convert(
                                buf, 
                                cbSystem1.getSelectedIndex(),
                                cbSystem2.getSelectedIndex());
                        tfResult.setText(String.valueOf(result));
                    } break;
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Укажите корректное значение");
            }
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    /**
     * Инициализирует комбобоксы с системами 
     * @param cmd 0-масса | 1-длина 
     */
    public void initSystems(int cmd) {
        cbSystem1.removeAllItems();
        cbSystem2.removeAllItems();
        if(cmd == 0) {
            int count = weight.length;
        
            for(int i = 0; i < count; i++) {
                cbSystem1.addItem(weight[i]);
                cbSystem2.addItem(weight[i]);
            }
        } else if(cmd == 1) {
            int count = length.length;
        
            for(int i = 0; i < count; i++) {
                cbSystem1.addItem(length[i]);
                cbSystem2.addItem(length[i]);
            }
        }
        
    }
    /**
     * Первоначальная инициализация
     */
    public void init() {
        initSystems(0);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox cbConverter;
    private javax.swing.JComboBox cbSystem1;
    private javax.swing.JComboBox cbSystem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfResult;
    private javax.swing.JTextField tfValue;
    // End of variables declaration//GEN-END:variables
}
