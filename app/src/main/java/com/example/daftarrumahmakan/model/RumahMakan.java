package com.example.daftarrumahmakan.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

public class RumahMakan {
    public static final String WARUNGMASBRO="WARUNG MAS BRO";
    public static final String IKANBAKARPURNAMA="IKAN BAKAR PURNAMA";
    public static final String MIEAYAMIJO="MIE AYAM IJO";
    public static final String RUMAHMAKANAREMA="RUMAH MAKAN AREMA";
    public static final String GAMARESTO="GAMARR ESTO";
    public static final String KAVACOFFE="KAVA COFFE";
    public static final String SECOCEFFE="SECO COFFE";
    private String id;
    private Date tanggal;
    private String deskripsi;
    private String nilai;
    private String jenis;
    private String model;

    public RumahMakan() {
        this.id = UUID.randomUUID().toString();
        this.tanggal = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getModel(){
        return model;
    }
    public void setModel( String model){
        this.model = model;
    }

    public static RumahMakan fromJSONObject(JSONObject obj) {
        RumahMakan tr = new RumahMakan();
        try {
            tr.setId(obj.getString("id"));
            tr.setTanggal(new Date(obj.getLong("tanggal")));
            tr.setDeskripsi(obj.getString("deskripsi"));
            tr.setNilai(obj.getString("nilai"));
            tr.setJenis(obj.getString("jenis"));
            tr.setModel(obj.getString("model"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return tr;
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObj = new JSONObject();
        try {
            jsonObj.put("id",this.id);
            jsonObj.put("tanggal",this.tanggal.getTime());
            jsonObj.put("jenis",this.jenis);
            jsonObj.put("nilai",this.nilai);
            jsonObj.put("deskripsi",this.deskripsi);
            jsonObj.put("model",this.model);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObj;
    }
}
