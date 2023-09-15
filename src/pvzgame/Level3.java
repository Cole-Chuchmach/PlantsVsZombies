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
import java.nio.channels.Channels;
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
public class Level3 extends javax.swing.JFrame {
    
    
    // <editor-fold defaultstate="collapsed" desc="NETBEANS GENERATED METHODS BELOW - Generated Code">  
          
    public Level3() {
        initComponents();
        startUp();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        zombie11 = new javax.swing.JLabel();
        zombie12 = new javax.swing.JLabel();
        zombie13 = new javax.swing.JLabel();
        zombie14 = new javax.swing.JLabel();
        zombie15 = new javax.swing.JLabel();
        waveZombie1 = new javax.swing.JLabel();
        waveZombie2 = new javax.swing.JLabel();
        waveZombie3 = new javax.swing.JLabel();
        waveZombie4 = new javax.swing.JLabel();
        waveZombie5 = new javax.swing.JLabel();
        pea1 = new javax.swing.JLabel();
        pea2 = new javax.swing.JLabel();
        pea3 = new javax.swing.JLabel();
        pea4 = new javax.swing.JLabel();
        pea5 = new javax.swing.JLabel();
        pea6 = new javax.swing.JLabel();
        pea7 = new javax.swing.JLabel();
        pea8 = new javax.swing.JLabel();
        pea9 = new javax.swing.JLabel();
        pea10 = new javax.swing.JLabel();
        pea11 = new javax.swing.JLabel();
        pea12 = new javax.swing.JLabel();
        pea13 = new javax.swing.JLabel();
        pea14 = new javax.swing.JLabel();
        pea15 = new javax.swing.JLabel();
        pea16 = new javax.swing.JLabel();
        pea17 = new javax.swing.JLabel();
        pea18 = new javax.swing.JLabel();
        pea19 = new javax.swing.JLabel();
        pea20 = new javax.swing.JLabel();
        pea21 = new javax.swing.JLabel();
        pea22 = new javax.swing.JLabel();
        pea23 = new javax.swing.JLabel();
        pea24 = new javax.swing.JLabel();
        pea25 = new javax.swing.JLabel();
        pea26 = new javax.swing.JLabel();
        pea27 = new javax.swing.JLabel();
        explosion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        concrete = new javax.swing.JLabel();
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
        sunFlowerPack = new javax.swing.JLabel();
        cherryBombPack = new javax.swing.JLabel();
        cherryBombBar = new javax.swing.JProgressBar();
        sunFlowerBar = new javax.swing.JProgressBar();
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
        jPanel69 = new javax.swing.JPanel();
        waveBar = new javax.swing.JProgressBar();
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
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        plantRange10 = new javax.swing.JLabel();
        plantRange11 = new javax.swing.JLabel();
        plantRange12 = new javax.swing.JLabel();
        plantRange13 = new javax.swing.JLabel();
        plantRange14 = new javax.swing.JLabel();
        plantRange15 = new javax.swing.JLabel();
        plantRange16 = new javax.swing.JLabel();
        plantRange17 = new javax.swing.JLabel();
        plantRange18 = new javax.swing.JLabel();
        zombieRange2 = new javax.swing.JLabel();
        grass10 = new javax.swing.JLabel();
        grass11 = new javax.swing.JLabel();
        grass12 = new javax.swing.JLabel();
        grass13 = new javax.swing.JLabel();
        grass14 = new javax.swing.JLabel();
        grass15 = new javax.swing.JLabel();
        grass16 = new javax.swing.JLabel();
        grass17 = new javax.swing.JLabel();
        grass18 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        plantRange19 = new javax.swing.JLabel();
        plantRange20 = new javax.swing.JLabel();
        plantRange21 = new javax.swing.JLabel();
        plantRange22 = new javax.swing.JLabel();
        plantRange23 = new javax.swing.JLabel();
        plantRange24 = new javax.swing.JLabel();
        plantRange25 = new javax.swing.JLabel();
        plantRange26 = new javax.swing.JLabel();
        plantRange27 = new javax.swing.JLabel();
        zombieRange3 = new javax.swing.JLabel();
        grass19 = new javax.swing.JLabel();
        grass20 = new javax.swing.JLabel();
        grass21 = new javax.swing.JLabel();
        grass22 = new javax.swing.JLabel();
        grass23 = new javax.swing.JLabel();
        grass24 = new javax.swing.JLabel();
        grass25 = new javax.swing.JLabel();
        grass26 = new javax.swing.JLabel();
        grass27 = new javax.swing.JLabel();
        waveZombie6 = new javax.swing.JLabel();
        waveZombie7 = new javax.swing.JLabel();
        waveZombie8 = new javax.swing.JLabel();
        waveZombie9 = new javax.swing.JLabel();
        waveZombie10 = new javax.swing.JLabel();
        waveZombie11 = new javax.swing.JLabel();

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

        zombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie1);
        zombie1.setBounds(1630, 10, 80, 120);

        zombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie2);
        zombie2.setBounds(1660, 10, 80, 120);

        zombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie3);
        zombie3.setBounds(1700, 10, 80, 120);

        zombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie4);
        zombie4.setBounds(1730, 10, 80, 120);

        zombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie5);
        zombie5.setBounds(1770, 10, 80, 120);

        zombie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie6);
        zombie6.setBounds(1800, 10, 80, 120);

        zombie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie7);
        zombie7.setBounds(1830, 10, 80, 120);

        zombie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie8);
        zombie8.setBounds(1870, 10, 80, 120);

        zombie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie9);
        zombie9.setBounds(1900, 10, 80, 120);

        zombie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie10);
        zombie10.setBounds(1940, 10, 80, 120);

        zombie11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie11);
        zombie11.setBounds(1970, 10, 80, 120);

        zombie12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie12);
        zombie12.setBounds(2000, 10, 80, 120);

        zombie13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie13);
        zombie13.setBounds(2030, 10, 80, 120);

        zombie14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie14);
        zombie14.setBounds(2070, 10, 80, 120);

        zombie15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(zombie15);
        zombie15.setBounds(2100, 10, 80, 120);

        waveZombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie1);
        waveZombie1.setBounds(1290, 150, 80, 120);

        waveZombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie2);
        waveZombie2.setBounds(1370, 150, 80, 120);

        waveZombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie3);
        waveZombie3.setBounds(1450, 150, 80, 120);

        waveZombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie4);
        waveZombie4.setBounds(1530, 150, 80, 120);

        waveZombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie5);
        waveZombie5.setBounds(1620, 150, 80, 120);

        pea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea1);
        pea1.setBounds(1450, 340, 28, 30);

        pea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea2);
        pea2.setBounds(1480, 340, 28, 30);

        pea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea3);
        pea3.setBounds(1520, 340, 28, 30);

        pea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea4);
        pea4.setBounds(1560, 340, 28, 30);

        pea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea5);
        pea5.setBounds(1600, 340, 28, 30);

        pea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea6);
        pea6.setBounds(1640, 340, 28, 30);

        pea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea7);
        pea7.setBounds(1680, 340, 28, 30);

        pea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea8);
        pea8.setBounds(1720, 340, 28, 30);

        pea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea9);
        pea9.setBounds(1760, 340, 28, 30);

        pea10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea10);
        pea10.setBounds(1450, 470, 28, 30);

        pea11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea11);
        pea11.setBounds(1480, 470, 28, 30);

        pea12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea12);
        pea12.setBounds(1520, 470, 28, 30);

        pea13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea13);
        pea13.setBounds(1560, 470, 28, 30);

        pea14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea14);
        pea14.setBounds(1600, 470, 28, 30);

        pea15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea15);
        pea15.setBounds(1640, 470, 28, 30);

        pea16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea16);
        pea16.setBounds(1680, 470, 28, 30);

        pea17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea17);
        pea17.setBounds(1720, 470, 28, 30);

        pea18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea18);
        pea18.setBounds(1760, 470, 28, 30);

        pea19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea19);
        pea19.setBounds(1450, 590, 28, 30);

        pea20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea20);
        pea20.setBounds(1480, 590, 28, 30);

        pea21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea21);
        pea21.setBounds(1520, 590, 28, 30);

        pea22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea22);
        pea22.setBounds(1560, 590, 28, 30);

        pea23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea23);
        pea23.setBounds(1600, 590, 28, 30);

        pea24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea24);
        pea24.setBounds(1640, 590, 28, 30);

        pea25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea25);
        pea25.setBounds(1680, 590, 28, 30);

        pea26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea26);
        pea26.setBounds(1720, 590, 28, 30);

        pea27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea27);
        pea27.setBounds(1760, 590, 28, 30);

        explosion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cbExplosion.png"))); // NOI18N
        explosion.setText("jLabel1");
        getContentPane().add(explosion);
        explosion.setBounds(1850, 290, 380, 380);

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

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(100, 690, 1160, 120);

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
        jPanel6.setBounds(0, 810, 1260, 10);

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
        jPanel8.setBounds(100, 680, 1160, 10);
        getContentPane().add(concrete);
        concrete.setBounds(40, 250, 10, 470);

        rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/concrete.jpg"))); // NOI18N
        getContentPane().add(rock);
        rock.setBounds(10, 170, 80, 640);

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
        peaShooterPack.setBounds(40, 0, 64, 90);

        sunFlowerPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/sunflowerSeed.png"))); // NOI18N
        sunFlowerPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sunFlowerPackMouseClicked(evt);
            }
        });
        packMenu.add(sunFlowerPack);
        sunFlowerPack.setBounds(120, 0, 70, 90);

        cherryBombPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cbPacket.png"))); // NOI18N
        cherryBombPack.setText("jLabel1");
        cherryBombPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cherryBombPackMouseClicked(evt);
            }
        });
        packMenu.add(cherryBombPack);
        cherryBombPack.setBounds(200, 0, 70, 90);

        cherryBombBar.setForeground(new java.awt.Color(153, 153, 153));
        cherryBombBar.setValue(100);
        packMenu.add(cherryBombBar);
        cherryBombBar.setBounds(200, 100, 60, 14);

        sunFlowerBar.setForeground(new java.awt.Color(153, 153, 153));
        sunFlowerBar.setValue(100);
        packMenu.add(sunFlowerBar);
        sunFlowerBar.setBounds(120, 100, 60, 14);

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
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel18);
        jPanel18.setBounds(90, 160, 10, 650);

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel19);
        jPanel19.setBounds(0, 160, 10, 650);

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
        jPanel20.setBounds(1130, 300, 10, 120);

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
        jPanel21.setBounds(350, 430, 10, 120);

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
        jPanel22.setBounds(350, 300, 10, 120);

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
        jPanel23.setBounds(480, 300, 10, 120);

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
        jPanel24.setBounds(610, 300, 10, 120);

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
        jPanel25.setBounds(740, 300, 10, 120);

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
        jPanel26.setBounds(870, 300, 10, 120);

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
        jPanel27.setBounds(1000, 300, 10, 120);

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

        jPanel69.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel69);
        jPanel69.setBounds(1160, 10, 10, 30);

        waveBar.setForeground(new java.awt.Color(255, 170, 255));
        getContentPane().add(waveBar);
        waveBar.setBounds(1090, 20, 160, 14);

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
        zombieRange.setBounds(100, 400, 1220, 20);

        plantRange1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange1.setText("RANGE 1");
        getContentPane().add(plantRange1);
        plantRange1.setBounds(100, 300, 120, 20);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass1MouseClicked(evt);
            }
        });
        getContentPane().add(grass1);
        grass1.setBounds(100, 300, 120, 120);

        plantRange2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange2.setText("RANGE 2");
        getContentPane().add(plantRange2);
        plantRange2.setBounds(230, 310, 120, 20);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass2MouseClicked(evt);
            }
        });
        getContentPane().add(grass2);
        grass2.setBounds(230, 300, 120, 120);

        plantRange3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange3.setText("RANGE 3");
        getContentPane().add(plantRange3);
        plantRange3.setBounds(360, 320, 120, 20);

        grass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass3MouseClicked(evt);
            }
        });
        getContentPane().add(grass3);
        grass3.setBounds(360, 300, 120, 120);

        plantRange4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange4.setText("RANGE 4");
        getContentPane().add(plantRange4);
        plantRange4.setBounds(490, 330, 120, 20);

        grass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass4MouseClicked(evt);
            }
        });
        getContentPane().add(grass4);
        grass4.setBounds(490, 300, 120, 120);

        plantRange5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange5.setText("RANGE 5");
        getContentPane().add(plantRange5);
        plantRange5.setBounds(620, 340, 120, 20);

        grass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass5MouseClicked(evt);
            }
        });
        getContentPane().add(grass5);
        grass5.setBounds(620, 300, 120, 120);

        plantRange6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange6.setText("RANGE 6");
        getContentPane().add(plantRange6);
        plantRange6.setBounds(750, 350, 120, 20);

        grass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass6MouseClicked(evt);
            }
        });
        getContentPane().add(grass6);
        grass6.setBounds(750, 300, 120, 120);

        plantRange7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange7.setText("RANGE 7");
        getContentPane().add(plantRange7);
        plantRange7.setBounds(880, 360, 120, 20);

        grass7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass7MouseClicked(evt);
            }
        });
        getContentPane().add(grass7);
        grass7.setBounds(880, 300, 120, 120);

        plantRange8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange8.setText("RANGE 8");
        getContentPane().add(plantRange8);
        plantRange8.setBounds(1010, 370, 120, 20);

        grass8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass8MouseClicked(evt);
            }
        });
        getContentPane().add(grass8);
        grass8.setBounds(1010, 300, 120, 120);

        plantRange9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange9.setText("RANGE 9");
        getContentPane().add(plantRange9);
        plantRange9.setBounds(1140, 380, 120, 20);

        grass9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass9MouseClicked(evt);
            }
        });
        getContentPane().add(grass9);
        grass9.setBounds(1140, 300, 120, 120);

        peaStopper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peaStopper.setText("STOP");
        peaStopper.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(peaStopper);
        peaStopper.setBounds(1310, 300, 60, 380);

        jPanel49.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel49);
        jPanel49.setBounds(220, 300, 10, 120);

        jPanel50.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel50);
        jPanel50.setBounds(220, 430, 10, 120);

        jPanel51.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel51);
        jPanel51.setBounds(480, 430, 10, 120);

        jPanel52.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel52);
        jPanel52.setBounds(610, 430, 10, 120);

        jPanel54.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel54);
        jPanel54.setBounds(740, 430, 10, 120);

        jPanel55.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel55);
        jPanel55.setBounds(870, 430, 10, 120);

        jPanel56.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel56);
        jPanel56.setBounds(1000, 430, 10, 120);

        jPanel57.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel57);
        jPanel57.setBounds(100, 420, 1160, 10);

        jPanel58.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel58);
        jPanel58.setBounds(1000, 560, 10, 120);

        jPanel59.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel59);
        jPanel59.setBounds(1130, 560, 10, 120);

        jPanel60.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel60);
        jPanel60.setBounds(870, 560, 10, 120);

        jPanel61.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel61);
        jPanel61.setBounds(740, 560, 10, 120);

        jPanel62.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel62);
        jPanel62.setBounds(610, 560, 10, 120);

        jPanel63.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel63);
        jPanel63.setBounds(480, 560, 10, 120);

        jPanel64.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel64);
        jPanel64.setBounds(350, 560, 10, 120);

        jPanel65.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel65);
        jPanel65.setBounds(220, 560, 10, 120);

        plantRange10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange10.setText("RANGE 10");
        getContentPane().add(plantRange10);
        plantRange10.setBounds(100, 440, 120, 20);

        plantRange11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange11.setText("RANGE 11");
        getContentPane().add(plantRange11);
        plantRange11.setBounds(230, 450, 120, 20);

        plantRange12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange12.setText("RANGE 12");
        getContentPane().add(plantRange12);
        plantRange12.setBounds(360, 460, 120, 20);

        plantRange13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange13.setText("RANGE 13");
        getContentPane().add(plantRange13);
        plantRange13.setBounds(490, 470, 120, 20);

        plantRange14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange14.setText("RANGE 14");
        getContentPane().add(plantRange14);
        plantRange14.setBounds(620, 480, 120, 20);

        plantRange15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange15.setText("RANGE 15");
        getContentPane().add(plantRange15);
        plantRange15.setBounds(750, 490, 120, 20);

        plantRange16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange16.setText("RANGE 16");
        getContentPane().add(plantRange16);
        plantRange16.setBounds(880, 500, 120, 20);

        plantRange17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange17.setText("RANGE 17");
        getContentPane().add(plantRange17);
        plantRange17.setBounds(1010, 510, 120, 20);

        plantRange18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange18.setText("RANGE 18");
        getContentPane().add(plantRange18);
        plantRange18.setBounds(1140, 520, 120, 20);

        zombieRange2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange2.setText("ZOMBIE DANGER RANGE 2");
        getContentPane().add(zombieRange2);
        zombieRange2.setBounds(100, 530, 1220, 20);

        grass10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass10MouseClicked(evt);
            }
        });
        getContentPane().add(grass10);
        grass10.setBounds(100, 430, 120, 120);

        grass11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass11MouseClicked(evt);
            }
        });
        getContentPane().add(grass11);
        grass11.setBounds(230, 430, 120, 120);

        grass12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass12MouseClicked(evt);
            }
        });
        getContentPane().add(grass12);
        grass12.setBounds(360, 430, 120, 120);

        grass13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass13MouseClicked(evt);
            }
        });
        getContentPane().add(grass13);
        grass13.setBounds(490, 430, 120, 120);

        grass14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass14MouseClicked(evt);
            }
        });
        getContentPane().add(grass14);
        grass14.setBounds(620, 430, 120, 120);

        grass15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass15MouseClicked(evt);
            }
        });
        getContentPane().add(grass15);
        grass15.setBounds(750, 430, 120, 120);

        grass16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass16MouseClicked(evt);
            }
        });
        getContentPane().add(grass16);
        grass16.setBounds(880, 430, 120, 120);

        grass17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass17MouseClicked(evt);
            }
        });
        getContentPane().add(grass17);
        grass17.setBounds(1010, 430, 120, 120);

        grass18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass18MouseClicked(evt);
            }
        });
        getContentPane().add(grass18);
        grass18.setBounds(1140, 430, 120, 120);

        jPanel66.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel66);
        jPanel66.setBounds(1130, 430, 10, 120);

        jPanel67.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel67);
        jPanel67.setBounds(100, 550, 1160, 10);

        plantRange19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange19.setText("RANGE 19");
        getContentPane().add(plantRange19);
        plantRange19.setBounds(100, 570, 120, 20);

        plantRange20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange20.setText("RANGE 20");
        getContentPane().add(plantRange20);
        plantRange20.setBounds(230, 580, 120, 20);

        plantRange21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange21.setText("RANGE 21");
        getContentPane().add(plantRange21);
        plantRange21.setBounds(360, 590, 120, 20);

        plantRange22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange22.setText("RANGE 22");
        getContentPane().add(plantRange22);
        plantRange22.setBounds(490, 600, 120, 20);

        plantRange23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange23.setText("RANGE 23");
        getContentPane().add(plantRange23);
        plantRange23.setBounds(620, 610, 120, 20);

        plantRange24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange24.setText("RANGE 24");
        getContentPane().add(plantRange24);
        plantRange24.setBounds(750, 610, 120, 20);

        plantRange25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange25.setText("RANGE 25");
        getContentPane().add(plantRange25);
        plantRange25.setBounds(880, 620, 120, 20);

        plantRange26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange26.setText("RANGE 26");
        getContentPane().add(plantRange26);
        plantRange26.setBounds(1010, 630, 120, 20);

        plantRange27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange27.setText("RANGE 27");
        getContentPane().add(plantRange27);
        plantRange27.setBounds(1140, 640, 120, 20);

        zombieRange3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange3.setText("ZOMBIE DANGER RANGE 3");
        getContentPane().add(zombieRange3);
        zombieRange3.setBounds(100, 660, 1220, 20);

        grass19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass19MouseClicked(evt);
            }
        });
        getContentPane().add(grass19);
        grass19.setBounds(100, 560, 120, 120);

        grass20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass20MouseClicked(evt);
            }
        });
        getContentPane().add(grass20);
        grass20.setBounds(230, 560, 120, 120);

        grass21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass21MouseClicked(evt);
            }
        });
        getContentPane().add(grass21);
        grass21.setBounds(360, 560, 120, 120);

        grass22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass22MouseClicked(evt);
            }
        });
        getContentPane().add(grass22);
        grass22.setBounds(490, 560, 120, 120);

        grass23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass23MouseClicked(evt);
            }
        });
        getContentPane().add(grass23);
        grass23.setBounds(620, 560, 120, 120);

        grass24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass24MouseClicked(evt);
            }
        });
        getContentPane().add(grass24);
        grass24.setBounds(750, 560, 120, 120);

        grass25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass25MouseClicked(evt);
            }
        });
        getContentPane().add(grass25);
        grass25.setBounds(880, 560, 120, 120);

        grass26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass26MouseClicked(evt);
            }
        });
        getContentPane().add(grass26);
        grass26.setBounds(1010, 560, 120, 120);

        grass27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass27MouseClicked(evt);
            }
        });
        getContentPane().add(grass27);
        grass27.setBounds(1140, 560, 120, 120);

        waveZombie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie6);
        waveZombie6.setBounds(1760, 150, 80, 120);

        waveZombie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie7);
        waveZombie7.setBounds(1840, 150, 80, 120);

        waveZombie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie8);
        waveZombie8.setBounds(1920, 150, 80, 120);

        waveZombie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie9);
        waveZombie9.setBounds(2000, 150, 80, 120);

        waveZombie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie10);
        waveZombie10.setBounds(2170, 150, 80, 120);

        waveZombie11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie11);
        waveZombie11.setBounds(2090, 150, 80, 120);

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
        grassClicked(evt, 100, 300);
    }//GEN-LAST:event_grass1MouseClicked

    private void grass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass2MouseClicked
        grassClicked(evt, 230, 300);
    }//GEN-LAST:event_grass2MouseClicked

    private void grass3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass3MouseClicked
        grassClicked(evt, 360, 300);
    }//GEN-LAST:event_grass3MouseClicked

    private void grass4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass4MouseClicked
        grassClicked(evt, 490, 300);
    }//GEN-LAST:event_grass4MouseClicked

    private void grass5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass5MouseClicked
        grassClicked(evt, 620, 300);
    }//GEN-LAST:event_grass5MouseClicked

    private void grass6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass6MouseClicked
        grassClicked(evt, 750, 300);
    }//GEN-LAST:event_grass6MouseClicked

    private void grass7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass7MouseClicked
        grassClicked(evt, 880, 300);
    }//GEN-LAST:event_grass7MouseClicked

    private void grass8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass8MouseClicked
        grassClicked(evt, 1010, 300);
    }//GEN-LAST:event_grass8MouseClicked

    private void grass9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass9MouseClicked
        grassClicked(evt, 1140, 300);
    }//GEN-LAST:event_grass9MouseClicked

    private void sunFlowerPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunFlowerPackMouseClicked
        originalSunFlowerPackMouseClicking(evt);
    }//GEN-LAST:event_sunFlowerPackMouseClicked

    private void grass10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass10MouseClicked
        grassClicked(evt, 100, 430);
    }//GEN-LAST:event_grass10MouseClicked

    private void grass11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass11MouseClicked
        grassClicked(evt, 230, 430);
    }//GEN-LAST:event_grass11MouseClicked

    private void grass12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass12MouseClicked
        grassClicked(evt, 360, 430);
    }//GEN-LAST:event_grass12MouseClicked

    private void grass13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass13MouseClicked
        grassClicked(evt, 490, 430);
    }//GEN-LAST:event_grass13MouseClicked

    private void grass14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass14MouseClicked
        grassClicked(evt, 620, 430);
    }//GEN-LAST:event_grass14MouseClicked

    private void grass15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass15MouseClicked
        grassClicked(evt, 750, 430);
    }//GEN-LAST:event_grass15MouseClicked

    private void grass16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass16MouseClicked
        grassClicked(evt, 880, 430);
    }//GEN-LAST:event_grass16MouseClicked

    private void grass17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass17MouseClicked
        grassClicked(evt, 1010, 430);
    }//GEN-LAST:event_grass17MouseClicked

    private void grass18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass18MouseClicked
        grassClicked(evt, 1140, 430);
    }//GEN-LAST:event_grass18MouseClicked

    private void grass19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass19MouseClicked
        grassClicked(evt, 100, 560);
    }//GEN-LAST:event_grass19MouseClicked

    private void grass20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass20MouseClicked
        grassClicked(evt, 230, 560);
    }//GEN-LAST:event_grass20MouseClicked

    private void grass21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass21MouseClicked
        grassClicked(evt, 360, 560);
    }//GEN-LAST:event_grass21MouseClicked

    private void grass22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass22MouseClicked
        grassClicked(evt, 490, 560);
    }//GEN-LAST:event_grass22MouseClicked

    private void grass23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass23MouseClicked
        grassClicked(evt, 620, 560);
    }//GEN-LAST:event_grass23MouseClicked

    private void grass24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass24MouseClicked
        grassClicked(evt, 750, 560);
    }//GEN-LAST:event_grass24MouseClicked

    private void grass25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass25MouseClicked
        grassClicked(evt, 880, 560);
    }//GEN-LAST:event_grass25MouseClicked

    private void grass26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass26MouseClicked
        grassClicked(evt, 1010, 560);
    }//GEN-LAST:event_grass26MouseClicked

    private void grass27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass27MouseClicked
        grassClicked(evt, 1140, 560);
    }//GEN-LAST:event_grass27MouseClicked

    private void cherryBombPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cherryBombPackMouseClicked
        originalCherryBombPackMouseClicking(evt);
    }//GEN-LAST:event_cherryBombPackMouseClicked
    
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="NetBeans Objects - Generated Code">    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrier;
    private javax.swing.JLabel cancel;
    private javax.swing.JProgressBar cherryBombBar;
    private javax.swing.JLabel cherryBombPack;
    private javax.swing.JLabel concrete;
    private javax.swing.JLabel explosion;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass10;
    private javax.swing.JLabel grass11;
    private javax.swing.JLabel grass12;
    private javax.swing.JLabel grass13;
    private javax.swing.JLabel grass14;
    private javax.swing.JLabel grass15;
    private javax.swing.JLabel grass16;
    private javax.swing.JLabel grass17;
    private javax.swing.JLabel grass18;
    private javax.swing.JLabel grass19;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel grass20;
    private javax.swing.JLabel grass21;
    private javax.swing.JLabel grass22;
    private javax.swing.JLabel grass23;
    private javax.swing.JLabel grass24;
    private javax.swing.JLabel grass25;
    private javax.swing.JLabel grass26;
    private javax.swing.JLabel grass27;
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
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel packMenu;
    private javax.swing.JPanel packMenu1;
    private javax.swing.JLabel pea1;
    private javax.swing.JLabel pea10;
    private javax.swing.JLabel pea11;
    private javax.swing.JLabel pea12;
    private javax.swing.JLabel pea13;
    private javax.swing.JLabel pea14;
    private javax.swing.JLabel pea15;
    private javax.swing.JLabel pea16;
    private javax.swing.JLabel pea17;
    private javax.swing.JLabel pea18;
    private javax.swing.JLabel pea19;
    private javax.swing.JLabel pea2;
    private javax.swing.JLabel pea20;
    private javax.swing.JLabel pea21;
    private javax.swing.JLabel pea22;
    private javax.swing.JLabel pea23;
    private javax.swing.JLabel pea24;
    private javax.swing.JLabel pea25;
    private javax.swing.JLabel pea26;
    private javax.swing.JLabel pea27;
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
    private javax.swing.JLabel plantRange10;
    private javax.swing.JLabel plantRange11;
    private javax.swing.JLabel plantRange12;
    private javax.swing.JLabel plantRange13;
    private javax.swing.JLabel plantRange14;
    private javax.swing.JLabel plantRange15;
    private javax.swing.JLabel plantRange16;
    private javax.swing.JLabel plantRange17;
    private javax.swing.JLabel plantRange18;
    private javax.swing.JLabel plantRange19;
    private javax.swing.JLabel plantRange2;
    private javax.swing.JLabel plantRange20;
    private javax.swing.JLabel plantRange21;
    private javax.swing.JLabel plantRange22;
    private javax.swing.JLabel plantRange23;
    private javax.swing.JLabel plantRange24;
    private javax.swing.JLabel plantRange25;
    private javax.swing.JLabel plantRange26;
    private javax.swing.JLabel plantRange27;
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
    private javax.swing.JProgressBar sunFlowerBar;
    private javax.swing.JLabel sunFlowerPack;
    private javax.swing.JPanel sunMenu;
    private javax.swing.JProgressBar waveBar;
    private javax.swing.JLabel waveZombie1;
    private javax.swing.JLabel waveZombie10;
    private javax.swing.JLabel waveZombie11;
    private javax.swing.JLabel waveZombie2;
    private javax.swing.JLabel waveZombie3;
    private javax.swing.JLabel waveZombie4;
    private javax.swing.JLabel waveZombie5;
    private javax.swing.JLabel waveZombie6;
    private javax.swing.JLabel waveZombie7;
    private javax.swing.JLabel waveZombie8;
    private javax.swing.JLabel waveZombie9;
    private javax.swing.JLabel zombie1;
    private javax.swing.JLabel zombie10;
    private javax.swing.JLabel zombie11;
    private javax.swing.JLabel zombie12;
    private javax.swing.JLabel zombie13;
    private javax.swing.JLabel zombie14;
    private javax.swing.JLabel zombie15;
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
    private javax.swing.JLabel zombieRange2;
    private javax.swing.JLabel zombieRange3;
    // End of variables declaration//GEN-END:variables

    // </editor-fold>  
    
    
    // CREATED METHODS AND PROPERTIES BELOW...............................
    
    private final String NEW_PEA_IMAGE        = "/media/peaShooterNEW.gif";
    private final String NEW_SUNFLOWER_IMAGE  = "/media/sunFlower.gif";
    private final String NEW_CHERRYBOMB_IMAGE = "/media/cherryBomb4.gif";
    private final String NEW_SPADE_IMAGE      = "/media/shovelN.png";
    
    private final int SUN_DELAY                      = 100;
    private final int SUN_STARTING_VALUE             = 50; 
    private final int SUN_PROGRESS_MAX_PEA           = 100;
    private final int SUN_PROGRESS_MAX_SUNFLOWER     = 50;
    private final int SUN_PROGRESS_MAX_CHERRYBOMB    = 150;
    private final int SUN_INCREASE                   = 25;    
    private final int SUNFLOWER_SUN_INCREASE         = 25;
    private int       zombieSpawnDelay               = 150;
    private int       totalSunFlowers                = 0;
    private final int WAVE_ZOMBIE_SPAWN_DELAY        = 400;
    private final int ZOMBIE_MOVE_DELAY              = 22;
    private final int ZOMBIE_PROGRESS_MAX            = 100;
    private final int ZOMBIE_SPAWN_X                 = 1300;
    private final int ZOMBIE_SPAWN_Y                 = 430;
    private final int ZOMBIE_SPAWN_CURRENT_MAX       = 15;
    private final int ZOMBIE_WAVE_SPAWN_CURRENT_MAX  = 5;
    private final int ZOMBIE_WAVE_SPAWN_2_CURRENT_MAX  = 6;
    private final int ZOMBIE_X_AMOUNT                = 50;
    private final int ZOMBIE_X_AMOUNT_INTERSECT      = 30;        
    private final int PEA_RECHARGE_DELAY             = 40;
    private final int SF_RECHARGE_DELAY              = 40;
    private final int CB_RECHARGE_DELAY              = 200;
    private final int PEA_RECHARGE_MAX               = 100;
    private final int SUNFLOWER_RECHARGE_MAX         = 100;
    private final int CHERRYBOMB_RECHARGE_MAX        = 100;
    private final int PEA_PACK_X                     = 40;
    private final int PEA_PACK_Y                     = 0;
    private final int SUNFLOWER_PACK_X               = 120;
    private final int SUNFLOWER_PACK_Y               = 0;
    private final int CHERRYBOMB_PACK_X              = 200;
    private final int CHERRYBOMB_PACK_Y              = 0;
    private final int SHOVEL_X                       = 10;
    private final int SHOVEL_Y                       = 10;
    private final int PEA_NEW_X                      = 150;
    private final int PEA_NEW_Y                      = 10;
    private final int SUNFLOWER_NEW_X                = 150;
    private final int SUNFLOWER_NEW_Y                = 10;
    private final int CHERRYBOMB_NEW_X               = 150;
    private final int CHERRYBOMB_NEW_Y               = 10;
    private final int PEA_NEW_WIDTH                  = 110;
    private final int PEA_NEW_HEIGHT                 = 120;
    private final int SUNFLOWER_NEW_WIDTH            = 110;
    private final int SUNFLOWER_NEW_HEIGHT           = 120;
    private final int CHERRYBOMB_NEW_WIDTH           = 125;
    private final int CHERRYBOMB_NEW_HEIGHT          = 105;
    private final int PEA_PLANT_HEALTH               = 6;  
    private final int SUNFLOWER_PLANT_HEALTH         = 6;
    private final int SPADE_NEW_X                    = 750;
    private final int SPADE_NEW_Y                    = 10;
    private final int SPADE_NEW_WIDTH                = 110;
    private final int SPADE_NEW_HEIGHT               = 110;    
    private final int PROJECTILE_MOVE_DELAY          = 65;   
    private final int RANGE_RETURN_DELAY             = 1500;
    private final int CHERRYBOMB_EXPLOSION_DELAY     = 2000;
    private final int EXPLOSION_RETURN_DELAY         = 600;
    private final int FRAME_WIDTH                    = 1275;
    private final int FRAME_HEIGHT                   = 859;        
    private final int OFF_SCREEN_X                   = 0;
    private final int OFF_SCREEN_Y                   = 10000;
    private final int STARTING_AMOUNT                = 100;
    

    private boolean plantPickup;
    private boolean plantPlaced;
    private boolean shovelPickup;
    private boolean peaShooterRecharged;
    private boolean sunFlowerRecharged;
    private boolean cherryBombRecharged;
    private boolean spadeHasClicked;
    private boolean peaHasClicked;
    private boolean sunFlowerHasClicked;
    private boolean cherryBombHasClicked;
    private boolean range1Trigger;
    private boolean range2Trigger;
    private boolean range3Trigger;
    private boolean range4Trigger;
    private boolean range5Trigger;
    private boolean range6Trigger;
    private boolean range7Trigger;
    private boolean range8Trigger;
    private boolean range9Trigger;
    private boolean range10Trigger;
    private boolean range11Trigger;
    private boolean range12Trigger;
    private boolean range13Trigger;
    private boolean range14Trigger;
    private boolean range15Trigger;
    private boolean range16Trigger;
    private boolean range17Trigger;
    private boolean range18Trigger;
    private boolean range19Trigger;
    private boolean range20Trigger;
    private boolean range21Trigger;
    private boolean range22Trigger;
    private boolean range23Trigger;
    private boolean range24Trigger;
    private boolean range25Trigger;
    private boolean range26Trigger;
    private boolean range27Trigger;
    
    private int sunProgress;
    private int waveProgress;
    private int zombieProgress;
    private int rechargePeaBar;    
    private int rechargeSunFlowerBar; 
    private int rechargeCherryBombBar;
    private int sun;
    private int peaShooterHealth;
    private int amount;
    private int direction;
    private int x;
    private int y;
    private int tempExplosionX;
    private int tempExplosionY;
    private int current;
    private int waveCurrent;
    private int waveCurrent2;
        
    private Timer sunTimer;
    private Timer sunFlowerSunTimer;
    private Timer zombieSpawnTimer;
    private Timer waveZombieSpawnTimer;
    private Timer waveZombieMoveTimer;
    private Timer waveZombie2SpawnTimer;
    private Timer waveZombie2MoveTimer;
    private Timer peaSRechargeTimer;
    private Timer sunFRechargeTimer;
    private Timer cherryBombRechargeTimer;
    private Timer zombieMoveTimer;
    private Timer projectileMoveTimer;
    private Timer rangeReturnTimer;
    private Timer cherryBombExplosionTimer;
    private Timer ExplosionReturnTimer;
    
    private JLabel newPeaShooter;
    private JLabel newSunFlower;
    private JLabel newCherryBomb;
        
    private Rectangle r1;
    private Rectangle r2;
    private Rectangle r3;
    private Rectangle r4;
    private Rectangle r5;
    private Rectangle r6;
    private Rectangle r7;
    private Rectangle r8;
    private Rectangle r9;
    private Rectangle r10;
    private Rectangle r11;
    private Rectangle r12;
    private Rectangle r13;
    private Rectangle r14;
    private Rectangle r15;
    private Rectangle r16;
    private Rectangle r17;
    private Rectangle r18;
    private Rectangle r19;
    private Rectangle r20;
    private Rectangle r21;
    private Rectangle r22;
    private Rectangle r23;
    private Rectangle r24;
    private Rectangle r25;
    private Rectangle r26;
    private Rectangle r27;
    private Rectangle p1;
    private Rectangle p2;
    private Rectangle p3;
    private Rectangle p4;
    private Rectangle p5;
    private Rectangle p6;
    private Rectangle p7;
    private Rectangle p8;
    private Rectangle p9;
    private Rectangle p10;
    private Rectangle p11;
    private Rectangle p12;
    private Rectangle p13;
    private Rectangle p14;
    private Rectangle p15;
    private Rectangle p16;
    private Rectangle p17;
    private Rectangle p18;
    private Rectangle p19;
    private Rectangle p20;
    private Rectangle p21;
    private Rectangle p22;
    private Rectangle p23;
    private Rectangle p24;
    private Rectangle p25;
    private Rectangle p26;
    private Rectangle p27;
    private Rectangle cbExplosion;
    private Rectangle zombieHB;
    private Rectangle waveZombieHB;
    private Rectangle waveZombie2HB;
    private Rectangle peaStop;
    
    private LinkedList<JLabel>  plantPickupLabels;  
    private LinkedList<JLabel>  spadePickupLabels;
    private LinkedList<JLabel>  zombieSpawnLabels;
    private LinkedList<Boolean> plantPickups; 
    private LinkedList<Boolean> plantsPlaced;
    private LinkedList<Boolean> shovels;
    private LinkedList<JLabel> zombies;
    private LinkedList<JLabel> waveZombies;
    private LinkedList<JLabel> waveZombies2;
    private LinkedList<JLabel> ranges;
    private LinkedList<JLabel> peas;
    
    private void startUp() {
        
        // Set global variables to starting values
        plantPickup          = false;
        plantPlaced          = false;
        shovelPickup         = false;
        peaShooterRecharged  = true;
        sunFlowerRecharged   = true;
        cherryBombRecharged  = true;
        spadeHasClicked      = false;
        peaHasClicked        = false;
        sunFlowerHasClicked  = false;
        range1Trigger        = false;
        sunProgress          = 0;
        zombieProgress       = 0;
        direction            = 0;
        x                    = 0;
        y                    = 0;
        current              = 0;
        waveCurrent          = 0;
        waveCurrent2         = 0;
        rechargePeaBar       = PEA_RECHARGE_MAX;    
        rechargeSunFlowerBar = SUNFLOWER_RECHARGE_MAX;
        rechargeCherryBombBar = CHERRYBOMB_RECHARGE_MAX;
        sun                  = SUN_STARTING_VALUE;
        peaShooterHealth     = PEA_PLANT_HEALTH;
        amount               = STARTING_AMOUNT;
        
        // Instantiate all objects
        plantPickupLabels = new LinkedList<>();  
        spadePickupLabels = new LinkedList<>();
        zombieSpawnLabels = new LinkedList<>();
        plantPickups      = new LinkedList<>(); 
        plantsPlaced      = new LinkedList<>();
        shovels           = new LinkedList<>();
        zombies           = new LinkedList<>();
        waveZombies       = new LinkedList<>();
        waveZombies2      = new LinkedList<>();
        ranges            = new LinkedList<>();
        peas              = new LinkedList<>();
        newPeaShooter     = new JLabel();
        newSunFlower      = new JLabel();
        newCherryBomb     = new JLabel();
        r1                = new Rectangle();
        r2                = new Rectangle();
        r3                = new Rectangle();
        r4                = new Rectangle();
        r5                = new Rectangle();
        r6                = new Rectangle();
        r7                = new Rectangle();
        r8                = new Rectangle();
        r9                = new Rectangle();
        r10               = new Rectangle();
        r11               = new Rectangle();
        r12               = new Rectangle();
        r13               = new Rectangle();
        r14               = new Rectangle();
        r15               = new Rectangle();
        r16               = new Rectangle();
        r17               = new Rectangle();
        r18               = new Rectangle();
        r19               = new Rectangle();
        r20               = new Rectangle();
        r21               = new Rectangle();
        r22               = new Rectangle();
        r23               = new Rectangle();
        r24               = new Rectangle();
        r25               = new Rectangle();
        r26               = new Rectangle();
        r27               = new Rectangle();
        p1                = new Rectangle();
        p2                = new Rectangle();
        p3                = new Rectangle();
        p4                = new Rectangle();
        p5                = new Rectangle();
        p6                = new Rectangle();
        p7                = new Rectangle();
        p8                = new Rectangle();
        p9                = new Rectangle();
        p10               = new Rectangle();
        p11               = new Rectangle();
        p12               = new Rectangle();
        p13               = new Rectangle();
        p14               = new Rectangle();
        p15               = new Rectangle();
        p16               = new Rectangle();
        p17               = new Rectangle();
        p18               = new Rectangle();
        p19               = new Rectangle();
        p20               = new Rectangle();
        p21               = new Rectangle();
        p22               = new Rectangle();
        p23               = new Rectangle();
        p24               = new Rectangle();
        p25               = new Rectangle();
        p26               = new Rectangle();
        p27               = new Rectangle();
        cbExplosion       = new Rectangle();
        zombieHB          = new Rectangle();
        waveZombieHB      = new Rectangle();
        waveZombie2HB     = new Rectangle();
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
        zombies.add(zombie11);
        zombies.add(zombie12);
        zombies.add(zombie13);
        zombies.add(zombie14);
        zombies.add(zombie15);
        
        waveZombies.add(waveZombie1);
        waveZombies.add(waveZombie2);
        waveZombies.add(waveZombie3);
        waveZombies.add(waveZombie4);
        waveZombies.add(waveZombie5);
        waveZombies2.add(waveZombie6);
        waveZombies2.add(waveZombie7);
        waveZombies2.add(waveZombie8);
        waveZombies2.add(waveZombie9);
        waveZombies2.add(waveZombie10);
        waveZombies2.add(waveZombie11);
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
        ranges.add(plantRange10);
        ranges.add(plantRange11);
        ranges.add(plantRange12);
        ranges.add(plantRange13);
        ranges.add(plantRange14);
        ranges.add(plantRange15);
        ranges.add(plantRange16);
        ranges.add(plantRange17);
        ranges.add(plantRange18);   
        ranges.add(plantRange19);
        ranges.add(plantRange20);
        ranges.add(plantRange21);
        ranges.add(plantRange22);
        ranges.add(plantRange23);
        ranges.add(plantRange24);
        ranges.add(plantRange25);
        ranges.add(plantRange26);
        ranges.add(plantRange27);   
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
        peas.add(pea10);
        peas.add(pea11);
        peas.add(pea12);
        peas.add(pea13);
        peas.add(pea14);
        peas.add(pea15);
        peas.add(pea16);
        peas.add(pea17);
        peas.add(pea18);
        peas.add(pea19);
        peas.add(pea20);
        peas.add(pea21);
        peas.add(pea22);
        peas.add(pea23);
        peas.add(pea24);
        peas.add(pea25);
        peas.add(pea26);
        peas.add(pea27);
        // get the first hit box for a zombie
        zombieHB = getRectangle(zombies.get(1));
        waveZombieHB = getRectangle(waveZombies.get(1));
        waveZombie2HB = getRectangle(waveZombies2.get(1));
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
        sunFlowerSunTimer = new Timer(20000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sunFlowerCreation();
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
        waveZombie2SpawnTimer = new Timer(WAVE_ZOMBIE_SPAWN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                waveZombie2SpawnTime();
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
        waveZombie2MoveTimer = new Timer(WAVE_ZOMBIE_SPAWN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                waveZombie2Move();
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
        sunFRechargeTimer = new Timer(SF_RECHARGE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sunFlowerRecharge();
            }
        }); 
        cherryBombRechargeTimer = new Timer(CB_RECHARGE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cherryBombRecharge();
            }
        });
        rangeReturnTimer = new Timer(RANGE_RETURN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rangeReturn();
            }
        }); 
        cherryBombExplosionTimer = new Timer(CHERRYBOMB_EXPLOSION_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cherryBombExplosion();
            }
        }); 
        ExplosionReturnTimer = new Timer(EXPLOSION_RETURN_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ExplosionReturn();
            }
        }); 
        // Start the relevant timers
        sunTimer.start();
        zombieSpawnTimer.start();
        projectileMoveTimer.start();
        zombieMoveTimer.start();
        
    }
    
    private void cherryBombExplosion(){
           
        newCherryBomb.setLocation(0, -10000);
        explosion.setLocation(tempExplosionX, tempExplosionY);
        ExplosionReturnTimer.start();
        cherryBombExplosionTimer.stop();
                
    }
    
    private void ExplosionReturn(){
           
        explosion.setLocation(1800, 460);
        ExplosionReturnTimer.stop();        
        
    }
    
    private void sunSpawnTime() {
        sunProgress = sunProgress + 1;          // increase to ...
        sunAmount.setText("" + sun);
        sunBar.setValue(sunProgress);           // change progress bar 
        if (sunProgress >= 100) {  // check if at bar max
            sunProgress = 0;                    // reset back to zero
            sun = sun + SUN_INCREASE;           // increase sun count by 25
            sunAmount.setText("" + sun);        // display this to user
        }
    }
    
    private void sunFlowerCreation() {
        
        if (totalSunFlowers <= 0){
            sunFlowerSunTimer.stop();
        }
        else{
        sun = sun + (SUNFLOWER_SUN_INCREASE * totalSunFlowers);
        }
    }
       
    private void zombieSpawnTime() {
        zombieProgress = zombieProgress + 1;        
        zombieBar.setValue(zombieProgress);        
        if (zombieProgress == ZOMBIE_PROGRESS_MAX) {   
            zombieMoveTimer.start(); 
            double seed = Math.random();
            final double LOW  = 0.0;
            final double HIGH = 2.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                zombies.get(current).setLocation(1310, 300);
                zombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                zombies.get(current).setLocation(1310, 430);
                zombieMoveTimer.start();
            }
            if (number <= 3 && number > 2){
                zombies.get(current).setLocation(1310, 560);
                zombieMoveTimer.start();
            }
//            zombies.get(current).setLocation(ZOMBIE_SPAWN_X, ZOMBIE_SPAWN_Y);            
            current++;
                       
            zombieProgress = 0;     
            zombieSpawnDelay = zombieSpawnDelay - 25;
        }        
        if (current >= ZOMBIE_SPAWN_CURRENT_MAX){
            zombieSpawnTimer.stop();
        }
    }
    
    private void waveZombieSpawnTime(){        
        JLabel label = waveZombies.get(waveCurrent);     
        if (label != null) {   
            double seed = Math.random();
            final double LOW  = 0.0;
            final double HIGH = 2.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                waveZombies.get(waveCurrent).setLocation(1310, 300);
                zombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                waveZombies.get(waveCurrent).setLocation(1310, 430);
                zombieMoveTimer.start();
            }
            if (number <= 3 && number > 2){
                waveZombies.get(waveCurrent).setLocation(1310, 560);
                zombieMoveTimer.start();
            }
        waveCurrent++;
        waveZombieMoveTimer.start();               
        
        if (waveCurrent >= ZOMBIE_WAVE_SPAWN_CURRENT_MAX){
            waveZombieSpawnTimer.stop();
        }
      }
    }
    
    private void waveZombie2SpawnTime(){
        JLabel label = waveZombies2.get(waveCurrent2);     
        if (label != null) {   
            double seed = Math.random();
            final double LOW  = 0.0;
            final double HIGH = 2.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                waveZombies2.get(waveCurrent2).setLocation(1310, 300);
                zombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                waveZombies2.get(waveCurrent2).setLocation(1310, 430);
                zombieMoveTimer.start();
            }
            if (number <= 3 && number > 2){
                waveZombies2.get(waveCurrent2).setLocation(1310, 560);
                zombieMoveTimer.start();
            }       
        waveCurrent2++;
        waveZombie2MoveTimer.start();               
        
        if (waveCurrent2 >= ZOMBIE_WAVE_SPAWN_2_CURRENT_MAX){
            waveZombie2SpawnTimer.stop();
        }
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
        if (newSunFlower == null){
            newSunFlower = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle explosionHB = getRectangle(explosion);
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
        Rectangle r10 = getRectangle(plantRange10);
        Rectangle r11 = getRectangle(plantRange11);
        Rectangle r12 = getRectangle(plantRange12);
        Rectangle r13 = getRectangle(plantRange13);
        Rectangle r14 = getRectangle(plantRange14);
        Rectangle r15 = getRectangle(plantRange15);
        Rectangle r16 = getRectangle(plantRange16);
        Rectangle r17 = getRectangle(plantRange17);
        Rectangle r18 = getRectangle(plantRange18);
        Rectangle r19 = getRectangle(plantRange19);
        Rectangle r20 = getRectangle(plantRange20);
        Rectangle r21 = getRectangle(plantRange21);
        Rectangle r22 = getRectangle(plantRange22);
        Rectangle r23 = getRectangle(plantRange23);
        Rectangle r24 = getRectangle(plantRange24);
        Rectangle r25 = getRectangle(plantRange25);
        Rectangle r26 = getRectangle(plantRange26);
        Rectangle r27 = getRectangle(plantRange27);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        
        for (int zombie = 0; zombie < zombies.size(); zombie++) {    
            JLabel label = zombies.get(zombie);
            zombieHB = getRectangle(label);           
            entrance = getRectangle(concrete);
            explosionHB = getRectangle(explosion);
            stop = getRectangle(barrier);
            zombieHB.x -= 1;
            
            if (zombieHB.intersects(entrance)) {
                zombieSpawnTimer.stop();
                zombieMoveTimer.stop();
                String text = "Level3";
        
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
                GameOver stage1 = new GameOver();
                this.dispose();
                zombieHB.setLocation(5000, 0);
            }
            
            if (zombieHB.intersects(explosionHB)){
                    
                    Globals.player.zombieHealth = Globals.player.zombieHealth -
                            Globals.player.cbExplosionDamage;
                    
                    if (Globals.player.zombieHealth <= 0){
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                    }
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
                
                newSunFlower = plantPickupLabels.get(plant);                
                
                if (zombieHB.intersects(peaShooterHB)) {
                    zombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("ps plant health is " + 
                                       Globals.player.psPlantHealth);
                }   
                
              
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(140, 310);
                    p1 = getRectangle(pea1);
                }
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 310);
                    p2 = getRectangle(pea2);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 310);
                    p3 = getRectangle(pea3);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 310);
                    p4 = getRectangle(pea4);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 310);
                    p5 = getRectangle(pea5);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 310);
                    p6 = getRectangle(pea6);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 310);
                    p7 = getRectangle(pea7);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 310);
                    p8 = getRectangle(pea8);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 310);
                    p9 = getRectangle(pea9);
                } 
                    
                // checking other stuff
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 440);
                    p10 = getRectangle(pea10);
                }
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 440);
                    p11 = getRectangle(pea11);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 440);
                    p12 = getRectangle(pea12);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 440);
                    p13 = getRectangle(pea13);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 440);
                    p14 = getRectangle(pea14);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 440);
                    p15 = getRectangle(pea15);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 440);
                    p16 = getRectangle(pea16);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 440);
                    p17 = getRectangle(pea17);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 440);
                    p18 = getRectangle(pea18);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 570);
                    p19 = getRectangle(pea19);
                }
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 570);
                    p20 = getRectangle(pea20);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 570);
                    p21 = getRectangle(pea21);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 570);
                    p22 = getRectangle(pea22);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 570);
                    p23 = getRectangle(pea23);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 570);
                    p24 = getRectangle(pea24);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 570);
                    p25 = getRectangle(pea25);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 570);
                    p26 = getRectangle(pea26);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 570);
                    p27 = getRectangle(pea27);
                } 
                
                if (Globals.player.psPlantHealth == 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    newPeaShooter.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
//                if (Globals.player.sfPlantHealth == 0) {
//                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
//                    Globals.player.sfPlantHealth = 6;
//                    newSunFlower.setBounds(sunFlowerHB.x, sunFlowerHB.y,
//                    sunFlowerHB.width, sunFlowerHB.height);
//                }  
            
            ////////////////////////////////////////////
            
            }
            if (zombieHB.intersects(stop)) {
                zombieHB.x += ZOMBIE_X_AMOUNT_INTERSECT;
                
            }
                        
            label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);        
                
        if (waveProgress >= 50){
            waveZombieSpawnTimer.start();
        }
        if (waveProgress >= 76){
            waveZombie2SpawnTimer.start();
        }
       
        }      
    }
    
    private void waveZombieMove(){
        
         if (newPeaShooter == null) {
            newPeaShooter = new JLabel();
        }
        if (newSunFlower == null){
            newSunFlower = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle explosionHB = getRectangle(explosion);
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
        Rectangle r10 = getRectangle(plantRange10);
        Rectangle r11 = getRectangle(plantRange11);
        Rectangle r12 = getRectangle(plantRange12);
        Rectangle r13 = getRectangle(plantRange13);
        Rectangle r14 = getRectangle(plantRange14);
        Rectangle r15 = getRectangle(plantRange15);
        Rectangle r16 = getRectangle(plantRange16);
        Rectangle r17 = getRectangle(plantRange17);
        Rectangle r18 = getRectangle(plantRange18);
        Rectangle r19 = getRectangle(plantRange19);
        Rectangle r20 = getRectangle(plantRange20);
        Rectangle r21 = getRectangle(plantRange21);
        Rectangle r22 = getRectangle(plantRange22);
        Rectangle r23 = getRectangle(plantRange23);
        Rectangle r24 = getRectangle(plantRange24);
        Rectangle r25 = getRectangle(plantRange25);
        Rectangle r26 = getRectangle(plantRange26);
        Rectangle r27 = getRectangle(plantRange27);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        
        for (int zombie2 = 0; zombie2 < waveZombies.size(); zombie2++) {    
            JLabel label = waveZombies.get(zombie2);
            waveZombieHB = getRectangle(label);           
            entrance = getRectangle(concrete);
            stop = getRectangle(barrier);
            waveZombieHB.x -= 1;
            
            if (waveZombieHB.intersects(entrance)) {
                waveZombieSpawnTimer.stop();
                waveZombieMoveTimer.stop();
                String text = "Level3";
        
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
                GameOver stage1 = new GameOver();
                this.dispose();
                waveZombieHB.setLocation(5000, 0);
            }
            
            if (waveZombieHB.intersects(explosionHB)){
                    
                    Globals.player.zombieHealth = Globals.player.zombieHealth -
                            Globals.player.cbExplosionDamage;
                    
                    if (Globals.player.zombieHealth <= 0){
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                    }
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
                newSunFlower = plantPickupLabels.get(plant);                
                Rectangle sunFlowerHB = getRectangle(newSunFlower);
                newSunFlower.setBounds(sunFlowerHB.x, 
                                        sunFlowerHB.y,
                                        sunFlowerHB.width, 
                                        sunFlowerHB.height);
                sunFlowerHB = getRectangle(newSunFlower);
                
                
                if (waveZombieHB.intersects(peaShooterHB)) {
                    waveZombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("ps plant health is " + 
                                       Globals.player.psPlantHealth);
                }   
                
                if (waveZombieHB.intersects(sunFlowerHB)) {
                    waveZombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.sfPlantHealth = Globals.player.sfPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("sf plant health is " + 
                                       Globals.player.sfPlantHealth);
                }
                // checking other stuff
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(140, 310);
                    p1 = getRectangle(pea1);
                }
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 310);
                    p2 = getRectangle(pea2);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 310);
                    p3 = getRectangle(pea3);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 310);
                    p4 = getRectangle(pea4);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 310);
                    p5 = getRectangle(pea5);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 310);
                    p6 = getRectangle(pea6);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 310);
                    p7 = getRectangle(pea7);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 310);
                    p8 = getRectangle(pea8);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 310);
                    p9 = getRectangle(pea9);
                } 
                    
                // checking other stuff
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 440);
                    p10 = getRectangle(pea10);
                }
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 440);
                    p11 = getRectangle(pea11);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 440);
                    p12 = getRectangle(pea12);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 440);
                    p13 = getRectangle(pea13);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 440);
                    p14 = getRectangle(pea14);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 440);
                    p15 = getRectangle(pea15);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 440);
                    p16 = getRectangle(pea16);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 440);
                    p17 = getRectangle(pea17);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 440);
                    p18 = getRectangle(pea18);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 570);
                    p19 = getRectangle(pea19);
                }
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 570);
                    p20 = getRectangle(pea20);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 570);
                    p21 = getRectangle(pea21);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 570);
                    p22 = getRectangle(pea22);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 570);
                    p23 = getRectangle(pea23);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 570);
                    p24 = getRectangle(pea24);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 570);
                    p25 = getRectangle(pea25);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 570);
                    p26 = getRectangle(pea26);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 570);
                    p27 = getRectangle(pea27);
                } 
                
                if (Globals.player.psPlantHealth == 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    newPeaShooter.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
                if (Globals.player.sfPlantHealth == 0) {
                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.sfPlantHealth = 6;
                    newSunFlower.setBounds(sunFlowerHB.x, sunFlowerHB.y,
                    sunFlowerHB.width, sunFlowerHB.height);
                }  
            
            ////////////////////////////////////////////
            
            
            if (waveZombieHB.intersects(stop)) {
                waveZombieHB.x += ZOMBIE_X_AMOUNT_INTERSECT;
            }
            
            label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
                }
            }    
        
    }
    
    private void waveZombie2Move(){
        if (newPeaShooter == null) {
            newPeaShooter = new JLabel();
        }
        if (newSunFlower == null){
            newSunFlower = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle explosionHB = getRectangle(explosion);
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
        Rectangle r10 = getRectangle(plantRange10);
        Rectangle r11 = getRectangle(plantRange11);
        Rectangle r12 = getRectangle(plantRange12);
        Rectangle r13 = getRectangle(plantRange13);
        Rectangle r14 = getRectangle(plantRange14);
        Rectangle r15 = getRectangle(plantRange15);
        Rectangle r16 = getRectangle(plantRange16);
        Rectangle r17 = getRectangle(plantRange17);
        Rectangle r18 = getRectangle(plantRange18);
        Rectangle r19 = getRectangle(plantRange19);
        Rectangle r20 = getRectangle(plantRange20);
        Rectangle r21 = getRectangle(plantRange21);
        Rectangle r22 = getRectangle(plantRange22);
        Rectangle r23 = getRectangle(plantRange23);
        Rectangle r24 = getRectangle(plantRange24);
        Rectangle r25 = getRectangle(plantRange25);
        Rectangle r26 = getRectangle(plantRange26);
        Rectangle r27 = getRectangle(plantRange27);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        
        for (int zombie3 = 0; zombie3 < waveZombies2.size(); zombie3++) {    
            JLabel label = waveZombies2.get(zombie3);
            waveZombie2HB = getRectangle(label);           
            entrance = getRectangle(concrete);
            stop = getRectangle(barrier);
            waveZombie2HB.x -= 1;
            
            if (waveZombie2HB.intersects(entrance)) {
                waveZombie2SpawnTimer.stop();
                waveZombie2MoveTimer.stop();
                String text = "Level3";
        
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
                GameOver gameEnd = new GameOver();
                this.dispose();
                waveZombie2HB.setLocation(5000, 0);
            }
            if (waveZombie2HB.intersects(explosionHB)){
                    
                    Globals.player.zombieHealth = Globals.player.zombieHealth -
                            Globals.player.cbExplosionDamage;
                    
                    if (Globals.player.zombieHealth <= 0){
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                    }
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
                
                newSunFlower = plantPickupLabels.get(plant);                
                Rectangle sunFlowerHB = getRectangle(newSunFlower);
                newSunFlower.setBounds(sunFlowerHB.x, 
                                        sunFlowerHB.y,
                                        sunFlowerHB.width, 
                                        sunFlowerHB.height);
                sunFlowerHB = getRectangle(newSunFlower);
                
                
                if (waveZombie2HB.intersects(peaShooterHB)) {
                    waveZombie2HB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("ps plant health is " + 
                                       Globals.player.psPlantHealth);
                }   
                
                if (waveZombie2HB.intersects(sunFlowerHB)) {
                    waveZombie2HB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.sfPlantHealth = Globals.player.sfPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("sf plant health is " + 
                                       Globals.player.sfPlantHealth);
                }
                // checking other stuff
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(140, 310);
                    p1 = getRectangle(pea1);
                }
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 310);
                    p2 = getRectangle(pea2);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 310);
                    p3 = getRectangle(pea3);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 310);
                    p4 = getRectangle(pea4);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 310);
                    p5 = getRectangle(pea5);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 310);
                    p6 = getRectangle(pea6);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 310);
                    p7 = getRectangle(pea7);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 310);
                    p8 = getRectangle(pea8);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 310);
                    p9 = getRectangle(pea9);
                } 
                    
                // checking other stuff
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 440);
                    p10 = getRectangle(pea10);
                }
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 440);
                    p11 = getRectangle(pea11);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 440);
                    p12 = getRectangle(pea12);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 440);
                    p13 = getRectangle(pea13);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 440);
                    p14 = getRectangle(pea14);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 440);
                    p15 = getRectangle(pea15);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 440);
                    p16 = getRectangle(pea16);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 440);
                    p17 = getRectangle(pea17);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 440);
                    p18 = getRectangle(pea18);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 570);
                    p19 = getRectangle(pea19);
                }
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 570);
                    p20 = getRectangle(pea20);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 570);
                    p21 = getRectangle(pea21);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 570);
                    p22 = getRectangle(pea22);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 570);
                    p23 = getRectangle(pea23);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 570);
                    p24 = getRectangle(pea24);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 570);
                    p25 = getRectangle(pea25);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 570);
                    p26 = getRectangle(pea26);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 570);
                    p27 = getRectangle(pea27);
                } 
                
                if (Globals.player.psPlantHealth == 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    newPeaShooter.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
                if (Globals.player.sfPlantHealth == 0) {
                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.sfPlantHealth = 6;
                    newSunFlower.setBounds(sunFlowerHB.x, sunFlowerHB.y,
                    sunFlowerHB.width, sunFlowerHB.height);
                }  
            
            ////////////////////////////////////////////
            
            
            if (waveZombie2HB.intersects(stop)) {
                waveZombie2HB.x += ZOMBIE_X_AMOUNT_INTERSECT;
            }
            
            label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);
                }
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p9.intersects(pStopper)){
                
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p10 = getRectangle(pea10);

            if (range10Trigger == true){

                p10.x += 1;
                pea10.setLocation(p10.x, p10.y);

            }
            if (range10Trigger == false){
                
                p10.x = 0;
                
            }
            if (p10.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p10.intersects(pStopper)){
                
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p11 = getRectangle(pea11);

            if (range11Trigger == true){

                p11.x += 1;
                pea11.setLocation(p11.x, p11.y);

            }
            if (range11Trigger == false){
                
                p11.x = 0;
                
            }
            if (p11.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p11.intersects(pStopper)){
                
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p12 = getRectangle(pea12);

            if (range12Trigger == true){

                p12.x += 1;
                pea12.setLocation(p12.x, p12.y);

            }
            if (range12Trigger == false){
                
                p12.x = 0;
                
            }
            if (p12.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p12.intersects(pStopper)){
                
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p13 = getRectangle(pea13);

            if (range13Trigger == true){

                p13.x += 1;
                pea13.setLocation(p13.x, p13.y);

            }
            if (range13Trigger == false){
                
                p13.x = 0;
                
            }
            if (p13.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p13.intersects(pStopper)){
                
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p14 = getRectangle(pea14);

            if (range14Trigger == true){

                p14.x += 1;
                pea14.setLocation(p14.x, p14.y);

            }
            if (range14Trigger == false){
                
                p14.x = 0;
                
            }
            if (p14.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p14.intersects(pStopper)){
                
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p15 = getRectangle(pea15);

            if (range15Trigger == true){

                p15.x += 1;
                pea15.setLocation(p15.x, p15.y);

            }
            if (range15Trigger == false){
                
                p15.x = 0;
                
            }
            if (p15.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p15.intersects(pStopper)){
                
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p16 = getRectangle(pea16);

            if (range16Trigger == true){

                p16.x += 1;
                pea16.setLocation(p16.x, p16.y);

            }
            if (range16Trigger == false){
                
                p16.x = 0;
                
            }
            if (p16.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p16.intersects(pStopper)){
                
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p17 = getRectangle(pea17);

            if (range17Trigger == true){

                p17.x += 1;
                pea17.setLocation(p17.x, p17.y);

            }
            if (range17Trigger == false){
                
                p17.x = 0;
                
            }
            if (p17.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p17.intersects(pStopper)){
                
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p18 = getRectangle(pea18);

            if (range18Trigger == true){

                p18.x += 1;
                pea18.setLocation(p18.x, p18.y);

            }
            if (range18Trigger == false){
                
                p18.x = 0;
                
            }
            if (p18.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p18.intersects(pStopper)){
                
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p19 = getRectangle(pea19);

            if (range19Trigger == true){

                p19.x += 1;
                pea19.setLocation(p19.x, p19.y);

            }
            if (range19Trigger == false){
                
                p19.x = 0;
                
            }
            if (p19.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p19.intersects(pStopper)){
                
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p20 = getRectangle(pea20);

            if (range20Trigger == true){

                p20.x += 1;
                pea20.setLocation(p20.x, p20.y);

            }
            if (range20Trigger == false){
                
                p20.x = 0;
                
            }
            if (p20.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p20.intersects(pStopper)){
                
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p21 = getRectangle(pea21);

            if (range21Trigger == true){

                p21.x += 1;
                pea21.setLocation(p21.x, p21.y);

            }
            if (range21Trigger == false){
                
                p21.x = 0;
                
            }
            if (p21.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p21.intersects(pStopper)){
                
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p22 = getRectangle(pea22);

            if (range22Trigger == true){

                p22.x += 1;
                pea22.setLocation(p22.x, p22.y);

            }
            if (range22Trigger == false){
                
                p22.x = 0;
                
            }
            if (p22.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p22.intersects(pStopper)){
                
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p23 = getRectangle(pea23);

            if (range23Trigger == true){

                p23.x += 1;
                pea23.setLocation(p23.x, p23.y);

            }
            if (range23Trigger == false){
                
                p23.x = 0;
                
            }
            if (p23.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p23.intersects(pStopper)){
                
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p24 = getRectangle(pea24);

            if (range24Trigger == true){

                p24.x += 1;
                pea24.setLocation(p24.x, p24.y);

            }
            if (range24Trigger == false){
                
                p24.x = 0;
                
            }
            if (p24.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p24.intersects(pStopper)){
                
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p25 = getRectangle(pea25);

            if (range25Trigger == true){

                p25.x += 1;
                pea25.setLocation(p25.x, p25.y);

            }
            if (range25Trigger == false){
                
                p25.x = 0;
                
            }
            if (p25.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p25.intersects(pStopper)){
                
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p26 = getRectangle(pea26);

            if (range26Trigger == true){

                p26.x += 1;
                pea26.setLocation(p26.x, p26.y);

            }
            if (range26Trigger == false){
                
                p26.x = 0;
                
            }
            if (p26.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p26.intersects(pStopper)){
                
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p27 = getRectangle(pea27);

            if (range27Trigger == true){

                p27.x += 1;
                pea27.setLocation(p18.x, p18.y);

            }
            if (range27Trigger == false){
                
                p27.x = 0;
                
            }
            if (p27.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       //////////////////////////
       //////WAVE ZOMBIES 1//////
       //////////////////////////
       
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p1.intersects(pStopper)){
                
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p2.intersects(pStopper)){
                
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p3.intersects(pStopper)){
                
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p4.intersects(pStopper)){
                
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p5.intersects(pStopper)){
                
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p6.intersects(pStopper)){
                
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p7.intersects(pStopper)){
                
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p8.intersects(pStopper)){
                
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p9.intersects(pStopper)){
                
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p10 = getRectangle(pea10);

            if (range10Trigger == true){

                p10.x += 1;
                pea10.setLocation(p10.x, p10.y);

            }
            if (range10Trigger == false){
                
                p10.x = 0;
                
            }
            if (p10.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p10.intersects(pStopper)){
                
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p11 = getRectangle(pea11);

            if (range11Trigger == true){

                p11.x += 1;
                pea11.setLocation(p11.x, p11.y);

            }
            if (range11Trigger == false){
                
                p11.x = 0;
                
            }
            if (p11.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p11.intersects(pStopper)){
                
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p12 = getRectangle(pea12);

            if (range12Trigger == true){

                p12.x += 1;
                pea12.setLocation(p12.x, p12.y);

            }
            if (range12Trigger == false){
                
                p12.x = 0;
                
            }
            if (p12.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p12.intersects(pStopper)){
                
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p13 = getRectangle(pea13);

            if (range13Trigger == true){

                p13.x += 1;
                pea13.setLocation(p13.x, p13.y);

            }
            if (range13Trigger == false){
                
                p13.x = 0;
                
            }
            if (p13.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p13.intersects(pStopper)){
                
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p14 = getRectangle(pea14);

            if (range14Trigger == true){

                p14.x += 1;
                pea14.setLocation(p14.x, p14.y);

            }
            if (range14Trigger == false){
                
                p14.x = 0;
                
            }
            if (p14.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p14.intersects(pStopper)){
                
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p15 = getRectangle(pea15);

            if (range15Trigger == true){

                p15.x += 1;
                pea15.setLocation(p15.x, p15.y);

            }
            if (range15Trigger == false){
                
                p15.x = 0;
                
            }
            if (p15.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p15.intersects(pStopper)){
                
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p16 = getRectangle(pea16);

            if (range16Trigger == true){

                p16.x += 1;
                pea16.setLocation(p16.x, p16.y);

            }
            if (range16Trigger == false){
                
                p16.x = 0;
                
            }
            if (p16.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p16.intersects(pStopper)){
                
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p17 = getRectangle(pea17);

            if (range17Trigger == true){

                p17.x += 1;
                pea17.setLocation(p17.x, p17.y);

            }
            if (range17Trigger == false){
                
                p17.x = 0;
                
            }
            if (p17.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p17.intersects(pStopper)){
                
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p18 = getRectangle(pea18);

            if (range18Trigger == true){

                p18.x += 1;
                pea18.setLocation(p18.x, p18.y);

            }
            if (range18Trigger == false){
                
                p18.x = 0;
                
            }
            if (p18.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p18.intersects(pStopper)){
                
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p19 = getRectangle(pea19);

            if (range19Trigger == true){

                p19.x += 1;
                pea19.setLocation(p19.x, p19.y);

            }
            if (range19Trigger == false){
                
                p19.x = 0;
                
            }
            if (p19.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p19.intersects(pStopper)){
                
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p20 = getRectangle(pea20);

            if (range20Trigger == true){

                p20.x += 1;
                pea20.setLocation(p20.x, p20.y);

            }
            if (range20Trigger == false){
                
                p20.x = 0;
                
            }
            if (p20.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p20.intersects(pStopper)){
                
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p21 = getRectangle(pea21);

            if (range21Trigger == true){

                p21.x += 1;
                pea21.setLocation(p21.x, p21.y);

            }
            if (range21Trigger == false){
                
                p21.x = 0;
                
            }
            if (p21.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p21.intersects(pStopper)){
                
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p22 = getRectangle(pea22);

            if (range22Trigger == true){

                p22.x += 1;
                pea22.setLocation(p22.x, p22.y);

            }
            if (range22Trigger == false){
                
                p22.x = 0;
                
            }
            if (p22.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p22.intersects(pStopper)){
                
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p23 = getRectangle(pea23);

            if (range23Trigger == true){

                p23.x += 1;
                pea23.setLocation(p23.x, p23.y);

            }
            if (range23Trigger == false){
                
                p23.x = 0;
                
            }
            if (p23.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p23.intersects(pStopper)){
                
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p24 = getRectangle(pea24);

            if (range24Trigger == true){

                p24.x += 1;
                pea24.setLocation(p24.x, p24.y);

            }
            if (range24Trigger == false){
                
                p24.x = 0;
                
            }
            if (p24.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p24.intersects(pStopper)){
                
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p25 = getRectangle(pea25);

            if (range25Trigger == true){

                p25.x += 1;
                pea25.setLocation(p25.x, p25.y);

            }
            if (range25Trigger == false){
                
                p25.x = 0;
                
            }
            if (p25.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p25.intersects(pStopper)){
                
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p26 = getRectangle(pea26);

            if (range26Trigger == true){

                p26.x += 1;
                pea26.setLocation(p26.x, p26.y);

            }
            if (range26Trigger == false){
                
                p26.x = 0;
                
            }
            if (p26.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p26.intersects(pStopper)){
                
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p27 = getRectangle(pea27);

            if (range27Trigger == true){

                p27.x += 1;
                pea27.setLocation(p18.x, p18.y);

            }
            if (range27Trigger == false){
                
                p27.x = 0;
                
            }
            if (p27.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombieHB.x, waveZombieHB.y,
                    waveZombieHB.width, waveZombieHB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }   
       
       //////////////////////////
       //////WAVE ZOMBIES 2//////
       //////////////////////////
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p1 = getRectangle(pea1);

            if (range1Trigger == true){

                p1.x += 1;
                pea1.setLocation(p1.x, p1.y);

            }
            if (range1Trigger == false){
                
                p1.x = 0;
                
            }
            if (p1.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p1.intersects(pStopper)){
                
                pea1.setLocation(1500, 460);
                range1Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p2 = getRectangle(pea2);

            if (range2Trigger == true){

                p2.x += 1;
                pea2.setLocation(p2.x, p2.y);

            }
            if (range2Trigger == false){
                
                p2.x = 0;
                
            }
            if (p2.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p2.intersects(pStopper)){
                
                pea2.setLocation(1500, 460);
                range2Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p3 = getRectangle(pea3);

            if (range3Trigger == true){

                p3.x += 1;
                pea3.setLocation(p3.x, p3.y);

            }
            if (range3Trigger == false){
                
                p3.x = 0;
                
            }
            if (p3.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p3.intersects(pStopper)){
                
                pea3.setLocation(1500, 460);
                range3Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p4 = getRectangle(pea4);

            if (range4Trigger == true){

                p4.x += 1;
                pea4.setLocation(p4.x, p4.y);

            }
            if (range4Trigger == false){
                
                p4.x = 0;
                
            }
            if (p4.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p4.intersects(pStopper)){
                
                pea4.setLocation(1500, 460);
                range4Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p5 = getRectangle(pea5);

            if (range5Trigger == true){

                p5.x += 1;
                pea5.setLocation(p5.x, p5.y);

            }
            if (range5Trigger == false){
                
                p5.x = 0;
                
            }
            if (p5.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p5.intersects(pStopper)){
                
                pea5.setLocation(1500, 460);
                range5Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p6 = getRectangle(pea6);

            if (range6Trigger == true){

                p6.x += 1;
                pea6.setLocation(p6.x, p6.y);

            }
            if (range6Trigger == false){
                
                p6.x = 0;
                
            }
            if (p6.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p6.intersects(pStopper)){
                
                pea6.setLocation(1500, 460);
                range6Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p7 = getRectangle(pea7);

            if (range7Trigger == true){

                p7.x += 1;
                pea7.setLocation(p7.x, p7.y);

            }
            if (range7Trigger == false){
                
                p7.x = 0;
                
            }
            if (p7.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p7.intersects(pStopper)){
                
                pea7.setLocation(1500, 460);
                range7Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p8 = getRectangle(pea8);

            if (range8Trigger == true){

                p8.x += 1;
                pea8.setLocation(p8.x, p8.y);

            }
            if (range8Trigger == false){
                
                p8.x = 0;
                
            }
            if (p8.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p8.intersects(pStopper)){
                
                pea8.setLocation(1500, 460);
                range8Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p9 = getRectangle(pea9);

            if (range9Trigger == true){

                p9.x += 1;
                pea9.setLocation(p9.x, p9.y);

            }
            if (range9Trigger == false){
                
                p9.x = 0;
                
            }
            if (p9.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p9.intersects(pStopper)){
                
                pea9.setLocation(1500, 460);
                range9Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p10 = getRectangle(pea10);

            if (range10Trigger == true){

                p10.x += 1;
                pea10.setLocation(p10.x, p10.y);

            }
            if (range10Trigger == false){
                
                p10.x = 0;
                
            }
            if (p10.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p10.intersects(pStopper)){
                
                pea10.setLocation(1500, 460);
                range10Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p11 = getRectangle(pea11);

            if (range11Trigger == true){

                p11.x += 1;
                pea11.setLocation(p11.x, p11.y);

            }
            if (range11Trigger == false){
                
                p11.x = 0;
                
            }
            if (p11.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p11.intersects(pStopper)){
                
                pea11.setLocation(1500, 460);
                range11Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p12 = getRectangle(pea12);

            if (range12Trigger == true){

                p12.x += 1;
                pea12.setLocation(p12.x, p12.y);

            }
            if (range12Trigger == false){
                
                p12.x = 0;
                
            }
            if (p12.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p12.intersects(pStopper)){
                
                pea12.setLocation(1500, 460);
                range12Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p13 = getRectangle(pea13);

            if (range13Trigger == true){

                p13.x += 1;
                pea13.setLocation(p13.x, p13.y);

            }
            if (range13Trigger == false){
                
                p13.x = 0;
                
            }
            if (p13.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p13.intersects(pStopper)){
                
                pea13.setLocation(1500, 460);
                range13Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p14 = getRectangle(pea14);

            if (range14Trigger == true){

                p14.x += 1;
                pea14.setLocation(p14.x, p14.y);

            }
            if (range14Trigger == false){
                
                p14.x = 0;
                
            }
            if (p14.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p14.intersects(pStopper)){
                
                pea14.setLocation(1500, 460);
                range14Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p15 = getRectangle(pea15);

            if (range15Trigger == true){

                p15.x += 1;
                pea15.setLocation(p15.x, p15.y);

            }
            if (range15Trigger == false){
                
                p15.x = 0;
                
            }
            if (p15.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p15.intersects(pStopper)){
                
                pea15.setLocation(1500, 460);
                range15Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p16 = getRectangle(pea16);

            if (range16Trigger == true){

                p16.x += 1;
                pea16.setLocation(p16.x, p16.y);

            }
            if (range16Trigger == false){
                
                p16.x = 0;
                
            }
            if (p16.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p16.intersects(pStopper)){
                
                pea16.setLocation(1500, 460);
                range16Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p17 = getRectangle(pea17);

            if (range17Trigger == true){

                p17.x += 1;
                pea17.setLocation(p17.x, p17.y);

            }
            if (range17Trigger == false){
                
                p17.x = 0;
                
            }
            if (p17.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p17.intersects(pStopper)){
                
                pea17.setLocation(1500, 460);
                range17Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p18 = getRectangle(pea18);

            if (range18Trigger == true){

                p18.x += 1;
                pea18.setLocation(p18.x, p18.y);

            }
            if (range18Trigger == false){
                
                p18.x = 0;
                
            }
            if (p18.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p18.intersects(pStopper)){
                
                pea18.setLocation(1500, 460);
                range18Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p19 = getRectangle(pea19);

            if (range19Trigger == true){

                p19.x += 1;
                pea19.setLocation(p19.x, p19.y);

            }
            if (range19Trigger == false){
                
                p19.x = 0;
                
            }
            if (p19.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                if (Globals.player.zombieHealth <= 0) {
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                }
                
                
                
                if (waveProgress >= 100){
                
                    zombieMoveTimer.stop();
                    projectileMoveTimer.stop();
                    zombieSpawnTimer.stop();
                    this.dispose();
                    waveProgress = 0;
                    Level3Win complete3 = new Level3Win();
                    
                }
                
            }
            
            if (p19.intersects(pStopper)){
                
                pea19.setLocation(1500, 460);
                range19Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p20 = getRectangle(pea20);

            if (range20Trigger == true){

                p20.x += 1;
                pea20.setLocation(p20.x, p20.y);

            }
            if (range20Trigger == false){
                
                p20.x = 0;
                
            }
            if (p20.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p20.intersects(pStopper)){
                
                pea20.setLocation(1500, 460);
                range20Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p21 = getRectangle(pea21);

            if (range21Trigger == true){

                p21.x += 1;
                pea21.setLocation(p21.x, p21.y);

            }
            if (range21Trigger == false){
                
                p21.x = 0;
                
            }
            if (p21.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p21.intersects(pStopper)){
                
                pea21.setLocation(1500, 460);
                range21Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p22 = getRectangle(pea22);

            if (range22Trigger == true){

                p22.x += 1;
                pea22.setLocation(p22.x, p22.y);

            }
            if (range22Trigger == false){
                
                p22.x = 0;
                
            }
            if (p22.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p22.intersects(pStopper)){
                
                pea22.setLocation(1500, 460);
                range22Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p23 = getRectangle(pea23);

            if (range23Trigger == true){

                p23.x += 1;
                pea23.setLocation(p23.x, p23.y);

            }
            if (range23Trigger == false){
                
                p23.x = 0;
                
            }
            if (p23.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p23.intersects(pStopper)){
                
                pea23.setLocation(1500, 460);
                range23Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p24 = getRectangle(pea24);

            if (range24Trigger == true){

                p24.x += 1;
                pea24.setLocation(p24.x, p24.y);

            }
            if (range24Trigger == false){
                
                p24.x = 0;
                
            }
            if (p24.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p24.intersects(pStopper)){
                
                pea24.setLocation(1500, 460);
                range24Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p25 = getRectangle(pea25);

            if (range25Trigger == true){

                p25.x += 1;
                pea25.setLocation(p25.x, p25.y);

            }
            if (range25Trigger == false){
                
                p25.x = 0;
                
            }
            if (p25.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p25.intersects(pStopper)){
                
                pea25.setLocation(1500, 460);
                range25Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p26 = getRectangle(pea26);

            if (range26Trigger == true){

                p26.x += 1;
                pea26.setLocation(p26.x, p26.y);

            }
            if (range26Trigger == false){
                
                p26.x = 0;
                
            }
            if (p26.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
                zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p26.intersects(pStopper)){
                
                pea26.setLocation(1500, 460);
                range26Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p27 = getRectangle(pea27);

            if (range27Trigger == true){

                p27.x += 1;
                pea27.setLocation(p18.x, p18.y);

            }
            if (range27Trigger == false){
                
                p27.x = 0;
                
            }
            if (p27.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
            }
            if (Globals.player.zombieHealth == 0) {                
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(waveZombie2HB.x, waveZombie2HB.y,
                    waveZombie2HB.width, waveZombie2HB.height);  
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress >= 100){
                
               zombieMoveTimer.stop();
                projectileMoveTimer.stop();
                zombieSpawnTimer.stop();
                this.dispose();
                waveProgress = 0;
                Level3Win complete3 = new Level3Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }     

    }
    
    private void rangeReturn(){
    
        if (range1Trigger == false){
        plantRange1.setLocation(100, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();
        }
        
        if(range2Trigger == false){
        plantRange2.setLocation(230, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range3Trigger == false){
        plantRange3.setLocation(360, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range4Trigger == false){
        plantRange4.setLocation(490, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range5Trigger == false){
        plantRange5.setLocation(620, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range6Trigger == false){
        plantRange6.setLocation(750, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range7Trigger == false){
        plantRange7.setLocation(880, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range8Trigger == false){
        plantRange8.setLocation(1010, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range9Trigger == false){
        plantRange9.setLocation(1140, 300);
        zombieRange.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        if (range10Trigger == false){
        plantRange10.setLocation(100, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();
        }
        
        if(range11Trigger == false){
        plantRange11.setLocation(230, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range12Trigger == false){
        plantRange12.setLocation(360, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range13Trigger == false){
        plantRange13.setLocation(490, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range14Trigger == false){
        plantRange14.setLocation(620, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range15Trigger == false){
        plantRange15.setLocation(750, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range16Trigger == false){
        plantRange16.setLocation(880, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range17Trigger == false){
        plantRange17.setLocation(1010, 430);
        zombieRange2.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range18Trigger == false){
        plantRange18.setLocation(1140, 430);
        zombieRange2.setLocation(130, 480);
        rangeReturnTimer.stop();              
        }
        if (range19Trigger == false){
        plantRange19.setLocation(100, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();
        }
        
        if(range20Trigger == false){
        plantRange20.setLocation(230, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range21Trigger == false){
        plantRange21.setLocation(360, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range22Trigger == false){
        plantRange22.setLocation(490, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range23Trigger == false){
        plantRange23.setLocation(620, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range24Trigger == false){
        plantRange24.setLocation(750, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range25Trigger == false){
        plantRange25.setLocation(880, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range26Trigger == false){
        plantRange26.setLocation(1010, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range27Trigger == false){
        plantRange27.setLocation(1140, 560);
        zombieRange3.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
    
    }
     
    private void peaShooterRecharge() {        
        peaSRechargeTimer.start();       
        rechargePeaBar = rechargePeaBar + 1;        
        peaShooterBar.setValue(rechargePeaBar);        
        if (rechargePeaBar == 100){            
            peaShooterRecharged = true;
            peaSRechargeTimer.stop();
        }
        else {            
            peaShooterRecharged = false;            
        }      
    }
    
    private void sunFlowerRecharge() {        
        sunFRechargeTimer.start();       
        rechargeSunFlowerBar = rechargeSunFlowerBar + 1;        
        sunFlowerBar.setValue(rechargeSunFlowerBar);        
        if (rechargeSunFlowerBar == 100){            
            sunFlowerRecharged = true;
            sunFRechargeTimer.stop();
        }
        else {            
            sunFlowerRecharged = false;            
        }      
    }
    
    private void cherryBombRecharge() {        
        cherryBombRechargeTimer.start();       
        rechargeCherryBombBar = rechargeCherryBombBar + 1;        
        cherryBombBar.setValue(rechargeCherryBombBar);        
        if (rechargeCherryBombBar == 100){            
            cherryBombRecharged = true;
            cherryBombRechargeTimer.stop();
        }
        else {            
            cherryBombRecharged = false;            
        }      
    }
        
    private void grassClicked(MouseEvent evt, int x, int y) {  
        if (peaHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            newPeaShooter = plantPickupLabels.get(index);
            newPeaShooter.setLocation(x, y);    
            peaHasClicked = false;
            rechargePeaBar = 0;
            peaSRechargeTimer.start();
            peaShooterPack.setLocation(PEA_PACK_X, PEA_PACK_Y);            
        }
        
        if (sunFlowerHasClicked == true){
            int index = plantPickupLabels.size() - 1;
            newSunFlower = plantPickupLabels.get(index);
            newSunFlower.setLocation(x, y);  
            System.out.println("sunflower placed");
            sunFlowerHasClicked = false;
            rechargeSunFlowerBar = 0;
            totalSunFlowers = totalSunFlowers + 1;
            sunFRechargeTimer.start();
            sunFlowerPack.setLocation(SUNFLOWER_PACK_X, SUNFLOWER_PACK_Y); 
            sunFlowerSunTimer.start();
        }
        
        if (cherryBombHasClicked == true) {
            cherryBombExplosionTimer.start();
            int index = plantPickupLabels.size() - 1;
            newCherryBomb = plantPickupLabels.get(index);
            newCherryBomb.setLocation(x, y);    
            cherryBombHasClicked = false;
            rechargeCherryBombBar = 0;
            cherryBombRechargeTimer.start();
            tempExplosionX = x - 120;
            tempExplosionY = y - 120;
            cherryBombPack.setLocation(CHERRYBOMB_PACK_X, CHERRYBOMB_PACK_Y);            
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
    
    private void newSunFlowerPackMouseClicked(MouseEvent evt, int index) {  
        if (spadeHasClicked == true) {            
            JLabel sunFlower = plantPickupLabels.get(index);
            sunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);      
        }
        else if (spadeHasClicked == true){
            System.out.println("CLICK ON A PLANT");
        }
    }
    
    private void originalPeaShooterPackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX_PEA && peaShooterRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX_PEA;          
            if (peaHasClicked == false) {               
                peaHasClicked = true;
                peaShooterPack.setLocation(OFF_SCREEN_X, PEA_PACK_Y);                
            }
            else if (peaHasClicked == true && peaShooterRecharged == true) {               
                peaHasClicked = true;
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
            getContentPane().setComponentZOrder(newPeaShooter, 1);            
            plantPickupLabels.add(newPeaShooter);            
            Globals.player.psPlantHealth = PEA_PLANT_HEALTH;
        }        
        if(sun >= SUN_PROGRESS_MAX_PEA && peaShooterRecharged == false){
            System.out.println("PEA SHOOTER NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX_PEA && peaShooterRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX_PEA && peaShooterRecharged == false){
            System.out.println("PEA SHOOTER NOT RECHARGED YET AND NOT ENOUGH SUN");
        }
    }
    
    private void originalSunFlowerPackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX_SUNFLOWER && sunFlowerRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX_SUNFLOWER;          
            if (sunFlowerHasClicked == false) {               
                sunFlowerHasClicked = true;
                sunFlowerPack.setLocation(OFF_SCREEN_X, PEA_PACK_Y);                
            }
            else if (sunFlowerHasClicked == true && sunFlowerRecharged == true) {               
                sunFlowerHasClicked = true;
                System.out.println("PLANT THE SUNFLOWER OR CANCEL");               
            }          
            plantPickups.add(plantPickup);
            plantsPlaced.add(plantPlaced);            
            int index = plantPickupLabels.size();
            JLabel newSunFlower = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource(NEW_SUNFLOWER_IMAGE));
            newSunFlower.setIcon(icon);
            newSunFlower.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    newSunFlowerPackMouseClicked(evt, index);
                }
            });
            getContentPane().add(newSunFlower);            
            x += SUNFLOWER_NEW_X;
            y += SUNFLOWER_NEW_Y;            
            newSunFlower.setBounds(x, y, SUNFLOWER_NEW_WIDTH, SUNFLOWER_NEW_HEIGHT);
            getContentPane().setComponentZOrder(newSunFlower, 0);            
            plantPickupLabels.add(newSunFlower);            
            Globals.player.sfPlantHealth = SUNFLOWER_PLANT_HEALTH;
        }        
        if(sun >= SUN_PROGRESS_MAX_SUNFLOWER && sunFlowerRecharged == false){
            System.out.println("SUNFLOWER NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX_SUNFLOWER && sunFlowerRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX_SUNFLOWER && sunFlowerRecharged == false){
            System.out.println("SUNFLOWER NOT RECHARGED YET AND NOT ENOUGH SUN");
        }
    }
    
    
    private void originalCherryBombPackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX_CHERRYBOMB && cherryBombRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX_CHERRYBOMB;          
            if (cherryBombHasClicked == false) {               
                cherryBombHasClicked = true;
                cherryBombPack.setLocation(OFF_SCREEN_X, PEA_PACK_Y);                
            }
            else if (cherryBombHasClicked == true && cherryBombRecharged == true) {               
                cherryBombHasClicked = true;
                System.out.println("PLANT THE CHERRY BOMB OR CANCEL");               
            }          
            plantPickups.add(plantPickup);
            plantsPlaced.add(plantPlaced);            
            int index = plantPickupLabels.size();
            JLabel newCherryBomb = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource(NEW_CHERRYBOMB_IMAGE));
            newCherryBomb.setIcon(icon);
            newCherryBomb.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    newSunFlowerPackMouseClicked(evt, index);
                }
            });
            getContentPane().add(newCherryBomb);            
            x += CHERRYBOMB_NEW_X;
            y += CHERRYBOMB_NEW_Y;            
            newCherryBomb.setBounds(x, y, CHERRYBOMB_NEW_WIDTH, CHERRYBOMB_NEW_HEIGHT);
            getContentPane().setComponentZOrder(newCherryBomb, 0);            
            plantPickupLabels.add(newCherryBomb);            
        }        
        if(sun >= SUN_PROGRESS_MAX_CHERRYBOMB && cherryBombRecharged == false){
            System.out.println("CHERRYBOMB NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX_CHERRYBOMB && cherryBombRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX_CHERRYBOMB && cherryBombRecharged == false){
            System.out.println("CHERRYBOMB NOT RECHARGED YET AND NOT ENOUGH SUN");
        }
    }
    
    private void shovelClicked() {         
        shovelPickup = true;          
        if (peaHasClicked == false && sunFlowerHasClicked == false) {
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
        if (peaHasClicked == true) {
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
        
        if (sunFlowerHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            JLabel sunFlower = plantPickupLabels.get(index);
            if (sunFlower != null) {
                int w = sunFlower.getWidth();
                int h = sunFlower.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                sunFlower.setBounds(x, y, w, h);
            }
        }   
        if (cherryBombHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            JLabel cherryBomb = plantPickupLabels.get(index);
            if (cherryBomb != null) {
                int w = cherryBomb.getWidth();
                int h = cherryBomb.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                cherryBomb.setBounds(x, y, w, h);
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
        if (peaHasClicked == true) {            
            peaHasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel peaShooter = plantPickupLabels.get(index);
            peaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + 100;      
            peaShooterPack.setLocation(PEA_PACK_X, PEA_PACK_Y);
        }    
        if (sunFlowerHasClicked == true) {            
            sunFlowerHasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel sunFlower = plantPickupLabels.get(index);
            sunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + 50;      
            sunFlowerPack.setLocation(SUNFLOWER_PACK_X, SUNFLOWER_PACK_Y);
        }  
        if (cherryBombHasClicked == true) {            
            cherryBombHasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel cherryBomb = plantPickupLabels.get(index);
            cherryBomb.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + 150;      
            cherryBombPack.setLocation(CHERRYBOMB_PACK_X, CHERRYBOMB_PACK_Y);
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
