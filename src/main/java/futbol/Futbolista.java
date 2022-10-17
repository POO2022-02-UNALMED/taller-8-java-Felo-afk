package futbol;

public abstract class Futbolista implements Comparable<Object> {
    String nombre;
    int edad;
    final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    @Override
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y" +
                " juega de" + this.posicion;
    }



    public boolean equals(Futbolista f) {
        if(f != this) {return false;}
        return true;
        }


    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}

