package futbol;

class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public int compareTo(Portero p) {
        return abs(this.golesRecibidos - p.golesRecibidos);
    }


    public boolean jugarConLasManos() { return true;}
}