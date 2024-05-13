//package geoguesser2;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Main extends JFrame {
//
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public Main() {
//        setTitle("GeoGuessr Variant");
//        setSize(800, 600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        MapPanel mapPanel = new MapPanel();
//        add(mapPanel);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Main::new);
//    }
//}
//
//class MapPanel extends JPanel {
//
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.BLUE);
//        g.fillRect(0, 0, getWidth(), getHeight());
//    }
//}
