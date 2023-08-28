package Paneller;

import UIKutuphaneSistemi.UIKutuphaneSistemi;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelKitapEkle extends Panel {
    
    private UIKutuphaneSistemi uIKutuphaneSistemi;

    public PanelKitapEkle(UIKutuphaneSistemi uIKutuphaneSistemi, JToggleButton jToggleButton, JPanel jPanel) {
        super(jToggleButton, jPanel);
        this.uIKutuphaneSistemi = uIKutuphaneSistemi;
    }
       
    public UIKutuphaneSistemi getuIKutuphaneSistemi() {
        return uIKutuphaneSistemi;
    }
    
    
    
}
