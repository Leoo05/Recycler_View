package model;

public class Persona {

    private String nombre;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;

    public Persona(String nombre, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender) {
        this.nombre = nombre;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Nombre=" + nombre + '\n' + "Altura=" + height + '\n' +
                        "Peso=" + mass + '\n' +
                        "Color del Cabello=" + hair_color + '\n' +
                        "Color de Piel=" + skin_color + '\n' +
                        "Color de Ojos=" + eye_color + '\n' +
                        "Año de Nacimiento=" + birth_year + '\n' +
                        "Genero=" + gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

