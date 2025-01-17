package timetable.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TARUN
 */
public class TeacherTable extends javax.swing.JFrame {

    /**
     * Creates new form TeacherTable
     */
    String url;
    Connection connection=null;
    PreparedStatement preStat;
    String Day,L1,L2,L3,L4,L5,L6;
    public TeacherTable() throws SQLException {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherTable.class.getName()).log(Level.SEVERE, null, ex);
        }

            url = "jdbc:mysql://localhost:3306/timetable";
            connection = DriverManager.getConnection(url, "root", "root");
        String query = "SELECT * FROM timetable";
        preStat = connection.prepareStatement(query);
            int i=0;
            ResultSet result = preStat.executeQuery();
            while(result.next())
            {
                ++i;
                Day=result.getString("day");
                L1=result.getString("lacture1");
                L2=result.getString("lacture2");
                L3=result.getString("lacture3");
                L4=result.getString("lacture4");
                L5=result.getString("lacture5");
                L6=result.getString("lacture6");
                switch(i)
                {
                    case 1:
                        L1D1.setText(L1);
                        L2D1.setText(L2);
                        L3D1.setText(L3);
                        L4D1.setText(L4);
                        L5D1.setText(L5);
                        L6D1.setText(L5);
                        break;
                    case 2:
                        L1D2.setText(L1);
                        L2D2.setText(L2);
                        L3D2.setText(L3);
                        L4D2.setText(L4);
                        L5D2.setText(L5);
                        L6D2.setText(L5);
                        break;
                    case 3:
                        L1D3.setText(L1);
                        L2D3.setText(L2);
                        L3D3.setText(L3);
                        L4D3.setText(L4);
                        L5D3.setText(L5);
                        L6D3.setText(L5);
                        break;
                    case 4:
                        L1D4.setText(L1);
                        L2D4.setText(L2);
                        L3D4.setText(L3);
                        L4D4.setText(L4);
                        L5D4.setText(L5);
                        L6D4.setText(L5);
                        break;
                    case 5:
                        L1D5.setText(L1);
                        L2D5.setText(L2);
                        L3D5.setText(L3);
                        L4D5.setText(L4);
                        L5D5.setText(L5);
                        L6D5.setText(L5);
                        break;
                    case 6:
                        L1D6.setText(L1);
                        L2D6.setText(L2);
                        L3D6.setText(L3);
                        L4D6.setText(L4);
                        L5D6.setText(L5);
                        L6D6.setText(L5);
                        break;
                    case 7:
                        L1D7.setText(L1);
                        L2D7.setText(L2);
                        L3D7.setText(L3);
                        L4D7.setText(L4);
                        L5D7.setText(L5);
                        L6D7.setText(L5);
                        break;
                }
                
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        day = new javax.swing.JLabel();
        lacture1 = new javax.swing.JLabel();
        lacture2 = new javax.swing.JLabel();
        lacture3 = new javax.swing.JLabel();
        lacture4 = new javax.swing.JLabel();
        lacture5 = new javax.swing.JLabel();
        lacture6 = new javax.swing.JLabel();
        day1 = new javax.swing.JLabel();
        day2 = new javax.swing.JLabel();
        day3 = new javax.swing.JLabel();
        day4 = new javax.swing.JLabel();
        day5 = new javax.swing.JLabel();
        day6 = new javax.swing.JLabel();
        day7 = new javax.swing.JLabel();
        L1D1 = new javax.swing.JTextField();
        L2D1 = new javax.swing.JTextField();
        L3D1 = new javax.swing.JTextField();
        L4D1 = new javax.swing.JTextField();
        L5D1 = new javax.swing.JTextField();
        L6D1 = new javax.swing.JTextField();
        L1D2 = new javax.swing.JTextField();
        L2D2 = new javax.swing.JTextField();
        L3D2 = new javax.swing.JTextField();
        L4D2 = new javax.swing.JTextField();
        L5D2 = new javax.swing.JTextField();
        L6D2 = new javax.swing.JTextField();
        L1D3 = new javax.swing.JTextField();
        L2D3 = new javax.swing.JTextField();
        L3D3 = new javax.swing.JTextField();
        L4D3 = new javax.swing.JTextField();
        L5D3 = new javax.swing.JTextField();
        L6D3 = new javax.swing.JTextField();
        L1D4 = new javax.swing.JTextField();
        L2D4 = new javax.swing.JTextField();
        L3D4 = new javax.swing.JTextField();
        L4D4 = new javax.swing.JTextField();
        L5D4 = new javax.swing.JTextField();
        L6D4 = new javax.swing.JTextField();
        L1D5 = new javax.swing.JTextField();
        L2D5 = new javax.swing.JTextField();
        L3D5 = new javax.swing.JTextField();
        L4D5 = new javax.swing.JTextField();
        L5D5 = new javax.swing.JTextField();
        L6D5 = new javax.swing.JTextField();
        L1D6 = new javax.swing.JTextField();
        L2D6 = new javax.swing.JTextField();
        L3D6 = new javax.swing.JTextField();
        L4D6 = new javax.swing.JTextField();
        L5D6 = new javax.swing.JTextField();
        L6D6 = new javax.swing.JTextField();
        L1D7 = new javax.swing.JTextField();
        L2D7 = new javax.swing.JTextField();
        L3D7 = new javax.swing.JTextField();
        L4D7 = new javax.swing.JTextField();
        L5D7 = new javax.swing.JTextField();
        L6D7 = new javax.swing.JTextField();
        teachercancel = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timetable");
        setResizable(false);
        setSize(new java.awt.Dimension(1051, 445));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day.setText("Day");
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 22, -1, -1));

        lacture1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture1.setText("8-9 AM");
        getContentPane().add(lacture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 22, -1, -1));

        lacture2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture2.setText("9-10 AM");
        getContentPane().add(lacture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 22, -1, -1));

        lacture3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture3.setText("10-11 AM");
        getContentPane().add(lacture3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 22, -1, -1));

        lacture4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture4.setText("11-12 AM");
        getContentPane().add(lacture4, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 22, -1, -1));

        lacture5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture5.setText("12-1 PM");
        getContentPane().add(lacture5, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 22, -1, -1));

        lacture6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lacture6.setText("1-2 PM");
        getContentPane().add(lacture6, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 22, -1, -1));

        day1.setBackground(new java.awt.Color(51, 51, 255));
        day1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day1.setText("Monday");
        getContentPane().add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 90, -1, -1));

        day2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day2.setText("Tuesday");
        getContentPane().add(day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 155, -1, -1));

        day3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day3.setText("Wednesday");
        getContentPane().add(day3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 223, -1, -1));

        day4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day4.setText("Thursday");
        getContentPane().add(day4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 293, -1, -1));

        day5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day5.setText("Friday");
        getContentPane().add(day5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 360, -1, -1));

        day6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day6.setText("Saturday");
        getContentPane().add(day6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 425, -1, -1));

        day7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        day7.setText("Sunday");
        getContentPane().add(day7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 484, -1, -1));

        L1D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D1.setText("jTextField1");
        L1D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1D1ActionPerformed(evt);
            }
        });
        getContentPane().add(L1D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 87, -1, -1));

        L2D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D1.setText("jTextField1");
        getContentPane().add(L2D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 87, -1, -1));

        L3D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D1.setText("jTextField1");
        getContentPane().add(L3D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 87, -1, -1));

        L4D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D1.setText("jTextField1");
        getContentPane().add(L4D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 87, -1, -1));

        L5D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D1.setText("jTextField1");
        getContentPane().add(L5D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 87, -1, -1));

        L6D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D1.setText("jTextField1");
        getContentPane().add(L6D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 87, -1, -1));

        L1D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D2.setText("jTextField1");
        getContentPane().add(L1D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 152, -1, -1));

        L2D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D2.setText("jTextField1");
        getContentPane().add(L2D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 152, -1, -1));

        L3D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D2.setText("jTextField1");
        getContentPane().add(L3D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 152, -1, -1));

        L4D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D2.setText("jTextField1");
        getContentPane().add(L4D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 152, -1, -1));

        L5D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D2.setText("jTextField1");
        getContentPane().add(L5D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 152, -1, -1));

        L6D2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D2.setText("jTextField1");
        getContentPane().add(L6D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 152, -1, -1));

        L1D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D3.setText("jTextField1");
        getContentPane().add(L1D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 220, -1, -1));

        L2D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D3.setText("jTextField1");
        getContentPane().add(L2D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 220, -1, -1));

        L3D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D3.setText("jTextField1");
        getContentPane().add(L3D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        L4D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D3.setText("jTextField1");
        getContentPane().add(L4D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 220, -1, -1));

        L5D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D3.setText("jTextField1");
        getContentPane().add(L5D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 220, -1, -1));

        L6D3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D3.setText("jTextField1");
        getContentPane().add(L6D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 220, -1, -1));

        L1D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D4.setText("jTextField1");
        getContentPane().add(L1D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 290, -1, -1));

        L2D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D4.setText("jTextField1");
        getContentPane().add(L2D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 290, -1, -1));

        L3D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D4.setText("jTextField1");
        getContentPane().add(L3D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        L4D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D4.setText("jTextField1");
        getContentPane().add(L4D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 290, -1, -1));

        L5D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D4.setText("jTextField1");
        getContentPane().add(L5D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 290, -1, -1));

        L6D4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D4.setText("jTextField1");
        getContentPane().add(L6D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 290, -1, -1));

        L1D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D5.setText("jTextField1");
        getContentPane().add(L1D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 349, -1, -1));

        L2D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D5.setText("jTextField1");
        getContentPane().add(L2D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 357, -1, -1));

        L3D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D5.setText("jTextField1");
        getContentPane().add(L3D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 357, -1, -1));

        L4D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D5.setText("jTextField1");
        getContentPane().add(L4D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 357, -1, -1));

        L5D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D5.setText("jTextField1");
        getContentPane().add(L5D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 357, -1, -1));

        L6D5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D5.setText("jTextField1");
        getContentPane().add(L6D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 357, -1, -1));

        L1D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D6.setText("jTextField1");
        getContentPane().add(L1D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 422, -1, -1));

        L2D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D6.setText("jTextField1");
        getContentPane().add(L2D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 422, -1, -1));

        L3D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D6.setText("jTextField1");
        getContentPane().add(L3D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 422, -1, -1));

        L4D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D6.setText("jTextField1");
        getContentPane().add(L4D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 422, -1, -1));

        L5D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D6.setText("jTextField1");
        getContentPane().add(L5D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 422, -1, -1));

        L6D6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D6.setText("jTextField1");
        getContentPane().add(L6D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 422, -1, -1));

        L1D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1D7.setText("jTextField1");
        getContentPane().add(L1D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 481, -1, -1));

        L2D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2D7.setText("jTextField1");
        getContentPane().add(L2D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 481, -1, -1));

        L3D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3D7.setText("jTextField1");
        getContentPane().add(L3D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 481, -1, -1));

        L4D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4D7.setText("jTextField1");
        getContentPane().add(L4D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 481, -1, -1));

        L5D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5D7.setText("jTextField1");
        getContentPane().add(L5D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 481, -1, -1));

        L6D7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6D7.setText("jTextField1");
        getContentPane().add(L6D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 481, -1, -1));

        teachercancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teachercancel.setText("Cancel");
        teachercancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teachercancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachercancelActionPerformed(evt);
            }
        });
        getContentPane().add(teachercancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 540, -1, -1));

        save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        save.setText("Save");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 540, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       
        
        
        try {
            String query="DELETE FROM timetable";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 1
            Day="Monday";
            L1=L1D1.getText();
            L2=L2D1.getText();
            L3=L3D1.getText();
            L4=L4D1.getText();
            L5=L5D1.getText();
            L6=L6D1.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 2
            Day="Tuesday";
            L1=L1D2.getText();
            L2=L2D2.getText();
            L3=L3D2.getText();
            L4=L4D2.getText();
            L5=L5D2.getText();
            L6=L6D2.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 3
            Day="Wednesday";
            L1=L1D3.getText();
            L2=L2D3.getText();
            L3=L3D3.getText();
            L4=L4D3.getText();
            L5=L5D3.getText();
            L6=L6D3.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 4
            Day="Thursday";
            L1=L1D4.getText();
            L2=L2D4.getText();
            L3=L3D4.getText();
            L4=L4D4.getText();
            L5=L5D4.getText();
            L6=L6D4.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 5
            Day="Friday";
            L1=L1D5.getText();
            L2=L2D5.getText();
            L3=L3D5.getText();
            L4=L4D5.getText();
            L5=L5D5.getText();
            L6=L6D5.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 6
            Day="Saturday";
            L1=L1D6.getText();
            L2=L2D6.getText();
            L3=L3D6.getText();
            L4=L4D6.getText();
            L5=L5D6.getText();
            L6=L6D6.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
            //FOR DAY 7
            Day="Sunday";
            L1=L1D7.getText();
            L2=L2D7.getText();
            L3=L3D7.getText();
            L4=L4D7.getText();
            L5=L5D7.getText();
            L6=L6D7.getText();
            query="INSERT INTO `timetable` (`day`,`lacture1`,`lacture2`,`lacture3`,`lacture4`,`lacture5`,`lacture6`)" + " VALUES ('" + Day + "', '" + L1 + "','" + L2 + "','" + L3 + "','" + L4 + "','" + L5 + "','" + L6 + "')";
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Successfully updated");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void teachercancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachercancelActionPerformed
      this.setVisible(false); 
      this.dispose();
    }//GEN-LAST:event_teachercancelActionPerformed

    private void L1D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1D1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L1D1;
    private javax.swing.JTextField L1D2;
    private javax.swing.JTextField L1D3;
    private javax.swing.JTextField L1D4;
    private javax.swing.JTextField L1D5;
    private javax.swing.JTextField L1D6;
    private javax.swing.JTextField L1D7;
    private javax.swing.JTextField L2D1;
    private javax.swing.JTextField L2D2;
    private javax.swing.JTextField L2D3;
    private javax.swing.JTextField L2D4;
    private javax.swing.JTextField L2D5;
    private javax.swing.JTextField L2D6;
    private javax.swing.JTextField L2D7;
    private javax.swing.JTextField L3D1;
    private javax.swing.JTextField L3D2;
    private javax.swing.JTextField L3D3;
    private javax.swing.JTextField L3D4;
    private javax.swing.JTextField L3D5;
    private javax.swing.JTextField L3D6;
    private javax.swing.JTextField L3D7;
    private javax.swing.JTextField L4D1;
    private javax.swing.JTextField L4D2;
    private javax.swing.JTextField L4D3;
    private javax.swing.JTextField L4D4;
    private javax.swing.JTextField L4D5;
    private javax.swing.JTextField L4D6;
    private javax.swing.JTextField L4D7;
    private javax.swing.JTextField L5D1;
    private javax.swing.JTextField L5D2;
    private javax.swing.JTextField L5D3;
    private javax.swing.JTextField L5D4;
    private javax.swing.JTextField L5D5;
    private javax.swing.JTextField L5D6;
    private javax.swing.JTextField L5D7;
    private javax.swing.JTextField L6D1;
    private javax.swing.JTextField L6D2;
    private javax.swing.JTextField L6D3;
    private javax.swing.JTextField L6D4;
    private javax.swing.JTextField L6D5;
    private javax.swing.JTextField L6D6;
    private javax.swing.JTextField L6D7;
    private javax.swing.JLabel day;
    private javax.swing.JLabel day1;
    private javax.swing.JLabel day2;
    private javax.swing.JLabel day3;
    private javax.swing.JLabel day4;
    private javax.swing.JLabel day5;
    private javax.swing.JLabel day6;
    private javax.swing.JLabel day7;
    private javax.swing.JLabel lacture1;
    private javax.swing.JLabel lacture2;
    private javax.swing.JLabel lacture3;
    private javax.swing.JLabel lacture4;
    private javax.swing.JLabel lacture5;
    private javax.swing.JLabel lacture6;
    private javax.swing.JButton save;
    private javax.swing.JButton teachercancel;
    // End of variables declaration//GEN-END:variables
}
