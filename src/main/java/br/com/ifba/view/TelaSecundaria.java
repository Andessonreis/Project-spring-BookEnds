/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.view;

import br.com.ifba.model.BookRepository;
import br.com.ifba.model.Book;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Andesson reis
 */

public class TelaSecundaria extends javax.swing.JFrame {
    
    @Autowired
    private BookRepository bookRepository;
    
    TelaPrincipal telaPrincipal;
    private int rowEditar;
    private boolean editar = false;

    public TelaSecundaria(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;

    }

    public TelaSecundaria(TelaPrincipal telaPrincipal, int row, boolean editar) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        this.rowEditar = row;
        this.editar = editar;
    }

    /**
     *
     */
    class JpaneGradient extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(17, 45, 78); // cor mais escura
            Color color2 = new Color(42, 85, 119); // cor mais clara
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
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

        jPanel1 = new JpaneGradient();
        txtData = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 14)); // NOI18N
        jLabel1.setText("LIVRO");

        jLabel2.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel2.setText("AUTOR");

        jLabel3.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel3.setText("DATA DE LANÇAMENTO");

        btAdicionar.setText("ADICIONAR");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNomeLivro)
            .addComponent(txtAutor)
            .addComponent(txtData)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAdicionar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(364, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtNomeLivro() {
        return txtNomeLivro;
    }

    public void setTxtNomeLivro(JTextField txtNomeLivro) {
        this.txtNomeLivro = txtNomeLivro;
    }


    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
            
        // Obtém os valores dos campos de texto da tela
        //BookDao books = new BookDao();
        Book book = new Book();

        String nameBook = txtNomeLivro.getText();
        String nameAuthor = txtAutor.getText();
        String dataString = txtData.getText();

        book.setTitle(nameBook);
        book.setAuthor(nameAuthor);
        book.setPublicationYear(dataString);

        // Converte a string de data para um objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // LocalDate data = LocalDate.parse(dataStrin, formatter);
        LocalDate data = LocalDate.parse(dataString, formatter);

        // Obtém o modelo de dados da tabela da TelaPrincipal
        DefaultTableModel model = (DefaultTableModel) telaPrincipal.getJtTabela().getModel();

        if (editar == true) {
            int col = telaPrincipal.getJtTabela().getColumn("ID").getModelIndex();
            long id = (long) telaPrincipal.getJtTabela().getValueAt(rowEditar, col);
  
            book.setId(id);
            modificarTabela(book);
            bookRepository.save(book);
            // Fecha a tela secundária
            dispose();
        }

        if (editar == false) {
            bookRepository.save(book);
            // Cria um novo array de objetos com os valores a serem adicionados
            Object[] row = new Object[]{nameBook, nameAuthor, data, book.getId()};
            // Adiciona a nova linha na tabela da TelaPrincipal
            model.addRow(row);
            // Notifica a tabela da TelaPrincipal de que os dados foram alterados
            model.fireTableDataChanged();
            // Fecha a tela secundária
            dispose();
        }

    }//GEN-LAST:event_btAdicionarActionPerformed
    public void modificarTabela(Book book) {
        telaPrincipal.getJtTabela().setValueAt(book.getTitle(), rowEditar, 0);
        telaPrincipal.getJtTabela().setValueAt(book.getAuthor(), rowEditar, 1);
        telaPrincipal.getJtTabela().setValueAt(book.getPublicationYear(), rowEditar, 2);
        telaPrincipal.getJtTabela().setValueAt(book.getId(), rowEditar, 3);

    }
    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed

    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
