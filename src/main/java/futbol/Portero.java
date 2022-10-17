package futbol;

import org.jetbrains.annotations.NotNull;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + getDorsal() + ". Le han marcado " + getGolesRecibidos();
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
