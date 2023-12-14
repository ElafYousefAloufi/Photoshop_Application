package Pack;

import cpit380practice.*;
import java.io.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;

public class PicturesForm extends javax.swing.JFrame {

    public PicturesForm() {
        initComponents();
        bacckgroundImageLabel.setIcon(new ImageIcon("src\\pics\\Welcomee.jpg"));
        FileChooser.setMediaPath("src\\BrowsePicture");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        inputImageLabel = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        outputImg = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        grayScaleBtn = new javax.swing.JButton();
        binaryBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSliderRed = new javax.swing.JSlider();
        jSliderGreen = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RedValue = new javax.swing.JLabel();
        greenValue = new javax.swing.JLabel();
        blueValue = new javax.swing.JLabel();
        jSliderBlue = new javax.swing.JSlider();
        RedEyeBtn = new javax.swing.JButton();
        LaplacianBtn = new javax.swing.JButton();
        MaxFilter = new javax.swing.JButton();
        MinFilter = new javax.swing.JButton();
        avgFilter = new javax.swing.JButton();
        medianFilter = new javax.swing.JButton();
        edgeDetection = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LabelscaleValue = new javax.swing.JLabel();
        jLabel6Scale = new javax.swing.JLabel();
        ScaleMethod = new javax.swing.JSlider();
        Blend = new javax.swing.JButton();
        createCollage = new javax.swing.JButton();
        computingHistogram = new javax.swing.JButton();
        Background = new javax.swing.JButton();
        trashhold1 = new javax.swing.JSlider();
        trashhold2 = new javax.swing.JSlider();
        Diagonal_Reflection_BT = new javax.swing.JButton();
        DiagonalReflection_TB = new javax.swing.JButton();
        HorizontalRefliction = new javax.swing.JButton();
        VerticalRefliction = new javax.swing.JButton();
        Rotate360 = new javax.swing.JButton();
        Rotate180 = new javax.swing.JButton();
        RotateLeft = new javax.swing.JButton();
        RotateRight = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showHistogram = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        imgPixInfo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        copy = new javax.swing.JButton();
        RedEyeXY = new javax.swing.JButton();
        sliderBlending = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        croping = new javax.swing.JButton();
        drawing = new javax.swing.JButton();
        back = new javax.swing.JButton();
        bacckgroundImageLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Image Input");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        browseBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        browseBtn.setForeground(new java.awt.Color(0, 51, 102));
        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(browseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        inputPanel.setBackground(new java.awt.Color(255, 255, 255));
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        inputPanel.setPreferredSize(new java.awt.Dimension(376, 430));

        inputImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputImageLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inputImageLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jPanel1.add(inputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 400, 330));

        outputPanel.setBackground(new java.awt.Color(255, 255, 255));
        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 51, 51))); // NOI18N
        outputPanel.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputImg, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jPanel1.add(outputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 380, 330));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(0, 51, 102));
        resetBtn.setText("Reset");
        resetBtn.setActionCommand("resetBtn");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 100, -1));

        grayScaleBtn.setForeground(new java.awt.Color(0, 51, 102));
        grayScaleBtn.setText("Gray Scale");
        grayScaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayScaleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(grayScaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, 140, -1));

        binaryBtn.setForeground(new java.awt.Color(0, 51, 102));
        binaryBtn.setText("Binary");
        binaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(binaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Colors");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Red");

        jSliderRed.setMaximum(255);
        jSliderRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRedStateChanged(evt);
            }
        });

        jSliderGreen.setMaximum(255);
        jSliderGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderGreenStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Green ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Blue");

        RedValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RedValue.setForeground(new java.awt.Color(255, 0, 0));
        RedValue.setText("0");

        greenValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        greenValue.setForeground(new java.awt.Color(0, 153, 0));
        greenValue.setText("0");

        blueValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blueValue.setForeground(new java.awt.Color(0, 51, 255));
        blueValue.setText("0");

        jSliderBlue.setMaximum(255);
        jSliderBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBlueStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jSliderBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jSliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueValue, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greenValue)
                            .addComponent(RedValue))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RedValue)
                                .addGap(18, 18, 18)
                                .addComponent(greenValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(blueValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jSliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSliderBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 310, 160));

        RedEyeBtn.setForeground(new java.awt.Color(0, 51, 102));
        RedEyeBtn.setText("Remove Red Eye");
        RedEyeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedEyeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RedEyeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, -1, -1));

        LaplacianBtn.setForeground(new java.awt.Color(0, 51, 102));
        LaplacianBtn.setText("Laplacian");
        LaplacianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaplacianBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LaplacianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 140, -1));

        MaxFilter.setForeground(new java.awt.Color(0, 51, 102));
        MaxFilter.setText("Max Filter");
        MaxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxFilterActionPerformed(evt);
            }
        });
        jPanel1.add(MaxFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 130, -1));

        MinFilter.setForeground(new java.awt.Color(0, 51, 102));
        MinFilter.setText("Min Filter");
        MinFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinFilterActionPerformed(evt);
            }
        });
        jPanel1.add(MinFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 130, -1));

        avgFilter.setForeground(new java.awt.Color(0, 51, 102));
        avgFilter.setText("Avrage Filter");
        avgFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgFilterActionPerformed(evt);
            }
        });
        jPanel1.add(avgFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 130, -1));

        medianFilter.setForeground(new java.awt.Color(0, 51, 102));
        medianFilter.setText("Median Filter");
        medianFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianFilterActionPerformed(evt);
            }
        });
        jPanel1.add(medianFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 130, -1));

        edgeDetection.setForeground(new java.awt.Color(0, 51, 102));
        edgeDetection.setText("Edge Detection");
        edgeDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgeDetectionActionPerformed(evt);
            }
        });
        jPanel1.add(edgeDetection, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 130, -1));

        LabelscaleValue.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6Scale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6Scale.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6Scale.setText("Scale");

        ScaleMethod.setMaximum(4);
        ScaleMethod.setValue(2);
        ScaleMethod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ScaleMethodFocusLost(evt);
            }
        });
        ScaleMethod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ScaleMethodMouseReleased(evt);
            }
        });
        ScaleMethod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ScaleMethodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6Scale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScaleMethod, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelscaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6Scale)
                            .addComponent(ScaleMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LabelscaleValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, 330, 40));

        Blend.setForeground(new java.awt.Color(0, 51, 102));
        Blend.setText("Blending");
        Blend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlendActionPerformed(evt);
            }
        });
        jPanel1.add(Blend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 320, 30));

        createCollage.setForeground(new java.awt.Color(0, 51, 102));
        createCollage.setText("Create Collage");
        createCollage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCollageActionPerformed(evt);
            }
        });
        jPanel1.add(createCollage, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 300, -1));

        computingHistogram.setForeground(new java.awt.Color(0, 51, 102));
        computingHistogram.setText("Computing Histogram Colors");
        computingHistogram.setToolTipText("");
        computingHistogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computingHistogramActionPerformed(evt);
            }
        });
        jPanel1.add(computingHistogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 300, -1));

        Background.setForeground(new java.awt.Color(0, 51, 102));
        Background.setText("Background Subtraction ");
        Background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackgroundActionPerformed(evt);
            }
        });
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 300, -1));

        trashhold1.setValue(0);
        jPanel1.add(trashhold1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 230, -1));

        trashhold2.setValue(0);
        jPanel1.add(trashhold2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 230, -1));

        Diagonal_Reflection_BT.setForeground(new java.awt.Color(0, 51, 102));
        Diagonal_Reflection_BT.setText("Diagonal Reflection D1 (Bottom to top)");
        Diagonal_Reflection_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagonal_Reflection_BTActionPerformed(evt);
            }
        });
        jPanel1.add(Diagonal_Reflection_BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 300, -1));

        DiagonalReflection_TB.setForeground(new java.awt.Color(0, 51, 102));
        DiagonalReflection_TB.setText("Diagonal Reflection D1 (Top to bottom)");
        DiagonalReflection_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonalReflection_TBActionPerformed(evt);
            }
        });
        jPanel1.add(DiagonalReflection_TB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 300, -1));

        HorizontalRefliction.setForeground(new java.awt.Color(0, 51, 102));
        HorizontalRefliction.setText("Horizontal Refliction");
        HorizontalRefliction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizontalReflictionActionPerformed(evt);
            }
        });
        jPanel1.add(HorizontalRefliction, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 150, -1));

        VerticalRefliction.setForeground(new java.awt.Color(0, 51, 102));
        VerticalRefliction.setText("Vertical Refliction");
        VerticalRefliction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerticalReflictionActionPerformed(evt);
            }
        });
        jPanel1.add(VerticalRefliction, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 140, -1));

        Rotate360.setForeground(new java.awt.Color(0, 51, 102));
        Rotate360.setText("Rotate 360");
        Rotate360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotate360ActionPerformed(evt);
            }
        });
        jPanel1.add(Rotate360, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 150, -1));

        Rotate180.setForeground(new java.awt.Color(0, 51, 102));
        Rotate180.setText("Rotate 180");
        Rotate180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotate180ActionPerformed(evt);
            }
        });
        jPanel1.add(Rotate180, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 140, -1));

        RotateLeft.setForeground(new java.awt.Color(0, 51, 102));
        RotateLeft.setText("Rotate Left");
        RotateLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateLeftActionPerformed(evt);
            }
        });
        jPanel1.add(RotateLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 140, -1));

        RotateRight.setForeground(new java.awt.Color(0, 51, 102));
        RotateRight.setText("Rotate Right");
        RotateRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateRightActionPerformed(evt);
            }
        });
        jPanel1.add(RotateRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Threshold1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Threshold2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 630, 70, 20));

        showHistogram.setForeground(new java.awt.Color(0, 51, 102));
        showHistogram.setText("Display Histogram");
        showHistogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHistogramActionPerformed(evt);
            }
        });
        jPanel1.add(showHistogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 20));

        imgPixInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        imgPixInfo.setForeground(new java.awt.Color(0, 102, 204));
        imgPixInfo.setText("sdsd");
        jPanel1.add(imgPixInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 340, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("dsd");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 310, 20));

        copy.setForeground(new java.awt.Color(0, 51, 102));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jPanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 130, -1));

        RedEyeXY.setForeground(new java.awt.Color(0, 51, 102));
        RedEyeXY.setText("Red Eye (using coordinates)");
        RedEyeXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedEyeXYActionPerformed(evt);
            }
        });
        jPanel1.add(RedEyeXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 300, 30));

        sliderBlending.setBackground(new java.awt.Color(204, 204, 204));
        sliderBlending.setForeground(new java.awt.Color(0, 102, 204));
        sliderBlending.setMajorTickSpacing(10);
        sliderBlending.setPaintLabels(true);
        sliderBlending.setPaintTicks(true);
        sliderBlending.setSnapToTicks(true);
        sliderBlending.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sliderBlending.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBlendingStateChanged(evt);
            }
        });
        jPanel1.add(sliderBlending, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, 400, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Blending Value");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("sdsd");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 380, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("dsd");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 390, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("sdsd");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 410, 20));

        croping.setForeground(new java.awt.Color(0, 51, 102));
        croping.setText("Crop");
        croping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropingActionPerformed(evt);
            }
        });
        jPanel1.add(croping, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 130, -1));

        drawing.setForeground(new java.awt.Color(0, 51, 102));
        drawing.setText("Draw on Picture");
        drawing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawingActionPerformed(evt);
            }
        });
        jPanel1.add(drawing, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 300, -1));

        back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(0, 51, 102));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 110, -1));

        bacckgroundImageLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bacckgroundImageLabel.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(bacckgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Picture pic;
    public static Picture picture2;
    String fileName = "";
    ImageIcon displayImg2;
    static ImageIcon picturePanelBackgroun;


    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        fileName = FileChooser.pickAFile();
        pic = new Picture(fileName);
        picture2 = pic;
        inputImageLabel.setIcon(new ImageIcon(pic.getImage().getScaledInstance(inputImageLabel.getWidth(), inputImageLabel.getHeight(), Image.SCALE_SMOOTH)));
        JOptionPane.showMessageDialog(this, "Please press and release on the Left image to get coordinates for RedEye, Copy and Crop methods");
    }//GEN-LAST:event_browseBtnActionPerformed

    private void jSliderRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRedStateChanged
        if (pic != null) {
            Pixel[] pxl = pic.getPixels();
            for (int i = 0; i < pxl.length; i++) {
                int newValue = (int) (jSliderRed.getValue());
                pxl[i].setRed(newValue);
            }

            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
            RedValue.setText(jSliderRed.getValue() + "");
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jSliderRedStateChanged

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        RedValue.setText(50 + "");
        jSliderRed.setValue(50);
        greenValue.setText(50 + "");
        jSliderGreen.setValue(50);
        blueValue.setText(50 + "");
        jSliderBlue.setValue(50);
        jLabel8.setText("");
        pic = null;
        picture2 = null;
        pic = new Picture(fileName);
        outputImg.setIcon(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jSliderGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderGreenStateChanged
        if (pic != null) {
            Pixel[] pxl = pic.getPixels();
            for (int i = 0; i < pxl.length; i++) {
                int newValue = (int) (jSliderGreen.getValue());
                pxl[i].setGreen(newValue);
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
            greenValue.setText(jSliderGreen.getValue() + "");
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jSliderGreenStateChanged

    private void jSliderBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBlueStateChanged
        Pixel[] pxl = pic.getPixels();
        for (int i = 0; i < pxl.length; i++) {
            int newValue = (int) (jSliderBlue.getValue());
            pxl[i].setBlue(newValue);
        }
        outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        blueValue.setText(jSliderBlue.getValue() + "");
    }//GEN-LAST:event_jSliderBlueStateChanged

    private void grayScaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayScaleBtnActionPerformed
        if (pic != null) {
            int r, b, g, intensity;
            for (int x = 0; x < pic.getWidth(); x++) {
                for (int y = 0; y < pic.getHeight(); y++) {
                    r = pic.getPixel(x, y).getRed();
                    b = pic.getPixel(x, y).getBlue();
                    g = pic.getPixel(x, y).getGreen();

                    intensity = (r + b + g) / 3;
                    pic.getPixel(x, y).setColor(new Color(intensity, intensity, intensity));
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_grayScaleBtnActionPerformed

    private void binaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryBtnActionPerformed
        if (pic != null) {
            for (int x = 1; x < pic.getWidth() - 1; x++) {
                for (int h = 1; h < pic.getHeight() - 1; h++) {
                    if (pic.getPixel(x, h).getAverage() >= 120) {
                        pic.getPixel(x, h).setColor(new Color(255, 255, 255));
                    } else {
                        pic.getPixel(x, h).setColor(new Color(0, 0, 0));
                    }
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_binaryBtnActionPerformed

    private void RedEyeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedEyeBtnActionPerformed
        if (pic != null) {
            pic.removeRedEye(109, 91, 202, 107, java.awt.Color.black);
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RedEyeBtnActionPerformed

    private void LaplacianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaplacianBtnActionPerformed
        if (pic != null) {
            pic.grayscale();
            int width = pic.getWidth();
            int height = pic.getHeight();
            int[] pixels = new int[9];

            Picture pic2 = new Picture(width, height);

            for (int i = 1; i < width - 1; i++) {
                for (int j = 1; j < height - 1; j++) {

                    pixels[0] = (int) pic.getPixel(i - 1, j - 1).getAverage() * 1;
                    pixels[1] = (int) pic.getPixel(i - 1, j).getAverage() * 1;
                    pixels[2] = (int) pic.getPixel(i - 1, j + 1).getAverage() * 1;

                    pixels[3] = (int) pic.getPixel(i, j).getAverage() * -8;
                    pixels[4] = (int) pic.getPixel(i, j - 1).getAverage() * 1;
                    pixels[5] = (int) pic.getPixel(i, j + 1).getAverage() * 1;

                    pixels[6] = (int) pic.getPixel(i + 1, j + 1).getAverage() * 1;
                    pixels[7] = (int) pic.getPixel(i + 1, j).getAverage() * 1;
                    pixels[8] = (int) pic.getPixel(i + 1, j - 1).getAverage() * 1;

                    int newValue = (pixels[0] + pixels[1] + pixels[2] + pixels[3] + pixels[4] + pixels[5] + pixels[6] + pixels[7] + pixels[8]);

                    if (newValue < 0) {
                        newValue = 0;
                    } else if (newValue > 255) {
                        newValue = 255;
                    } else {
                        pic2.getPixel(i, j).setColor(new Color(newValue, newValue, newValue));
                    }
                }
            }
            outputImg.setIcon(new ImageIcon(pic2.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LaplacianBtnActionPerformed

    private void MaxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxFilterActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getWidth(), pic.getHeight());
            for (int x = 1; x < pic.getWidth() - 1; x++) {
                for (int y = 1; y < pic.getHeight() - 1; y++) {
                    double[] Filter = new double[9];
                    Filter[0] = pic.getPixel(x - 1, y - 1).getAverage();
                    Filter[1] = pic.getPixel(x - 1, y).getAverage();
                    Filter[2] = pic.getPixel(x - 1, y + 1).getAverage();
                    Filter[3] = pic.getPixel(x, y - 1).getAverage();
                    Filter[4] = pic.getPixel(x, y).getAverage();
                    Filter[5] = pic.getPixel(x, y + 1).getAverage();
                    Filter[6] = pic.getPixel(x + 1, y - 1).getAverage();
                    Filter[7] = pic.getPixel(x + 1, y).getAverage();
                    Filter[8] = pic.getPixel(x + 1, y + 1).getAverage();
                    Arrays.sort(Filter);
                    Color c = new Color((int) Filter[8], (int) Filter[8], (int) Filter[8]);
                    target.getPixel(x, y).setColor(c);
                }
            }
            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_MaxFilterActionPerformed

    private void avgFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgFilterActionPerformed
        if (pic != null) {
            int[] pixels = new int[9];
            int width = pic.getWidth();
            int height = pic.getHeight();
            for (int i = 1; i < width - 1; i++) {
                for (int j = 1; j < height - 1; j++) {
                    pixels[0] = (int) pic.getPixel(i - 1, j - 1).getAverage();
                    pixels[1] = (int) pic.getPixel(i - 1, j).getAverage();
                    pixels[2] = (int) pic.getPixel(i - 1, j + 1).getAverage();
                    pixels[3] = (int) pic.getPixel(i, j).getAverage();
                    pixels[4] = (int) pic.getPixel(i, j - 1).getAverage();
                    pixels[5] = (int) pic.getPixel(i, j + 1).getAverage();
                    pixels[6] = (int) pic.getPixel(i + 1, j + 1).getAverage();
                    pixels[7] = (int) pic.getPixel(i + 1, j).getAverage();
                    pixels[8] = (int) pic.getPixel(i + 1, j - 1).getAverage();
                    int newValue = (pixels[0] + pixels[1] + pixels[2] + pixels[3] + pixels[4] + pixels[5] + pixels[6] + pixels[7] + pixels[8]);
                    newValue = newValue / 9;
                    pic.getPixel(i, j).setColor(new Color(newValue, newValue, newValue));
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_avgFilterActionPerformed

    private void medianFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianFilterActionPerformed
        if (pic != null) {
            int[] Color = new int[9];
            for (int i = 1; i < pic.getWidth() - 1; i++) {
                for (int j = 1; j < pic.getHeight() - 1; j++) {
                    Color[0] = (int) pic.getPixel(i, j).getAverage();
                    Color[1] = (int) pic.getPixel(i - 1, j - 1).getAverage();
                    Color[2] = (int) pic.getPixel(i, j - 1).getAverage();
                    Color[3] = (int) pic.getPixel(i + 1, j - 1).getAverage();
                    Color[4] = (int) pic.getPixel(i + 1, j).getAverage();
                    Color[5] = (int) pic.getPixel(i - 1, j).getAverage();
                    Color[6] = (int) pic.getPixel(i - 1, j + 1).getAverage();
                    Color[7] = (int) pic.getPixel(i, j + 1).getAverage();
                    Color[8] = (int) pic.getPixel(i + 1, j + 1).getAverage();
                    Arrays.sort(Color);
                    int n = (int) Color.length / 2;
                    pic.getPixel(i, j).setColor(new Color(Color[n], Color[n], Color[n]));
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_medianFilterActionPerformed

    private void edgeDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edgeDetectionActionPerformed
        if (pic != null) {
            Pixel topPixel, bottomPixel = null;
            double topAvg, bottomAvg;
            int endY = pic.getHeight() - 1;
            for (int y = 0; y < endY; y++) {
                for (int x = 0; x < pic.getWidth(); x++) {
                    topPixel = pic.getPixel(x, y);
                    bottomPixel = pic.getPixel(x, y + 1);
                    topAvg = topPixel.getAverage();
                    bottomAvg = bottomPixel.getAverage();
                    if (Math.abs(topAvg - bottomAvg) < 10.0) {
                        topPixel.setColor(Color.WHITE);
                    } else {
                        topPixel.setColor(Color.BLACK);
                    }
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_edgeDetectionActionPerformed

    private void ScaleMethodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ScaleMethodFocusLost

    }//GEN-LAST:event_ScaleMethodFocusLost

    private void ScaleMethodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ScaleMethodKeyReleased

    }//GEN-LAST:event_ScaleMethodKeyReleased

    private void ScaleMethodMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScaleMethodMouseReleased
        if (pic != null) {
            int scaleValue = ScaleMethod.getValue();
            switch (scaleValue) {
                case 0:
                    pic = scaleDown(3, pic);
                    LabelscaleValue.setText(scaleValue + "");
                    break;
                case 1:
                    pic = scaleDown(2, pic);
                    LabelscaleValue.setText(scaleValue + "");
                    break;
                case 3:
                    pic = scaleUp(2, pic);
                    LabelscaleValue.setText(scaleValue + "");
                    break;
                case 4:
                    pic = scaleUp(3, pic);
                    LabelscaleValue.setText(scaleValue + "");
                    break;
                default:
                    break;
            }
            ScaleMethod.setValue(2);
            outputImg.setIcon(new ImageIcon(pic.getImage()));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ScaleMethodMouseReleased

    private void BlendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlendActionPerformed
        if (pic != null) {
            picture2 = new Picture(FileChooser.pickAFile());
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BlendActionPerformed
    private void PlotHistogram(String color, Pixel_LL Histogram[]) {
        // first must find the max height of the histogram.
        int maxHeight = 0;
        for (int i = 0; i < Histogram.length; i++) {
            if (Histogram[i].getTotal() > maxHeight) {
                maxHeight = Histogram[i].getTotal();
            }
        }

        Picture histogram = new Picture(256, 256, Color.white);

        Color c;
        if (color.equalsIgnoreCase("RED")) {
            c = Color.RED;
        } else if (color.equalsIgnoreCase("green")) {
            c = Color.GREEN;
        } else if (color.equalsIgnoreCase("BLue")) {
            c = Color.BLUE;
        } else {
            c = Color.GRAY;
        }

        // Actual max = maxHeight
        // the max we want to make is 512 so it become visible
        for (int i = 0; i < 256; i++) { // now plot the histogram
            int max = (int) (Histogram[i].getTotal() * 256 / maxHeight);
            for (int j = 255; j >= (256 - max); j--) {
                histogram.getPixel(i, j).setColor(c);
            }
        }
        histogram.scaleUp(2).show();
    }
    private void createCollageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCollageActionPerformed
        if (pic != null) {
            Picture w = whitePicture();

            Picture p = ScaleDownAuto();

            int tx = pic.getWidth() - p.getWidth();
            int ty = pic.getHeight() - p.getHeight();

            // central white board
            int cx = w.getWidth() / 2;
            int cy = w.getHeight() / 2;

            // central picture
            int cpx = p.getWidth() / 2;
            int cpy = p.getHeight() / 2;

            // central
            w.copy(p, 0, 0, p.getWidth(), p.getHeight(), cx - cpx, cy - cpy);

            // top left up corner
            pic.copy(p, 0, 0, p.getWidth(), p.getHeight(), 0, 0);
            w.copy(p, 0, 0, p.getWidth(), p.getHeight(), 0, 0);

            // top left down corner
            pic.copy(p, 0, 0, p.getWidth(), p.getHeight(), 0, ty);
            w.copy(p, 0, 0, p.getWidth(), p.getHeight(), 0, ty);

            // top right up corner
            pic.copy(p, 0, 0, p.getWidth(), p.getHeight(), tx, 0);
            w.copy(p, 0, 0, p.getWidth(), p.getHeight(), tx, 0);

            // top right down corner
            pic.copy(p, 0, 0, p.getWidth(), p.getHeight(), tx, ty);
            w.copy(p, 0, 0, p.getWidth(), p.getHeight(), tx, ty);
            outputImg.setIcon(new ImageIcon(w.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createCollageActionPerformed

    private Pixel_LL[][] ComputeHistograms() {

        Pixel_LL[][] Histograms = new Pixel_LL[3][256]; // [0] red, [1] green [2] blue

        int maxR = 0;
        int maxR_index = 0;
        int maxG = 0;
        int maxG_index = 0;
        int maxB = 0;
        int maxB_index = 0;

        for (int i = 0; i < 256; i++) { // Inisilazing all the arrays
            Histograms[0][i] = new Pixel_LL();
            Histograms[1][i] = new Pixel_LL();
            Histograms[2][i] = new Pixel_LL();
        }
        for (int i = 0; i < pic.getWidth(); i++) {
            for (int j = 0; j < pic.getHeight(); j++) {
                int intensityR = pic.getPixel(i, j).getRed();
                int intensityG = pic.getPixel(i, j).getGreen();
                int intensityB = pic.getPixel(i, j).getBlue();
                Histograms[0][intensityR].addPixel(new PixelLinkedList_node(i, j));
                Histograms[1][intensityG].addPixel(new PixelLinkedList_node(i, j));
                Histograms[2][intensityB].addPixel(new PixelLinkedList_node(i, j));

                if (Histograms[0][intensityR].getTotal() > maxR) {
                    maxR = Histograms[0][intensityR].getTotal();
                    maxR_index = intensityR;
                }
                if (Histograms[1][intensityG].getTotal() > maxG) {
                    maxG = Histograms[1][intensityG].getTotal();
                    maxG_index = intensityG;
                }
                if (Histograms[2][intensityB].getTotal() > maxB) {
                    maxB = Histograms[2][intensityB].getTotal();
                    maxB_index = intensityB;
                }
            }
        }
        // ***plotting the histogrmas***
        if ((maxR == maxG && maxR == maxB)) {// image is gray
            if ((maxR_index == maxG_index && maxG_index == maxB_index)) {
                PlotHistogram("Gray", Histograms[0]);
                return Histograms;
            }
        }
        PlotHistogram("RED", Histograms[0]);
        PlotHistogram("GREEN", Histograms[1]);
        PlotHistogram("BLUE", Histograms[2]);
        return Histograms;
    }

    private void computingHistogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computingHistogramActionPerformed
        ComputeHistograms();
    }//GEN-LAST:event_computingHistogramActionPerformed

    private void Background_Subtraction(int[] values, Picture oldBackground, Picture newBackground) {
        Pixel picPixel = null;
        Pixel oldPixel = null;
        Pixel newPixel = null;
        Pack.Grid grid = new Pack.Grid();
        grid.setTargts(pic); // as the original pic as first target.
        for (int i = 0; i < values.length; i++) {
            Picture copyPic = new Picture(pic);//take a copy of the original pic
            for (int x = 0; x < copyPic.getWidth(); x++) {
                for (int y = 0; y < copyPic.getHeight(); y++) {
                    picPixel = copyPic.getPixel(x, y);
                    oldPixel = oldBackground.getPixel(x, y);
                    newPixel = newBackground.getPixel(x, y);
                    //compare the orignal image with the old background
                    if (picPixel.colorDistance(oldPixel.getColor()) < values[i]) {
                        picPixel.setColor(newPixel.getColor());
                    }
                }
            }
            grid.setTargts(copyPic);//add the image to the grid
        }
        grid.setVisible(true);
        grid.DisplayEdges();
    }

    private void BackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackgroundActionPerformed
        if (pic != null) {
            FileChooser.setMediaPath("src\\BrowsePicture");
            if (trashhold1.getValue() > 0 && trashhold2.getValue() > 0) {
                JFileChooser FileChooser = new JFileChooser();
                int conf = JOptionPane.showConfirmDialog(null, "Choose old background image", "Choose Old Background", JOptionPane.OK_CANCEL_OPTION);
                if (conf == 0) {
                    int val = FileChooser.showOpenDialog(null);
                    if (val == JFileChooser.APPROVE_OPTION) {
                        Picture oldBackground = new Picture(FileChooser.getSelectedFile().getAbsolutePath());
                        conf = JOptionPane.showConfirmDialog(null, "Choose new background image", "Choose New Background", JOptionPane.OK_CANCEL_OPTION);
                        if (conf == 0) {
                            val = FileChooser.showOpenDialog(null);
                            if (val == JFileChooser.APPROVE_OPTION) {

                                Picture newBackground = new Picture(FileChooser.getSelectedFile().getAbsolutePath());
                                if (pic.getHeight() <= newBackground.getHeight() && pic.getWidth() <= newBackground.getWidth()) {
                                    int[] values = new int[2];
                                    values[0] = trashhold1.getValue();
                                    values[1] = trashhold2.getValue();
                                    Background_Subtraction(values, oldBackground, newBackground);
                                } else {
                                    JOptionPane.showMessageDialog(null, "New Background Size must be >= Picture Size", "Error", JOptionPane.ERROR_MESSAGE);

                                }

                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please adjust the trashhold > 0", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BackgroundActionPerformed

    private void Diagonal_Reflection_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagonal_Reflection_BTActionPerformed
        if (pic != null) {
            Pixel leftPixel = null;
            Pixel rightPixel = null;
            for (int y = 1; y < pic.getHeight(); y++) {
                for (int x = 0; x < y; x++) {
                    leftPixel = pic.getPixel(x, y);
                    rightPixel = pic.getPixel(y, x);
                    rightPixel.setColor(leftPixel.getColor());
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_Diagonal_Reflection_BTActionPerformed

    private void DiagonalReflection_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonalReflection_TBActionPerformed
        if (pic != null) {
            Pixel leftPixel = null;
            Pixel rightPixel = null;
            for (int y = 1; y < pic.getHeight(); y++) {
                for (int x = 0; x < y; x++) {
                    rightPixel = pic.getPixel(x, y);
                    leftPixel = pic.getPixel(y, x);
                    rightPixel.setColor(leftPixel.getColor());
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_DiagonalReflection_TBActionPerformed

    private void HorizontalReflictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizontalReflictionActionPerformed
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int x = 0; x < pic.getHeight(); x++) {
                int target_x = pic.getWidth() - 1;
                int source_x = 0;
                while (target_x > source_x) {
                    Pixel source_Pixel = pic.getPixel(source_x, x);
                    Pixel target_Pixel = pic.getPixel(target_x, x);
                    target_Pixel.setColor(source_Pixel.getColor());
                    target_x--;
                    source_x++;
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_HorizontalReflictionActionPerformed

    private void VerticalReflictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerticalReflictionActionPerformed
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int source_y = 0;
            int target_y = pic.getHeight() - 1;
            while (target_y > source_y) {
                for (int x = 0; x < pic.getWidth(); x++) {
                    Pixel source_Pixel = pic.getPixel(x, source_y);
                    Pixel target_Pixel = pic.getPixel(x, target_y);
                    target_Pixel.setColor(source_Pixel.getColor());
                }
                target_y--;
                source_y++;
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_VerticalReflictionActionPerformed

    private void Rotate360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotate360ActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getWidth(), pic.getHeight());
          target = pic.rotate(360);
            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));

        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Rotate360ActionPerformed

    private void Rotate180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotate180ActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getWidth(), pic.getHeight());
            Pixel startPixel = null;
            Pixel endPixel = null;
            for (int y = 0; y < pic.getHeight(); y++) {
                for (int x = 0; x < pic.getWidth(); x++) {
                    startPixel = target.getPixel(x, y);
                    endPixel = pic.getPixel(pic.getWidth() - 1 - x, pic.getHeight() - 1 - y);
                    startPixel.setColor(endPixel.getColor());
                }
            }

            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_Rotate180ActionPerformed

    private void RotateLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateLeftActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getHeight(), pic.getWidth());
            Pixel sourcePixel = null;
            Pixel targetPixel = null;

            // loop through the columns
            for (int x = 0; x < pic.getWidth(); x++) {
                // loop through the rows
                for (int y = 0; y < pic.getHeight(); y++) {
                    // set the target pixel color to the source pixel color
                    sourcePixel = pic.getPixel(x, y);
                    targetPixel = target.getPixel(y, pic.getWidth() - 1 - x);
                    targetPixel.setColor(sourcePixel.getColor());
                }
            }
            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RotateLeftActionPerformed

    private void RotateRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateRightActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getHeight(), pic.getWidth());
            Pixel sourcePixel = null;
            Pixel targetPixel = null;

            // loop through the columns
            for (int x = 0; x < pic.getWidth(); x++) {
                // loop through the rows
                for (int y = 0; y < pic.getHeight(); y++) {
                    // set the target pixel color to the source pixel color
                    sourcePixel = pic.getPixel(x, y);
                    targetPixel = target.getPixel(pic.getHeight() - 1 - y, x);
                    targetPixel.setColor(sourcePixel.getColor());
                }
            }
            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RotateRightActionPerformed

    private void MinFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinFilterActionPerformed
        if (pic != null) {
            Picture target = new Picture(pic.getWidth(), pic.getHeight());
            for (int x = 1; x < pic.getWidth() - 1; x++) {
                for (int y = 1; y < pic.getHeight() - 1; y++) {
                    double[] Filter = new double[9];
                    Filter[0] = pic.getPixel(x - 1, y - 1).getAverage();
                    Filter[1] = pic.getPixel(x - 1, y).getAverage();
                    Filter[2] = pic.getPixel(x - 1, y + 1).getAverage();
                    Filter[3] = pic.getPixel(x, y - 1).getAverage();
                    Filter[4] = pic.getPixel(x, y).getAverage();
                    Filter[5] = pic.getPixel(x, y + 1).getAverage();
                    Filter[6] = pic.getPixel(x + 1, y - 1).getAverage();
                    Filter[7] = pic.getPixel(x + 1, y).getAverage();
                    Filter[8] = pic.getPixel(x + 1, y + 1).getAverage();
                    Arrays.sort(Filter);
                    Color c = new Color((int) Filter[0], (int) Filter[0], (int) Filter[0]);
                    target.getPixel(x, y).setColor(c);
                }
            }
            outputImg.setIcon(new ImageIcon(target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_MinFilterActionPerformed


    private void showHistogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHistogramActionPerformed
        Picture pic1 = pic;
        int h = -1;
        int iValue = 0;
        int[] arrFreq = new int[256];
        Pixel pixel = null;
        for (int x = 1; x < pic1.getWidth(); x++) {
            for (int y = 1; y < pic1.getHeight(); y++) {
                pixel = pic1.getPixel(x, y);
                iValue = (int) Math.round((pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3);
                arrFreq[iValue]++;
            }
        }
        for (int i = 0; i < arrFreq.length; i++) {
            if (h < arrFreq[i]) {
                h = arrFreq[i];
            }
        }

        Picture picH = new Picture(300, h + 20);
        Graphics graph = picH.getGraphics();
        graph.setColor(Color.black);

        for (int i = 0; i < arrFreq.length; i++) {
            graph.drawLine(i, picH.getHeight(), i, picH.getHeight() - arrFreq[i]);
        }
        outputImg.setIcon(new ImageIcon(picH.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        jLabel8.setText(picH.getWidth() + "x" + picH.getHeight() + " pixels");

    }//GEN-LAST:event_showHistogramActionPerformed

    int x1;
    int x2;
    int y1;
    int y2;

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Picture Target = new Picture(pic.getWidth(), pic.getHeight());
            Pixel targetPixel;
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    targetPixel = Target.getPixel(x, y);
                    targetPixel.setColor(pic.getPixel(x, y).getColor());
                }
            }
            outputImg.setIcon(new ImageIcon(Target.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_copyActionPerformed

    private void RedEyeXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedEyeXYActionPerformed
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double W = (pic.getWidth() * 1.00 / outputImg.getWidth());
            double H = (pic.getHeight() * 1.00 / outputImg.getHeight());

            x1 = (int) (W * x1);
            x2 = (int) (W * x2);
            y1 = (int) (H * y1);
            y2 = (int) (H * y2);

            Color newColor = JColorChooser.showDialog(null, "Choose New Color", Color.BLACK);
            int trashhold = Integer.parseInt(JOptionPane.showInputDialog("TrashHold?"));
            for (int i = y1; i < y2; i++) {
                for (int j = x1; j < x2; j++) {
                    Pixel p = pic.getPixel(j, i);
                    //here we compare because get the different between Red color amd pxl .
                    if (p.colorDistance(Color.RED) < trashhold) {
                        p.setColor(newColor);
                    }
                }
            }
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        }


    }//GEN-LAST:event_RedEyeXYActionPerformed

    public void pixelsInformationDisplay() {
        Pixel[] pix = pic.getPixels();
        int avgBlue = 0, avgGreen = 0, avgRed = 0;
        for (int i = 0; i < pix.length; i++) {
            avgBlue += pix[i].getBlue();
            avgGreen += pix[i].getGreen();
            avgRed += pix[i].getRed();
        }
        jLabel9.setText("Picture widthxHeight: " + pic.getWidth() + "x" + pic.getHeight());
        jLabel11.setText("Picture RGB Avrage: ");
        jLabel13.setText(avgRed + ", " + avgGreen + ", " + avgBlue);
        imgPixInfo.setText("Pixel Width x Height: " + pic.getPixel(x1, y1).getX() + "x" + pic.getPixel(x1, y1).getY());
        jLabel10.setText("Pixel Colors: " + pic.getPixel(x1, y1).getRed() + ", " + pic.getPixel(x1, y1).getGreen() + ", " + pic.getPixel(x1, y1).getBlue());
    }

    private void inputImageLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputImageLabelMousePressed
        x1 = evt.getX();
        y1 = evt.getY();
        pixelsInformationDisplay();
    }//GEN-LAST:event_inputImageLabelMousePressed

    private void inputImageLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputImageLabelMouseReleased
        x2 = evt.getX();
        y2 = evt.getY();
    }//GEN-LAST:event_inputImageLabelMouseReleased

    private void sliderBlendingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBlendingStateChanged
        Picture pic1 = pic;

        int sValue = (int) sliderBlending.getValue();
        double Copy = (100 - sValue) / 2;
        double blend = 100 - Copy;

        Copy = Copy / 100;
        blend = blend / 100;

        Picture targert = new Picture(pic1.getWidth(), pic1.getHeight());
        Pixel pixel1 = null;
        Pixel pixel2 = null;
        Pixel targetPixel = null;

        // copy the first pic1
        int end1 = (int) (pic1.getWidth() * Copy);
        for (int x = 0; x < end1; x++) {
            for (int y = 0; y < pic1.getHeight(); y++) {
                pixel1 = pic1.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(pixel1.getColor());
            }
        }

        // now blend pic1 and pic2
        int end2 = (int) (pic1.getWidth() * blend);
        for (int x = end1; x < end2; x++) {
            for (int y = 0; y < pic1.getHeight(); y++) {
                pixel1 = pic1.getPixel(x, y);
                pixel2 = picture2.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(new Color(pixel1.getRed() / 2
                        + pixel2.getRed() / 2,
                        pixel1.getGreen() / 2
                        + pixel2.getGreen() / 2,
                        pixel1.getBlue() / 2
                        + pixel2.getBlue() / 2));
            }
        }

        // copy pic2
        for (int x = end2; x < picture2.getWidth(); x++) {
            for (int y = 0; y < picture2.getHeight(); y++) {
                pixel2 = picture2.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(pixel2.getColor());
            }
        }

        outputImg.setIcon(new ImageIcon(targert.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_sliderBlendingStateChanged

    private void cropingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropingActionPerformed
        if (pic == null) {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            pic.cropPic(x1, y1, x2, y2);
            outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputImg.getWidth(), outputImg.getHeight(), Image.SCALE_SMOOTH)));
        }

    }//GEN-LAST:event_cropingActionPerformed

    private void myDrawRectangle(int Sx, int Sy, int W, int H) {
        Graphics2D g2 = (Graphics2D) pic.getGraphics();
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(3));
//        g2.drawOval(x1, y1, 10, 10);
        g2.drawLine(x1, y1, x2, y2);

    }

    private void drawingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawingActionPerformed
        // TODO add your handling code here:
        if (pic != null) {
            inputImageLabel.addMouseListener(new MouseAdapter() {
                public void MousePessed(MouseEvent me) {
                    x1 = me.getX();
                    y1 = me.getY();
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    x2 = me.getX();
                    y2 = me.getY();
                    myDrawRectangle(x1, y1, x2, y2);
                    outputImg.setIcon(new ImageIcon(pic.getImage().getScaledInstance(outputPanel.getWidth(), outputPanel.getHeight(), Image.SCALE_SMOOTH)));
                    inputImageLabel.removeMouseListener(this);
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "Select an image please!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_drawingActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.toBack();
        this.setVisible(false);
        Welcompage p = new Welcompage();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_backActionPerformed

    int Xaxis = 0;
    int Yaxis = 0;

    public Picture scaleUp(int numTimes, Picture pic) {
        Picture targetPicture = new Picture(pic.getWidth() * numTimes, pic.getHeight() * numTimes);
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        int targetX, targetY;

        // loop through the source picture columns
        for (int sourceX = 0;
                sourceX < pic.getWidth();
                sourceX++) {
            // loop through the source picture rows
            for (int sourceY = 0;
                    sourceY < pic.getHeight();
                    sourceY++) {
                // get the source pixel
                sourcePixel = pic.getPixel(sourceX, sourceY);

                // loop copying to the target y
                for (int indexY = 0; indexY < numTimes; indexY++) {
                    // loop copying to the target x
                    for (int indexX = 0; indexX < numTimes; indexX++) {
                        targetX = sourceX * numTimes + indexX;
                        targetY = sourceY * numTimes + indexY;
                        targetPixel = targetPicture.getPixel(targetX, targetY);
                        targetPixel.setColor(sourcePixel.getColor());
                    }
                }
            }
        }

        return targetPicture;

    }

    public Picture scaleDown(int numTimes, Picture pic) {
        Picture targetPicture = new Picture(pic.getWidth(), pic.getHeight());
        Pixel sourcePixel, targetPixel;
        // loop through the source picture columns
        for (int sourceX = 0, targetX = 0; sourceX < targetPicture.getWidth(); sourceX += numTimes, targetX++) {

            for (int sourceY = 0, targetY = 0; sourceY < targetPicture.getHeight(); sourceY += numTimes, targetY++) {

                sourcePixel = pic.getPixel(sourceX, sourceY);

                targetPixel = targetPicture.getPixel(targetX, targetY);

                targetPixel.setColor(sourcePixel.getColor());

            }
        }

        return targetPicture;

    }

    public void removeRedEye(int startX, int startY, int endX, int endY, Color newColor) {
        /* loop through the pixels in the rectangle defined by the startX, startY, and endX and endY */
        for (int x = startX; x < endX; x++) {
            for (int y = startY; y < endY; y++) {
                // if the color is near red then change it
                if (pic.getPixel(x, y).colorDistance(Color.red) < 167) {
                    pic.getPixel(x, y).setColor(newColor);
                }
            }
        }
    }

    private Picture whitePicture() {
        Picture p = new Picture(pic);
        Pixel[] ps = p.getPixels();
        for (Pixel p1 : ps) {
            p1.setColor(Color.WHITE);
        }
        return p;
    }

    private Picture ScaleDownAuto() {
        int ip = 3;

        Picture tPicture = new Picture(pic.getWidth() / ip, pic.getHeight() / ip);
        for (int Sx = 0, Tx = 0; Tx < tPicture.getWidth() - 1; Sx += ip, Tx++) {
            for (int Sy = 0, Ty = 0; Ty < tPicture.getHeight() - 1; Sy += ip, Ty++) {
                Pixel Spixel = pic.getPixel(Sx, Sy);
                Pixel Tpixal = tPicture.getPixel(Tx, Ty);
                Tpixal.setColor(Spixel.getColor());
            }
        }

        return tPicture;

    }

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(PicturesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PicturesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PicturesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PicturesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PicturesForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Background;
    private javax.swing.JButton Blend;
    private javax.swing.JButton DiagonalReflection_TB;
    private javax.swing.JButton Diagonal_Reflection_BT;
    private javax.swing.JButton HorizontalRefliction;
    private javax.swing.JLabel LabelscaleValue;
    private javax.swing.JButton LaplacianBtn;
    private javax.swing.JButton MaxFilter;
    private javax.swing.JButton MinFilter;
    private javax.swing.JButton RedEyeBtn;
    private javax.swing.JButton RedEyeXY;
    private javax.swing.JLabel RedValue;
    private javax.swing.JButton Rotate180;
    private javax.swing.JButton Rotate360;
    private javax.swing.JButton RotateLeft;
    private javax.swing.JButton RotateRight;
    private javax.swing.JSlider ScaleMethod;
    private javax.swing.JButton VerticalRefliction;
    private javax.swing.JButton avgFilter;
    private static javax.swing.JLabel bacckgroundImageLabel;
    private javax.swing.JButton back;
    private javax.swing.JButton binaryBtn;
    private javax.swing.JLabel blueValue;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton computingHistogram;
    private javax.swing.JButton copy;
    private javax.swing.JButton createCollage;
    private javax.swing.JButton croping;
    private javax.swing.JButton drawing;
    private javax.swing.JButton edgeDetection;
    private javax.swing.JButton grayScaleBtn;
    private javax.swing.JLabel greenValue;
    private javax.swing.JLabel imgPixInfo;
    private javax.swing.JLabel inputImageLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6Scale;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSliderBlue;
    private javax.swing.JSlider jSliderGreen;
    private javax.swing.JSlider jSliderRed;
    private javax.swing.JButton medianFilter;
    private javax.swing.JLabel outputImg;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton showHistogram;
    private javax.swing.JSlider sliderBlending;
    private javax.swing.JSlider trashhold1;
    private javax.swing.JSlider trashhold2;
    // End of variables declaration//GEN-END:variables
}
