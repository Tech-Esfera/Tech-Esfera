
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class jogodavelha extends javax.swing.JFrame {
    
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int VitoriaDoJogador1 = 0;
    int VitoriaDoJogador2 = 0;
    int PartidasEmpatadasn = 0;
    
    

    /**
     * Creates new form jogodavelha
     */
    public jogodavelha() {
        initComponents();
    }
    
    public void JogadorAtivo(){
        if (Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        }else{
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        
        JogadorVencedor("X");
        JogadorVencedor("O");
      
}
    public void JogadorVencedor(String Jogador){
        /*********************Verificando Linhas*******************/
        if (botao1.getText().equals(Jogador)&&
                botao2.getText().equals(Jogador)&&
                botao3.getText().equals(Jogador)){
            if (botao1.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
            
        }          
        
        if (botao4.getText().equals(Jogador)&&
                botao5.getText().equals(Jogador)&&
                botao6.getText().equals(Jogador)){
            if (botao4.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
        
        }
        if (botao7.getText().equals(Jogador)&&
                botao8.getText().equals(Jogador)&&
                botao9.getText().equals(Jogador)){
            if (botao7.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
        }
        /*********************Verificando colunas*******************/
            if (botao1.getText().equals(Jogador)&&
                botao4.getText().equals(Jogador)&&
                botao7.getText().equals(Jogador)){
            if (botao1.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
        }
            
            
            if (botao2.getText().equals(Jogador)&&
                botao5.getText().equals(Jogador)&&
                botao8.getText().equals(Jogador)){
            if (botao2.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
            
            }
                
            if (botao3.getText().equals(Jogador)&&
                botao6.getText().equals(Jogador)&&
                botao9.getText().equals(Jogador)){
            if (botao3.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
            }
             /*********************Verificando Diagonais*******************/
        if (botao1.getText().equals(Jogador)&&
            botao5.getText().equals(Jogador)&&
            botao9.getText().equals(Jogador)){
            if (botao1.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
            
            }
            
            if (botao3.getText().equals(Jogador)&&
                botao5.getText().equals(Jogador)&&
                botao7.getText().equals(Jogador)){
            if (botao3.getText().equals("X"))
                Vencedor ("Jogador 1");
            else
                Vencedor ("Jogador 2");
            }
            
            /*********************Verificando empate*******************/
        if ( !botao1.getText().equals("")&&
                !botao2.getText().equals("")&&
                !botao3.getText().equals("")&&
                !botao4.getText().equals("")&& 
                !botao5.getText().equals("")&& 
                !botao6.getText().equals("")&& 
                !botao7.getText().equals("")&& 
                !botao8.getText().equals("")&& 
                !botao9.getText().equals("") ){
            Vencedor("Empate");
            
               
               
            }
                

    }
    
        public void Vencedor(String JogadorVencedor){
        if (JogadorVencedor.equals("Jogador 1")){
            JOptionPane.showMessageDialog(jogodavelha.this, "Parabéns, Jogador 1. Você venceu o jogo!");
            VitoriaDoJogador1++;
            numerodevitoriasdojogador1.setText("Número de Vitorías: " + VitoriaDoJogador1);
            LimparCampos();
        }
        if (JogadorVencedor.equals("Jogador 2")){
            JOptionPane.showMessageDialog(jogodavelha.this, "Parabéns, Jogador 2. Você venceu o jogo!");
            VitoriaDoJogador2++;
           numerodevitoriasdojogador2.setText("Número de Vitorías: " + VitoriaDoJogador2);
            LimparCampos();
            }
            if (JogadorVencedor.equals("Empate")){
                JOptionPane.showMessageDialog(jogodavelha.this, "Jogo Empatado!. Joguem Novamente!");
                PartidasEmpatadasn++;
                PartidasEmpatadas.setText("Número de empates: " + PartidasEmpatadasn);
                LimparCampos();  
            }
            
        }
       
       public void LimparCampos(){

          botao1.setText("");
          botao2.setText("");
          botao3.setText("");
          botao4.setText("");
          botao5.setText("");
          botao6.setText("");
          botao7.setText("");
          botao8.setText("");
          botao9.setText("");
          
          Jogador1Ativo = true;
          Jogador2Ativo = false;
       }
        
    



    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        paineljogo = new javax.swing.JPanel();
        JogadorAtivo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numerodevitoriasdojogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JogadorAtivo2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numerodevitoriasdojogador2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        PartidasEmpatadas = new javax.swing.JLabel();
        controledojogo = new javax.swing.JPanel();
        novojogo = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(153, 255, 153));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOGO DA VELHA");

        jPanel4.setBackground(new java.awt.Color(164, 194, 247));
        jPanel4.setForeground(new java.awt.Color(66, 141, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botao1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        paineljogo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        JogadorAtivo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JogadorAtivo1.setText("Jogador 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Simbolo: X");

        numerodevitoriasdojogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numerodevitoriasdojogador1.setText("Número de Vitorías: 0");

        JogadorAtivo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JogadorAtivo2.setText("Jogador 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Simbolo: O");

        numerodevitoriasdojogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numerodevitoriasdojogador2.setText("Número de Vitorías: 0");

        PartidasEmpatadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PartidasEmpatadas.setText("Número de empates: 0");

        javax.swing.GroupLayout paineljogoLayout = new javax.swing.GroupLayout(paineljogo);
        paineljogo.setLayout(paineljogoLayout);
        paineljogoLayout.setHorizontalGroup(
            paineljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(paineljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineljogoLayout.createSequentialGroup()
                        .addComponent(JogadorAtivo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(numerodevitoriasdojogador1)
                    .addGroup(paineljogoLayout.createSequentialGroup()
                        .addComponent(JogadorAtivo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(numerodevitoriasdojogador2)
                    .addComponent(PartidasEmpatadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paineljogoLayout.setVerticalGroup(
            paineljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JogadorAtivo1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numerodevitoriasdojogador1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paineljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JogadorAtivo2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numerodevitoriasdojogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PartidasEmpatadas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controledojogo.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle do Jogo"));

        novojogo.setText("Novo Jogo");
        novojogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novojogoActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controledojogoLayout = new javax.swing.GroupLayout(controledojogo);
        controledojogo.setLayout(controledojogoLayout);
        controledojogoLayout.setHorizontalGroup(
            controledojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controledojogoLayout.createSequentialGroup()
                .addGroup(controledojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(novojogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controledojogoLayout.setVerticalGroup(
            controledojogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controledojogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novojogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(botao6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paineljogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controledojogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(paineljogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controledojogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9});

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JOGO DA VELHA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(502, 502, 502))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(654, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void novojogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novojogoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_novojogoActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        if (Jogador1Ativo == true){
            if (botao9.getText().equals("")){
                botao9.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao9.getText().equals("")){
                botao9.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao9ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        if (Jogador1Ativo == true){
            if (botao7.getText().equals("")){
                botao7.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao7.getText().equals("")){
                botao7.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao7ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        if (Jogador1Ativo == true){
            if (botao4.getText().equals("")){
                botao4.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao4.getText().equals("")){
                botao4.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao4ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        if (Jogador1Ativo == true){
            if (botao8.getText().equals("")){
                botao8.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao8.getText().equals("")){
                botao8.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao8ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        if (Jogador1Ativo == true){
            if (botao3.getText().equals("")){
                botao3.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao3.getText().equals("")){
                botao3.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao3ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        if (Jogador1Ativo == true){
            if (botao5.getText().equals("")){
                botao5.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao5.getText().equals("")){
                botao5.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        if (Jogador1Ativo == true){
            if (botao6.getText().equals("")){
                botao6.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao6.getText().equals("")){
                botao6.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao6ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        if (Jogador1Ativo == true){
            if (botao2.getText().equals("")){
                botao2.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao2.getText().equals("")){
                botao2.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        if (Jogador1Ativo == true){
            if (botao1.getText().equals("")){
                botao1.setText("X");
                JogadorAtivo();

            }
        }else {
            if (botao1.getText().equals("")){
                botao1.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_botao1ActionPerformed

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
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogodavelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JogadorAtivo1;
    private javax.swing.JLabel JogadorAtivo2;
    private javax.swing.JLabel PartidasEmpatadas;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JPanel controledojogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton novojogo;
    private javax.swing.JLabel numerodevitoriasdojogador1;
    private javax.swing.JLabel numerodevitoriasdojogador2;
    private javax.swing.JPanel paineljogo;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
