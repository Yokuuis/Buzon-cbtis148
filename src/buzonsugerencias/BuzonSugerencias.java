package buzonsugerencias;

import buzonsugerencias.view.FrmMenuPrincipal;

public class BuzonSugerencias {

    public static void main(String[] args) {

        // (Opcional) Dejar Nimbus si existe
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // si falla, se queda el look and feel por defecto
        }

        // Lanzar la ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }
}
