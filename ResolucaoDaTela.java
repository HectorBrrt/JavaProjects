import java.awt.*;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Altura: " + d.height);
        System.out.println("Largura: " + d.width);
    }
}
