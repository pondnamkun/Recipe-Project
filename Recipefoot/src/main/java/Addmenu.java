import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

import Recipefoot.Maincourse;
import Recipefoot.Readflie;


import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pondx
 */
public class Addmenu extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    boolean MainFooodNew, dessertNew = false;
    File file;JButton button;
    JFrame frame;

    /**
     * Creates new form Addmenu
     */
    public Addmenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Textpicture = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Textfood = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Textrecipe = new javax.swing.JTextArea();
        ApplyAddmenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textname = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Des = new javax.swing.JCheckBox();
        Mainfoot = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel2.setText(" Food ingredients");

        Textfood.setColumns(20);
        Textfood.setRows(5);
        jScrollPane1.setViewportView(Textfood);

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel3.setText("Recipe");

        Textrecipe.setColumns(20);
        Textrecipe.setRows(5);
        jScrollPane2.setViewportView(Textrecipe);

        ApplyAddmenu.setText("Apply");
        ApplyAddmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplyAddmenuMouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(textname);

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel4.setText("Picture");

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel5.setText("Name Menu");

        Des.setText("Dessert");
        Des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesActionPerformed(evt);
            }
        });

        Mainfoot.setText("Maincourse");
        Mainfoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainfootActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Textpicture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ApplyAddmenu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(Mainfoot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Des)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save)
                    .addComponent(Textpicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Des)
                    .addComponent(Mainfoot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApplyAddmenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
////////////////////////////
    /*String name = textname.getText();
        String Food = Textfood.getText();
        String recipe = Textrecipe.getText();
        try {
            SaveaddData(name, Food, recipe);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (MainFooodNew == true && dessertNew == false) {
            /*Course.AddrowoTable1();
        } else if (dessertNew == true && MainFooodNew == false) {
            Dessert.Addrow();
        } else {
            Dessert.Addrow();
        }
        System.exit(0);*/
/////////////////////////////////////
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SaveActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            Textpicture.setText(j.getSelectedFile().getAbsolutePath());
            file = j.getSelectedFile();
        } else {
            Textpicture.setText("the user cancelled the operation");
            file = null;
        }
        try {
            pathimage();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }                                    

    private void MainfootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainfootActionPerformed
        if (Mainfoot.isSelected()) {
            MainFooodNew= true;
        } else {
            MainFooodNew= false;
        }
    }//GEN-LAST:event_MainfootActionPerformed

    private void DesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesActionPerformed
        if (Mainfoot.isSelected()) {
            dessertNew= true;
        } else {
            dessertNew= false;
        }
    }//GEN-LAST:event_DesActionPerformed

    private void ApplyAddmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyAddmenuMouseClicked
        String name = textname.getText();
        String Food = Textfood.getText();
        String recipe = Textrecipe.getText();
        try {
            SaveaddData(name, Food, recipe);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (MainFooodNew == true && dessertNew == false) {
            Course.AddrowoTable1();
        } else if (dessertNew == true && MainFooodNew == false) {
            Dessert.Addrow();
        } else {
            Dessert.Addrow();
        }
        dispose();
    }//GEN-LAST:event_ApplyAddmenuMouseClicked

    public void SaveaddData(String Name, String Food,String Recipe) throws IOException {
        String File;String Path = ".\\img\\"+file.getName();
        Maincourse Mainc = new Maincourse(Name,Food,Recipe,Path);
        ArrayList<Maincourse> productList = new ArrayList<Maincourse>();
        if (MainFooodNew == true && dessertNew == false) {
            File = "Maincourse.bin";}
        else if (dessertNew == true && MainFooodNew == false) {
            File = "Dessert.bin";}
        else{File = "Dessert.bin";}
        ArrayList<Maincourse> Ma = Readflie.load(File) ;
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(File)))) {
            for (int i = 0 ; i < Ma.size() ; i++) {
              Maincourse p = new Maincourse();
              p.setNames(input.readUTF());
              p.setFoot(input.readUTF());
              p.setRecipe(input.readUTF());
              p.setfilename(input.readUTF());
              productList.add(p);}
              try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(File)))) {
                  for (int j = 0; j < productList.size(); j++) {
                      Maincourse sa =productList.get(j);
                  out.writeUTF(sa.getNames());
                  out.writeUTF(sa.getFoot());
                  out.writeUTF(sa.getRecipe());
                  out.writeUTF(sa.getfilename());
                }
            out.writeUTF(Mainc.getNames());
            out.writeUTF(Mainc.getFoot());
            out.writeUTF(Mainc.getRecipe());
            out.writeUTF(Mainc.getfilename());
                  } catch (IOException ex) {
                  ex.printStackTrace();
          }
        
        } catch (EOFException ex) {
          ex.printStackTrace();}

    }
    public void pathimage() throws IOException {
        String Name = file.getName();
        FileInputStream in = null;
    FileOutputStream out = null;
    int c = 0;

    try {
      in = new FileInputStream(file);
      out = new FileOutputStream(".\\img\\"+Name);

      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      in.close();
      out.close();
    }
    }



    /**
     * @param args the command line arguments
     */
    public static void Addmenus() {
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
            java.util.logging.Logger.getLogger(Addmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ApplyAddmenu;
    private javax.swing.JCheckBox Des;
    private javax.swing.JCheckBox Mainfoot;
    private javax.swing.JButton Save;
    private javax.swing.JTextArea Textfood;
    private javax.swing.JTextField Textpicture;
    private javax.swing.JTextArea Textrecipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane textname;
    // End of variables declaration//GEN-END:variables
}
