package Pack;

import cpit380practice.FileChooser;
import cpit380practice.Picture;
import cpit380practice.Sound;
import cpit380practice.SoundSample;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SoundForm extends javax.swing.JFrame {

    public static int delay;
    static Sound sound;
    static Sound sound2;

    public SoundForm() {
        initComponents();
        FileChooser.setMediaPath("MediaSources\\");
        icon.setIcon(new ImageIcon(new Picture("src\\pics\\insert-file.png").getImage().getScaledInstance(jPanel2icon.getWidth(), jPanel2icon.getHeight(), Image.SCALE_SMOOTH)));
        backgroundicon1.setIcon(new ImageIcon("src\\pics\\Welcomee.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        browseSound = new javax.swing.JButton();
        splice = new javax.swing.JButton();
        blend_to_sound = new javax.swing.JButton();
        reverse = new javax.swing.JButton();
        mirror = new javax.swing.JButton();
        avgFilter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2icon = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        playBtn = new javax.swing.JButton();
        lengthLabel = new javax.swing.JLabel();
        clipPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startField = new javax.swing.JTextField();
        endField = new javax.swing.JTextField();
        clip = new javax.swing.JButton();
        volPanle = new javax.swing.JPanel();
        Increasing_the_sound_volume = new javax.swing.JButton();
        Decreasing_the_sound_volume = new javax.swing.JButton();
        ChangeVolume = new javax.swing.JSlider();
        spread_squeeze = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        backgroundicon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Insert Sound");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        browseSound.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        browseSound.setForeground(new java.awt.Color(0, 51, 102));
        browseSound.setText("Browse");
        browseSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseSoundActionPerformed(evt);
            }
        });
        jPanel1.add(browseSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 30));

        splice.setText("Splice");
        splice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spliceActionPerformed(evt);
            }
        });
        jPanel1.add(splice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 250, -1));

        blend_to_sound.setText("Blend");
        blend_to_sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blend_to_soundActionPerformed(evt);
            }
        });
        jPanel1.add(blend_to_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, -1));

        reverse.setText("Reverse");
        reverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseActionPerformed(evt);
            }
        });
        jPanel1.add(reverse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 130, -1));

        mirror.setText("Mirror");
        mirror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirrorActionPerformed(evt);
            }
        });
        jPanel1.add(mirror, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, -1));

        avgFilter.setText("Avrage Filter");
        avgFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgFilterActionPerformed(evt);
            }
        });
        jPanel1.add(avgFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 130, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Edit Sound");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jPanel2icon.setPreferredSize(new java.awt.Dimension(100, 100));

        icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2iconLayout = new javax.swing.GroupLayout(jPanel2icon);
        jPanel2icon.setLayout(jPanel2iconLayout);
        jPanel2iconLayout.setHorizontalGroup(
            jPanel2iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2iconLayout.setVerticalGroup(
            jPanel2iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        playBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playBtn.setForeground(new java.awt.Color(0, 51, 102));
        playBtn.setText("Play");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        jPanel1.add(playBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 110, -1));

        lengthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lengthLabel.setText("sound length");
        jPanel1.add(lengthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, 40));

        clipPanel.setBackground(new java.awt.Color(226, 226, 255));
        clipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Set a specific range to clip the sound");
        clipPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel5.setText("start");
        clipPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 20));

        jLabel6.setText("end");
        clipPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 30, 20));
        clipPanel.add(startField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, -1));
        clipPanel.add(endField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 50, -1));

        clip.setText("Clip");
        clip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clipActionPerformed(evt);
            }
        });
        clipPanel.add(clip, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        jPanel1.add(clipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 290, 120));

        volPanle.setBackground(new java.awt.Color(226, 226, 255));

        Increasing_the_sound_volume.setForeground(new java.awt.Color(0, 51, 102));
        Increasing_the_sound_volume.setText("+ve");
        Increasing_the_sound_volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Increasing_the_sound_volumeActionPerformed(evt);
            }
        });

        Decreasing_the_sound_volume.setForeground(new java.awt.Color(0, 51, 102));
        Decreasing_the_sound_volume.setText("-ve");
        Decreasing_the_sound_volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decreasing_the_sound_volumeActionPerformed(evt);
            }
        });

        ChangeVolume.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ChangeVolume.setForeground(new java.awt.Color(0, 102, 204));
        ChangeVolume.setMajorTickSpacing(1);
        ChangeVolume.setMaximum(6);
        ChangeVolume.setPaintLabels(true);
        ChangeVolume.setToolTipText("");
        ChangeVolume.setValue(3);
        ChangeVolume.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout volPanleLayout = new javax.swing.GroupLayout(volPanle);
        volPanle.setLayout(volPanleLayout);
        volPanleLayout.setHorizontalGroup(
            volPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volPanleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangeVolume, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(volPanleLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Decreasing_the_sound_volume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Increasing_the_sound_volume)
                .addGap(37, 37, 37))
        );
        volPanleLayout.setVerticalGroup(
            volPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volPanleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangeVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(volPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Increasing_the_sound_volume)
                    .addComponent(Decreasing_the_sound_volume))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(volPanle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 290, 80));

        spread_squeeze.setText("Spread & Squeeze");
        spread_squeeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spread_squeezeActionPerformed(evt);
            }
        });
        jPanel1.add(spread_squeeze, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 250, 30));

        Back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 51, 102));
        Back.setText("Back");
        Back.setMaximumSize(new java.awt.Dimension(85, 27));
        Back.setMinimumSize(new java.awt.Dimension(85, 27));
        Back.setPreferredSize(new java.awt.Dimension(85, 27));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, 30));
        jPanel1.add(backgroundicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        icon.setIcon(new ImageIcon(new Picture("src\\pics\\radio-waves.png").getImage().getScaledInstance(jPanel2icon.getWidth(), jPanel2icon.getHeight(), Image.SCALE_SMOOTH)));
        sound.play();

    }//GEN-LAST:event_playBtnActionPerformed

    private void reverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseActionPerformed
        int length = sound.getLength();
        // loop through the samples
        for (int targetIndex = 0, sourceIndex = length - 1;
                targetIndex < length && sourceIndex > 0;
                targetIndex++, sourceIndex--) {
            sound.setSampleValueAt(targetIndex,
                    sound.getSampleValueAt(sourceIndex));
        }
    }//GEN-LAST:event_reverseActionPerformed

    private void blend_to_soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blend_to_soundActionPerformed
        Sound s1 = sound;
        JFrame parent = new JFrame();
        JOptionPane.showMessageDialog(parent, "Choose a second sound");
        Sound s2 = new Sound(FileChooser.pickAFile());
        Sound soundTarget = new Sound(s1.getLength() + s2.getLength());

        int value = 0;

        for (int index = 0; index < (s1.getLength() / 2); index++) {
            soundTarget.setSampleValueAt(index, s1.getSampleValueAt(index));
        }

        for (int index = 0; index < (s1.getLength() / 2) && index < (s2.getLength() / 2); index++) {
            value = (int) ((s1.getSampleValueAt(index + (s1.getLength() / 2)) * 0.5) + (s2.getSampleValueAt(index) * 0.5));
            soundTarget.setSampleValueAt(index + (s1.getLength() / 2), value);
        }

        sound = soundTarget;

    }//GEN-LAST:event_blend_to_soundActionPerformed

    private void clipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clipActionPerformed
        {
            //calculate the number of samples in the clip
            int start = Integer.parseInt(startField.getText());
            int end = Integer.parseInt(endField.getText());
            int lengthInSamples = end - start + 1;
            Sound target = new Sound(lengthInSamples); // hold clip
            int value; // holds the current sample value
            int targetIndex = 0; // index in target sound
            // copy from start to end from source into target
            for (int i = start; i <= end; i++, targetIndex++) {
                value = sound.getSampleValueAt(i);
                target.setSampleValueAt(targetIndex, value);
            }
            sound = target;
        }
    }//GEN-LAST:event_clipActionPerformed

    private void spliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spliceActionPerformed
        Sound sound1 = sound;
        JFrame parent = new JFrame();
        JOptionPane.showMessageDialog(parent, "Choose a second sound");
        Sound sounnd2 = new Sound(FileChooser.pickAFile());
        Sound target = new Sound("src\\SoundBrowse\\sec3silence.wav"); // hold clip
        int targetIndex = 0; // the starting place on the target
        int value;
        // copy all of sound 1 into the current sound (target)
        for (int i = 0; i < sound1.getLength(); i++, targetIndex++) {
            value = sound1.getSampleValueAt(i);
            target.setSampleValueAt(targetIndex, value);
        }
        for (int i = 0; i < (int) (target.getSamplingRate() * 0.1); i++, targetIndex++) {
            target.setSampleValueAt(targetIndex, 0);
        }
        //copy all of sound 2 into the current sound (target)
        for (int i = 0; i < sounnd2.getLength(); i++, targetIndex++) {
            value = sounnd2.getSampleValueAt(i);
            target.setSampleValueAt(targetIndex, value);
        }
        sound = target;
    }//GEN-LAST:event_spliceActionPerformed

    private void browseSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSoundActionPerformed
        sound = new Sound(FileChooser.pickAFile());
        icon.setIcon(new ImageIcon(new Picture("src\\pics\\enable-sound.png").getImage().getScaledInstance(jPanel2icon.getWidth(), jPanel2icon.getHeight(), Image.SCALE_SMOOTH)));
        lengthLabel.setText("Sound Length: " + sound.getLength());
    }//GEN-LAST:event_browseSoundActionPerformed

    private void mirrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirrorActionPerformed
        int length = sound.getLength(); // save the length 
        int mirrorPoint = length / 2; // mirror around this 
        int value = 0; // hold the current value 
        // loop from 0 to mirrorPoint
        for (int i = 0; i < mirrorPoint; i++) {
            value = sound.getSampleValueAt(i);
            sound.setSampleValueAt(length - 1 - i, value);
        }
    }//GEN-LAST:event_mirrorActionPerformed

    private void Increasing_the_sound_volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Increasing_the_sound_volumeActionPerformed
        SoundSample[] s = sound.getSamples();
        int value;
        SoundSample s2 = null;

        for (SoundSample item : s) {
            s2 = item;
            value = s2.getValue();
            s2.setValue((int) (value * ChangeVolume.getValue()));
        }
    }//GEN-LAST:event_Increasing_the_sound_volumeActionPerformed

    private void Decreasing_the_sound_volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decreasing_the_sound_volumeActionPerformed
        SoundSample[] s = sound.getSamples();
        int value = 0;
        SoundSample s2 = null;

        for (SoundSample item : s) {
            s2 = item;
            value = s2.getValue();
            s2.setValue((int) (value * ChangeVolume.getValue()) / 10);
        }
    }//GEN-LAST:event_Decreasing_the_sound_volumeActionPerformed

    private void avgFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgFilterActionPerformed
        int avg = 0;
        Sound tempSound = new Sound(sound.getLength());
        for (int i = 1; i < sound.getLength() - 1; i++) {
            avg = sound.getSampleValueAt(i) + sound.getSampleValueAt(i - 1) + sound.getSampleValueAt(i + 1);
            tempSound.setSampleValueAt(i, avg / 3);
        }
        sound = tempSound;
    }//GEN-LAST:event_avgFilterActionPerformed

    private void spread_squeezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spread_squeezeActionPerformed
        Sound soundTarget = new Sound(sound);
        soundTarget = halveFreq(soundTarget); // spread
        soundTarget = doubleFreq(soundTarget); // squeez
        sound = soundTarget;
    }//GEN-LAST:event_spread_squeezeActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.toBack();
        this.setVisible(false);
        Welcompage p = new Welcompage();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_BackActionPerformed

    public Sound halveFreq(Sound thee) {
        // make a copy of the original sound
        Sound s = new Sound(thee.getFileName());

        /* loop through the sound and increment target index
         * by one but source index by 0.5 and set target value
         * to the copy of the original sound
         */
        for (double sourceIndex = 0, targetIndex = 0;
                targetIndex < thee.getLength();
                sourceIndex += 0.5, targetIndex++) {
            thee.setSampleValueAt((int) targetIndex, s.getSampleValueAt((int) sourceIndex));
        }
        return thee;
    }

    public Sound doubleFreq(Sound thh) {
        // make a copy of the original sound
        Sound s = new Sound(thh.getFileName());

        /* loop through the sound and increment target index
         * by one but source index by 2 and set target value
         * to the copy of the original sound
         */
        for (int sourceIndex = 0, targetIndex = 0;
                sourceIndex < thh.getLength();
                sourceIndex = sourceIndex + 2, targetIndex++) {
            thh.setSampleValueAt(targetIndex,
                    s.getSampleValueAt(sourceIndex));
        }

        // clear out the rest of this sound
        for (int i = thh.getLength() / 2;
                i < thh.getLength();
                i++) {
            thh.setSampleValueAt(i, 0);
        }

        return thh;
    }

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
            java.util.logging.Logger.getLogger(SoundForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoundForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoundForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoundForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JSlider ChangeVolume;
    private javax.swing.JButton Decreasing_the_sound_volume;
    private javax.swing.JButton Increasing_the_sound_volume;
    private javax.swing.JButton avgFilter;
    private javax.swing.JLabel backgroundicon1;
    private javax.swing.JButton blend_to_sound;
    private javax.swing.JButton browseSound;
    private javax.swing.JButton clip;
    private javax.swing.JPanel clipPanel;
    private javax.swing.JTextField endField;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2icon;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JButton mirror;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton reverse;
    private javax.swing.JButton splice;
    private javax.swing.JButton spread_squeeze;
    private javax.swing.JTextField startField;
    private javax.swing.JPanel volPanle;
    // End of variables declaration//GEN-END:variables
}
