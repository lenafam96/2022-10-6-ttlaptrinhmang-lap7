/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package congto_ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class CongTo {
    private String SoCT;
    private String ChuHo;
    private int SoCu;
    private int SoMoi;
    private int DonGia;

    public CongTo() {
        
    }

    public CongTo(String SoCT, String ChuHoString, int SoCu, int SoMoi, int DonGia) {
        this.SoCT = SoCT;
        this.ChuHo = ChuHoString;
        this.SoCu = SoCu;
        this.SoMoi = SoMoi;
        this.DonGia = DonGia;
    }
    
    public CongTo(ResultSet rs) {
        try {
            this.SoCT = rs.getString("SoCT");;
            this.ChuHo = rs.getString("ChuHo");
            this.SoCu = rs.getInt("SoCu");
            this.SoMoi = rs.getInt("SoMoi");
            this.DonGia = rs.getInt("DonGia");
        } catch (SQLException ex) {
            Logger.getLogger(CongTo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getSoCT() {
        return SoCT;
    }

    public void setSoCT(String SoCT) {
        this.SoCT = SoCT;
    }

    public String getChuHo() {
        return ChuHo;
    }

    public void setChuHo(String ChuHo) {
        this.ChuHo = ChuHo;
    }

    public int getSoCu() {
        return SoCu;
    }

    public void setSoCu(int SoCu) {
        this.SoCu = SoCu;
    }

    public int getSoMoi() {
        return SoMoi;
    }

    public void setSoMoi(int SoMoi) {
        this.SoMoi = SoMoi;
    }
    
    public int getSoDien(){
        return this.getSoMoi() - this.getSoCu();
    }
    
    public int getThanhTien(){
        return this.getDonGia()*this.getSoDien();
    }
}
