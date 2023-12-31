
package pvzgame;

import io.FileHandler;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author c.chuchmach
 */
public class StartScreen extends javax.swing.JFrame {


    public StartScreen() throws IOException {
        initComponents();
        setSize(773, 438);
        setLocationRelativeTo(null);
        this.setVisible(true);
        setResizable(false); 
             
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        continueBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().setLayout(null);

        startBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        startBtn.setText("NEW GAME");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn);
        startBtn.setBounds(300, 110, 150, 25);

        quitBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        quitBtn.setText("QUIT");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn);
        quitBtn.setBounds(300, 170, 150, 23);

        continueBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        continueBtn.setText("CONTINUE");
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(continueBtn);
        continueBtn.setBounds(300, 140, 150, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/title.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        
        String text = "Level1";
        
        try {        
            File file = new File("saveData.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }
            if (text == null) {
                file.delete();
            }
            else {
                FileHandler<String> handler = new FileHandler<>();
                handler.save(text, file);
            }
        }
        catch (IOException error) {
            System.out.println("Error in save method");
        }   
        Level1 stage1 = new Level1();
        this.dispose();
        
    }//GEN-LAST:event_startBtnActionPerformed

    
    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_quitBtnActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
     
        open();
        
    }//GEN-LAST:event_continueBtnActionPerformed

    private void open() {   
        File file = new File("saveData.txt");
        if (file.exists()) {
            FileHandler<String> handler = new FileHandler<>();
            String text = handler.open(file);
            
            if(text.equals("")){
                JOptionPane.showMessageDialog(null, "NO SAVED DATA");
            }
            else if (text.equals("Level1"))
            {
                Level1 stage1 = new Level1();
                this.dispose();
            }
            else if (text.equals("Level2"))
            {
                Level2 stage2 = new Level2();
                this.dispose();
            }
            else if (text.equals("Level3"))
            {
                Level3 stage3 = new Level3();
                this.dispose();
            }
            else if (text.equals("Level4"))
            {
                Level4 stage4 = new Level4();
                this.dispose();
            }
            else if (text.equals("Level5"))
            {
                Level5 stage5 = new Level5();
                this.dispose();
            }           
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
