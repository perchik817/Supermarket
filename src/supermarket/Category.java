package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Perchik
 */
public class Category extends javax.swing.JFrame {

    public Category() {
        initComponents();
        selectCategory();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CATEGORIES");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("CATID");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("DESCRIPTION");

        id.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(0, 204, 255));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        description.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        description.setForeground(new java.awt.Color(0, 204, 255));
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NAME");

        name.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 204, 255));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 204, 255));
        addBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setBorder(null);
        addBtn.setBorderPainted(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(0, 204, 255));
        delBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("DELETE");
        delBtn.setBorder(null);
        delBtn.setBorderPainted(false);
        delBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delBtnMouseClicked(evt);
            }
        });
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(0, 204, 255));
        editBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("UPDATE");
        editBtn.setBorder(null);
        editBtn.setBorderPainted(false);
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 204, 255));
        clearBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(null);
        clearBtn.setBorderPainted(false);
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        catList.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        catList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAME", "DESCRIPTION"
            }
        ));
        catList.setRowHeight(25);
        catList.setSelectionBackground(new java.awt.Color(0, 204, 255));
        catList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        catList.setShowGrid(true);
        catList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catList);

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CATEGORIES LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(303, 303, 303))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        exit.setFont(new java.awt.Font("2MASS J1808", 0, 21)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if ((id.getText().isEmpty() || name.getText().isEmpty()) || description.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please, fill all fields!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supermarket", "postgres", "postgres");
                String query = "INSERT INTO category_tb (id, name, description) VALUES (?, ?, ?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, Integer.parseInt(id.getText()));
                preparedStatement.setString(2, name.getText());
                preparedStatement.setString(3, description.getText());
                int row = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category added successfully.");
                connection.close();
                selectCategory();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to connect to the database");
            }
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void delBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBtnMouseClicked
        if (id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter correct category's id to delete!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supermarket", "postgres", "postgres");
                String catId = id.getText();
                String query = "delete from category_tb where id=" + catId;
                Statement delete = connection.createStatement();
                delete.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Category deleted successfully!");
                connection.close();
                selectCategory();
            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Failed to connect to the database");
            }
        }
    }//GEN-LAST:event_delBtnMouseClicked

    private void catListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catListMouseClicked
        DefaultTableModel model = (DefaultTableModel) catList.getModel();
        int index = catList.getSelectedRow();
        id.setText(model.getValueAt(index, 0).toString());
        name.setText(model.getValueAt(index, 1).toString());
        description.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_catListMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        id.setText("");
        name.setText("");
        description.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        if(id.getText().isEmpty() || name.getText().isEmpty() || description.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information!");
        } else{
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supermarket",
                        "postgres",
                        "postgres");
                String query = "update category_tb set name=?, description=? where id=?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, name.getText());
                preparedStatement.setString(2, description.getText());
                preparedStatement.setInt(3, Integer.parseInt(id.getText()));
                
                int rowsAff = preparedStatement.executeUpdate();
                if (rowsAff > 0) {
                    JOptionPane.showMessageDialog(this, "Category was updated!");
                } else {
                    JOptionPane.showMessageDialog(this, "Category not found with given ID.");
                }
                connection.close();
                selectCategory();
            } catch (SQLException ex) {
                System.out.println("Failed to connect to the DB");
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_editBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        new AdminPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    public void selectCategory() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supermarket", "postgres", "postgres");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from category_tb");
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            model.setColumnIdentifiers(new String[]{"ID", "NAME", "DESCRIPTION"});
            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("id"), 
                    resultSet.getString("name"), 
                    resultSet.getString("description")});
            }
            catList.setModel(model);
            //catList.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable catList;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField description;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
