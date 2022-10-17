package futbol;

import org.jetbrains.annotations.NotNull;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    public String toString(){
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y" +
                " juega de" + this.posicion+ " con el dorsal "+this.dorsal+ ". Le han marcado "+ this.golesRecibidos;

    }

    public int compareTo(Object o){
        Portero p=(Portero) o;
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
    }
    public boolean jugarConLasManos(){
        return true;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
