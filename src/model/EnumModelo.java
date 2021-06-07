package model;

public enum EnumModelo {
    GOL("VW GOL 1.0"),
    KWUID("Kwid 1.0"),
    UNO("Uno 1.0"),
    HB20("HB20s 1.6"),
    CRONOS("Cronos 1.6"),
    NISSAN_VERSA("Nissan Versa 1.6"),
    CITROEN_CACTOS("Citroën Cactos 1.6"),
    KICKS("Kicks 1.6"),
    DUSTER("Duster 1.6");

    private String modelo;

    EnumModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }
}
