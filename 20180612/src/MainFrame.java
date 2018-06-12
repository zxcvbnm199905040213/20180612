import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private Container cp ;
    JTextField jtf = new JTextField();
    JButton    jbt1 = new JButton("轉換");
    JButton    jbt2 = new JButton("Exit");
    JLabel     jlb1 = new JLabel ();

    public MainFrame(){
        init();
    }

    private void init(){

        this.setBounds(50, 50, 490, 680);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jbt1.setBounds(100,50,100,100);
        jbt2.setBounds(100,100,100,100);
        jlb1.setBounds(50,50,100,100);
        jtf.setBounds(50,100,100,100);

        this.setLayout(new GridLayout(2,3,1,1));
        this.add(jtf);
        this.add(jbt1);
        this.add(jlb1);
        this.add(jbt2);

        jbt2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        jbt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int data [] = new int[5] ;
                try{
                    for (int i =0 ; i<5  ; i++ ){
                    }
                    float v1 = Float.parseFloat(jtf.getText());
                    float v2 = v1*1.6f ;
                    jlb1.setText(Float.toString(v2));
                }catch (ArrayIndexOutOfBoundsException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"erroe");
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"error");
                }
            }
        });




    }

}
