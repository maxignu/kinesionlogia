/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author maxi
 */
public class Util {
    
       public static java.sql.Date dateToSqlDate(java.util.Date fecha) {

        java.sql.Date fechaSql;
        if (fecha != null) {
            fechaSql = new java.sql.Date(fecha.getTime());
        } else {
            return null;
        }
        return fechaSql;
    }
    public static String getFechaMod(Date fechaMod){
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        return sf.format(fechaMod);
    }
    
}
