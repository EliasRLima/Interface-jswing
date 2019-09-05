/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easter_egg;


import interfaces.PrimeiraTela;
import java.awt.Color;
import static java.lang.Thread.sleep;

/**
 *
 * @author elias
 */
public class Beat extends javax.swing.JFrame {

    /**
     * Creates new form beat
     */
    
    private Som som;
    
    public Beat() {
        initComponents();
        jb_bubbles.setBackground(new java.awt.Color(1,1,1,0));
        jb_moon.setBackground(new java.awt.Color(1,1,1,0));
        jb_clay.setBackground(new java.awt.Color(1,1,1,0));
        jb_confetti.setBackground(new java.awt.Color(1,1,1,0));
        jb_ufo.setBackground(new java.awt.Color(1,1,1,0));
        jb_glimmer.setBackground(new java.awt.Color(1,1,1,0));
        jb_bubbles1.setBackground(new java.awt.Color(1,1,1,0));
        jb_sair.setBackground(new java.awt.Color(1,1,1,0));
        jp_beats.setBackground(this.getBackground());
        jp_beats.setVisible(true);
        beat1.setVisible(false);
        beat2.setVisible(false);
        beat3.setVisible(false);
        beat4.setVisible(false);
        beat5.setVisible(false);
        beat6.setVisible(false);
        beat7.setVisible(false);
        beat8.setVisible(false);
        beat9.setVisible(false);
        beat10.setVisible(false);
        beat11.setVisible(false);
        beat12.setVisible(false);
        beat13.setVisible(false);
        beat14.setVisible(false);
        this.som = new Som();
    }
    
    public class Colorir1 extends Thread{
        public void run(){
                Color cor = new Color(51,255,0);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
                }
        }
    }
    public class Colorir2 extends Thread{
        public void run(){
                Color cor = new Color(255,51,51);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
                }
        }
    }
    public class Colorir3 extends Thread{
        public void run(){
                Color cor = new Color(255,255,51);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
                }
        }
    }
    public class Colorir4 extends Thread{
        public void run(){
                Color cor = new Color(0,204,204);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
                }
        }
    }
    public class Colorir5 extends Thread{
        public void run(){
                Color cor = new Color(255,51,255);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
                }
        }
    }
    public class Colorir6 extends Thread{
        public void run(){
                Color cor = new Color(0,102,204);
                try{
                    beat1.setVisible(false);
                    sleep(100);
                    beat1.setBackground(cor);
                    beat1.setVisible(true);
                    sleep(100);
                    beat1.setVisible(false);
                    beat2.setBackground(cor);;
                    beat2.setVisible(true);
                    sleep(100);
                    beat2.setVisible(false);
                    beat3.setBackground(cor);;
                    beat3.setVisible(true);
                    sleep(100);
                    beat3.setVisible(false);
                    beat4.setBackground(cor);;
                    beat4.setVisible(true);
                    sleep(100);
                    beat4.setVisible(false);
                    beat5.setBackground(cor);;
                    beat5.setVisible(true);
                    sleep(100);
                    beat5.setVisible(false);
                    beat6.setBackground(cor);;
                    beat6.setVisible(true);
                    sleep(100);
                    beat6.setVisible(false);
                    beat7.setBackground(cor);;
                    beat7.setVisible(true);
                    sleep(100);
                    beat7.setVisible(false);
                    beat8.setBackground(cor);;
                    beat8.setVisible(true);
                    sleep(100);
                    beat8.setVisible(false);
                    beat9.setBackground(cor);;
                    beat9.setVisible(true);
                    sleep(100);
                    beat9.setVisible(false);
                    beat10.setBackground(cor);;
                    beat10.setVisible(true);
                    sleep(100);
                    beat10.setVisible(false);
                    beat11.setBackground(cor);;
                    beat11.setVisible(true);
                    sleep(100);
                    beat11.setVisible(false);
                    beat12.setBackground(cor);;
                    beat12.setVisible(true);
                    sleep(100);
                    beat12.setVisible(false);
                    beat13.setBackground(cor);;
                    beat13.setVisible(true);
                    sleep(100);
                    beat13.setVisible(false);
                    beat14.setBackground(cor);;
                    beat14.setVisible(true);
                    sleep(100);
                    beat14.setVisible(false);
                    
                }catch(Exception e){
                    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jp_bubbles = new javax.swing.JPanel();
        jb_bubbles = new javax.swing.JButton();
        jp_clay = new javax.swing.JPanel();
        jb_clay = new javax.swing.JButton();
        jp_confetti = new javax.swing.JPanel();
        jb_confetti = new javax.swing.JButton();
        jp_glimmer = new javax.swing.JPanel();
        jb_glimmer = new javax.swing.JButton();
        jp_moon = new javax.swing.JPanel();
        jb_moon = new javax.swing.JButton();
        jp_ufo = new javax.swing.JPanel();
        jb_ufo = new javax.swing.JButton();
        jp_bubbles1 = new javax.swing.JPanel();
        jb_bubbles1 = new javax.swing.JButton();
        jp_beats = new javax.swing.JPanel();
        beat1 = new javax.swing.JPanel();
        beat9 = new javax.swing.JPanel();
        beat8 = new javax.swing.JPanel();
        beat7 = new javax.swing.JPanel();
        beat13 = new javax.swing.JPanel();
        beat11 = new javax.swing.JPanel();
        beat10 = new javax.swing.JPanel();
        beat6 = new javax.swing.JPanel();
        beat5 = new javax.swing.JPanel();
        beat4 = new javax.swing.JPanel();
        beat3 = new javax.swing.JPanel();
        beat2 = new javax.swing.JPanel();
        beat12 = new javax.swing.JPanel();
        beat14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TapMusic - Play4Fun");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(280, 299));
        setMinimumSize(new java.awt.Dimension(280, 299));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(280, 299));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TapMusic♪");

        jLabel2.setText("- Clique nas cores!");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jp_bubbles.setBackground(new java.awt.Color(51, 255, 0));
        jp_bubbles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_bubbles.setBorder(null);
        jb_bubbles.setOpaque(false);
        jb_bubbles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bubblesActionPerformed(evt);
            }
        });
        jp_bubbles.add(jb_bubbles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_bubbles, new java.awt.GridBagConstraints());

        jp_clay.setBackground(new java.awt.Color(255, 51, 51));
        jp_clay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_clay.setBorder(null);
        jb_clay.setOpaque(false);
        jb_clay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clayActionPerformed(evt);
            }
        });
        jp_clay.add(jb_clay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_clay, new java.awt.GridBagConstraints());

        jp_confetti.setBackground(new java.awt.Color(255, 255, 51));
        jp_confetti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_confetti.setBorder(null);
        jb_confetti.setOpaque(false);
        jb_confetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_confettiActionPerformed(evt);
            }
        });
        jp_confetti.add(jb_confetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_confetti, new java.awt.GridBagConstraints());

        jp_glimmer.setBackground(new java.awt.Color(0, 204, 204));
        jp_glimmer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_glimmer.setBorder(null);
        jb_glimmer.setOpaque(false);
        jb_glimmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_glimmerActionPerformed(evt);
            }
        });
        jp_glimmer.add(jb_glimmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_glimmer, new java.awt.GridBagConstraints());

        jp_moon.setBackground(new java.awt.Color(255, 51, 255));
        jp_moon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_moon.setBorder(null);
        jb_moon.setOpaque(false);
        jb_moon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_moonActionPerformed(evt);
            }
        });
        jp_moon.add(jb_moon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_moon, new java.awt.GridBagConstraints());

        jp_ufo.setBackground(new java.awt.Color(0, 102, 204));
        jp_ufo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_ufo.setBorder(null);
        jb_ufo.setOpaque(false);
        jb_ufo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ufoActionPerformed(evt);
            }
        });
        jp_ufo.add(jb_ufo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_ufo, new java.awt.GridBagConstraints());

        jp_bubbles1.setBackground(new java.awt.Color(51, 255, 0));
        jp_bubbles1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_bubbles1.setBorder(null);
        jb_bubbles1.setOpaque(false);
        jb_bubbles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bubbles1ActionPerformed(evt);
            }
        });
        jp_bubbles1.add(jb_bubbles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jp_bubbles1, new java.awt.GridBagConstraints());

        jp_beats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        beat1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout beat1Layout = new javax.swing.GroupLayout(beat1);
        beat1.setLayout(beat1Layout);
        beat1Layout.setHorizontalGroup(
            beat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat1Layout.setVerticalGroup(
            beat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        beat9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat9Layout = new javax.swing.GroupLayout(beat9);
        beat9.setLayout(beat9Layout);
        beat9Layout.setHorizontalGroup(
            beat9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat9Layout.setVerticalGroup(
            beat9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 30, 30));

        beat8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat8Layout = new javax.swing.GroupLayout(beat8);
        beat8.setLayout(beat8Layout);
        beat8Layout.setHorizontalGroup(
            beat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat8Layout.setVerticalGroup(
            beat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 30, 30));

        beat7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat7Layout = new javax.swing.GroupLayout(beat7);
        beat7.setLayout(beat7Layout);
        beat7Layout.setHorizontalGroup(
            beat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat7Layout.setVerticalGroup(
            beat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, 30));

        beat13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat13Layout = new javax.swing.GroupLayout(beat13);
        beat13.setLayout(beat13Layout);
        beat13Layout.setHorizontalGroup(
            beat13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat13Layout.setVerticalGroup(
            beat13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 30, 30));

        beat11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat11Layout = new javax.swing.GroupLayout(beat11);
        beat11.setLayout(beat11Layout);
        beat11Layout.setHorizontalGroup(
            beat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat11Layout.setVerticalGroup(
            beat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 30));

        beat10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat10Layout = new javax.swing.GroupLayout(beat10);
        beat10.setLayout(beat10Layout);
        beat10Layout.setHorizontalGroup(
            beat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat10Layout.setVerticalGroup(
            beat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        beat6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat6Layout = new javax.swing.GroupLayout(beat6);
        beat6.setLayout(beat6Layout);
        beat6Layout.setHorizontalGroup(
            beat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat6Layout.setVerticalGroup(
            beat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 30, 30));

        beat5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat5Layout = new javax.swing.GroupLayout(beat5);
        beat5.setLayout(beat5Layout);
        beat5Layout.setHorizontalGroup(
            beat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat5Layout.setVerticalGroup(
            beat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 30, 30));

        beat4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat4Layout = new javax.swing.GroupLayout(beat4);
        beat4.setLayout(beat4Layout);
        beat4Layout.setHorizontalGroup(
            beat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat4Layout.setVerticalGroup(
            beat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 30, 30));

        beat3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat3Layout = new javax.swing.GroupLayout(beat3);
        beat3.setLayout(beat3Layout);
        beat3Layout.setHorizontalGroup(
            beat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat3Layout.setVerticalGroup(
            beat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 30));

        beat2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat2Layout = new javax.swing.GroupLayout(beat2);
        beat2.setLayout(beat2Layout);
        beat2Layout.setHorizontalGroup(
            beat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat2Layout.setVerticalGroup(
            beat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, 30));

        beat12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat12Layout = new javax.swing.GroupLayout(beat12);
        beat12.setLayout(beat12Layout);
        beat12Layout.setHorizontalGroup(
            beat12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat12Layout.setVerticalGroup(
            beat12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 30, 30));

        beat14.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout beat14Layout = new javax.swing.GroupLayout(beat14);
        beat14.setLayout(beat14Layout);
        beat14Layout.setHorizontalGroup(
            beat14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        beat14Layout.setVerticalGroup(
            beat14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_beats.add(beat14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_sair.setText("X");
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        jPanel2.add(jb_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_beats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jp_beats, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jb_clayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clayActionPerformed
        // TODO add your handling code here:
         new Som("src/sounds/tiro.wav");
         new Colorir2().start();
    }//GEN-LAST:event_jb_clayActionPerformed

    private void jb_ufoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ufoActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/boxcomgrave.wav");
        new Colorir6().start();
    }//GEN-LAST:event_jb_ufoActionPerformed

    private void jb_bubblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bubblesActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/grave.wav");
        new Colorir1().start();
    }//GEN-LAST:event_jb_bubblesActionPerformed

    private void jb_confettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_confettiActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/box.wav");
        new Colorir3().start();
    }//GEN-LAST:event_jb_confettiActionPerformed

    private void jb_glimmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_glimmerActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/pelucia.wav");
        new Colorir4().start();
    }//GEN-LAST:event_jb_glimmerActionPerformed

    private void jb_moonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_moonActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/an.wav");
        new Colorir5().start();
    }//GEN-LAST:event_jb_moonActionPerformed

    private void jb_bubbles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bubbles1ActionPerformed
        // TODO add your handling code here:
        new Som("src/sounds/grave.wav");
        new Colorir1().start();
    }//GEN-LAST:event_jb_bubbles1ActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        // TODO add your handling code here:
        this.som.pararMusica();
        PrimeiraTela.beat = 0;
        this.dispose();
    }//GEN-LAST:event_jb_sairActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Beat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel beat1;
    private javax.swing.JPanel beat10;
    private javax.swing.JPanel beat11;
    private javax.swing.JPanel beat12;
    private javax.swing.JPanel beat13;
    private javax.swing.JPanel beat14;
    private javax.swing.JPanel beat2;
    private javax.swing.JPanel beat3;
    private javax.swing.JPanel beat4;
    private javax.swing.JPanel beat5;
    private javax.swing.JPanel beat6;
    private javax.swing.JPanel beat7;
    private javax.swing.JPanel beat8;
    private javax.swing.JPanel beat9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_bubbles;
    private javax.swing.JButton jb_bubbles1;
    private javax.swing.JButton jb_clay;
    private javax.swing.JButton jb_confetti;
    private javax.swing.JButton jb_glimmer;
    private javax.swing.JButton jb_moon;
    private javax.swing.JButton jb_sair;
    private javax.swing.JButton jb_ufo;
    private javax.swing.JPanel jp_beats;
    private javax.swing.JPanel jp_bubbles;
    private javax.swing.JPanel jp_bubbles1;
    private javax.swing.JPanel jp_clay;
    private javax.swing.JPanel jp_confetti;
    private javax.swing.JPanel jp_glimmer;
    private javax.swing.JPanel jp_moon;
    private javax.swing.JPanel jp_ufo;
    // End of variables declaration//GEN-END:variables
}
