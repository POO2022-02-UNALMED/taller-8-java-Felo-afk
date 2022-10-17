package futbol;

import futbol.Futbolista;

public class Jugador extends Futbolista {
    short  golesMarcados;
    byte dorsal;
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados=golesMarcados;
        this.dorsal=dorsal;
    }
    public Jugador(){
        super();
        this.golesMarcados=289;
        this.dorsal=7;
    }
    @Override
    public int compareTo(Object o){
        Jugador j=(Jugador) o;
        return Math.abs(this.getEdad()-j.getEdad());
    }
    @Override
    public String toString(){
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y" +
                " juega de" + getPosicion()+ " con el dorsal "+getDorsal()+ ". Ha marcado "+ getGolesMarcados();

    }
    public boolean jugarConLasManos() {
        return false;
    }
    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
