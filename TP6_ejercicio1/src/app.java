
import Vistas.VistaGestionProductos;


public class app {
    public static void main(String[] args ){
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGestionProductos().setVisible(true);
            }
        });
        String categoria1 = "Comestible";
        String categoria2 = "Limpieza";
        String categoria3= "Farmacia";
        String categoria4 = "Ropa";
        String categoria5 = "Perfumeria";
        VistaGestionProductos.productos.getCategorias().add(categoria1);
        VistaGestionProductos.productos.getCategorias().add(categoria2);
        VistaGestionProductos.productos.getCategorias().add(categoria3);
        VistaGestionProductos.productos.getCategorias().add(categoria4);
        VistaGestionProductos.productos.getCategorias().add(categoria5);
        
    }
}
