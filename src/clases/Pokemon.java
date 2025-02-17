public class Pokemon {
  // Definicion de atributos
  private String nombre;
  private int nivel;
  private int puntosDeVida;

  // Constructor
  public Pokemon(String nombre, int nivel, int puntosDeVida) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.puntosDeVida = puntosDeVida;
  }

  // Getters y setters
  public String getNombre(){
    return nombre;
  }
  public void setNombre(String newNombre) {
    this.nombre = newNombre;
  }
  public int getNivel(){
    return nivel;
  }
  public void setNivel(int newNivel) {
    this.nivel = newNivel;
  }
  public int getPuntosDeVida(){
    return puntosDeVida;
  }
  public void setPuntosDeVida(int newPuntosDeVida) {
    this.puntosDeVida = newPuntosDeVida;
  }
}
