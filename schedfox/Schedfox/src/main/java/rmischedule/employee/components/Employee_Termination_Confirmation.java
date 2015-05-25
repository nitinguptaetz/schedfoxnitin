/*
 * Employee_Termination_Confirmation.java
 *
 * Created on August 30, 2005, 9:31 AM
 */

package rmischedule.employee.components;

import rmischedule.components.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import rmischedule.components.other_functions;
import rmischedule.employee.*;

/**
 *
 * @author  jason.allen
 */
public class Employee_Termination_Confirmation extends javax.swing.JDialog {
    private rmischedule.components.jcalendar.JCalendarPanel calTermDate;
    private xEmployeeEdit calling;    
    
    /** Creates new form Employee_Termination_Confirmation */
    public Employee_Termination_Confirmation(java.awt.Frame parent, boolean modal, xEmployeeEdit c) {
        super(parent, modal);
        calling = c;
        initComponents();
        calTermDate = new rmischedule.components.jcalendar.JCalendarPanel();
        pnCal.add(calTermDate, BorderLayout.CENTER);
        calTermDate.setEnabled(true);
        setLocation((parent.getWidth()/2) - 100, (parent.getHeight()/2) - 100);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pbOk = new javax.swing.JButton();
        pbCancel = new javax.swing.JButton();
        pnCal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        jLabel1.setText(" Confirm termination date:");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        pbOk.setText("Ok");
        pbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbOkActionPerformed(evt);
            }
        });

        jPanel2.add(pbOk);

        pbCancel.setText("Cancel");
        pbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbCancelActionPerformed(evt);
            }
        });

        jPanel2.add(pbCancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pnCal.setLayout(new java.awt.BorderLayout());

        pnCal.setMinimumSize(new java.awt.Dimension(200, 200));
        pnCal.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pnCal, java.awt.BorderLayout.CENTER);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void pbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbCancelActionPerformed
        dispose();
    }//GEN-LAST:event_pbCancelActionPerformed

    private void pbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbOkActionPerformed
        calling.terminateEmployee(calTermDate.getCalendar());
        dispose();
    }//GEN-LAST:event_pbOkActionPerformed
    
    /**
     * @param args the command line arguments
     */

    /*
        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Employee_Termination_Confirmation(new javax.swing.JFrame(), true).setVisible(true);
                }
            });
        }
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pbCancel;
    private javax.swing.JButton pbOk;
    private javax.swing.JPanel pnCal;
    // End of variables declaration//GEN-END:variables
    
}