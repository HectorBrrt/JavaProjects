import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalcGUI {
    private JButton a1Button;
    private JPanel panel1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton plus;
    private JButton minus;
    private JButton multi;
    private JButton divis;
    private JButton clear;
    private JButton delete;
    private JTextField Resultado;
    private JButton equalsTo;
    private JButton dot;
    private JLabel hist;

    double numero, resultado;
    int calculo;

    public CalcGUI() {
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "1");

            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "2");
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "3");
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "4");
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "5");
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "6");
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "7");
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "8");
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "9");
            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + "0");
            }
        });
        plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero = Double.parseDouble(Resultado.getText());
                calculo = 1;
                Resultado.setText("");
                hist.setText(numero + "+");
            }
        });
        minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero = Double.parseDouble(Resultado.getText());
                calculo = 2;
                Resultado.setText("");
                hist.setText(numero + "-");

            }
        });
        multi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero = Double.parseDouble(Resultado.getText());
                calculo = 3;
                Resultado.setText("");
                hist.setText(numero + "×");

            }
        });
        divis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero = Double.parseDouble(Resultado.getText());
                calculo = 4;
                Resultado.setText("");
                hist.setText(numero + "÷");

            }
        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText("");
                hist.setText("");

            }
        });
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int tam = Resultado.getText().length();
                int num = Resultado.getText().length() - 1;
                String store;

                if(tam > 0){
                    StringBuilder back = new StringBuilder(Resultado.getText());
                    back.deleteCharAt(num);
                    store = back.toString();
                    Resultado.setText(store);
                }
            }
        });
        dot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Resultado.setText(Resultado.getText() + ".");
            }
        });
        equalsTo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                hist.setText("");
                operacaoAritmetica();
            }
        });

    }

    public void operacaoAritmetica(){
        switch (calculo) {
            case 1 -> { // Adição
                resultado = numero + Double.parseDouble(Resultado.getText());
                Resultado.setText(Double.toString(resultado));
            }
            case 2 -> { // Subtração
                resultado = numero - Double.parseDouble(Resultado.getText());
                Resultado.setText(Double.toString(resultado));
            }
            case 3 -> { // Multiplicação
                resultado = numero * Double.parseDouble(Resultado.getText());
                Resultado.setText(Double.toString(resultado));
            }
            case 4 -> { // Divisão
                resultado = numero / Double.parseDouble(Resultado.getText());
                Resultado.setText(Double.toString(resultado));
            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalcGUI");
        frame.setContentPane(new CalcGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(220,300);
    }
}
