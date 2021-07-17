/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Sebastian
 */
public class cls_refrigerados extends Herencia {
    private String Codigo_Supervision;

    public cls_refrigerados(String Codigo_Supervision, String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String temperatura, String producto) {
        super(fecha_caducidad, lote, fecha_envasada, pais_origen, temperatura, producto);
        this.Codigo_Supervision = Codigo_Supervision;
    }

    public String getCodigo_Supervision() {
        return Codigo_Supervision;
    }

    public void setCodigo_Supervision(String Codigo_Supervision) {
        this.Codigo_Supervision = Codigo_Supervision;
    }
    
    
}
