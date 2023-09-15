package pvzgame;

import collections.LinkedList;
import io.FileHandler;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JPanel;

/**
 * description - 
 * 
 * @author c.chuchmach
 * @since September 2020
 * 
 */
public class Level1 extends javax.swing.JFrame {
    
    
    // <editor-fold defaultstate="collapsed" desc="NETBEANS GENERATED METHODS BELOW - Generated Code">  
          
    public Level1() {
        initComponents();
        startUp();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        concrete = new javax.swing.JLabel();
        zombie1 = new javax.swing.JLabel();
        zombie2 = new javax.swing.JLabel();
        zombie3 = new javax.swing.JLabel();
        zombie4 = new javax.swing.JLabel();
        zombie5 = new javax.swing.JLabel();
        zombie6 = new javax.swing.JLabel();
        zombie7 = new javax.swing.JLabel();
        zombie8 = new javax.swing.JLabel();
        zombie9 = new javax.swing.JLabel();
        zombie10 = new javax.swing.JLabel();
        waveZombie1 = new javax.swing.JLabel();
        waveZombie2 = new javax.swing.JLabel();
        waveZombie3 = new javax.swing.JLabel();
        pea1 = new javax.swing.JLabel();
        pea2 = new javax.swing.JLabel();
        pea3 = new javax.swing.JLabel();
        pea4 = new javax.swing.JLabel();
        pea5 = new javax.swing.JLabel();
        pea6 = new javax.swing.JLabel();
        pea7 = new javax.swing.JLabel();
        pea8 = new javax.swing.JLabel();
        pea9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        rock = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        packMenu = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        peaShooterBar = new javax.swing.JProgressBar();
        peaShooterPack = new javax.swing.JLabel();
        sunMenu = new javax.swing.JPanel();
        sunAmount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        waveBar = new javax.swing.JProgressBar();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        sunBar = new javax.swing.JProgressBar();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        zombieBar = new javax.swing.JProgressBar();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        packMenu1 = new javax.swing.JPanel();
        peaShooterPack1 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        shovel = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        barrier = new javax.swing.JPanel();
        zombieRange = new javax.swing.JLabel();
        plantRange1 = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        plantRange2 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
        plantRange3 = new javax.swing.JLabel();
        grass3 = new javax.swing.JLabel();
        plantRange4 = new javax.swing.JLabel();
        grass4 = new javax.swing.JLabel();
        plantRange5 = new javax.swing.JLabel();
        grass5 = new javax.swing.JLabel();
        plantRange6 = new javax.swing.JLabel();
        grass6 = new javax.swing.JLabel();
        plantRange7 = new javax.swing.JLabel();
        grass7 = new javax.swing.JLabel();
        plantRange8 = new javax.swing.JLabel();
        grass8 = new javax.swing.JLabel();
        plantRange9 = new javax.swing.JLabel();
        grass9 = new javax.swing.JLabel();
        peaStopper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STAGE 1-1");
        setBackground(new java.awt.Color(153, 255, 255));
        setName("STAGE 1-1"); // NOI18N
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(concrete);
        concrete.setBounds(20, 180, 10, 600);

        zombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie1);
        zombie1.setBounds(1690, 10, 80, 120);

        zombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie2);
        zombie2.setBounds(1780, 10, 80, 120);

        zombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie3);
        zombie3.setBounds(1820, 10, 80, 120);

        zombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie4);
        zombie4.setBounds(1850, 10, 80, 120);

        zombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie5);
        zombie5.setBounds(1890, 10, 80, 120);

        zombie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie6);
        zombie6.setBounds(1920, 10, 80, 120);

        zombie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie7);
        zombie7.setBounds(1950, 10, 80, 120);

        zombie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie8);
        zombie8.setBounds(1990, 10, 80, 120);

        zombie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie9);
        zombie9.setBounds(2020, 10, 80, 120);

        zombie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie10);
        zombie10.setBounds(2050, 10, 80, 120);

        waveZombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie1);
        waveZombie1.setBounds(1380, 190, 80, 120);

        waveZombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie2);
        waveZombie2.setBounds(1470, 190, 80, 120);

        waveZombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie3);
        waveZombie3.setBounds(1550, 190, 80, 120);

        pea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea1);
        pea1.setBounds(1460, 460, 28, 30);

        pea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea2);
        pea2.setBounds(1490, 460, 28, 30);

        pea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea3);
        pea3.setBounds(1530, 460, 28, 30);

        pea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea4);
        pea4.setBounds(1570, 460, 28, 30);

        pea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea5);
        pea5.setBounds(1610, 460, 28, 30);

        pea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea6);
        pea6.setBounds(1650, 460, 28, 30);

        pea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea7);
        pea7.setBounds(1690, 460, 28, 30);

        pea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea8);
        pea8.setBounds(1730, 460, 28, 30);

        pea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea9);
        pea9.setBounds(1770, 460, 28, 30);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 170, 1160, 120);

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 300, 1160, 110);

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 550, 1160, 110);

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(100, 670, 1160, 100);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(1080, 30, 180, 10);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 770, 1260, 10);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(100, 290, 1160, 10);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(100, 660, 1160, 10);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(100, 540, 1160, 10);

        rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/concrete.jpg"))); // NOI18N
        getContentPane().add(rock);
        rock.setBounds(10, 170, 80, 600);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 160, 1260, 10);

        jPanel12.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(-10, 130, 740, 10);

        jPanel14.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel14);
        jPanel14.setBounds(0, 0, 10, 130);

        jPanel15.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel15);
        jPanel15.setBounds(140, 0, 10, 130);

        packMenu.setBackground(new java.awt.Color(86, 57, 0));
        packMenu.setLayout(null);

        jPanel41.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        packMenu.add(jPanel41);
        jPanel41.setBounds(650, -10, 10, 130);

        jPanel39.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        packMenu.add(jPanel39);
        jPanel39.setBounds(570, 0, 10, 130);

        peaShooterBar.setForeground(new java.awt.Color(153, 153, 153));
        peaShooterBar.setValue(100);
        packMenu.add(peaShooterBar);
        peaShooterBar.setBounds(40, 100, 60, 14);

        peaShooterPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/psPacket.png"))); // NOI18N
        peaShooterPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peaShooterPackMouseClicked(evt);
            }
        });
        packMenu.add(peaShooterPack);
        peaShooterPack.setBounds(40, 0, 70, 90);

        getContentPane().add(packMenu);
        packMenu.setBounds(150, 10, 580, 120);

        sunMenu.setBackground(new java.awt.Color(86, 57, 0));
        sunMenu.setLayout(null);

        sunAmount.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        sunAmount.setForeground(new java.awt.Color(255, 255, 204));
        sunAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sunAmount.setText("50");
        sunMenu.add(sunAmount);
        sunAmount.setBounds(0, 100, 130, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/sunN.png"))); // NOI18N
        sunMenu.add(jLabel2);
        jLabel2.setBounds(10, 0, 110, 100);

        getContentPane().add(sunMenu);
        sunMenu.setBounds(10, 10, 130, 120);

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel18);
        jPanel18.setBounds(90, 160, 10, 610);

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel19);
        jPanel19.setBounds(0, 160, 10, 610);

        jPanel20.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel20);
        jPanel20.setBounds(1130, 420, 10, 120);

        jPanel21.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel21);
        jPanel21.setBounds(220, 420, 10, 120);

        jPanel22.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel22);
        jPanel22.setBounds(350, 420, 10, 120);

        jPanel23.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel23);
        jPanel23.setBounds(480, 420, 10, 120);

        jPanel24.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel24);
        jPanel24.setBounds(610, 420, 10, 120);

        jPanel25.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel25);
        jPanel25.setBounds(740, 420, 10, 120);

        jPanel26.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel26);
        jPanel26.setBounds(870, 420, 10, 120);

        jPanel27.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel27);
        jPanel27.setBounds(1000, 420, 10, 120);

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel28);
        jPanel28.setBounds(1080, 10, 180, 10);

        jPanel53.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel53);
        jPanel53.setBounds(1210, 10, 10, 30);

        waveBar.setForeground(new java.awt.Color(255, 170, 255));
        getContentPane().add(waveBar);
        waveBar.setBounds(1090, 20, 160, 14);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel16);
        jPanel16.setBounds(100, 410, 1160, 10);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel17);
        jPanel17.setBounds(1250, 20, 10, 10);

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel29);
        jPanel29.setBounds(1080, 20, 10, 10);

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel30);
        jPanel30.setBounds(1080, 80, 180, 10);

        sunBar.setForeground(new java.awt.Color(251, 255, 175));
        getContentPane().add(sunBar);
        sunBar.setBounds(1090, 70, 160, 14);

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel31);
        jPanel31.setBounds(1250, 70, 10, 10);

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel32);
        jPanel32.setBounds(1080, 60, 180, 10);

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel33);
        jPanel33.setBounds(1080, 70, 10, 10);

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel34);
        jPanel34.setBounds(1080, 130, 180, 10);

        zombieBar.setForeground(new java.awt.Color(201, 224, 203));
        getContentPane().add(zombieBar);
        zombieBar.setBounds(1090, 120, 160, 14);

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel35);
        jPanel35.setBounds(1250, 120, 10, 10);

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel36);
        jPanel36.setBounds(1080, 110, 180, 10);

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel37);
        jPanel37.setBounds(1080, 120, 10, 10);

        packMenu1.setBackground(new java.awt.Color(86, 57, 0));
        packMenu1.setLayout(null);

        peaShooterPack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peaShooterPack1MouseClicked(evt);
            }
        });
        packMenu1.add(peaShooterPack1);
        peaShooterPack1.setBounds(10, 10, 0, 90);

        getContentPane().add(packMenu1);
        packMenu1.setBounds(150, 10, 580, 110);

        jPanel45.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel45);
        jPanel45.setBounds(0, 0, 730, 10);

        jPanel11.setBackground(new java.awt.Color(86, 57, 0));
        jPanel11.setLayout(null);

        jPanel38.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel38);
        jPanel38.setBounds(0, 0, 140, 10);

        jPanel13.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13);
        jPanel13.setBounds(0, 130, 140, 10);

        jPanel40.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel40);
        jPanel40.setBounds(0, 10, 10, 120);

        jPanel42.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel42);
        jPanel42.setBounds(130, 10, 10, 120);

        shovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/shovelN.png"))); // NOI18N
        shovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shovelMouseClicked(evt);
            }
        });
        jPanel11.add(shovel);
        shovel.setBounds(10, 10, 120, 120);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(740, 0, 140, 140);

        jPanel43.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel43);
        jPanel43.setBounds(890, 0, 140, 10);

        jPanel44.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel44);
        jPanel44.setBounds(890, 130, 140, 10);

        jPanel46.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel46);
        jPanel46.setBounds(890, 10, 10, 120);

        jPanel47.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel47);
        jPanel47.setBounds(1020, 10, 10, 120);

        jPanel48.setBackground(new java.awt.Color(86, 57, 0));
        jPanel48.setLayout(null);

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cancelN.png"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel48.add(cancel);
        cancel.setBounds(0, 0, 120, 120);

        getContentPane().add(jPanel48);
        jPanel48.setBounds(900, 10, 120, 120);

        barrier.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barrierLayout = new javax.swing.GroupLayout(barrier);
        barrier.setLayout(barrierLayout);
        barrierLayout.setHorizontalGroup(
            barrierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        barrierLayout.setVerticalGroup(
            barrierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(barrier);
        barrier.setBounds(1580, 10, 40, 120);

        zombieRange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange.setText("ZOMBIE DANGER RANGE");
        getContentPane().add(zombieRange);
        zombieRange.setBounds(100, 520, 1220, 20);

        plantRange1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange1.setText("RANGE 1");
        getContentPane().add(plantRange1);
        plantRange1.setBounds(100, 420, 120, 17);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass1MouseClicked(evt);
            }
        });
        getContentPane().add(grass1);
        grass1.setBounds(100, 420, 120, 120);

        plantRange2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange2.setText("RANGE 2");
        getContentPane().add(plantRange2);
        plantRange2.setBounds(230, 430, 120, 14);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass2MouseClicked(evt);
            }
        });
        getContentPane().add(grass2);
        grass2.setBounds(230, 420, 120, 120);

        plantRange3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange3.setText("RANGE 3");
        getContentPane().add(plantRange3);
        plantRange3.setBounds(360, 440, 120, 14);

        grass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass3MouseClicked(evt);
            }
        });
        getContentPane().add(grass3);
        grass3.setBounds(360, 420, 120, 120);

        plantRange4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange4.setText("RANGE 4");
        getContentPane().add(plantRange4);
        plantRange4.setBounds(490, 450, 120, 17);

        grass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass4MouseClicked(evt);
            }
        });
        getContentPane().add(grass4);
        grass4.setBounds(490, 420, 120, 120);

        plantRange5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange5.setText("RANGE 5");
        getContentPane().add(plantRange5);
        plantRange5.setBounds(620, 460, 120, 17);

        grass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass5MouseClicked(evt);
            }
        });
        getContentPane().add(grass5);
        grass5.setBounds(620, 420, 120, 120);

        plantRange6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange6.setText("RANGE 6");
        getContentPane().add(plantRange6);
        plantRange6.setBounds(750, 470, 120, 17);

        grass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass6MouseClicked(evt);
            }
        });
        getContentPane().add(grass6);
        grass6.setBounds(750, 420, 120, 120);

        plantRange7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange7.setText("RANGE 7");
        getContentPane().add(plantRange7);
        plantRange7.setBounds(880, 480, 120, 17);

        grass7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass7MouseClicked(evt);
            }
        });
        getContentPane().add(grass7);
        grass7.setBounds(880, 420, 120, 120);

        plantRange8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange8.setText("RANGE 8");
        getContentPane().add(plantRange8);
        plantRange8.setBounds(1010, 490, 120, 17);

        grass8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass8MouseClicked(evt);
            }
        });
        getContentPane().add(grass8);
        grass8.setBounds(1010, 420, 120, 120);

        plantRange9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange9.setText("RANGE 9");
        getContentPane().add(plantRange9);
        plantRange9.setBounds(1140, 500, 120, 17);

        grass9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass9MouseClicked(evt);
            }
        });
        getContentPane().add(grass9);
        grass9.setBounds(1140, 420, 120, 120);

        peaStopper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peaStopper.setText("STOP");
        peaStopper.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(peaStopper);
        peaStopper.setBounds(1350, 380, 60, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void peaShooterPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peaShooterPackMouseClicked
        originalPeaShooterPackMouseClicking(evt);
    }//GEN-LAST:event_peaShooterPackMouseClicked
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        formMouseMoving(evt);
    }//GEN-LAST:event_formMouseMoved

    private void peaShooterPack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peaShooterPack1MouseClicked
        
    }//GEN-LAST:event_peaShooterPack1MouseClicked

    private void shovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shovelMouseClicked
        shovelClicked();
    }//GEN-LAST:event_shovelMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        cancelClicked(evt);
    }//GEN-LAST:event_cancelMouseClicked

    private void grass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass1MouseClicked
        grassClicked(evt, 100, 420);
    }//GEN-LAST:event_grass1MouseClicked

    private void grass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass2MouseClicked
        grassClicked(evt, 230, 420);
    }//GEN-LAST:event_grass2MouseClicked

    private void grass3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass3MouseClicked
        grassClicked(evt, 360, 420);
    }//GEN-LAST:event_grass3MouseClicked

    private void grass4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass4MouseClicked
        grassClicked(evt, 490, 420);
    }//GEN-LAST:event_grass4MouseClicked

    private void grass5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass5MouseClicked
        grassClicked(evt, 620, 420);
    }//GEN-LAST:event_grass5MouseClicked

    private void grass6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass6MouseClicked
        grassClicked(evt, 750, 420);
    }//GEN-LAST:event_grass6MouseClicked

    private void grass7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass7MouseClicked
        grassClicked(evt, 880, 420);
    }//GEN-LAST:event_grass7MouseClicked

    private void grass8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass8MouseClicked
        grassClicked(evt, 1010, 420);
    }//GEN-LAST:event_grass8MouseClicked

    private void grass9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass9MouseClicked
        grassClicked(evt, 1140, 420);
    }//GEN-LAST:event_grass9MouseClicked
    
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="NetBeans Objects - Generated Code">    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrier;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel concrete;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel grass3;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel packMenu;
    private javax.swing.JPanel packMenu1;
    private javax.swing.JLabel pea1;
    private javax.swing.JLabel pea2;
    private javax.swing.JLabel pea3;
    private javax.swing.JLabel pea4;
    private javax.swing.JLabel pea5;
    private javax.swing.JLabel pea6;
    private javax.swing.JLabel pea7;
    private javax.swing.JLabel pea8;
    private javax.swing.JLabel pea9;
    private javax.swing.JProgressBar peaShooterBar;
    private javax.swing.JLabel peaShooterPack;
    private javax.swing.JLabel peaShooterPack1;
    private javax.swing.JLabel peaStopper;
    private javax.swing.JLabel plantRange1;
    private javax.swing.JLabel plantRange2;
    private javax.swing.JLabel plantRange3;
    private javax.swing.JLabel plantRange4;
    private javax.swing.JLabel plantRange5;
    private javax.swing.JLabel plantRange6;
    private javax.swing.JLabel plantRange7;
    private javax.swing.JLabel plantRange8;
    private javax.swing.JLabel plantRange9;
    private javax.swing.JLabel rock;
    private javax.swing.JLabel shovel;
    private javax.swing.JLabel sunAmount;
    private javax.swing.JProgressBar sunBar;
    private javax.swing.JPanel sunMenu;
    private javax.swing.JProgressBar waveBar;
    private javax.swing.JLabel waveZombie1;
    private javax.swing.JLabel waveZombie2;
    private javax.swing.JLabel waveZombie3;
    private javax.swing.JLabel zombie1;
    private javax.swing.JLabel zombie10;
    private javax.swing.JLabel zombie2;
    private javax.swing.JLabel zombie3;
    private javax.swing.JLabel zombie4;
    private javax.swing.JLabel zombie5;
    private javax.swing.JLabel zombie6;
    private javax.swing.JLabel zombie7;
    private javax.swing.JLabel zombie8;
    private javax.swing.JLabel zombie9;
    private javax.swing.JProgressBar zombieBar;
    private javax.swing.JLabel zombieRange;
    // End of variables declaration//GEN-END:variables

    // </editor-fold>  
    
    
    // CREATED METHODS AND PROPERTIES BELOW...............................
    
    private final String NEW_PEA_IMAGE   = "/media/peaShooterNEW.gif";
    private final String NEW_SPADE_IMAGE = "/media/shovelN.png";
    
    private final int SUN_DELAY                      = 100;
    private final int SUN_STARTING_VALUE             = 50; 
    private final int SUN_PROGRESS_MAX               = 100;
    private final int SUN_INCREASE                   = 25;    
    private int       zombieSpawnDelay               = 175;
    private final int WAVE_ZOMBIE_SPAWN_DELAY        = 400;
    private final int ZOMBIE_MOVE_DELAY              = 22;
    private final int ZOMBIE_PROGRESS_MAX            = 100;
    private final int ZOMBIE_SPAWN_X                 = 1300;
    private final int ZOMBIE_SPAWN_Y                 = 420;
    private final int ZOMBIE_SPAWN_CURRENT_MAX       = 10;
    private final int ZOMBIE_WAVE_SPAWN_CURRENT_MAX  = 3;
    private final int ZOMBIE_X_AMOUNT                = 50;
    private final int ZOMBIE_X_AMOUNT_INTERSECT      = 30;        
    private final int PEA_RECHARGE_DELAY             = 40;
    private final int PEA_RECHARGE_MAX               = 100;
    private final int PEA_PACK_X                     = 40;
    private final int PEA_PACK_Y                     = 0;
    private final int SHOVEL_X                       = 10;
    private final int SHOVEL_Y                       = 10;
    private final int PEA_NEW_X                      = 150;
    private final int PEA_NEW_Y                      = 10;
    private final int PEA_NEW_WIDTH                  = 110;
    private final int PEA_NEW_HEIGHT                 = 120;
    private final int PEA_PLANT_HEALTH               = 5;    
    private final int SPADE_NEW_X                    = 750;
    private final int SPADE_NEW_Y                    = 10;
    private final int SPADE_NEW_WIDTH                = 110;
    private final int SPADE_NEW_HEIGHT               = 110;    
    private final int PROJECTILE_MOVE_DELAY          = 45;   
    private final int RANGE_RETURN_DELAY             = 1000;
    private final int FRAME_WIDTH                    = 1275;
    private final int FRAME_HEIGHT                   = 819;        
    private final int OFF_SCREEN_X                   = 10000;
    private final int OFF_SCREEN_Y                   = 10000;
    private final int STARTING_AMOUNT                = 100;
    

    private boolean plantPickup;
    private boolean plantPlaced;
    private boolean shovelPickup;
    private boolean peaShooterRecharged;
    private boolean spadeHasClicked;
    private boolean hasClicked;
    private boolean range1Trigger;
    private boolean range2Trigger;
    private boolean range3Trigger;
    private boolean range4Trigger;
    private boolean range5Trigger;
    private boolean range6Trigger;
    private boolean range7Trigger;
    private boolean range8Trigger;
    private boolean range9Trigger;
    
    private int sunProgress;
    private int waveProgress;
    private int zombieProgress;
    private int rechargePeaBar;    
    private int sun;
    private int peaShooterHealth;
    private int amount;
    private int direction;
    private int x;
    private int y;
    private int current;
    private int waveCurrent;
        
    private Timer sunTimer;
    private Timer zombieSpawnTimer;
    private Timer waveZombieSpawnTimer;
    private Timer waveZombieMoveTimer;
    private Timer peaSRechargeTimer;
    private Timer zombieMoveTimer;
    private Timer projectileMoveTimer;
    private Timer rangeReturnTimer;
    
    private JLabel newPeaShooter;
        
    private Rectangle r1;
    private Rectangle r2;
    private Rectangle r3;
    private Rectangle r4;
    private Rectangle r5;
    private Rectangle r6;
    private Rectangle r7;
    private Rectangle r8;
    private Rectangle r9;
    private Rectangle p1;
    private Rectangle p2;
    private Rectangle p3;
    private Rectangle p4;
    private Rectangle p5;
    private Rectangle p6;
    private Rectangle p7;
    private Rectangle p8;
    private Rectangle p9;
    private Rectangle zombieHB;
    private Rectangle waveZombieHB;
    private Rectangle peaStop;
    
    private LinkedList<JLabel>  plantPickupLabels;  
    private LinkedList<JLabel>  spadePickupLabels;
    private LinkedList<JLabel>  zombieSpawnLabels;
    private LinkedList<Boolean> plantPickups; 
    private LinkedList<Boolean> plantsPlaced;
    private LinkedList<Boolean> shovels;
    private LinkedList<JLabel> zombies;
    private LinkedList<JLabel> waveZombies;
    private LinkedList<JLabel> ranges;
    private LinkedList<JLabel> peas;
    
    private void startUp() {
        
        // Set global variables to starting values
        plantPickup         = false;
        plantPlaced         = false;
        shovelPickup        = false;
        peaShooterRecharged = true;
        spadeHasClicked     = false;
        hasClicked          = false;
        range1Trigger       = false;
        sunProgress         = 0;
        zombieProgress      = 0;
        direction           = 0;
        x                   = 0;
        y                   = 0;
        current             = 0;
        waveCurrent         = 0;
        rechargePeaBar      = PEA_RECHARGE_MAX;    
        sun                 = SUN_STARTING_VALUE;
        peaShooterHealth    = PEA_PLANT_HEALTH;
        amount              = STARTING_AMOUNT;
        
        // Instantiate all objects
        plantPickupLabels = new LinkedList<>();  
        spadePickupLabels = new LinkedList<>();
        zombieSpawnLabels = new LinkedList<>();
        plantPickups      = new LinkedList<>(); 
        plantsPlaced      = new LinkedList<>();
        shovels           = new LinkedList<>();
        zombies           = new LinkedList<>();
        waveZombies       = new LinkedList<>();
        ranges            = new LinkedList<>();
        peas              = new LinkedList<>();
        newPeaShooter     = new JLabel();
        r1                = new Rectangle();
        r2                = new Rectangle();
        r3                = new Rectangle();
        r4                = new Rectangle();
        r5                = new Rectangle();
        r6                = new Rectangle();
        r7                = new Rectangle();
        r8                = new Rectangle();
        r9                = new Rectangle();
        p1                = new Rectangle();
        p2                = new Rectangle();
        p3                = new Rectangle();
        p4                = new Rectangle();
        p5                = new Rectangle();
        p6                = new Rectangle();
        p7                = new Rectangle();
        p8                = new Rectangle();
        p9                = new Rectangle();
        zombieHB          = new Rectangle();
        waveZombieHB      = new Rectangle();
        peaStop           = new Rectangle();
        
        // Add the labels to the list
        zombies.add(zombie1);
        zombies.add(zombie2);
        zombies.add(zombie3);
        zombies.add(zombie4);
        zombies.add(zombie5);
        zombies.add(zombie6);
        zombies.add(zombie7);
        zombies.add(zombie8);
        zombies.add(zombie9);
        zombies.add(zombie10);
        
        waveZombies.add(waveZombie1);
        waveZombies.add(waveZombie2);
        waveZombies.add(waveZombie3);
        // now all the ranges to it's list
        ranges.add(plantRange1);
        ranges.add(plantRange2);
        ranges.add(plantRange3);
        ranges.add(plantRange4);
        ranges.add(plantRange5);
        ranges.add(plantRange6);
        ranges.add(plantRange7);
        ranges.add(plantRange8);
        ranges.add(plantRange9);     
        //now all the peas to it's list
        peas.add(pea1);
        peas.add(pea2);
        peas.add(pea3);
        peas.add(pea4);
        peas.add(pea5);
        peas.add(pea6);
        peas.add(pea7);
        peas.add(pea8);
        peas.add(pea9);  
        // get the first hit box for a zombie
        zombieHB = getRectangle(zombies.get(1));
        waveZombieHB = getRectangle(waveZombies.get(1));
       // p1       = getRectangle(pea1);
        // set up all timers       
        setTimers();
        // set up the frame properties
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);        
        this.setVisible(true);
    }
    
    private void setTimers() {
        // set all the timer's delay and action event methods
        sunTimer = new Timer(SUN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sunSpawnTime();
            }
        });        
        zombieSpawnTimer = new Timer(zombieSpawnDelay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zombieSpawnTime();
            }
        });    
        waveZombieSpawnTimer = new Timer(WAVE_ZOMBIE_SPAWN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                waveZombieSpawnTime();
            }
        });    
        zombieMoveTimer = new Timer(ZOMBIE_MOVE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zombieMove();
            }
        });   
        waveZombieMoveTimer  = new Timer(ZOMBIE_MOVE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                waveZombieMove();
            }
        });   
        projectileMoveTimer = new Timer(PROJECTILE_MOVE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                projectileMove();
            }
        });        
        peaSRechargeTimer = new Timer(PEA_RECHARGE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                peaShooterRecharge();
            }
        });   
        rangeReturnTimer = new Timer(RANGE_RETURN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeReturn();
            }
        }); 
        // Start the relevant timers
        sunTimer.start();
        zombieSpawnTimer.start();
        projectileMoveTimer.start();
        //waveZombieSpawnTimer.start();
    }
    
    private void sunSpawnTime() {
        sunProgress = sunProgress + 1;          // increase to ...
        sunAmount.setText("" + sun);
        sunBar.setValue(sunProgress);           // change progress bar 
        if (sunProgress >= SUN_PROGRESS_MAX) {  // check if at bar max
            sunProgress = 0;                    // reset back to zero
            sun = sun + SUN_INCREASE;           // increase sun count by 25
            sunAmount.setText("" + sun);        // display this to user
        }
    }
       
    private void zombieSpawnTime() {
        zombieProgress = zombieProgress + 1;        
        zombieBar.setValue(zombieProgress);        
        if (zombieProgress == ZOMBIE_PROGRESS_MAX) {                                                      
            zombies.get(current).setLocation(ZOMBIE_SPAWN_X, ZOMBIE_SPAWN_Y);            
            current++;
            zombieMoveTimer.start();            
            zombieProgress = 0;     
            zombieSpawnDelay = zombieSpawnDelay - 15;
        }        
        if (current >= ZOMBIE_SPAWN_CURRENT_MAX){
            zombieSpawnTimer.stop();
        }
    }
    
    private void waveZombieSpawnTime(){        
        JLabel label = waveZombies.get(waveCurrent);     
        if (label != null) {
            label.setLocation(ZOMBIE_SPAWN_X, ZOMBIE_SPAWN_Y);            
        }
        waveCurrent++;
        waveZombieMoveTimer.start();               
        
        if (waveCurrent >= ZOMBIE_WAVE_SPAWN_CURRENT_MAX){
            waveZombieSpawnTimer.stop();
        }
    }
    
    private Rectangle getRectangle(JLabel label) {
        Rectangle rectangle = new Rectangle(label.getX(),
                                            label.getY(),
                                            label.getWidth(),
                                            label.getHeight());
        return rectangle;
    }
    
    private Rectangle getRectangle(JPanel panel) {
        Rectangle rectangle = new Rectangle(panel.getX(),
                                            panel.getY(),
                                            panel.getWidth(),
                                            panel.getHeight());
        return rectangle;
    }
    
    private void zombieMove() {     
        if (newPeaShooter == null) {
            newPeaShooter = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle stop = getRectangle(barrier);
        Rectangle r1 = getRectangle(plantRange1);
        Rectangle r2 = getRectangle(plantRange2);
        Rectangle r3 = getRectangle(plantRange3);
        Rectangle r4 = getRectangle(plantRange4);
        Rectangle r5 = getRectangle(plantRange5);
        Rectangle r6 = getRectangle(plantRange6);
        Rectangle r7 = getRectangle(plantRange7);
        Rectangle r8 = getRectangle(plantRange8);
        Rectangle r9 = getRectangle(plantRange9);
        Rectangle zr = getRectangle(zombieRange);
        
        for (int zombie = 0; zombie < zombies.size(); zombie++) {    
            JLabel label = zombies.get(zombie);
            zombieHB = getRectangle(label);           
            entrance = getRectangle(concrete);         
            stop = getRectangle(barrier);
            zombieHB.x -= 1;
            
            if (zombieHB.intersects(entrance)) {
                zombieSpawnTimer.stop();
                zombieMoveTimer.stop();
                String text = "Level1";

                try {
                    File file = new File("saveData.txt");
                    if (file.exists() == false) {
                        file.createNewFile();
                    }
                    if (text == null) {
                        file.delete();
                    } else {
                        FileHandler<String> handler = new FileHandler<>();
                        handler.save(text, file);
                    }
                } catch (IOException error) {
                    System.out.println("Error in save method");
                }
                GameOver stage1 = new GameOver();
                this.dispose();
                zombieHB.setLocation(0, -5000);
            }
            
            // checking all the plants....................................            
            int totalPlants = plantPickupLabels.size();
            for (int plant = 0; plant < totalPlants; plant++) {
                newPeaShooter = plantPickupLabels.get(plant);                
                Rectangle peaShooterHB = getRectangle(newPeaShooter);
                newPeaShooter.setBounds(peaShooterHB.x, 
                                        peaShooterHB.y,
                                        peaShooterHB.width, 
                                        peaShooterHB.height);
                peaShooterHB = getRectangle(newPeaShooter);                
                if (zombieHB.intersects(peaShooterHB)) {
                    zombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("plant health is " + 
                                       Globals.player.psPlantHealth);
                }     
                // checking other stuff
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(120, 440);
                    p1 = getRectangle(pea1);
                }
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(240, 440);
                    p2 = getRectangle(pea2);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(360, 440);
                    p3 = getRectangle(pea3);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(480, 440);
                    p4 = getRectangle(pea4);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(600, 440);
                    p5 = getRectangle(pea5);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(720, 440);
                    p6 = getRectangle(pea6);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(840, 440);
                    p7 = getRectangle(pea7);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(980, 440);
                    p8 = getRectangle(pea8);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1080, 440);
                    p9 = getRectangle(pea9);
                } 
                
                if (Globals.player.psPlantHealth == 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 5;
                    label.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }               
            }            
            ////////////////////////////////////////////
            
            
            if (zombieHB.intersects(stop)) {
                zombieHB.x += ZOMBIE_X_AMOUNT_INTERSECT;
            }
            
            label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
        }
        
        if (waveProgress >= 80){
            waveZombieSpawnTimer.start();
        }
        
    }
    
    private void waveZombieMove(){
        
        if (newPeaShooter == null) {
            newPeaShooter = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle stop = getRectangle(barrier);
        Rectangle r1 = getRectangle(plantRange1);
        Rectangle r2 = getRectangle(plantRange2);
        Rectangle r3 = getRectangle(plantRange3);
        Rectangle r4 = getRectangle(plantRange4);
        Rectangle r5 = getRectangle(plantRange5);
        Rectangle r6 = getRectangle(plantRange6);
        Rectangle r7 = getRectangle(plantRange7);
        Rectangle r8 = getRectangle(plantRange8);
        Rectangle r9 = getRectangle(plantRange9);
        Rectangle zr = getRectangle(zombieRange);
        
        for (int zombieWave = 0; zombieWave < waveZombies.size(); zombieWave++) {    
            JLabel label = waveZombies.get(zombieWave);
            waveZombieHB = getRectangle(label);           
            entrance = getRectangle(concrete);
            
            stop = getRectangle(barrier);
            waveZombieHB.x -= 1;
            
            if (waveZombieHB.intersects(entrance)) {
                waveZombieSpawnTimer.stop();
                waveZombieMoveTimer.stop();
                this.dispose();
                GameOver gameEnd = new GameOver();
                waveZombieHB.setLocation(0, -5000);
            }
            
            // checking all the plants....................................            
            int totalPlants = plantPickupLabels.size();
            for (int plant = 0; plant < totalPlants; plant++) {
                newPeaShooter = plantPickupLabels.get(plant);                
                Rectangle peaShooterHB = getRectangle(newPeaShooter);
                newPeaShooter.setBounds(peaShooterHB.x, 
                                        peaShooterHB.y,
                                        peaShooterHB.width, 
                                        peaShooterHB.height);
                peaShooterHB = getRectangle(newPeaShooter);                
                if (waveZombieHB.intersects(peaShooterHB)) {
                    waveZombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("plant health is " + 
                                       Globals.player.psPlantHealth);
                }     
                // checking other stuff
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(120, 440);
                    p1 = getRectangle(pea1);
                }
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(240, 440);
                    p2 = getRectangle(pea2);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea3.setLocation(240, 440);
                    p3 = getRectangle(pea3);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea4.setLocation(240, 440);
                    p4 = getRectangle(pea4);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea5.setLocation(240, 440);
                    p5 = getRectangle(pea5);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea6.setLocation(240, 440);
                    p6 = getRectangle(pea6);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea7.setLocation(240, 440);
                    p7 = getRectangle(pea7);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea8.setLocation(240, 440);
                    p8 = getRectangle(pea8);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea9.setLocation(240, 440);
                    p9 = getRectangle(pea9);
                } 
                
                if (Globals.player.psPlantHealth == 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 5;
                    label.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }               
            }            
            ////////////////////////////////////////////
            
            
            if (waveZombieHB.intersects(stop)) {
                waveZombieHB.x += ZOMBIE_X_AMOUNT_INTERSECT;
            }
            
            label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
        }
        
    }
     
    private void projectileMove() {
        
        
       Rectangle pStopper = getRectangle(peaStopper);
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p1 = getRectangle(pea1);

            if (range1Trigger == true){

                p1.x += 1;
                pea1.setLocation(p1.x, p1.y);

            }
            if (range1Trigger == false){
                
                p1.x = 0;
                
            }
            if (p1.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p1.intersects(pStopper)){
                
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p2 = getRectangle(pea2);

            if (range2Trigger == true){

                p2.x += 1;
                pea2.setLocation(p2.x, p2.y);

            }
            if (range2Trigger == false){
                
                p2.x = 0;
                
            }
            if (p2.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p2.intersects(pStopper)){
                
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p3 = getRectangle(pea3);

            if (range3Trigger == true){

                p3.x += 1;
                pea3.setLocation(p3.x, p3.y);

            }
            if (range3Trigger == false){
                
                p3.x = 0;
                
            }
            if (p3.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p3.intersects(pStopper)){
                
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p4 = getRectangle(pea4);

            if (range4Trigger == true){

                p4.x += 1;
                pea4.setLocation(p4.x, p4.y);

            }
            if (range4Trigger == false){
                
                p4.x = 0;
                
            }
            if (p4.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p4.intersects(pStopper)){
                
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p5 = getRectangle(pea5);

            if (range5Trigger == true){

                p5.x += 1;
                pea5.setLocation(p5.x, p5.y);

            }
            if (range5Trigger == false){
                
                p5.x = 0;
                
            }
            if (p5.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p5.intersects(pStopper)){
                
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p6 = getRectangle(pea6);

            if (range6Trigger == true){

                p6.x += 1;
                pea6.setLocation(p6.x, p6.y);

            }
            if (range6Trigger == false){
                
                p6.x = 0;
                
            }
            if (p6.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p6.intersects(pStopper)){
                
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p7 = getRectangle(pea7);

            if (range7Trigger == true){

                p7.x += 1;
                pea7.setLocation(p7.x, p7.y);

            }
            if (range7Trigger == false){
                
                p7.x = 0;
                
            }
            if (p7.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p7.intersects(pStopper)){
                
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p8 = getRectangle(pea8);

            if (range8Trigger == true){

                p8.x += 1;
                pea8.setLocation(p8.x, p8.y);

            }
            if (range8Trigger == false){
                
                p8.x = 0;
                
            }
            if (p8.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p8.intersects(pStopper)){
                
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p9 = getRectangle(pea9);

            if (range9Trigger == true){

                p9.x += 1;
                pea9.setLocation(p9.x, p9.y);

            }
            if (range9Trigger == false){
                
                p9.x = 0;
                
            }
            if (p9.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level1Win complete1 = new Level1Win();
            }
            
            if (p9.intersects(pStopper)){
                
                pea9.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       if (p1.intersects(pStopper)){
           pea1.setLocation(1500, 460);
           range1Trigger = false;
           rangeReturnTimer.start();
       }
       
       //////////////////////
       ////WAVE ZOMBIES//////
       //////////////////////
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p1 = getRectangle(pea1);

            if (range1Trigger == true){

                p1.x += 1;
                pea1.setLocation(p1.x, p1.y);

            }
            if (range1Trigger == false){
                
                p1.x = 0;
                
            }
            if (p1.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
                }
            }
            
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p2 = getRectangle(pea2);

            if (range2Trigger == true){

                p2.x += 1;
                pea2.setLocation(p2.x, p2.y);

            }
            if (range2Trigger == false){
                
                p2.x = 0;
                
            }
            if (p2.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }  
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p3 = getRectangle(pea3);

            if (range3Trigger == true){

                p3.x += 1;
                pea3.setLocation(p3.x, p3.y);

            }
            if (range3Trigger == false){
                
                p3.x = 0;
                
            }
            if (p3.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p4 = getRectangle(pea4);

            if (range4Trigger == true){

                p4.x += 1;
                pea4.setLocation(p4.x, p4.y);

            }
            if (range4Trigger == false){
                
                p4.x = 0;
                
            }
            if (p4.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p5 = getRectangle(pea5);

            if (range5Trigger == true){

                p5.x += 1;
                pea5.setLocation(p5.x, p5.y);

            }
            if (range5Trigger == false){
                
                p5.x = 0;
                
            }
            if (p5.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p6 = getRectangle(pea6);

            if (range6Trigger == true){

                p6.x += 1;
                pea6.setLocation(p6.x, p6.y);

            }
            if (range6Trigger == false){
                
                p6.x = 0;
                
            }
            if (p6.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p7 = getRectangle(pea7);

            if (range7Trigger == true){

                p7.x += 1;
                pea7.setLocation(p7.x, p7.y);

            }
            if (range7Trigger == false){
                
                p7.x = 0;
                
            }
            if (p7.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p8 = getRectangle(pea8);

            if (range8Trigger == true){

                p8.x += 1;
                pea8.setLocation(p8.x, p8.y);

            }
            if (range8Trigger == false){
                
                p8.x = 0;
                
            }
            if (p8.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p9 = getRectangle(pea9);

            if (range9Trigger == true){

                p9.x += 1;
                pea9.setLocation(p9.x, p9.y);

            }
            if (range9Trigger == false){
                
                p9.x = 0;
                
            }
            if (p9.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 8;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                System.out.println("GAME WIN");
            }
       }        

    }
    
    private void rangeReturn(){
    
        if (range1Trigger == false){
        plantRange1.setLocation(100, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();
        }
        
        if(range2Trigger == false){
        plantRange2.setLocation(230, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range3Trigger == false){
        plantRange3.setLocation(360, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range4Trigger == false){
        plantRange4.setLocation(490, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range5Trigger == false){
        plantRange5.setLocation(620, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range6Trigger == false){
        plantRange6.setLocation(750, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range7Trigger == false){
        plantRange7.setLocation(880, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range8Trigger == false){
        plantRange8.setLocation(1010, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        
        if(range9Trigger == false){
        plantRange9.setLocation(1140, 420);
        zombieRange.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
    
    }
     
    private void peaShooterRecharge() {        
        peaSRechargeTimer.start();       
        rechargePeaBar = rechargePeaBar + 1;        
        peaShooterBar.setValue(rechargePeaBar);        
        if (rechargePeaBar == PEA_RECHARGE_MAX){            
            peaShooterRecharged = true;
            peaSRechargeTimer.stop();
        }
        else {            
            peaShooterRecharged = false;            
        }      
    }
        
    private void grassClicked(MouseEvent evt, int x, int y) {  
        if (hasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            newPeaShooter = plantPickupLabels.get(index);
            newPeaShooter.setLocation(x, y);    
            hasClicked = false;
            rechargePeaBar = 0;
            peaSRechargeTimer.start();
            peaShooterPack.setLocation(PEA_PACK_X, PEA_PACK_Y);            
        }
    }
        
    private void newPeaShooterPackMouseClicked(MouseEvent evt, int index) {  
        if (spadeHasClicked == true) {            
            JLabel peaShooter = plantPickupLabels.get(index);
            peaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);      
        }
        else if (spadeHasClicked == true){
            System.out.println("CLICK ON A PLANT");
        }
    }
    
    private void originalPeaShooterPackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX && peaShooterRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX;          
            if (hasClicked == false) {               
                hasClicked = true;
                peaShooterPack.setLocation(OFF_SCREEN_X, PEA_PACK_Y);                
            }
            else if (hasClicked == true && peaShooterRecharged == true) {               
                hasClicked = true;
                System.out.println("PLANT THE PEASHOOTER OR CANCEL");               
            }          
            plantPickups.add(plantPickup);
            plantsPlaced.add(plantPlaced);            
            int index = plantPickupLabels.size();
            JLabel newPeaShooter = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource(NEW_PEA_IMAGE));
            newPeaShooter.setIcon(icon);
            newPeaShooter.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    newPeaShooterPackMouseClicked(evt,index);
                }
            });
            getContentPane().add(newPeaShooter);            
            x += PEA_NEW_X;
            y += PEA_NEW_Y;            
            newPeaShooter.setBounds(x, y, PEA_NEW_WIDTH, PEA_NEW_HEIGHT);
            getContentPane().setComponentZOrder(newPeaShooter, 0);            
            plantPickupLabels.add(newPeaShooter);            
            Globals.player.psPlantHealth = PEA_PLANT_HEALTH;
        }        
        if(sun >= SUN_PROGRESS_MAX && peaShooterRecharged == false){
            System.out.println("PEA SHOOTER NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX && peaShooterRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX && peaShooterRecharged == false){
            System.out.println("PEA SHOOTER NOT RECHARGED YET AND NOT ENOUGH SUN");
        }
    }
    
    private void shovelClicked() {         
        shovelPickup = true;          
        if (hasClicked == false) {
            spadeHasClicked = true;
            shovel.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
        }
        else {
            spadeHasClicked = false;
        }         
        int index = spadePickupLabels.size();
        JLabel spade = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource(NEW_SPADE_IMAGE));
        spade.setIcon(icon);       
        getContentPane().add(spade);        
        x += SPADE_NEW_X;
        y += SPADE_NEW_Y;        
        spade.setBounds(x, y, SPADE_NEW_WIDTH, SPADE_NEW_HEIGHT);            
        getContentPane().setComponentZOrder(spade, 0);          
        spadePickupLabels.add(spade);        
    }


    private void formMouseMoving(MouseEvent evt) {        
        if (hasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            JLabel peaShooter = plantPickupLabels.get(index);
            if (peaShooter != null) {
                int w = peaShooter.getWidth();
                int h = peaShooter.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                peaShooter.setBounds(x, y, w, h);
            }
        }        
        if (spadeHasClicked == true) {
            int index = spadePickupLabels.size() - 1;
            JLabel spade = spadePickupLabels.get(index);
            if (spade != null) {
                int w = spade.getWidth();
                int h = spade.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                spade.setBounds(x, y, w, h);
            }
        }
    }
   
    
    private void cancelClicked(MouseEvent evt) {        
        if (hasClicked == true) {            
            hasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel peaShooter = plantPickupLabels.get(index);
            peaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + SUN_PROGRESS_MAX;      
            peaShooterPack.setLocation(PEA_PACK_X, PEA_PACK_Y);
        }        
        else if (spadeHasClicked == true) {            
            spadeHasClicked = false;     
            int index = spadePickupLabels.size() - 1;
            JLabel spade = spadePickupLabels.get(index);
            spade.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            shovel.setLocation(SHOVEL_X, SHOVEL_Y);
        }   
    }   
    
}
