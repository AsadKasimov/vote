import javax.swing.JOptionPane;
import java.util.List;
import votingsystem.VotingSystem; // Импортируем VotingSystem
import votingsystem.Candidate;    // Импортируем Candidate
import javax.swing.JOptionPane;

public class VotingSystemForm extends javax.swing.JFrame {

    private VotingSystem votingSystem = new VotingSystem(); // Создаем экземпляр VotingSystem

    public VotingSystemForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        candidateNameField = new javax.swing.JTextField();
        voteNameField = new javax.swing.JTextField();
        addCandidateButton = new javax.swing.JButton();
        voteButton = new javax.swing.JButton();
        showResultsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Имя кандидата:");

        jLabel2.setText("Голосовать за:");

        jLabel3.setText("Результаты:");

        candidateNameField.setName("candidateNameField "); // NOI18N
        candidateNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateNameFieldActionPerformed(evt);
            }
        });

        voteNameField.setName("voteNameField"); // NOI18N
        voteNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteNameFieldActionPerformed(evt);
            }
        });

        addCandidateButton.setText("Добавить кандидат");
        addCandidateButton.setName("addCandidateButton"); // NOI18N
        addCandidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCandidateButtonActionPerformed(evt);
            }
        });

        voteButton.setText("Голосовать");
        voteButton.setName("voteButton"); // NOI18N
        voteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteButtonActionPerformed(evt);
            }
        });

        showResultsButton.setText("Показать результаты");
        showResultsButton.setName("showResultsButton "); // NOI18N
        showResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultsButtonActionPerformed(evt);
            }
        });

        resultsArea.setColumns(20);
        resultsArea.setRows(5);
        resultsArea.setName("resultsArea"); // NOI18N
        jScrollPane1.setViewportView(resultsArea);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addCandidateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(voteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showResultsButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(candidateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(voteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCandidateButton)
                    .addComponent(showResultsButton)
                    .addComponent(voteButton))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        candidateNameField.getAccessibleContext().setAccessibleName("candidateNameField ");
        voteNameField.getAccessibleContext().setAccessibleName("voteNameField");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void candidateNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateNameFieldActionPerformed

    }//GEN-LAST:event_candidateNameFieldActionPerformed

    private void voteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteButtonActionPerformed
        String voteName = voteNameField.getText().trim();
        if (!voteName.isEmpty()) {
            votingSystem.castVote(voteName);
            resultsArea.append("Голос учтён для: " + voteName + "\n");
            voteNameField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Введите имя кандидата для голосования.");
        }
    }//GEN-LAST:event_voteButtonActionPerformed

    private void showResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultsButtonActionPerformed
        resultsArea.append("\nРезультаты голосования:\n");
        for (Candidate candidate : votingSystem.getCandidates()) {
            resultsArea.append(candidate.getName() + ": " + candidate.getVotes() + " голосов\n");
        }
    }//GEN-LAST:event_showResultsButtonActionPerformed

    private void addCandidateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCandidateButtonActionPerformed
                String candidateName = candidateNameField.getText().trim();
        if (!candidateName.isEmpty()) {
            votingSystem.addCandidate(candidateName);
            resultsArea.append("Кандидат " + candidateName + " добавлен.\n");
            candidateNameField.setText(""); // Очищаем поле после добавления кандидата
        } else {
            JOptionPane.showMessageDialog(this, "Введите имя кандидата.");
        }
    }//GEN-LAST:event_addCandidateButtonActionPerformed

    private void voteNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voteNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VotingSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotingSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotingSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotingSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingSystemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCandidateButton;
    private javax.swing.JTextField candidateNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultsArea;
    private javax.swing.JButton showResultsButton;
    private javax.swing.JButton voteButton;
    private javax.swing.JTextField voteNameField;
    // End of variables declaration//GEN-END:variables
}
