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
public class Level5 extends javax.swing.JFrame {
    
    
    // <editor-fold defaultstate="collapsed" desc="NETBEANS GENERATED METHODS BELOW - Generated Code">  
          
    public Level5() {
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
        pea28 = new javax.swing.JLabel();
        pea29 = new javax.swing.JLabel();
        pea30 = new javax.swing.JLabel();
        pea31 = new javax.swing.JLabel();
        pea32 = new javax.swing.JLabel();
        pea33 = new javax.swing.JLabel();
        pea34 = new javax.swing.JLabel();
        pea35 = new javax.swing.JLabel();
        pea36 = new javax.swing.JLabel();
        pea37 = new javax.swing.JLabel();
        pea38 = new javax.swing.JLabel();
        pea39 = new javax.swing.JLabel();
        pea40 = new javax.swing.JLabel();
        pea41 = new javax.swing.JLabel();
        pea42 = new javax.swing.JLabel();
        pea43 = new javax.swing.JLabel();
        pea44 = new javax.swing.JLabel();
        pea45 = new javax.swing.JLabel();
        explosion = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
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
        sunFlowerBar = new javax.swing.JProgressBar();
        wallnutPack = new javax.swing.JLabel();
        cherryBombBar = new javax.swing.JProgressBar();
        potatoMinePack = new javax.swing.JLabel();
        wallnutBar = new javax.swing.JProgressBar();
        potatoMineBar = new javax.swing.JProgressBar();
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
        jPanel68 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        plantRange28 = new javax.swing.JLabel();
        plantRange29 = new javax.swing.JLabel();
        plantRange30 = new javax.swing.JLabel();
        plantRange31 = new javax.swing.JLabel();
        plantRange32 = new javax.swing.JLabel();
        plantRange33 = new javax.swing.JLabel();
        plantRange34 = new javax.swing.JLabel();
        plantRange35 = new javax.swing.JLabel();
        plantRange36 = new javax.swing.JLabel();
        zombieRange4 = new javax.swing.JLabel();
        grass28 = new javax.swing.JLabel();
        grass29 = new javax.swing.JLabel();
        grass30 = new javax.swing.JLabel();
        grass31 = new javax.swing.JLabel();
        grass32 = new javax.swing.JLabel();
        grass33 = new javax.swing.JLabel();
        grass34 = new javax.swing.JLabel();
        grass35 = new javax.swing.JLabel();
        grass36 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        plantRange37 = new javax.swing.JLabel();
        plantRange38 = new javax.swing.JLabel();
        plantRange39 = new javax.swing.JLabel();
        plantRange40 = new javax.swing.JLabel();
        plantRange41 = new javax.swing.JLabel();
        plantRange42 = new javax.swing.JLabel();
        plantRange43 = new javax.swing.JLabel();
        plantRange44 = new javax.swing.JLabel();
        plantRange45 = new javax.swing.JLabel();
        zombieRange5 = new javax.swing.JLabel();
        grass37 = new javax.swing.JLabel();
        grass38 = new javax.swing.JLabel();
        grass39 = new javax.swing.JLabel();
        grass40 = new javax.swing.JLabel();
        grass41 = new javax.swing.JLabel();
        grass42 = new javax.swing.JLabel();
        grass43 = new javax.swing.JLabel();
        grass44 = new javax.swing.JLabel();
        grass45 = new javax.swing.JLabel();

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
        waveZombie1.setBounds(2040, 300, 80, 120);

        waveZombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie2);
        waveZombie2.setBounds(2080, 300, 80, 120);

        waveZombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie3);
        waveZombie3.setBounds(2120, 300, 80, 120);

        waveZombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie4);
        waveZombie4.setBounds(2180, 300, 80, 120);

        waveZombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie5);
        waveZombie5.setBounds(2240, 300, 80, 120);

        pea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea1);
        pea1.setBounds(1440, 220, 28, 30);

        pea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea2);
        pea2.setBounds(1470, 220, 28, 30);

        pea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea3);
        pea3.setBounds(1510, 220, 28, 30);

        pea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea4);
        pea4.setBounds(1550, 220, 28, 30);

        pea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea5);
        pea5.setBounds(1590, 220, 28, 30);

        pea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea6);
        pea6.setBounds(1630, 220, 28, 30);

        pea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea7);
        pea7.setBounds(1670, 220, 28, 30);

        pea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea8);
        pea8.setBounds(1710, 220, 28, 30);

        pea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea9);
        pea9.setBounds(1750, 220, 28, 30);

        pea10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea10);
        pea10.setBounds(1440, 350, 28, 30);

        pea11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea11);
        pea11.setBounds(1470, 350, 28, 30);

        pea12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea12);
        pea12.setBounds(1510, 350, 28, 30);

        pea13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea13);
        pea13.setBounds(1550, 350, 28, 30);

        pea14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea14);
        pea14.setBounds(1590, 350, 28, 30);

        pea15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea15);
        pea15.setBounds(1630, 350, 28, 30);

        pea16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea16);
        pea16.setBounds(1670, 350, 28, 30);

        pea17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea17);
        pea17.setBounds(1710, 350, 28, 30);

        pea18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea18);
        pea18.setBounds(1750, 350, 28, 30);

        pea19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea19);
        pea19.setBounds(1440, 470, 28, 30);

        pea20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea20);
        pea20.setBounds(1470, 470, 28, 30);

        pea21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea21);
        pea21.setBounds(1510, 470, 28, 30);

        pea22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea22);
        pea22.setBounds(1550, 470, 28, 30);

        pea23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea23);
        pea23.setBounds(1590, 470, 28, 30);

        pea24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea24);
        pea24.setBounds(1630, 470, 28, 30);

        pea25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea25);
        pea25.setBounds(1670, 470, 28, 30);

        pea26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea26);
        pea26.setBounds(1710, 470, 28, 30);

        pea27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea27);
        pea27.setBounds(1750, 470, 28, 30);

        pea28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea28);
        pea28.setBounds(1450, 590, 28, 30);

        pea29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea29);
        pea29.setBounds(1480, 590, 28, 30);

        pea30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea30);
        pea30.setBounds(1520, 590, 28, 30);

        pea31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea31);
        pea31.setBounds(1560, 590, 28, 30);

        pea32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea32);
        pea32.setBounds(1600, 590, 28, 30);

        pea33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea33);
        pea33.setBounds(1640, 590, 28, 30);

        pea34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea34);
        pea34.setBounds(1680, 590, 28, 30);

        pea35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea35);
        pea35.setBounds(1720, 590, 28, 30);

        pea36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea36);
        pea36.setBounds(1760, 590, 28, 30);

        pea37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea37);
        pea37.setBounds(1450, 710, 28, 30);

        pea38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea38);
        pea38.setBounds(1480, 710, 28, 30);

        pea39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea39);
        pea39.setBounds(1520, 710, 28, 30);

        pea40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea40);
        pea40.setBounds(1560, 710, 28, 30);

        pea41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea41);
        pea41.setBounds(1600, 710, 28, 30);

        pea42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea42);
        pea42.setBounds(1640, 710, 28, 30);

        pea43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea43);
        pea43.setBounds(1680, 710, 28, 30);

        pea44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea44);
        pea44.setBounds(1720, 710, 28, 30);

        pea45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ProjectilePea.png"))); // NOI18N
        getContentPane().add(pea45);
        pea45.setBounds(1760, 710, 28, 30);

        explosion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cbExplosion.png"))); // NOI18N
        getContentPane().add(explosion);
        explosion.setBounds(1950, 510, 380, 380);

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
        getContentPane().add(concrete);
        concrete.setBounds(50, 170, 10, 640);

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
        cherryBombPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cherryBombPackMouseClicked(evt);
            }
        });
        packMenu.add(cherryBombPack);
        cherryBombPack.setBounds(200, 0, 70, 90);

        sunFlowerBar.setForeground(new java.awt.Color(153, 153, 153));
        sunFlowerBar.setValue(100);
        packMenu.add(sunFlowerBar);
        sunFlowerBar.setBounds(120, 100, 60, 14);

        wallnutPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/wallnutpacket.png"))); // NOI18N
        wallnutPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallnutPackMouseClicked(evt);
            }
        });
        packMenu.add(wallnutPack);
        wallnutPack.setBounds(280, 0, 70, 90);

        cherryBombBar.setForeground(new java.awt.Color(153, 153, 153));
        cherryBombBar.setValue(100);
        packMenu.add(cherryBombBar);
        cherryBombBar.setBounds(200, 100, 60, 14);

        potatoMinePack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/PotatoMineSeedPacket.png"))); // NOI18N
        potatoMinePack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potatoMinePackMouseClicked(evt);
            }
        });
        packMenu.add(potatoMinePack);
        potatoMinePack.setBounds(360, 0, 70, 90);

        wallnutBar.setForeground(new java.awt.Color(153, 153, 153));
        wallnutBar.setValue(100);
        packMenu.add(wallnutBar);
        wallnutBar.setBounds(280, 100, 60, 14);

        potatoMineBar.setForeground(new java.awt.Color(153, 153, 153));
        potatoMineBar.setValue(100);
        packMenu.add(potatoMineBar);
        potatoMineBar.setBounds(360, 100, 60, 14);

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
        jPanel20.setBounds(1130, 170, 10, 120);

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
        jPanel21.setBounds(350, 300, 10, 120);

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
        jPanel22.setBounds(350, 170, 10, 120);

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
        jPanel23.setBounds(480, 170, 10, 120);

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
        jPanel24.setBounds(610, 170, 10, 120);

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
        jPanel25.setBounds(740, 170, 10, 120);

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
        jPanel26.setBounds(870, 170, 10, 120);

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
        jPanel27.setBounds(1000, 170, 10, 120);

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
        zombieRange.setBounds(100, 270, 1220, 20);

        plantRange1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange1.setText("RANGE 1");
        getContentPane().add(plantRange1);
        plantRange1.setBounds(100, 170, 120, 20);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass1MouseClicked(evt);
            }
        });
        getContentPane().add(grass1);
        grass1.setBounds(100, 170, 120, 120);

        plantRange2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange2.setText("RANGE 2");
        getContentPane().add(plantRange2);
        plantRange2.setBounds(230, 180, 120, 20);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass2MouseClicked(evt);
            }
        });
        getContentPane().add(grass2);
        grass2.setBounds(230, 170, 120, 120);

        plantRange3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange3.setText("RANGE 3");
        getContentPane().add(plantRange3);
        plantRange3.setBounds(360, 190, 120, 20);

        grass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass3MouseClicked(evt);
            }
        });
        getContentPane().add(grass3);
        grass3.setBounds(360, 170, 120, 120);

        plantRange4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange4.setText("RANGE 4");
        getContentPane().add(plantRange4);
        plantRange4.setBounds(490, 200, 120, 20);

        grass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass4MouseClicked(evt);
            }
        });
        getContentPane().add(grass4);
        grass4.setBounds(490, 170, 120, 120);

        plantRange5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange5.setText("RANGE 5");
        getContentPane().add(plantRange5);
        plantRange5.setBounds(620, 210, 120, 20);

        grass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass5MouseClicked(evt);
            }
        });
        getContentPane().add(grass5);
        grass5.setBounds(620, 170, 120, 120);

        plantRange6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange6.setText("RANGE 6");
        getContentPane().add(plantRange6);
        plantRange6.setBounds(750, 220, 120, 20);

        grass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass6MouseClicked(evt);
            }
        });
        getContentPane().add(grass6);
        grass6.setBounds(750, 170, 120, 120);

        plantRange7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange7.setText("RANGE 7");
        getContentPane().add(plantRange7);
        plantRange7.setBounds(880, 230, 120, 20);

        grass7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass7MouseClicked(evt);
            }
        });
        getContentPane().add(grass7);
        grass7.setBounds(880, 170, 120, 120);

        plantRange8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange8.setText("RANGE 8");
        getContentPane().add(plantRange8);
        plantRange8.setBounds(1010, 240, 120, 20);

        grass8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass8MouseClicked(evt);
            }
        });
        getContentPane().add(grass8);
        grass8.setBounds(1010, 170, 120, 120);

        plantRange9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange9.setText("RANGE 9");
        getContentPane().add(plantRange9);
        plantRange9.setBounds(1140, 250, 120, 20);

        grass9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass9MouseClicked(evt);
            }
        });
        getContentPane().add(grass9);
        grass9.setBounds(1140, 170, 120, 120);

        peaStopper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peaStopper.setText("STOP");
        peaStopper.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(peaStopper);
        peaStopper.setBounds(1370, 300, 60, 380);

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
        jPanel49.setBounds(220, 170, 10, 120);

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
        jPanel50.setBounds(220, 300, 10, 120);

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
        jPanel51.setBounds(480, 300, 10, 120);

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
        jPanel52.setBounds(610, 300, 10, 120);

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
        jPanel54.setBounds(740, 300, 10, 120);

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
        jPanel55.setBounds(870, 300, 10, 120);

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
        jPanel56.setBounds(1000, 300, 10, 120);

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
        jPanel57.setBounds(100, 290, 1160, 10);

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
        jPanel58.setBounds(1000, 430, 10, 120);

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
        jPanel59.setBounds(1130, 430, 10, 120);

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
        jPanel60.setBounds(870, 430, 10, 120);

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
        jPanel61.setBounds(740, 430, 10, 120);

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
        jPanel62.setBounds(610, 430, 10, 120);

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
        jPanel63.setBounds(480, 430, 10, 120);

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
        jPanel64.setBounds(350, 430, 10, 120);

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
        jPanel65.setBounds(220, 430, 10, 120);

        plantRange10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange10.setText("RANGE 10");
        getContentPane().add(plantRange10);
        plantRange10.setBounds(100, 310, 120, 20);

        plantRange11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange11.setText("RANGE 11");
        getContentPane().add(plantRange11);
        plantRange11.setBounds(230, 320, 120, 20);

        plantRange12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange12.setText("RANGE 12");
        getContentPane().add(plantRange12);
        plantRange12.setBounds(360, 330, 120, 20);

        plantRange13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange13.setText("RANGE 13");
        getContentPane().add(plantRange13);
        plantRange13.setBounds(490, 340, 120, 20);

        plantRange14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange14.setText("RANGE 14");
        getContentPane().add(plantRange14);
        plantRange14.setBounds(620, 350, 120, 20);

        plantRange15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange15.setText("RANGE 15");
        getContentPane().add(plantRange15);
        plantRange15.setBounds(750, 360, 120, 20);

        plantRange16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange16.setText("RANGE 16");
        getContentPane().add(plantRange16);
        plantRange16.setBounds(880, 370, 120, 20);

        plantRange17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange17.setText("RANGE 17");
        getContentPane().add(plantRange17);
        plantRange17.setBounds(1010, 380, 120, 20);

        plantRange18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange18.setText("RANGE 18");
        getContentPane().add(plantRange18);
        plantRange18.setBounds(1140, 390, 120, 20);

        zombieRange2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange2.setText("ZOMBIE DANGER RANGE 2");
        getContentPane().add(zombieRange2);
        zombieRange2.setBounds(100, 400, 1220, 20);

        grass10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass10MouseClicked(evt);
            }
        });
        getContentPane().add(grass10);
        grass10.setBounds(100, 300, 120, 120);

        grass11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass11MouseClicked(evt);
            }
        });
        getContentPane().add(grass11);
        grass11.setBounds(230, 300, 120, 120);

        grass12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass12MouseClicked(evt);
            }
        });
        getContentPane().add(grass12);
        grass12.setBounds(360, 300, 120, 120);

        grass13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass13MouseClicked(evt);
            }
        });
        getContentPane().add(grass13);
        grass13.setBounds(490, 300, 120, 120);

        grass14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass14MouseClicked(evt);
            }
        });
        getContentPane().add(grass14);
        grass14.setBounds(620, 300, 120, 120);

        grass15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass15MouseClicked(evt);
            }
        });
        getContentPane().add(grass15);
        grass15.setBounds(750, 300, 120, 120);

        grass16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass16MouseClicked(evt);
            }
        });
        getContentPane().add(grass16);
        grass16.setBounds(880, 300, 120, 120);

        grass17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass17MouseClicked(evt);
            }
        });
        getContentPane().add(grass17);
        grass17.setBounds(1010, 300, 120, 120);

        grass18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass18MouseClicked(evt);
            }
        });
        getContentPane().add(grass18);
        grass18.setBounds(1140, 300, 120, 120);

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
        jPanel66.setBounds(1130, 300, 10, 120);

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
        jPanel67.setBounds(100, 680, 1160, 10);

        plantRange19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange19.setText("RANGE 19");
        getContentPane().add(plantRange19);
        plantRange19.setBounds(100, 440, 120, 20);

        plantRange20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange20.setText("RANGE 20");
        getContentPane().add(plantRange20);
        plantRange20.setBounds(230, 450, 120, 20);

        plantRange21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange21.setText("RANGE 21");
        getContentPane().add(plantRange21);
        plantRange21.setBounds(360, 460, 120, 20);

        plantRange22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange22.setText("RANGE 22");
        getContentPane().add(plantRange22);
        plantRange22.setBounds(490, 470, 120, 20);

        plantRange23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange23.setText("RANGE 23");
        getContentPane().add(plantRange23);
        plantRange23.setBounds(620, 480, 120, 20);

        plantRange24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange24.setText("RANGE 24");
        getContentPane().add(plantRange24);
        plantRange24.setBounds(750, 480, 120, 20);

        plantRange25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange25.setText("RANGE 25");
        getContentPane().add(plantRange25);
        plantRange25.setBounds(880, 490, 120, 20);

        plantRange26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange26.setText("RANGE 26");
        getContentPane().add(plantRange26);
        plantRange26.setBounds(1010, 500, 120, 20);

        plantRange27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange27.setText("RANGE 27");
        getContentPane().add(plantRange27);
        plantRange27.setBounds(1140, 510, 120, 20);

        zombieRange3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange3.setText("ZOMBIE DANGER RANGE 3");
        getContentPane().add(zombieRange3);
        zombieRange3.setBounds(100, 530, 1220, 20);

        grass19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass19MouseClicked(evt);
            }
        });
        getContentPane().add(grass19);
        grass19.setBounds(100, 430, 120, 120);

        grass20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass20MouseClicked(evt);
            }
        });
        getContentPane().add(grass20);
        grass20.setBounds(230, 430, 120, 120);

        grass21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass21MouseClicked(evt);
            }
        });
        getContentPane().add(grass21);
        grass21.setBounds(360, 430, 120, 120);

        grass22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass22MouseClicked(evt);
            }
        });
        getContentPane().add(grass22);
        grass22.setBounds(490, 430, 120, 120);

        grass23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass23MouseClicked(evt);
            }
        });
        getContentPane().add(grass23);
        grass23.setBounds(620, 430, 120, 120);

        grass24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass24MouseClicked(evt);
            }
        });
        getContentPane().add(grass24);
        grass24.setBounds(750, 430, 120, 120);

        grass25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass25MouseClicked(evt);
            }
        });
        getContentPane().add(grass25);
        grass25.setBounds(880, 430, 120, 120);

        grass26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass26MouseClicked(evt);
            }
        });
        getContentPane().add(grass26);
        grass26.setBounds(1010, 430, 120, 120);

        grass27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass27MouseClicked(evt);
            }
        });
        getContentPane().add(grass27);
        grass27.setBounds(1140, 430, 120, 120);

        waveZombie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie6);
        waveZombie6.setBounds(2000, 160, 80, 120);

        waveZombie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie7);
        waveZombie7.setBounds(2050, 160, 80, 120);

        waveZombie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie8);
        waveZombie8.setBounds(2100, 160, 80, 120);

        waveZombie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie9);
        waveZombie9.setBounds(2140, 160, 80, 120);

        waveZombie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie10);
        waveZombie10.setBounds(2240, 160, 80, 120);

        waveZombie11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/zombieT.gif"))); // NOI18N
        getContentPane().add(waveZombie11);
        waveZombie11.setBounds(2190, 160, 80, 120);

        jPanel68.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel68);
        jPanel68.setBounds(100, 420, 1160, 10);

        jPanel70.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel70);
        jPanel70.setBounds(100, 550, 1160, 10);

        jPanel71.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel71);
        jPanel71.setBounds(1000, 560, 10, 120);

        jPanel72.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel72);
        jPanel72.setBounds(1130, 560, 10, 120);

        jPanel73.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel73);
        jPanel73.setBounds(870, 560, 10, 120);

        jPanel74.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel74);
        jPanel74.setBounds(740, 560, 10, 120);

        jPanel75.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel75);
        jPanel75.setBounds(610, 560, 10, 120);

        jPanel76.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel76);
        jPanel76.setBounds(480, 560, 10, 120);

        jPanel77.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel77);
        jPanel77.setBounds(350, 560, 10, 120);

        jPanel78.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel78);
        jPanel78.setBounds(220, 560, 10, 120);

        plantRange28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange28.setText("RANGE 28");
        getContentPane().add(plantRange28);
        plantRange28.setBounds(100, 570, 120, 20);

        plantRange29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange29.setText("RANGE 29");
        getContentPane().add(plantRange29);
        plantRange29.setBounds(230, 580, 120, 20);

        plantRange30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange30.setText("RANGE 30");
        getContentPane().add(plantRange30);
        plantRange30.setBounds(360, 590, 120, 20);

        plantRange31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange31.setText("RANGE 31");
        getContentPane().add(plantRange31);
        plantRange31.setBounds(490, 600, 120, 20);

        plantRange32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange32.setText("RANGE 32");
        getContentPane().add(plantRange32);
        plantRange32.setBounds(620, 610, 120, 20);

        plantRange33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange33.setText("RANGE 33");
        getContentPane().add(plantRange33);
        plantRange33.setBounds(750, 610, 120, 20);

        plantRange34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange34.setText("RANGE 34");
        getContentPane().add(plantRange34);
        plantRange34.setBounds(880, 620, 120, 20);

        plantRange35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange35.setText("RANGE 35");
        getContentPane().add(plantRange35);
        plantRange35.setBounds(1010, 630, 120, 20);

        plantRange36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange36.setText("RANGE 36");
        getContentPane().add(plantRange36);
        plantRange36.setBounds(1140, 640, 120, 20);

        zombieRange4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange4.setText("ZOMBIE DANGER RANGE 4");
        getContentPane().add(zombieRange4);
        zombieRange4.setBounds(100, 660, 1220, 20);

        grass28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass28MouseClicked(evt);
            }
        });
        getContentPane().add(grass28);
        grass28.setBounds(100, 560, 120, 120);

        grass29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass29MouseClicked(evt);
            }
        });
        getContentPane().add(grass29);
        grass29.setBounds(230, 560, 120, 120);

        grass30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass30MouseClicked(evt);
            }
        });
        getContentPane().add(grass30);
        grass30.setBounds(360, 560, 120, 120);

        grass31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass31MouseClicked(evt);
            }
        });
        getContentPane().add(grass31);
        grass31.setBounds(490, 560, 120, 120);

        grass32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass32MouseClicked(evt);
            }
        });
        getContentPane().add(grass32);
        grass32.setBounds(620, 560, 120, 120);

        grass33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass33MouseClicked(evt);
            }
        });
        getContentPane().add(grass33);
        grass33.setBounds(750, 560, 120, 120);

        grass34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass34MouseClicked(evt);
            }
        });
        getContentPane().add(grass34);
        grass34.setBounds(880, 560, 120, 120);

        grass35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass35MouseClicked(evt);
            }
        });
        getContentPane().add(grass35);
        grass35.setBounds(1010, 560, 120, 120);

        grass36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass36MouseClicked(evt);
            }
        });
        getContentPane().add(grass36);
        grass36.setBounds(1140, 560, 120, 120);

        jPanel79.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel79);
        jPanel79.setBounds(1000, 690, 10, 120);

        jPanel80.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel80);
        jPanel80.setBounds(1130, 690, 10, 120);

        jPanel81.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel81);
        jPanel81.setBounds(870, 690, 10, 120);

        jPanel82.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel82);
        jPanel82.setBounds(740, 690, 10, 120);

        jPanel83.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel83);
        jPanel83.setBounds(610, 690, 10, 120);

        jPanel84.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel84);
        jPanel84.setBounds(480, 690, 10, 120);

        jPanel85.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel85);
        jPanel85.setBounds(350, 690, 10, 120);

        jPanel86.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel86);
        jPanel86.setBounds(220, 690, 10, 120);

        plantRange37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange37.setText("RANGE 37");
        getContentPane().add(plantRange37);
        plantRange37.setBounds(100, 700, 120, 20);

        plantRange38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange38.setText("RANGE 38");
        getContentPane().add(plantRange38);
        plantRange38.setBounds(230, 710, 120, 20);

        plantRange39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange39.setText("RANGE 39");
        getContentPane().add(plantRange39);
        plantRange39.setBounds(360, 720, 120, 20);

        plantRange40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange40.setText("RANGE 40");
        getContentPane().add(plantRange40);
        plantRange40.setBounds(490, 730, 120, 20);

        plantRange41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange41.setText("RANGE 41");
        getContentPane().add(plantRange41);
        plantRange41.setBounds(620, 740, 120, 20);

        plantRange42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange42.setText("RANGE 42");
        getContentPane().add(plantRange42);
        plantRange42.setBounds(750, 740, 120, 20);

        plantRange43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange43.setText("RANGE 43");
        getContentPane().add(plantRange43);
        plantRange43.setBounds(880, 750, 120, 20);

        plantRange44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange44.setText("RANGE 44");
        getContentPane().add(plantRange44);
        plantRange44.setBounds(1010, 760, 120, 20);

        plantRange45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plantRange45.setText("RANGE 45");
        getContentPane().add(plantRange45);
        plantRange45.setBounds(1140, 770, 120, 20);

        zombieRange5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zombieRange5.setText("ZOMBIE DANGER RANGE 5");
        getContentPane().add(zombieRange5);
        zombieRange5.setBounds(100, 790, 1220, 20);

        grass37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass37MouseClicked(evt);
            }
        });
        getContentPane().add(grass37);
        grass37.setBounds(100, 690, 120, 120);

        grass38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass38MouseClicked(evt);
            }
        });
        getContentPane().add(grass38);
        grass38.setBounds(230, 690, 120, 120);

        grass39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass39MouseClicked(evt);
            }
        });
        getContentPane().add(grass39);
        grass39.setBounds(360, 690, 120, 120);

        grass40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass40MouseClicked(evt);
            }
        });
        getContentPane().add(grass40);
        grass40.setBounds(490, 690, 120, 120);

        grass41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass41MouseClicked(evt);
            }
        });
        getContentPane().add(grass41);
        grass41.setBounds(620, 690, 120, 120);

        grass42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass42MouseClicked(evt);
            }
        });
        getContentPane().add(grass42);
        grass42.setBounds(750, 690, 120, 120);

        grass43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass43MouseClicked(evt);
            }
        });
        getContentPane().add(grass43);
        grass43.setBounds(880, 690, 120, 120);

        grass44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass44MouseClicked(evt);
            }
        });
        getContentPane().add(grass44);
        grass44.setBounds(1010, 690, 120, 120);

        grass45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/grass2.png"))); // NOI18N
        grass45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grass45MouseClicked(evt);
            }
        });
        getContentPane().add(grass45);
        grass45.setBounds(1140, 690, 120, 120);

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
        grassClicked(evt, 100, 170);
    }//GEN-LAST:event_grass1MouseClicked

    private void grass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass2MouseClicked
        grassClicked(evt, 230, 170);
    }//GEN-LAST:event_grass2MouseClicked

    private void grass3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass3MouseClicked
        grassClicked(evt, 360, 170);
    }//GEN-LAST:event_grass3MouseClicked

    private void grass4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass4MouseClicked
        grassClicked(evt, 490, 170);
    }//GEN-LAST:event_grass4MouseClicked

    private void grass5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass5MouseClicked
        grassClicked(evt, 620, 170);
    }//GEN-LAST:event_grass5MouseClicked

    private void grass6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass6MouseClicked
        grassClicked(evt, 750, 170);
    }//GEN-LAST:event_grass6MouseClicked

    private void grass7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass7MouseClicked
        grassClicked(evt, 880, 170);
    }//GEN-LAST:event_grass7MouseClicked

    private void grass8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass8MouseClicked
        grassClicked(evt, 1010, 170);
    }//GEN-LAST:event_grass8MouseClicked

    private void grass9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass9MouseClicked
        grassClicked(evt, 1140, 170);
    }//GEN-LAST:event_grass9MouseClicked

    private void sunFlowerPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunFlowerPackMouseClicked
        originalSunFlowerPackMouseClicking(evt);
    }//GEN-LAST:event_sunFlowerPackMouseClicked

    private void grass10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass10MouseClicked
        grassClicked(evt, 100, 300);
    }//GEN-LAST:event_grass10MouseClicked

    private void grass11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass11MouseClicked
        grassClicked(evt, 230, 300);
    }//GEN-LAST:event_grass11MouseClicked

    private void grass12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass12MouseClicked
        grassClicked(evt, 360, 300);
    }//GEN-LAST:event_grass12MouseClicked

    private void grass13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass13MouseClicked
        grassClicked(evt, 490, 300);
    }//GEN-LAST:event_grass13MouseClicked

    private void grass14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass14MouseClicked
        grassClicked(evt, 620, 300);
    }//GEN-LAST:event_grass14MouseClicked

    private void grass15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass15MouseClicked
        grassClicked(evt, 750, 300);
    }//GEN-LAST:event_grass15MouseClicked

    private void grass16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass16MouseClicked
        grassClicked(evt, 880, 300);
    }//GEN-LAST:event_grass16MouseClicked

    private void grass17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass17MouseClicked
        grassClicked(evt, 1010, 300);
    }//GEN-LAST:event_grass17MouseClicked

    private void grass18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass18MouseClicked
        grassClicked(evt, 1140, 300);
    }//GEN-LAST:event_grass18MouseClicked

    private void grass19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass19MouseClicked
        grassClicked(evt, 100, 430);
    }//GEN-LAST:event_grass19MouseClicked

    private void grass20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass20MouseClicked
        grassClicked(evt, 230, 430);
    }//GEN-LAST:event_grass20MouseClicked

    private void grass21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass21MouseClicked
        grassClicked(evt, 360, 430);
    }//GEN-LAST:event_grass21MouseClicked

    private void grass22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass22MouseClicked
        grassClicked(evt, 490, 430);
    }//GEN-LAST:event_grass22MouseClicked

    private void grass23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass23MouseClicked
        grassClicked(evt, 620, 430);
    }//GEN-LAST:event_grass23MouseClicked

    private void grass24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass24MouseClicked
        grassClicked(evt, 750, 430);
    }//GEN-LAST:event_grass24MouseClicked

    private void grass25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass25MouseClicked
        grassClicked(evt, 880, 430);
    }//GEN-LAST:event_grass25MouseClicked

    private void grass26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass26MouseClicked
        grassClicked(evt, 1010, 430);
    }//GEN-LAST:event_grass26MouseClicked

    private void grass27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass27MouseClicked
        grassClicked(evt, 1140, 430);
    }//GEN-LAST:event_grass27MouseClicked

    private void cherryBombPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cherryBombPackMouseClicked
        originalCherryBombPackMouseClicking(evt);
    }//GEN-LAST:event_cherryBombPackMouseClicked

    private void wallnutPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallnutPackMouseClicked
        originalWallnutPackMouseClicking(evt);
    }//GEN-LAST:event_wallnutPackMouseClicked

    private void grass28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass28MouseClicked
        grassClicked(evt, 100, 560);
    }//GEN-LAST:event_grass28MouseClicked

    private void grass29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass29MouseClicked
        grassClicked(evt, 230, 560);
    }//GEN-LAST:event_grass29MouseClicked

    private void grass30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass30MouseClicked
        grassClicked(evt, 360, 560);
    }//GEN-LAST:event_grass30MouseClicked

    private void grass31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass31MouseClicked
        grassClicked(evt, 490, 600);
    }//GEN-LAST:event_grass31MouseClicked

    private void grass32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass32MouseClicked
        grassClicked(evt, 620, 560);
    }//GEN-LAST:event_grass32MouseClicked

    private void grass33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass33MouseClicked
        grassClicked(evt, 750, 560);
    }//GEN-LAST:event_grass33MouseClicked

    private void grass34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass34MouseClicked
        grassClicked(evt, 880, 560);
    }//GEN-LAST:event_grass34MouseClicked

    private void grass35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass35MouseClicked
        grassClicked(evt, 1010, 560);
    }//GEN-LAST:event_grass35MouseClicked

    private void grass36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass36MouseClicked
        grassClicked(evt, 1140, 560);
    }//GEN-LAST:event_grass36MouseClicked

    private void grass37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass37MouseClicked
        grassClicked(evt, 100, 690);
    }//GEN-LAST:event_grass37MouseClicked

    private void grass38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass38MouseClicked
        grassClicked(evt, 230, 690);
    }//GEN-LAST:event_grass38MouseClicked

    private void grass39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass39MouseClicked
        grassClicked(evt, 360, 690);
    }//GEN-LAST:event_grass39MouseClicked

    private void grass40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass40MouseClicked
        grassClicked(evt, 490, 690);
    }//GEN-LAST:event_grass40MouseClicked

    private void grass41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass41MouseClicked
        grassClicked(evt, 620, 690);
    }//GEN-LAST:event_grass41MouseClicked

    private void grass42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass42MouseClicked
        grassClicked(evt, 750, 690);
    }//GEN-LAST:event_grass42MouseClicked

    private void grass43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass43MouseClicked
        grassClicked(evt, 880, 690);
    }//GEN-LAST:event_grass43MouseClicked

    private void grass44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass44MouseClicked
        grassClicked(evt, 1010, 690);
    }//GEN-LAST:event_grass44MouseClicked

    private void grass45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grass45MouseClicked
        grassClicked(evt, 1140, 690);
    }//GEN-LAST:event_grass45MouseClicked

    private void potatoMinePackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potatoMinePackMouseClicked
        originalPotatoMinePackMouseClicking(evt);
    }//GEN-LAST:event_potatoMinePackMouseClicked
    
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
    private javax.swing.JLabel grass28;
    private javax.swing.JLabel grass29;
    private javax.swing.JLabel grass3;
    private javax.swing.JLabel grass30;
    private javax.swing.JLabel grass31;
    private javax.swing.JLabel grass32;
    private javax.swing.JLabel grass33;
    private javax.swing.JLabel grass34;
    private javax.swing.JLabel grass35;
    private javax.swing.JLabel grass36;
    private javax.swing.JLabel grass37;
    private javax.swing.JLabel grass38;
    private javax.swing.JLabel grass39;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass40;
    private javax.swing.JLabel grass41;
    private javax.swing.JLabel grass42;
    private javax.swing.JLabel grass43;
    private javax.swing.JLabel grass44;
    private javax.swing.JLabel grass45;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass9;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
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
    private javax.swing.JLabel pea28;
    private javax.swing.JLabel pea29;
    private javax.swing.JLabel pea3;
    private javax.swing.JLabel pea30;
    private javax.swing.JLabel pea31;
    private javax.swing.JLabel pea32;
    private javax.swing.JLabel pea33;
    private javax.swing.JLabel pea34;
    private javax.swing.JLabel pea35;
    private javax.swing.JLabel pea36;
    private javax.swing.JLabel pea37;
    private javax.swing.JLabel pea38;
    private javax.swing.JLabel pea39;
    private javax.swing.JLabel pea4;
    private javax.swing.JLabel pea40;
    private javax.swing.JLabel pea41;
    private javax.swing.JLabel pea42;
    private javax.swing.JLabel pea43;
    private javax.swing.JLabel pea44;
    private javax.swing.JLabel pea45;
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
    private javax.swing.JLabel plantRange28;
    private javax.swing.JLabel plantRange29;
    private javax.swing.JLabel plantRange3;
    private javax.swing.JLabel plantRange30;
    private javax.swing.JLabel plantRange31;
    private javax.swing.JLabel plantRange32;
    private javax.swing.JLabel plantRange33;
    private javax.swing.JLabel plantRange34;
    private javax.swing.JLabel plantRange35;
    private javax.swing.JLabel plantRange36;
    private javax.swing.JLabel plantRange37;
    private javax.swing.JLabel plantRange38;
    private javax.swing.JLabel plantRange39;
    private javax.swing.JLabel plantRange4;
    private javax.swing.JLabel plantRange40;
    private javax.swing.JLabel plantRange41;
    private javax.swing.JLabel plantRange42;
    private javax.swing.JLabel plantRange43;
    private javax.swing.JLabel plantRange44;
    private javax.swing.JLabel plantRange45;
    private javax.swing.JLabel plantRange5;
    private javax.swing.JLabel plantRange6;
    private javax.swing.JLabel plantRange7;
    private javax.swing.JLabel plantRange8;
    private javax.swing.JLabel plantRange9;
    private javax.swing.JProgressBar potatoMineBar;
    private javax.swing.JLabel potatoMinePack;
    private javax.swing.JLabel rock;
    private javax.swing.JLabel shovel;
    private javax.swing.JLabel sunAmount;
    private javax.swing.JProgressBar sunBar;
    private javax.swing.JProgressBar sunFlowerBar;
    private javax.swing.JLabel sunFlowerPack;
    private javax.swing.JPanel sunMenu;
    private javax.swing.JProgressBar wallnutBar;
    private javax.swing.JLabel wallnutPack;
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
    private javax.swing.JLabel zombieRange4;
    private javax.swing.JLabel zombieRange5;
    // End of variables declaration//GEN-END:variables

    // </editor-fold>  
    
    
    // CREATED METHODS AND PROPERTIES BELOW...............................
    
    private final String NEW_PEA_IMAGE         = "/media/peaShooterNEW.gif";
    private final String NEW_SUNFLOWER_IMAGE   = "/media/sunFlower.gif";
    private final String NEW_CHERRYBOMB_IMAGE  = "/media/cherryBomb4.gif";
    private final String NEW_WALLNUT_IMAGE     = "/media/wallnut.gif";
    private final String NEW_POTATO_MINE_IMAGE = "/media/PMunarmed.png";
    private final String NEW_POTATO_MINE_IMAGE_2 = "/media/potatoMine2.gif";
    private final String NEW_SPADE_IMAGE       = "/media/shovelN.png";
    
    private final int SUN_DELAY                      = 100;
    private final int SUN_STARTING_VALUE             = 50; 
    private final int SUN_PROGRESS_MAX_PEA           = 100;
    private final int SUN_PROGRESS_MAX_SUNFLOWER     = 50;
    private final int SUN_PROGRESS_MAX_CHERRYBOMB    = 150;
    private final int SUN_PROGRESS_MAX_WALLNUT       = 50;
    private final int SUN_PROGRESS_MAX_POTATO_MINE   = 25;
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
    private final int CB_RECHARGE_DELAY              = 400;
    private final int WN_RECHARGE_DELAY              = 250;
    private final int PM_RECHARGE_DELAY              = 200;
    private final int PEA_RECHARGE_MAX               = 100;
    private final int SUNFLOWER_RECHARGE_MAX         = 100;
    private final int CHERRYBOMB_RECHARGE_MAX        = 100;
    private final int WALLNUT_RECHARGE_MAX           = 100;
    private final int PEA_PACK_X                     = 40;
    private final int PEA_PACK_Y                     = 0;
    private final int SUNFLOWER_PACK_X               = 120;
    private final int SUNFLOWER_PACK_Y               = 0;
    private final int CHERRYBOMB_PACK_X              = 200;
    private final int CHERRYBOMB_PACK_Y              = 0;
    private final int WALLNUT_PACK_X                 = 280;
    private final int WALLNUT_PACK_Y                 = 0;
    private final int POTATO_MINE_PACK_X             = 360;
    private final int POTATO_MINE_PACK_Y             = 0;
    private final int SHOVEL_X                       = 10;
    private final int SHOVEL_Y                       = 10;
    private final int PEA_NEW_X                      = 10;
    private final int PEA_NEW_Y                      = 0;
    private final int SUNFLOWER_NEW_X                = 10;
    private final int SUNFLOWER_NEW_Y                = 0;
    private final int CHERRYBOMB_NEW_X               = 10;
    private final int CHERRYBOMB_NEW_Y               = 0;
    private final int WALLNUT_NEW_X                  = 10;
    private final int WALLNUT_NEW_Y                  = 0;
    private final int POTATO_MINE_NEW_X              = 10;
    private final int POTATO_MINE_NEW_Y              = 0;
    private final int PEA_NEW_WIDTH                  = 110;
    private final int PEA_NEW_HEIGHT                 = 120;
    private final int SUNFLOWER_NEW_WIDTH            = 110;
    private final int SUNFLOWER_NEW_HEIGHT           = 120;
    private final int CHERRYBOMB_NEW_WIDTH           = 125;
    private final int CHERRYBOMB_NEW_HEIGHT          = 105;
    private final int WALLNUT_NEW_WIDTH              = 110;
    private final int WALLNUT_NEW_HEIGHT             = 120;
    private final int POTATO_MINE_NEW_WIDTH          = 110;
    private final int POTATO_MINE_NEW_HEIGHT         = 120;
    private final int PEA_PLANT_HEALTH               = 6;  
    private final int SUNFLOWER_PLANT_HEALTH         = 6;
    private final int SPADE_NEW_X                    = 750;
    private final int SPADE_NEW_Y                    = 10;
    private final int SPADE_NEW_WIDTH                = 110;
    private final int SPADE_NEW_HEIGHT               = 110;    
    private final int PROJECTILE_MOVE_DELAY          = 65;   
    private final int RANGE_RETURN_DELAY             = 1500;
    private final int CHERRYBOMB_EXPLOSION_DELAY     = 2000;
    private final int POTATOMINE_ARMING_DELAY        = 14000;
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
    private boolean wallnutRecharged;
    private boolean potatoMineRecharged;
    private boolean spadeHasClicked;
    private boolean peaHasClicked;
    private boolean sunFlowerHasClicked;
    private boolean cherryBombHasClicked;
    private boolean wallnutHasClicked;
    private boolean potatoMineHasClicked;
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
    private boolean range28Trigger;
    private boolean range29Trigger;
    private boolean range30Trigger;
    private boolean range31Trigger;
    private boolean range32Trigger;
    private boolean range33Trigger;
    private boolean range34Trigger;
    private boolean range35Trigger;
    private boolean range36Trigger;
    private boolean range37Trigger;
    private boolean range38Trigger;
    private boolean range39Trigger;
    private boolean range40Trigger;
    private boolean range41Trigger;
    private boolean range42Trigger;
    private boolean range43Trigger;
    private boolean range44Trigger;
    private boolean range45Trigger;
    
    private int sunProgress;
    private int waveProgress;
    private int zombieProgress;
    private int rechargePeaBar;    
    private int rechargeSunFlowerBar; 
    private int rechargeCherryBombBar;
    private int rechargeWallnutBar;
    private int rechargePotatoMineBar;
    private int sun;
    private int peaShooterHealth;
    private int amount;
    private int direction;
    private int x;
    private int y;
    private int tempExplosionX;
    private int tempExplosionY;
    private int tempExplosionX2;
    private int tempExplosionY2;
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
    private Timer wallnutRechargeTimer;
    private Timer potatoMineRechargeTimer;
    private Timer zombieMoveTimer;
    private Timer projectileMoveTimer;
    private Timer rangeReturnTimer;
    private Timer cherryBombExplosionTimer;
    private Timer potatoMineArmingTimer;
    private Timer ExplosionReturnTimer;
    
    private JLabel newPeaShooter;
    private JLabel newSunFlower;
    private JLabel newCherryBomb;
    private JLabel newWallnut;
    private JLabel newPotatoMine;
    private JLabel newPotatoMineArmed;
        
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
    private Rectangle r28;
    private Rectangle r29;
    private Rectangle r30;
    private Rectangle r31;
    private Rectangle r32;
    private Rectangle r33;
    private Rectangle r34;
    private Rectangle r35;
    private Rectangle r36;
    private Rectangle r37;
    private Rectangle r38;
    private Rectangle r39;
    private Rectangle r40;
    private Rectangle r41;
    private Rectangle r42;
    private Rectangle r43;
    private Rectangle r44;
    private Rectangle r45;
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
    private Rectangle p28;
    private Rectangle p29;
    private Rectangle p30;
    private Rectangle p31;
    private Rectangle p32;
    private Rectangle p33;
    private Rectangle p34;
    private Rectangle p35;
    private Rectangle p36;
    private Rectangle p37;
    private Rectangle p38;
    private Rectangle p39;
    private Rectangle p40;
    private Rectangle p41;
    private Rectangle p42;
    private Rectangle p43;
    private Rectangle p44;
    private Rectangle p45;
    private Rectangle cbExplosion;
    private Rectangle pmExplosion;
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
        wallnutRecharged     = true;
        potatoMineRecharged  = true;
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
        rechargePeaBar       = PEA_RECHARGE_MAX;    
        rechargeSunFlowerBar = SUNFLOWER_RECHARGE_MAX;
        rechargeCherryBombBar = CHERRYBOMB_RECHARGE_MAX;
        rechargeWallnutBar   = WALLNUT_RECHARGE_MAX;
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
        r28               = new Rectangle();
        r29               = new Rectangle();
        r30               = new Rectangle();
        r31               = new Rectangle();
        r32               = new Rectangle();
        r33               = new Rectangle();
        r34               = new Rectangle();
        r35               = new Rectangle();
        r36               = new Rectangle();
        r37               = new Rectangle();
        r38               = new Rectangle();
        r39               = new Rectangle();
        r40               = new Rectangle();
        r41               = new Rectangle();
        r42               = new Rectangle();
        r43               = new Rectangle();
        r44               = new Rectangle();
        r45               = new Rectangle();
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
        p28               = new Rectangle();
        p29               = new Rectangle();
        p30               = new Rectangle();
        p31               = new Rectangle();
        p32               = new Rectangle();
        p33               = new Rectangle();
        p34               = new Rectangle();
        p35               = new Rectangle();
        p36               = new Rectangle();
        p37               = new Rectangle();
        p38               = new Rectangle();
        p39               = new Rectangle();
        p40               = new Rectangle();
        p41               = new Rectangle();
        p42               = new Rectangle();
        p43               = new Rectangle();
        p44               = new Rectangle();
        p45               = new Rectangle();
        cbExplosion       = new Rectangle();
        pmExplosion       = new Rectangle();
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
        wallnutRechargeTimer = new Timer(WN_RECHARGE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wallnutRecharge();
            }
        });
        potatoMineRechargeTimer = new Timer(WN_RECHARGE_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                potatoMineRecharge();
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
        potatoMineArmingTimer = new Timer(POTATOMINE_ARMING_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                potatoMineExplosion();
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
    
    private void potatoMineExplosion(){
                                      
        System.out.println("MINE ARMED");
        potatoMineArmingTimer.stop();       
        Rectangle armedPM = getRectangle(newPotatoMineArmed);
        Icon icon = new ImageIcon(getClass().getResource(NEW_POTATO_MINE_IMAGE_2));
        newPotatoMineArmed.setIcon(icon);
        getContentPane().add(newPotatoMineArmed);
        newPotatoMineArmed.setBounds(x, y, POTATO_MINE_NEW_WIDTH, POTATO_MINE_NEW_HEIGHT);
        getContentPane().setComponentZOrder(newPotatoMineArmed, 0);
        newPotatoMineArmed.setLocation(tempExplosionX2, tempExplosionY2);
        newPotatoMine.setLocation(-10000, -10000);
               
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
            final double HIGH = 4.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                zombies.get(current).setLocation(1310, 170);
                zombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                zombies.get(current).setLocation(1310, 300);
                zombieMoveTimer.start();
            }
            if (number <= 3 && number > 2){
                zombies.get(current).setLocation(1310, 430);
                zombieMoveTimer.start();
            }
            if (number <= 4 && number > 3){
                zombies.get(current).setLocation(1310, 560);
                zombieMoveTimer.start();
            }
            if (number <= 5 && number > 4){
                zombies.get(current).setLocation(1310, 690);
                zombieMoveTimer.start();
            }
//            zombies.get(current).setLocation(ZOMBIE_SPAWN_X, ZOMBIE_SPAWN_Y);            
            current++;
                       
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
            double seed = Math.random();
            final double LOW  = 0.0;
            final double HIGH = 4.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                waveZombies.get(waveCurrent).setLocation(1310, 170);
                waveZombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                waveZombies.get(waveCurrent).setLocation(1310, 300);
                waveZombieMoveTimer.start();
            }
            if (number <= 3 && number > 2){
                waveZombies.get(waveCurrent).setLocation(1310, 430);
                waveZombieMoveTimer.start();
            }
            if (number <= 4 && number > 3){
                waveZombies.get(waveCurrent).setLocation(1310, 560);
                waveZombieMoveTimer.start();
            }
            if (number <= 5 && number > 4){
                waveZombies.get(waveCurrent).setLocation(1310, 690);
                waveZombieMoveTimer.start();
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
            final double HIGH = 4.0;
            double number = (HIGH - LOW + 1) * seed + LOW;
            System.out.println(number);
            if (number <= 1){
                waveZombies2.get(waveCurrent2).setLocation(1310, 170);
                waveZombieMoveTimer.start();
            }
            if (number <= 2 && number > 1){
                waveZombies2.get(waveCurrent2).setLocation(1310, 300);
                waveZombie2MoveTimer.start();
            }
            if (number <= 3 && number > 2){
                waveZombies2.get(waveCurrent2).setLocation(1310, 430);
                waveZombie2MoveTimer.start();
            }
            if (number <= 4 && number > 3){
                waveZombies2.get(waveCurrent2).setLocation(1310, 560);
                waveZombie2MoveTimer.start();
            }
            if (number <= 5 && number > 4){
                waveZombies2.get(waveCurrent2).setLocation(1310, 690);
                waveZombie2MoveTimer.start();
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
        if (newPotatoMineArmed == null){
            newPotatoMineArmed = new JLabel();
        }
        
        Rectangle entrance = getRectangle(concrete);
        Rectangle explosionHB = getRectangle(explosion);
        Rectangle stop = getRectangle(barrier);
        Rectangle armedPM = getRectangle(newPotatoMineArmed);
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
        Rectangle r28 = getRectangle(plantRange28);
        Rectangle r29 = getRectangle(plantRange29);
        Rectangle r30 = getRectangle(plantRange30);
        Rectangle r31 = getRectangle(plantRange31);
        Rectangle r32 = getRectangle(plantRange32);
        Rectangle r33 = getRectangle(plantRange33);
        Rectangle r34 = getRectangle(plantRange34);
        Rectangle r35 = getRectangle(plantRange35);
        Rectangle r36 = getRectangle(plantRange36);
        Rectangle r37 = getRectangle(plantRange37);
        Rectangle r38 = getRectangle(plantRange38);
        Rectangle r39 = getRectangle(plantRange39);
        Rectangle r40 = getRectangle(plantRange40);
        Rectangle r41 = getRectangle(plantRange41);
        Rectangle r42 = getRectangle(plantRange42);
        Rectangle r43 = getRectangle(plantRange43);
        Rectangle r44 = getRectangle(plantRange44);
        Rectangle r45 = getRectangle(plantRange45);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        Rectangle zr4 = getRectangle(zombieRange4);
        Rectangle zr5 = getRectangle(zombieRange5);
        
        for (int zombie = 0; zombie < zombies.size(); zombie++) {    
            JLabel label = zombies.get(zombie);
            zombieHB    = getRectangle(label);           
            entrance    = getRectangle(concrete);
            explosionHB = getRectangle(explosion);
            armedPM     = getRectangle(newPotatoMineArmed);
            stop = getRectangle(barrier);
            zombieHB.x -= 1;
            
            if (zombieHB.intersects(entrance)) {
                zombieSpawnTimer.stop();
                zombieMoveTimer.stop();
                String text = "Level5";
        
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
                zombieHB.setLocation(0, 100000);
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
            
            if (zombieHB.intersects(armedPM)){
                    
                    Globals.player.zombieHealth = Globals.player.zombieHealth -
                            Globals.player.cbExplosionDamage;
                    
                    if (Globals.player.zombieHealth <= 0){
                    zombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.zombieHealth = 8;
                    label.setBounds(zombieHB.x, zombieHB.y,
                    zombieHB.width, zombieHB.height);
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);
                    newPotatoMineArmed.setLocation(-10000, -10000);
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
                
                
                if (zombieHB.intersects(peaShooterHB)) {
                    zombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.psPlantHealth = Globals.player.psPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("ps plant health is " + 
                                       Globals.player.psPlantHealth);
                }   
                
                if (zombieHB.intersects(sunFlowerHB)) {
                    zombieHB.x += ZOMBIE_X_AMOUNT;
                    Globals.player.sfPlantHealth = Globals.player.sfPlantHealth - 
                                                   Globals.player.zombieDamage;
                    System.out.println("zombie hits plant!");
                    System.out.println("sf plant health is " + 
                                       Globals.player.sfPlantHealth);
                }               
                // checking other stuff
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r1)) {
                    System.out.println("zombie touches range 1");
                    range1Trigger = true;
                    plantRange1.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea1.setLocation(140, 180);
                    p1 = getRectangle(pea1);
                }
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 180);
                    p2 = getRectangle(pea2);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 180);
                    p3 = getRectangle(pea3);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 180);
                    p4 = getRectangle(pea4);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 180);
                    p5 = getRectangle(pea5);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 180);
                    p6 = getRectangle(pea6);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 180);
                    p7 = getRectangle(pea7);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 180);
                    p8 = getRectangle(pea8);
                } 
                
                if (zombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 180);
                    p9 = getRectangle(pea9);
                } 
                    
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 310);
                    p10 = getRectangle(pea10);
                }
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 310);
                    p11 = getRectangle(pea11);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 310);
                    p12 = getRectangle(pea12);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 310);
                    p13 = getRectangle(pea13);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 310);
                    p14 = getRectangle(pea14);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 310);
                    p15 = getRectangle(pea15);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 310);
                    p16 = getRectangle(pea16);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 310);
                    p17 = getRectangle(pea17);
                } 
                
                if (zombieHB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 310);
                    p18 = getRectangle(pea18);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 440);
                    p19 = getRectangle(pea19);
                }
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 440);
                    p20 = getRectangle(pea20);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 440);
                    p21 = getRectangle(pea21);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 440);
                    p22 = getRectangle(pea22);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 440);
                    p23 = getRectangle(pea23);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 440);
                    p24 = getRectangle(pea24);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 440);
                    p25 = getRectangle(pea25);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 440);
                    p26 = getRectangle(pea26);
                } 
                
                if (zombieHB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 440);
                    p27 = getRectangle(pea27);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r28)) {
                    System.out.println("zombie touches range 1");
                    range28Trigger = true;
                    plantRange28.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea28.setLocation(140, 570);
                    p28 = getRectangle(pea28);
                }
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r29)) {
                    System.out.println("zombie touches range 2");
                    range29Trigger = true;
                    plantRange29.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea29.setLocation(270, 570);
                    p29 = getRectangle(pea29);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r30)) {
                    System.out.println("zombie touches range 3");
                    range30Trigger = true;
                    plantRange30.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea30.setLocation(400, 570);
                    p30 = getRectangle(pea30);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r31)) {
                    System.out.println("zombie touches range 4");
                    range31Trigger = true;
                    plantRange31.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea31.setLocation(530, 570);
                    p31 = getRectangle(pea31);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r32)) {
                    System.out.println("zombie touches range 5");
                    range32Trigger = true;
                    plantRange32.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea32.setLocation(660, 570);
                    p32 = getRectangle(pea32);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r33)) {
                    System.out.println("zombie touches range 6");
                    range33Trigger = true;
                    plantRange33.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea33.setLocation(790, 570);
                    p33 = getRectangle(pea33);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r34)) {
                    System.out.println("zombie touches range 7");
                    range34Trigger = true;
                    plantRange34.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea34.setLocation(920, 570);
                    p34 = getRectangle(pea34);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r35)) {
                    System.out.println("zombie touches range 8");
                    range35Trigger = true;
                    plantRange35.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea35.setLocation(1050, 570);
                    p35 = getRectangle(pea35);
                } 
                
                if (zombieHB.intersects(zr4) && peaShooterHB.intersects(r36)) {
                    System.out.println("zombie touches range 9");
                    range36Trigger = true;
                    plantRange36.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea36.setLocation(1180, 570);
                    p36 = getRectangle(pea36);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r37)) {
                    System.out.println("zombie touches range 1");
                    range37Trigger = true;
                    plantRange37.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea37.setLocation(140, 700);
                    p37 = getRectangle(pea37);
                }
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r38)) {
                    System.out.println("zombie touches range 2");
                    range38Trigger = true;
                    plantRange38.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea38.setLocation(270, 700);
                    p38 = getRectangle(pea38);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r39)) {
                    System.out.println("zombie touches range 3");
                    range39Trigger = true;
                    plantRange39.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea39.setLocation(400, 700);
                    p39 = getRectangle(pea39);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r40)) {
                    System.out.println("zombie touches range 4");
                    range40Trigger = true;
                    plantRange40.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea40.setLocation(530, 700);
                    p40 = getRectangle(pea40);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r41)) {
                    System.out.println("zombie touches range 5");
                    range41Trigger = true;
                    plantRange41.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea41.setLocation(660, 700);
                    p41 = getRectangle(pea41);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r42)) {
                    System.out.println("zombie touches range 6");
                    range42Trigger = true;
                    plantRange42.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea42.setLocation(790, 700);
                    p42 = getRectangle(pea42);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r43)) {
                    System.out.println("zombie touches range 7");
                    range43Trigger = true;
                    plantRange43.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea43.setLocation(920, 700);
                    p43 = getRectangle(pea43);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r44)) {
                    System.out.println("zombie touches range 8");
                    range44Trigger = true;
                    plantRange44.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea44.setLocation(1050, 700);
                    p44 = getRectangle(pea44);
                } 
                
                if (zombieHB.intersects(zr5) && peaShooterHB.intersects(r45)) {
                    System.out.println("zombie touches range 9");
                    range45Trigger = true;
                    plantRange45.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea45.setLocation(1180, 700);
                    p45 = getRectangle(pea45);
                }
                
                if (Globals.player.psPlantHealth <= 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    label.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
                if (Globals.player.sfPlantHealth <= 0) {
                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.sfPlantHealth = 6;
                    label.setBounds(sunFlowerHB.x, sunFlowerHB.y,
                    sunFlowerHB.width, sunFlowerHB.height);
                }  
            
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
        Rectangle explosionHB = getRectangle(concrete);
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
        Rectangle r28 = getRectangle(plantRange28);
        Rectangle r29 = getRectangle(plantRange29);
        Rectangle r30 = getRectangle(plantRange30);
        Rectangle r31 = getRectangle(plantRange31);
        Rectangle r32 = getRectangle(plantRange32);
        Rectangle r33 = getRectangle(plantRange33);
        Rectangle r34 = getRectangle(plantRange34);
        Rectangle r35 = getRectangle(plantRange35);
        Rectangle r36 = getRectangle(plantRange36);
        Rectangle r37 = getRectangle(plantRange37);
        Rectangle r38 = getRectangle(plantRange38);
        Rectangle r39 = getRectangle(plantRange39);
        Rectangle r40 = getRectangle(plantRange40);
        Rectangle r41 = getRectangle(plantRange41);
        Rectangle r42 = getRectangle(plantRange42);
        Rectangle r43 = getRectangle(plantRange43);
        Rectangle r44 = getRectangle(plantRange44);
        Rectangle r45 = getRectangle(plantRange45);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        Rectangle zr4 = getRectangle(zombieRange4);
        Rectangle zr5 = getRectangle(zombieRange5);
        
        for (int zombieWave = 0; zombieWave < waveZombies.size(); zombieWave++) {    
            JLabel label = waveZombies.get(zombieWave);
            waveZombieHB = getRectangle(label);           
            entrance = getRectangle(concrete);
            explosionHB = getRectangle(explosion);
            stop = getRectangle(barrier);
            waveZombieHB.x -= 1;
            
            if (waveZombieHB.intersects(entrance)) {
                zombieSpawnTimer.stop();
                zombieMoveTimer.stop();
                String text = "Level5";
        
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
                waveZombieHB.setLocation(5000, 0);
            }
            
            if (waveZombieHB.intersects(explosionHB)){
                    
                    Globals.player.zombieHealth = Globals.player.zombieHealth -
                            Globals.player.cbExplosionDamage;
                    
                    if (Globals.player.zombieHealth <= 0){
                    waveZombieHB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
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
//                newSunFlower.setBounds(sunFlowerHB.x, 
//                                        sunFlowerHB.y,
//                                        sunFlowerHB.width, 
//                                        sunFlowerHB.height);
//                sunFlowerHB = getRectangle(newSunFlower);
                
                
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
                    pea1.setLocation(140, 180);
                    p1 = getRectangle(pea1);
                }
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 180);
                    p2 = getRectangle(pea2);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 180);
                    p3 = getRectangle(pea3);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 180);
                    p4 = getRectangle(pea4);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 180);
                    p5 = getRectangle(pea5);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 180);
                    p6 = getRectangle(pea6);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 180);
                    p7 = getRectangle(pea7);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 180);
                    p8 = getRectangle(pea8);
                } 
                
                if (waveZombieHB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 180);
                    p9 = getRectangle(pea9);
                } 
                    
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 310);
                    p10 = getRectangle(pea10);
                }
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 310);
                    p11 = getRectangle(pea11);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 310);
                    p12 = getRectangle(pea12);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 310);
                    p13 = getRectangle(pea13);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 310);
                    p14 = getRectangle(pea14);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 310);
                    p15 = getRectangle(pea15);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 310);
                    p16 = getRectangle(pea16);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 310);
                    p17 = getRectangle(pea17);
                } 
                
                if (waveZombieHB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 310);
                    p18 = getRectangle(pea18);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 440);
                    p19 = getRectangle(pea19);
                }
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 440);
                    p20 = getRectangle(pea20);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 440);
                    p21 = getRectangle(pea21);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 440);
                    p22 = getRectangle(pea22);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 440);
                    p23 = getRectangle(pea23);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 440);
                    p24 = getRectangle(pea24);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 440);
                    p25 = getRectangle(pea25);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 440);
                    p26 = getRectangle(pea26);
                } 
                
                if (waveZombieHB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 440);
                    p27 = getRectangle(pea27);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r28)) {
                    System.out.println("zombie touches range 1");
                    range28Trigger = true;
                    plantRange28.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea28.setLocation(140, 570);
                    p28 = getRectangle(pea28);
                }
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r29)) {
                    System.out.println("zombie touches range 2");
                    range29Trigger = true;
                    plantRange29.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea29.setLocation(270, 570);
                    p29 = getRectangle(pea29);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r30)) {
                    System.out.println("zombie touches range 3");
                    range30Trigger = true;
                    plantRange30.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea30.setLocation(400, 570);
                    p30 = getRectangle(pea30);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r31)) {
                    System.out.println("zombie touches range 4");
                    range31Trigger = true;
                    plantRange31.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea31.setLocation(530, 570);
                    p31 = getRectangle(pea31);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r32)) {
                    System.out.println("zombie touches range 5");
                    range32Trigger = true;
                    plantRange32.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea32.setLocation(660, 570);
                    p32 = getRectangle(pea32);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r33)) {
                    System.out.println("zombie touches range 6");
                    range33Trigger = true;
                    plantRange33.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea33.setLocation(790, 570);
                    p33 = getRectangle(pea33);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r34)) {
                    System.out.println("zombie touches range 7");
                    range34Trigger = true;
                    plantRange34.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea34.setLocation(920, 570);
                    p34 = getRectangle(pea34);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r35)) {
                    System.out.println("zombie touches range 8");
                    range35Trigger = true;
                    plantRange35.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea35.setLocation(1050, 570);
                    p35 = getRectangle(pea35);
                } 
                
                if (waveZombieHB.intersects(zr4) && peaShooterHB.intersects(r36)) {
                    System.out.println("zombie touches range 9");
                    range36Trigger = true;
                    plantRange36.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea36.setLocation(1180, 570);
                    p36 = getRectangle(pea36);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r37)) {
                    System.out.println("zombie touches range 1");
                    range37Trigger = true;
                    plantRange37.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea37.setLocation(140, 700);
                    p37 = getRectangle(pea37);
                }
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r38)) {
                    System.out.println("zombie touches range 2");
                    range38Trigger = true;
                    plantRange38.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea38.setLocation(270, 700);
                    p38 = getRectangle(pea38);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r39)) {
                    System.out.println("zombie touches range 3");
                    range39Trigger = true;
                    plantRange39.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea39.setLocation(400, 700);
                    p39 = getRectangle(pea39);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r40)) {
                    System.out.println("zombie touches range 4");
                    range40Trigger = true;
                    plantRange40.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea40.setLocation(530, 700);
                    p40 = getRectangle(pea40);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r41)) {
                    System.out.println("zombie touches range 5");
                    range41Trigger = true;
                    plantRange41.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea41.setLocation(660, 700);
                    p41 = getRectangle(pea41);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r42)) {
                    System.out.println("zombie touches range 6");
                    range42Trigger = true;
                    plantRange42.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea42.setLocation(790, 700);
                    p42 = getRectangle(pea42);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r43)) {
                    System.out.println("zombie touches range 7");
                    range43Trigger = true;
                    plantRange43.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea43.setLocation(920, 700);
                    p43 = getRectangle(pea43);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r44)) {
                    System.out.println("zombie touches range 8");
                    range44Trigger = true;
                    plantRange44.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea44.setLocation(1050, 700);
                    p44 = getRectangle(pea44);
                } 
                
                if (waveZombieHB.intersects(zr5) && peaShooterHB.intersects(r45)) {
                    System.out.println("zombie touches range 9");
                    range45Trigger = true;
                    plantRange45.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea45.setLocation(1180, 700);
                    p45 = getRectangle(pea45);
                }
                
                if (Globals.player.psPlantHealth <= 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    label.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
                if (Globals.player.sfPlantHealth <= 0) {
                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.sfPlantHealth = 6;
                    label.setBounds(sunFlowerHB.x, sunFlowerHB.y,
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
        Rectangle explosionHB = getRectangle(concrete);
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
        Rectangle r28 = getRectangle(plantRange28);
        Rectangle r29 = getRectangle(plantRange29);
        Rectangle r30 = getRectangle(plantRange30);
        Rectangle r31 = getRectangle(plantRange31);
        Rectangle r32 = getRectangle(plantRange32);
        Rectangle r33 = getRectangle(plantRange33);
        Rectangle r34 = getRectangle(plantRange34);
        Rectangle r35 = getRectangle(plantRange35);
        Rectangle r36 = getRectangle(plantRange36);
        Rectangle r37 = getRectangle(plantRange37);
        Rectangle r38 = getRectangle(plantRange38);
        Rectangle r39 = getRectangle(plantRange39);
        Rectangle r40 = getRectangle(plantRange40);
        Rectangle r41 = getRectangle(plantRange41);
        Rectangle r42 = getRectangle(plantRange42);
        Rectangle r43 = getRectangle(plantRange43);
        Rectangle r44 = getRectangle(plantRange44);
        Rectangle r45 = getRectangle(plantRange45);
        Rectangle zr  = getRectangle(zombieRange);
        Rectangle zr2 = getRectangle(zombieRange2);
        Rectangle zr3 = getRectangle(zombieRange3);
        Rectangle zr4 = getRectangle(zombieRange4);
        Rectangle zr5 = getRectangle(zombieRange5);
        
        for (int zombieWave2 = 0; zombieWave2 < waveZombies2.size(); zombieWave2++) {    
            JLabel label = waveZombies2.get(zombieWave2);
            waveZombie2HB = getRectangle(label);           
            entrance = getRectangle(concrete);
            explosionHB = getRectangle(explosion);
            stop = getRectangle(barrier);
            waveZombie2HB.x -= 1;
            
            if (waveZombie2HB.intersects(entrance)) {
                zombieSpawnTimer.stop();
                zombieMoveTimer.stop();
                String text = "Level5";
        
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
                    waveZombie2HB.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
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
                    pea1.setLocation(140, 180);
                    p1 = getRectangle(pea1);
                }
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r2)) {
                    System.out.println("zombie touches range 2");
                    range2Trigger = true;
                    plantRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, 5000);
                    pea2.setLocation(270, 180);
                    p2 = getRectangle(pea2);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r3)) {
                    System.out.println("zombie touches range 3");
                    range3Trigger = true;
                    plantRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea3.setLocation(400, 180);
                    p3 = getRectangle(pea3);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r4)) {
                    System.out.println("zombie touches range 4");
                    range4Trigger = true;
                    plantRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea4.setLocation(530, 180);
                    p4 = getRectangle(pea4);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r5)) {
                    System.out.println("zombie touches range 5");
                    range5Trigger = true;
                    plantRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea5.setLocation(660, 180);
                    p5 = getRectangle(pea5);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r6)) {
                    System.out.println("zombie touches range 6");
                    range6Trigger = true;
                    plantRange6.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea6.setLocation(790, 180);
                    p6 = getRectangle(pea6);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r7)) {
                    System.out.println("zombie touches range 7");
                    range7Trigger = true;
                    plantRange7.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea7.setLocation(920, 180);
                    p7 = getRectangle(pea7);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r8)) {
                    System.out.println("zombie touches range 8");
                    range8Trigger = true;
                    plantRange8.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea8.setLocation(1050, 180);
                    p8 = getRectangle(pea8);
                } 
                
                if (waveZombie2HB.intersects(zr) && peaShooterHB.intersects(r9)) {
                    System.out.println("zombie touches range 9");
                    range9Trigger = true;
                    plantRange9.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea9.setLocation(1180, 180);
                    p9 = getRectangle(pea9);
                } 
                    
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r10)) {
                    System.out.println("zombie touches range 1");
                    range10Trigger = true;
                    plantRange10.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea10.setLocation(140, 310);
                    p10 = getRectangle(pea10);
                }
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r11)) {
                    System.out.println("zombie touches range 2");
                    range11Trigger = true;
                    plantRange11.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, 5000);
                    pea11.setLocation(270, 310);
                    p11 = getRectangle(pea11);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r12)) {
                    System.out.println("zombie touches range 3");
                    range12Trigger = true;
                    plantRange12.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea12.setLocation(400, 310);
                    p12 = getRectangle(pea12);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r13)) {
                    System.out.println("zombie touches range 4");
                    range13Trigger = true;
                    plantRange13.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea13.setLocation(530, 310);
                    p13 = getRectangle(pea13);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r14)) {
                    System.out.println("zombie touches range 5");
                    range14Trigger = true;
                    plantRange14.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea14.setLocation(660, 310);
                    p14 = getRectangle(pea14);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r15)) {
                    System.out.println("zombie touches range 6");
                    range15Trigger = true;
                    plantRange15.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea15.setLocation(790, 310);
                    p15 = getRectangle(pea15);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r16)) {
                    System.out.println("zombie touches range 7");
                    range16Trigger = true;
                    plantRange16.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea16.setLocation(920, 310);
                    p16 = getRectangle(pea16);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r17)) {
                    System.out.println("zombie touches range 8");
                    range17Trigger = true;
                    plantRange17.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea17.setLocation(1050, 310);
                    p17 = getRectangle(pea17);
                } 
                
                if (waveZombie2HB.intersects(zr2) && peaShooterHB.intersects(r18)) {
                    System.out.println("zombie touches range 9");
                    range18Trigger = true;
                    plantRange18.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange2.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea18.setLocation(1180, 310);
                    p18 = getRectangle(pea18);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r19)) {
                    System.out.println("zombie touches range 1");
                    range19Trigger = true;
                    plantRange19.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea19.setLocation(140, 440);
                    p19 = getRectangle(pea19);
                }
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r20)) {
                    System.out.println("zombie touches range 2");
                    range20Trigger = true;
                    plantRange20.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, 5000);
                    pea20.setLocation(270, 440);
                    p20 = getRectangle(pea20);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r21)) {
                    System.out.println("zombie touches range 3");
                    range21Trigger = true;
                    plantRange21.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea21.setLocation(400, 440);
                    p21 = getRectangle(pea21);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r22)) {
                    System.out.println("zombie touches range 4");
                    range22Trigger = true;
                    plantRange22.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea22.setLocation(530, 440);
                    p22 = getRectangle(pea22);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r23)) {
                    System.out.println("zombie touches range 5");
                    range23Trigger = true;
                    plantRange23.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea23.setLocation(660, 440);
                    p23 = getRectangle(pea23);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r24)) {
                    System.out.println("zombie touches range 6");
                    range24Trigger = true;
                    plantRange24.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea24.setLocation(790, 440);
                    p24 = getRectangle(pea24);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r25)) {
                    System.out.println("zombie touches range 7");
                    range25Trigger = true;
                    plantRange25.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea25.setLocation(920, 440);
                    p25 = getRectangle(pea25);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r26)) {
                    System.out.println("zombie touches range 8");
                    range26Trigger = true;
                    plantRange26.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea26.setLocation(1050, 440);
                    p26 = getRectangle(pea26);
                } 
                
                if (waveZombie2HB.intersects(zr3) && peaShooterHB.intersects(r27)) {
                    System.out.println("zombie touches range 9");
                    range27Trigger = true;
                    plantRange27.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange3.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea27.setLocation(1180, 440);
                    p27 = getRectangle(pea27);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r28)) {
                    System.out.println("zombie touches range 1");
                    range28Trigger = true;
                    plantRange28.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea28.setLocation(140, 570);
                    p28 = getRectangle(pea28);
                }
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r29)) {
                    System.out.println("zombie touches range 2");
                    range29Trigger = true;
                    plantRange29.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, 5000);
                    pea29.setLocation(270, 570);
                    p29 = getRectangle(pea29);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r30)) {
                    System.out.println("zombie touches range 3");
                    range30Trigger = true;
                    plantRange30.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea30.setLocation(400, 570);
                    p30 = getRectangle(pea30);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r31)) {
                    System.out.println("zombie touches range 4");
                    range31Trigger = true;
                    plantRange31.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea31.setLocation(530, 570);
                    p31 = getRectangle(pea31);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r32)) {
                    System.out.println("zombie touches range 5");
                    range32Trigger = true;
                    plantRange32.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea32.setLocation(660, 570);
                    p32 = getRectangle(pea32);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r33)) {
                    System.out.println("zombie touches range 6");
                    range33Trigger = true;
                    plantRange33.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea33.setLocation(790, 570);
                    p33 = getRectangle(pea33);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r34)) {
                    System.out.println("zombie touches range 7");
                    range34Trigger = true;
                    plantRange34.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea34.setLocation(920, 570);
                    p34 = getRectangle(pea34);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r35)) {
                    System.out.println("zombie touches range 8");
                    range35Trigger = true;
                    plantRange35.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea35.setLocation(1050, 570);
                    p35 = getRectangle(pea35);
                } 
                
                if (waveZombie2HB.intersects(zr4) && peaShooterHB.intersects(r36)) {
                    System.out.println("zombie touches range 9");
                    range36Trigger = true;
                    plantRange36.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange4.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea36.setLocation(1180, 570);
                    p36 = getRectangle(pea36);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r37)) {
                    System.out.println("zombie touches range 1");
                    range37Trigger = true;
                    plantRange37.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea37.setLocation(140, 700);
                    p37 = getRectangle(pea37);
                }
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r38)) {
                    System.out.println("zombie touches range 2");
                    range38Trigger = true;
                    plantRange38.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, 5000);
                    pea38.setLocation(270, 700);
                    p38 = getRectangle(pea38);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r39)) {
                    System.out.println("zombie touches range 3");
                    range39Trigger = true;
                    plantRange39.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea39.setLocation(400, 700);
                    p39 = getRectangle(pea39);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r40)) {
                    System.out.println("zombie touches range 4");
                    range40Trigger = true;
                    plantRange40.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea40.setLocation(530, 700);
                    p40 = getRectangle(pea40);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r41)) {
                    System.out.println("zombie touches range 5");
                    range41Trigger = true;
                    plantRange41.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea41.setLocation(660, 700);
                    p41 = getRectangle(pea41);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r42)) {
                    System.out.println("zombie touches range 6");
                    range42Trigger = true;
                    plantRange42.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea42.setLocation(790, 700);
                    p42 = getRectangle(pea42);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r43)) {
                    System.out.println("zombie touches range 7");
                    range43Trigger = true;
                    plantRange43.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea43.setLocation(920, 700);
                    p43 = getRectangle(pea43);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r44)) {
                    System.out.println("zombie touches range 8");
                    range44Trigger = true;
                    plantRange44.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea44.setLocation(1050, 700);
                    p44 = getRectangle(pea44);
                } 
                
                if (waveZombie2HB.intersects(zr5) && peaShooterHB.intersects(r45)) {
                    System.out.println("zombie touches range 9");
                    range45Trigger = true;
                    plantRange45.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    zombieRange5.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    pea45.setLocation(1180, 700);
                    p45 = getRectangle(pea45);
                }
                
                if (Globals.player.psPlantHealth <= 0) {
                    newPeaShooter.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.psPlantHealth = 6;
                    label.setBounds(peaShooterHB.x, peaShooterHB.y,
                    peaShooterHB.width, peaShooterHB.height);
                }   
                if (Globals.player.sfPlantHealth <= 0) {
                    newSunFlower.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
                    Globals.player.sfPlantHealth = 6;
                    label.setBounds(sunFlowerHB.x, sunFlowerHB.y,
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
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
                    waveProgress = waveProgress + 4;          
                    waveBar.setValue(waveProgress);

            }
            if (waveProgress > 100){
                
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
                    waveProgress = waveProgress + 4;          
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
                    waveProgress = waveProgress + 4;          
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
                    waveProgress = waveProgress + 4;          
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
                    waveProgress = waveProgress + 4;          
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
                    waveProgress = waveProgress + 4;          
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
                    waveProgress = waveProgress + 4;          
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                pea27.setLocation(p27.x, p27.y);

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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p28 = getRectangle(pea28);

            if (range28Trigger == true){

                p28.x += 1;
                pea10.setLocation(p28.x, p28.y);

            }
            if (range28Trigger == false){
                
                p28.x = 0;
                
            }
            if (p28.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea28.setLocation(1500, 460);
                range28Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p28.intersects(pStopper)){
                
                pea28.setLocation(1500, 460);
                range28Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p29 = getRectangle(pea29);

            if (range29Trigger == true){

                p29.x += 1;
                pea29.setLocation(p29.x, p29.y);

            }
            if (range29Trigger == false){
                
                p29.x = 0;
                
            }
            if (p29.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea29.setLocation(1500, 460);
                range29Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p29.intersects(pStopper)){
                
                pea29.setLocation(1500, 460);
                range29Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p30 = getRectangle(pea30);

            if (range30Trigger == true){

                p30.x += 1;
                pea30.setLocation(p30.x, p30.y);

            }
            if (range30Trigger == false){
                
                p30.x = 0;
                
            }
            if (p30.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea30.setLocation(1500, 460);
                range30Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p30.intersects(pStopper)){
                
                pea30.setLocation(1500, 460);
                range30Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p31 = getRectangle(pea31);

            if (range31Trigger == true){

                p31.x += 1;
                pea31.setLocation(p31.x, p31.y);

            }
            if (range31Trigger == false){
                
                p31.x = 0;
                
            }
            if (p31.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea31.setLocation(1500, 460);
                range31Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p31.intersects(pStopper)){
                
                pea31.setLocation(1500, 460);
                range31Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p32 = getRectangle(pea32);

            if (range32Trigger == true){

                p32.x += 1;
                pea32.setLocation(p32.x, p32.y);

            }
            if (range32Trigger == false){
                
                p32.x = 0;
                
            }
            if (p32.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea32.setLocation(1500, 460);
                range32Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p32.intersects(pStopper)){
                
                pea32.setLocation(1500, 460);
                range32Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p33 = getRectangle(pea33);

            if (range33Trigger == true){

                p33.x += 1;
                pea33.setLocation(p33.x, p33.y);

            }
            if (range33Trigger == false){
                
                p33.x = 0;
                
            }
            if (p33.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea33.setLocation(1500, 460);
                range33Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p33.intersects(pStopper)){
                
                pea33.setLocation(1500, 460);
                range33Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p34 = getRectangle(pea34);

            if (range34Trigger == true){

                p34.x += 1;
                pea34.setLocation(p34.x, p34.y);

            }
            if (range34Trigger == false){
                
                p34.x = 0;
                
            }
            if (p34.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea34.setLocation(1500, 460);
                range34Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p34.intersects(pStopper)){
                
                pea34.setLocation(1500, 460);
                range34Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p35 = getRectangle(pea35);

            if (range35Trigger == true){

                p35.x += 1;
                pea35.setLocation(p35.x, p35.y);

            }
            if (range35Trigger == false){
                
                p35.x = 0;
                
            }
            if (p35.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea35.setLocation(1500, 460);
                range35Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p35.intersects(pStopper)){
                
                pea35.setLocation(1500, 460);
                range35Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p36 = getRectangle(pea36);

            if (range36Trigger == true){

                p36.x += 1;
                pea36.setLocation(p36.x, p36.y);

            }
            if (range36Trigger == false){
                
                p36.x = 0;
                
            }
            if (p36.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea36.setLocation(1500, 460);
                range36Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p36.intersects(pStopper)){
                
                pea36.setLocation(1500, 460);
                range36Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p37 = getRectangle(pea37);

            if (range37Trigger == true){

                p37.x += 1;
                pea37.setLocation(p37.x, p37.y);

            }
            if (range37Trigger == false){
                
                p37.x = 0;
                
            }
            if (p37.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea37.setLocation(1500, 460);
                range37Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p37.intersects(pStopper)){
                
                pea37.setLocation(1500, 460);
                range37Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p38 = getRectangle(pea38);

            if (range38Trigger == true){

                p38.x += 1;
                pea38.setLocation(p38.x, p38.y);

            }
            if (range38Trigger == false){
                
                p38.x = 0;
                
            }
            if (p38.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea38.setLocation(1500, 460);
                range38Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p38.intersects(pStopper)){
                
                pea38.setLocation(1500, 460);
                range38Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p39 = getRectangle(pea39);

            if (range39Trigger == true){

                p39.x += 1;
                pea39.setLocation(p39.x, p39.y);

            }
            if (range39Trigger == false){
                
                p39.x = 0;
                
            }
            if (p39.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea39.setLocation(1500, 460);
                range39Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p39.intersects(pStopper)){
                
                pea39.setLocation(1500, 460);
                range39Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p40 = getRectangle(pea40);

            if (range40Trigger == true){

                p40.x += 1;
                pea40.setLocation(p40.x, p40.y);

            }
            if (range40Trigger == false){
                
                p40.x = 0;
                
            }
            if (p40.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea40.setLocation(1500, 460);
                range40Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p40.intersects(pStopper)){
                
                pea40.setLocation(1500, 460);
                range40Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p41 = getRectangle(pea41);

            if (range41Trigger == true){

                p41.x += 1;
                pea41.setLocation(p41.x, p41.y);

            }
            if (range41Trigger == false){
                
                p41.x = 0;
                
            }
            if (p41.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea41.setLocation(1500, 460);
                range41Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p41.intersects(pStopper)){
                
                pea41.setLocation(1500, 460);
                range41Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p42 = getRectangle(pea42);

            if (range42Trigger == true){

                p42.x += 1;
                pea42.setLocation(p42.x, p42.y);

            }
            if (range42Trigger == false){
                
                p42.x = 0;
                
            }
            if (p42.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea42.setLocation(1500, 460);
                range42Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p42.intersects(pStopper)){
                
                pea42.setLocation(1500, 460);
                range42Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p43 = getRectangle(pea43);

            if (range43Trigger == true){

                p43.x += 1;
                pea43.setLocation(p43.x, p43.y);

            }
            if (range43Trigger == false){
                
                p43.x = 0;
                
            }
            if (p43.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea43.setLocation(1500, 460);
                range43Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p43.intersects(pStopper)){
                
                pea43.setLocation(1500, 460);
                range43Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p44 = getRectangle(pea44);

            if (range44Trigger == true){

                p44.x += 1;
                pea44.setLocation(p44.x, p44.y);

            }
            if (range44Trigger == false){
                
                p44.x = 0;
                
            }
            if (p44.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea44.setLocation(1500, 460);
                range44Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p44.intersects(pStopper)){
                
                pea44.setLocation(1500, 460);
                range44Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < zombies.size(); i++) {    
            JLabel label = zombies.get(i);
            zombieHB = getRectangle(label); 
            p45 = getRectangle(pea45);

            if (range45Trigger == true){

                p45.x += 1;
                pea45.setLocation(p45.x, p45.y);

            }
            if (range45Trigger == false){
                
                p45.x = 0;
                
            }
            if (p45.intersects(zombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea45.setLocation(1500, 460);
                range45Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p45.intersects(pStopper)){
                
                pea45.setLocation(1500, 460);
                range45Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                pea27.setLocation(p27.x, p27.y);

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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p28 = getRectangle(pea28);

            if (range28Trigger == true){

                p28.x += 1;
                pea10.setLocation(p28.x, p28.y);

            }
            if (range28Trigger == false){
                
                p28.x = 0;
                
            }
            if (p28.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea28.setLocation(1500, 460);
                range28Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p28.intersects(pStopper)){
                
                pea28.setLocation(1500, 460);
                range28Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p29 = getRectangle(pea29);

            if (range29Trigger == true){

                p29.x += 1;
                pea29.setLocation(p29.x, p29.y);

            }
            if (range29Trigger == false){
                
                p29.x = 0;
                
            }
            if (p29.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea29.setLocation(1500, 460);
                range29Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p29.intersects(pStopper)){
                
                pea29.setLocation(1500, 460);
                range29Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p30 = getRectangle(pea30);

            if (range30Trigger == true){

                p30.x += 1;
                pea30.setLocation(p30.x, p30.y);

            }
            if (range30Trigger == false){
                
                p30.x = 0;
                
            }
            if (p30.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea30.setLocation(1500, 460);
                range30Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p30.intersects(pStopper)){
                
                pea30.setLocation(1500, 460);
                range30Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p31 = getRectangle(pea31);

            if (range31Trigger == true){

                p31.x += 1;
                pea31.setLocation(p31.x, p31.y);

            }
            if (range31Trigger == false){
                
                p31.x = 0;
                
            }
            if (p31.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea31.setLocation(1500, 460);
                range31Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p31.intersects(pStopper)){
                
                pea31.setLocation(1500, 460);
                range31Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p32 = getRectangle(pea32);

            if (range32Trigger == true){

                p32.x += 1;
                pea32.setLocation(p32.x, p32.y);

            }
            if (range32Trigger == false){
                
                p32.x = 0;
                
            }
            if (p32.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea32.setLocation(1500, 460);
                range32Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p32.intersects(pStopper)){
                
                pea32.setLocation(1500, 460);
                range32Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p33 = getRectangle(pea33);

            if (range33Trigger == true){

                p33.x += 1;
                pea33.setLocation(p33.x, p33.y);

            }
            if (range33Trigger == false){
                
                p33.x = 0;
                
            }
            if (p33.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea33.setLocation(1500, 460);
                range33Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p33.intersects(pStopper)){
                
                pea33.setLocation(1500, 460);
                range33Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p34 = getRectangle(pea34);

            if (range34Trigger == true){

                p34.x += 1;
                pea34.setLocation(p34.x, p34.y);

            }
            if (range34Trigger == false){
                
                p34.x = 0;
                
            }
            if (p34.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea34.setLocation(1500, 460);
                range34Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p34.intersects(pStopper)){
                
                pea34.setLocation(1500, 460);
                range34Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p35 = getRectangle(pea35);

            if (range35Trigger == true){

                p35.x += 1;
                pea35.setLocation(p35.x, p35.y);

            }
            if (range35Trigger == false){
                
                p35.x = 0;
                
            }
            if (p35.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea35.setLocation(1500, 460);
                range35Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p35.intersects(pStopper)){
                
                pea35.setLocation(1500, 460);
                range35Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p36 = getRectangle(pea36);

            if (range36Trigger == true){

                p36.x += 1;
                pea36.setLocation(p36.x, p36.y);

            }
            if (range36Trigger == false){
                
                p36.x = 0;
                
            }
            if (p36.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea36.setLocation(1500, 460);
                range36Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p36.intersects(pStopper)){
                
                pea36.setLocation(1500, 460);
                range36Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p37 = getRectangle(pea37);

            if (range37Trigger == true){

                p37.x += 1;
                pea37.setLocation(p37.x, p37.y);

            }
            if (range37Trigger == false){
                
                p37.x = 0;
                
            }
            if (p37.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea37.setLocation(1500, 460);
                range37Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p37.intersects(pStopper)){
                
                pea37.setLocation(1500, 460);
                range37Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p38 = getRectangle(pea38);

            if (range38Trigger == true){

                p38.x += 1;
                pea38.setLocation(p38.x, p38.y);

            }
            if (range38Trigger == false){
                
                p38.x = 0;
                
            }
            if (p38.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea38.setLocation(1500, 460);
                range38Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p38.intersects(pStopper)){
                
                pea38.setLocation(1500, 460);
                range38Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p39 = getRectangle(pea39);

            if (range39Trigger == true){

                p39.x += 1;
                pea39.setLocation(p39.x, p39.y);

            }
            if (range39Trigger == false){
                
                p39.x = 0;
                
            }
            if (p39.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea39.setLocation(1500, 460);
                range39Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p39.intersects(pStopper)){
                
                pea39.setLocation(1500, 460);
                range39Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p40 = getRectangle(pea40);

            if (range40Trigger == true){

                p40.x += 1;
                pea40.setLocation(p40.x, p40.y);

            }
            if (range40Trigger == false){
                
                p40.x = 0;
                
            }
            if (p40.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea40.setLocation(1500, 460);
                range40Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p40.intersects(pStopper)){
                
                pea40.setLocation(1500, 460);
                range40Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p41 = getRectangle(pea41);

            if (range41Trigger == true){

                p41.x += 1;
                pea41.setLocation(p41.x, p41.y);

            }
            if (range41Trigger == false){
                
                p41.x = 0;
                
            }
            if (p41.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea41.setLocation(1500, 460);
                range41Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p41.intersects(pStopper)){
                
                pea41.setLocation(1500, 460);
                range41Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p42 = getRectangle(pea42);

            if (range42Trigger == true){

                p42.x += 1;
                pea42.setLocation(p42.x, p42.y);

            }
            if (range42Trigger == false){
                
                p42.x = 0;
                
            }
            if (p42.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea42.setLocation(1500, 460);
                range42Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p42.intersects(pStopper)){
                
                pea42.setLocation(1500, 460);
                range42Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p43 = getRectangle(pea43);

            if (range43Trigger == true){

                p43.x += 1;
                pea43.setLocation(p43.x, p43.y);

            }
            if (range43Trigger == false){
                
                p43.x = 0;
                
            }
            if (p43.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea43.setLocation(1500, 460);
                range43Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p43.intersects(pStopper)){
                
                pea43.setLocation(1500, 460);
                range43Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p44 = getRectangle(pea44);

            if (range44Trigger == true){

                p44.x += 1;
                pea44.setLocation(p44.x, p44.y);

            }
            if (range44Trigger == false){
                
                p44.x = 0;
                
            }
            if (p44.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea44.setLocation(1500, 460);
                range44Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p44.intersects(pStopper)){
                
                pea44.setLocation(1500, 460);
                range44Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies.size(); i++) {    
            JLabel label = waveZombies.get(i);
            waveZombieHB = getRectangle(label); 
            p45 = getRectangle(pea45);

            if (range45Trigger == true){

                p45.x += 1;
                pea45.setLocation(p45.x, p45.y);

            }
            if (range45Trigger == false){
                
                p45.x = 0;
                
            }
            if (p45.intersects(waveZombieHB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea45.setLocation(1500, 460);
                range45Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p45.intersects(pStopper)){
                
                pea45.setLocation(1500, 460);
                range45Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                    Level1Win complete1 = new Level1Win();
                    
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                Level1Win complete1 = new Level1Win();
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
                pea27.setLocation(p27.x, p27.y);

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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p27.intersects(pStopper)){
                
                pea27.setLocation(1500, 460);
                range27Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p28 = getRectangle(pea28);

            if (range28Trigger == true){

                p28.x += 1;
                pea10.setLocation(p28.x, p28.y);

            }
            if (range28Trigger == false){
                
                p28.x = 0;
                
            }
            if (p28.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea28.setLocation(1500, 460);
                range28Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p28.intersects(pStopper)){
                
                pea28.setLocation(1500, 460);
                range28Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p29 = getRectangle(pea29);

            if (range29Trigger == true){

                p29.x += 1;
                pea29.setLocation(p29.x, p29.y);

            }
            if (range29Trigger == false){
                
                p29.x = 0;
                
            }
            if (p29.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea29.setLocation(1500, 460);
                range29Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p29.intersects(pStopper)){
                
                pea29.setLocation(1500, 460);
                range29Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p30 = getRectangle(pea30);

            if (range30Trigger == true){

                p30.x += 1;
                pea30.setLocation(p30.x, p30.y);

            }
            if (range30Trigger == false){
                
                p30.x = 0;
                
            }
            if (p30.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea30.setLocation(1500, 460);
                range30Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p30.intersects(pStopper)){
                
                pea30.setLocation(1500, 460);
                range30Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p31 = getRectangle(pea31);

            if (range31Trigger == true){

                p31.x += 1;
                pea31.setLocation(p31.x, p31.y);

            }
            if (range31Trigger == false){
                
                p31.x = 0;
                
            }
            if (p31.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea31.setLocation(1500, 460);
                range31Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p31.intersects(pStopper)){
                
                pea31.setLocation(1500, 460);
                range31Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p32 = getRectangle(pea32);

            if (range32Trigger == true){

                p32.x += 1;
                pea32.setLocation(p32.x, p32.y);

            }
            if (range32Trigger == false){
                
                p32.x = 0;
                
            }
            if (p32.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea32.setLocation(1500, 460);
                range32Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p32.intersects(pStopper)){
                
                pea32.setLocation(1500, 460);
                range32Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p33 = getRectangle(pea33);

            if (range33Trigger == true){

                p33.x += 1;
                pea33.setLocation(p33.x, p33.y);

            }
            if (range33Trigger == false){
                
                p33.x = 0;
                
            }
            if (p33.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea33.setLocation(1500, 460);
                range33Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p33.intersects(pStopper)){
                
                pea33.setLocation(1500, 460);
                range33Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p34 = getRectangle(pea34);

            if (range34Trigger == true){

                p34.x += 1;
                pea34.setLocation(p34.x, p34.y);

            }
            if (range34Trigger == false){
                
                p34.x = 0;
                
            }
            if (p34.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea34.setLocation(1500, 460);
                range34Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p34.intersects(pStopper)){
                
                pea34.setLocation(1500, 460);
                range34Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p35 = getRectangle(pea35);

            if (range35Trigger == true){

                p35.x += 1;
                pea35.setLocation(p35.x, p35.y);

            }
            if (range35Trigger == false){
                
                p35.x = 0;
                
            }
            if (p35.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea35.setLocation(1500, 460);
                range35Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p35.intersects(pStopper)){
                
                pea35.setLocation(1500, 460);
                range35Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p36 = getRectangle(pea36);

            if (range36Trigger == true){

                p36.x += 1;
                pea36.setLocation(p36.x, p36.y);

            }
            if (range36Trigger == false){
                
                p36.x = 0;
                
            }
            if (p36.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea36.setLocation(1500, 460);
                range36Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p36.intersects(pStopper)){
                
                pea36.setLocation(1500, 460);
                range36Trigger = false;
                rangeReturnTimer.start();
                
            }
       }
             
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p37 = getRectangle(pea37);

            if (range37Trigger == true){

                p37.x += 1;
                pea37.setLocation(p37.x, p37.y);

            }
            if (range37Trigger == false){
                
                p37.x = 0;
                
            }
            if (p37.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea37.setLocation(1500, 460);
                range37Trigger = false;
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
                    Level1Win complete1 = new Level1Win();
                    
                }
                
            }
            
            if (p37.intersects(pStopper)){
                
                pea37.setLocation(1500, 460);
                range37Trigger = false;
                rangeReturnTimer.start();
                
            }
            
       }
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p38 = getRectangle(pea38);

            if (range38Trigger == true){

                p38.x += 1;
                pea38.setLocation(p38.x, p38.y);

            }
            if (range38Trigger == false){
                
                p38.x = 0;
                
            }
            if (p38.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea38.setLocation(1500, 460);
                range38Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p38.intersects(pStopper)){
                
                pea38.setLocation(1500, 460);
                range38Trigger = false;
                rangeReturnTimer.start();
                
            }
       }  
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p39 = getRectangle(pea39);

            if (range39Trigger == true){

                p39.x += 1;
                pea39.setLocation(p39.x, p39.y);

            }
            if (range39Trigger == false){
                
                p39.x = 0;
                
            }
            if (p39.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea39.setLocation(1500, 460);
                range39Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p39.intersects(pStopper)){
                
                pea39.setLocation(1500, 460);
                range39Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p40 = getRectangle(pea40);

            if (range40Trigger == true){

                p40.x += 1;
                pea40.setLocation(p40.x, p40.y);

            }
            if (range40Trigger == false){
                
                p40.x = 0;
                
            }
            if (p40.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea40.setLocation(1500, 460);
                range40Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p40.intersects(pStopper)){
                
                pea40.setLocation(1500, 460);
                range40Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p41 = getRectangle(pea41);

            if (range41Trigger == true){

                p41.x += 1;
                pea41.setLocation(p41.x, p41.y);

            }
            if (range41Trigger == false){
                
                p41.x = 0;
                
            }
            if (p41.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea41.setLocation(1500, 460);
                range41Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p41.intersects(pStopper)){
                
                pea41.setLocation(1500, 460);
                range41Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p42 = getRectangle(pea42);

            if (range42Trigger == true){

                p42.x += 1;
                pea42.setLocation(p42.x, p42.y);

            }
            if (range42Trigger == false){
                
                p42.x = 0;
                
            }
            if (p42.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea42.setLocation(1500, 460);
                range42Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p42.intersects(pStopper)){
                
                pea42.setLocation(1500, 460);
                range42Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p43 = getRectangle(pea43);

            if (range43Trigger == true){

                p43.x += 1;
                pea43.setLocation(p43.x, p43.y);

            }
            if (range43Trigger == false){
                
                p43.x = 0;
                
            }
            if (p43.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea43.setLocation(1500, 460);
                range43Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p43.intersects(pStopper)){
                
                pea43.setLocation(1500, 460);
                range43Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p44 = getRectangle(pea44);

            if (range44Trigger == true){

                p44.x += 1;
                pea44.setLocation(p44.x, p44.y);

            }
            if (range44Trigger == false){
                
                p44.x = 0;
                
            }
            if (p44.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea44.setLocation(1500, 460);
                range44Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p44.intersects(pStopper)){
                
                pea44.setLocation(1500, 460);
                range44Trigger = false;
                rangeReturnTimer.start();
                
            }
       }        
       
       for (int i = 0; i < waveZombies2.size(); i++) {    
            JLabel label = waveZombies2.get(i);
            waveZombie2HB = getRectangle(label); 
            p45 = getRectangle(pea45);

            if (range45Trigger == true){

                p45.x += 1;
                pea45.setLocation(p45.x, p45.y);

            }
            if (range45Trigger == false){
                
                p45.x = 0;
                
            }
            if (p45.intersects(waveZombie2HB)){
                System.out.println("zombie health =" + Globals.player.zombieHealth);
                Globals.player.zombieHealth = Globals.player.zombieHealth - Globals.player.psPlantDamage;
                pea45.setLocation(1500, 460);
                range45Trigger = false;
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
                Level1Win complete1 = new Level1Win();
            }
            
            if (p45.intersects(pStopper)){
                
                pea45.setLocation(1500, 460);
                range45Trigger = false;
                rangeReturnTimer.start();
                
            }
       }     
    }
    
    private void rangeReturn(){
    
        if (range1Trigger == false){
        plantRange1.setLocation(100, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();
        }
        
        if(range2Trigger == false){
        plantRange2.setLocation(230, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range3Trigger == false){
        plantRange3.setLocation(360, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range4Trigger == false){
        plantRange4.setLocation(490, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range5Trigger == false){
        plantRange5.setLocation(620, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range6Trigger == false){
        plantRange6.setLocation(750, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range7Trigger == false){
        plantRange7.setLocation(880, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range8Trigger == false){
        plantRange8.setLocation(1010, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        
        if(range9Trigger == false){
        plantRange9.setLocation(1140, 170);
        zombieRange.setLocation(130, 170);
        rangeReturnTimer.stop();              
        }
        if (range10Trigger == false){
        plantRange10.setLocation(100, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();
        }
        
        if(range11Trigger == false){
        plantRange11.setLocation(230, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range12Trigger == false){
        plantRange12.setLocation(360, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range13Trigger == false){
        plantRange13.setLocation(490, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range14Trigger == false){
        plantRange14.setLocation(620, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range15Trigger == false){
        plantRange15.setLocation(750, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range16Trigger == false){
        plantRange16.setLocation(880, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range17Trigger == false){
        plantRange17.setLocation(1010, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        
        if(range18Trigger == false){
        plantRange18.setLocation(1140, 300);
        zombieRange2.setLocation(130, 300);
        rangeReturnTimer.stop();              
        }
        if (range19Trigger == false){
        plantRange19.setLocation(100, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();
        }
        
        if(range20Trigger == false){
        plantRange20.setLocation(230, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range21Trigger == false){
        plantRange21.setLocation(360, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range22Trigger == false){
        plantRange22.setLocation(490, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range23Trigger == false){
        plantRange23.setLocation(620, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range24Trigger == false){
        plantRange24.setLocation(750, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range25Trigger == false){
        plantRange25.setLocation(880, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range26Trigger == false){
        plantRange26.setLocation(1010, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if(range27Trigger == false){
        plantRange27.setLocation(1140, 430);
        zombieRange3.setLocation(130, 430);
        rangeReturnTimer.stop();              
        }
        
        if (range28Trigger == false){
        plantRange28.setLocation(100, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();
        }
        
        if(range29Trigger == false){
        plantRange29.setLocation(230, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range30Trigger == false){
        plantRange30.setLocation(360, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range31Trigger == false){
        plantRange31.setLocation(490, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range32Trigger == false){
        plantRange32.setLocation(620, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range33Trigger == false){
        plantRange33.setLocation(750, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range34Trigger == false){
        plantRange34.setLocation(880, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range35Trigger == false){
        plantRange35.setLocation(1010, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if(range36Trigger == false){
        plantRange36.setLocation(1140, 560);
        zombieRange4.setLocation(130, 560);
        rangeReturnTimer.stop();              
        }
        
        if (range37Trigger == false){
        plantRange37.setLocation(100, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();
        }
        
        if(range38Trigger == false){
        plantRange38.setLocation(230, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range39Trigger == false){
        plantRange39.setLocation(360, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range40Trigger == false){
        plantRange40.setLocation(490, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range41Trigger == false){
        plantRange41.setLocation(620, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range42Trigger == false){
        plantRange42.setLocation(750, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range43Trigger == false){
        plantRange43.setLocation(880, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range44Trigger == false){
        plantRange44.setLocation(1010, 690);
        zombieRange5.setLocation(130, 690);
        rangeReturnTimer.stop();              
        }
        
        if(range45Trigger == false){
        plantRange45.setLocation(1140, 690);
        zombieRange5.setLocation(130, 690);
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
    
    private void wallnutRecharge() {        
        wallnutRechargeTimer.start();       
        rechargeWallnutBar = rechargeWallnutBar + 1;        
        wallnutBar.setValue(rechargeWallnutBar);        
        if (rechargeWallnutBar == 100){            
            wallnutRecharged = true;
            wallnutRechargeTimer.stop();
        }
        else {            
            wallnutRecharged = false;            
        }      
    }
    
    private void potatoMineRecharge() {        
        potatoMineRechargeTimer.start();       
        rechargePotatoMineBar = rechargePotatoMineBar + 1;        
        potatoMineBar.setValue(rechargePotatoMineBar);        
        if (rechargePotatoMineBar == 100){            
            potatoMineRecharged = true;
            potatoMineRechargeTimer.stop();
        }
        else {            
            potatoMineRecharged = false;            
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
        if (wallnutHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            newWallnut = plantPickupLabels.get(index);
            newWallnut.setLocation(x, y);    
            wallnutHasClicked = false;
            rechargeWallnutBar = 0;
            wallnutRechargeTimer.start();
            wallnutPack.setLocation(WALLNUT_PACK_X, WALLNUT_PACK_Y);            
        }
        
        if (potatoMineHasClicked == true) {
            potatoMineArmingTimer.start();
            int index = plantPickupLabels.size() - 1;
            newPotatoMine = plantPickupLabels.get(index);
            newPotatoMine.setLocation(x, y);    
            potatoMineHasClicked = false;
            rechargePotatoMineBar = 0;
            potatoMineRechargeTimer.start();
            tempExplosionX2 = x;
            tempExplosionY2 = y;
            potatoMinePack.setLocation(POTATO_MINE_PACK_X, POTATO_MINE_PACK_Y);            
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
    
    private void newCherryBombPackMouseClicked(MouseEvent evt, int index) {  
        if (spadeHasClicked == true) {            
            JLabel cherryBomb = plantPickupLabels.get(index);
            cherryBomb.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);      
        }
        else if (spadeHasClicked == true){
            System.out.println("CLICK ON A PLANT");
        }
    }
    
    private void newWallnutPackMouseClicked(MouseEvent evt, int index) {  
        if (spadeHasClicked == true) {            
            JLabel wallnut = plantPickupLabels.get(index);
            wallnut.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);      
        }
        else if (spadeHasClicked == true){
            System.out.println("CLICK ON A PLANT");
        }
    }
    
    private void newPotatoMinePackMouseClicked(MouseEvent evt, int index) {  
        if (spadeHasClicked == true) {            
            JLabel potatoMine = plantPickupLabels.get(index);
            potatoMine.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);      
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
                peaShooterPack.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);                
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
                sunFlowerPack.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);                
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
                cherryBombPack.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);                
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
                    newCherryBombPackMouseClicked(evt, index);
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
    
    private void originalWallnutPackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX_WALLNUT && wallnutRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX_WALLNUT;          
            if (wallnutHasClicked == false) {               
                wallnutHasClicked = true;
                wallnutPack.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);                
            }
            else if (wallnutHasClicked == true && wallnutRecharged == true) {               
                wallnutHasClicked = true;
                System.out.println("PLANT THE CHERRY BOMB OR CANCEL");               
            }          
            plantPickups.add(plantPickup);
            plantsPlaced.add(plantPlaced);            
            int index = plantPickupLabels.size();
            JLabel newWallnut = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource(NEW_WALLNUT_IMAGE));
            newWallnut.setIcon(icon);
            newWallnut.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    newWallnutPackMouseClicked(evt, index);
                }
            });
            getContentPane().add(newWallnut);            
            x += WALLNUT_NEW_X;
            y += WALLNUT_NEW_Y;            
            newWallnut.setBounds(x, y, WALLNUT_NEW_WIDTH, WALLNUT_NEW_HEIGHT);
            getContentPane().setComponentZOrder(newWallnut, 0);            
            plantPickupLabels.add(newWallnut);            
        }        
        if(sun >= SUN_PROGRESS_MAX_WALLNUT && wallnutRecharged == false){
            System.out.println("WALLNUT NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX_WALLNUT && wallnutRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX_WALLNUT && wallnutRecharged == false){
            System.out.println("WALLNUT NOT RECHARGED YET AND NOT ENOUGH SUN");
        }
    }
    
    private void originalPotatoMinePackMouseClicking(MouseEvent evt) {        
        if (sun >= SUN_PROGRESS_MAX_POTATO_MINE && potatoMineRecharged == true){             
            sun = sun - SUN_PROGRESS_MAX_POTATO_MINE;          
            if (potatoMineHasClicked == false) {               
                potatoMineHasClicked = true;
                potatoMinePack.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);                
            }
            else if (potatoMineHasClicked == true && potatoMineRecharged == true) {               
                potatoMineHasClicked = true;
                System.out.println("PLANT THE POTATO MINE OR CANCEL");               
            }          
            plantPickups.add(plantPickup);
            plantsPlaced.add(plantPlaced);            
            int index = plantPickupLabels.size();
            JLabel newPotatoMine = new JLabel();            
            Icon icon = new ImageIcon(getClass().getResource(NEW_POTATO_MINE_IMAGE));
            newPotatoMine.setIcon(icon);
            newPotatoMine.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    newPotatoMinePackMouseClicked(evt, index);
                }
            });
            getContentPane().add(newPotatoMine);            
            x += POTATO_MINE_NEW_X;
            y += POTATO_MINE_NEW_Y;            
            newPotatoMine.setBounds(x, y, POTATO_MINE_NEW_WIDTH, POTATO_MINE_NEW_HEIGHT);
            getContentPane().setComponentZOrder(newPotatoMine, 0);            
            plantPickupLabels.add(newPotatoMine);            
        }        
        if(sun >= SUN_PROGRESS_MAX_POTATO_MINE && potatoMineRecharged == false){
            System.out.println("POTATO MINE NOT RECHARGED YET");
        } 
        else if(sun <= SUN_PROGRESS_MAX_POTATO_MINE && potatoMineRecharged == true){
            System.out.println("NOT ENOUGH SUN");
        }
        else if(sun <= SUN_PROGRESS_MAX_POTATO_MINE && potatoMineRecharged == false){
            System.out.println("POTATO MINE NOT RECHARGED YET AND NOT ENOUGH SUN");
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
        
        if (wallnutHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            JLabel wallnut = plantPickupLabels.get(index);
            if (wallnut != null) {
                int w = wallnut.getWidth();
                int h = wallnut.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                wallnut.setBounds(x, y, w, h);
            }
        }
        
        if (potatoMineHasClicked == true) {
            int index = plantPickupLabels.size() - 1;
            JLabel potatoMine = plantPickupLabels.get(index);
            if (potatoMine != null) {
                int w = potatoMine.getWidth();
                int h = potatoMine.getHeight();
                int x = evt.getX() - (w / 2);
                int y = evt.getY() - (h / 2);
                potatoMine.setBounds(x, y, w, h);
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
        if (wallnutHasClicked == true) {            
            wallnutHasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel wallnut = plantPickupLabels.get(index);
            wallnut.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + 50;      
            wallnutPack.setLocation(WALLNUT_PACK_X, WALLNUT_PACK_Y);
        }
        if (potatoMineHasClicked == true) {            
            potatoMineHasClicked = false;            
            int index = plantPickupLabels.size() - 1;
            JLabel potatoMine = plantPickupLabels.get(index);
            potatoMine.setLocation(OFF_SCREEN_X, OFF_SCREEN_Y);
            sun = sun + 50;      
            wallnutPack.setLocation(POTATO_MINE_PACK_X, POTATO_MINE_PACK_Y);
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
