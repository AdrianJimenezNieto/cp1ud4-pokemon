public class PokemonPlanta extends Pokemon {
  // atributos propios de esta clase
  private String tipoHoja;
  private int capacidadFotosintesis;

  public PokemonPlanta(String nombre, int nivel, int puntosDeVida, String tipoHoja, int capacidadFotosintesis) {
    // LLamada al contructor padre
    super(nombre, nivel, puntosDeVida);
    this.tipoHoja = tipoHoja;
    this.capacidadFotosintesis = capacidadFotosintesis;
  }

  // Getters y setters

  public String getTipoHoja() {
    return tipoHoja;
  }
  public void setTipoHoja(String tipoHoja) {
    this.tipoHoja = tipoHoja;
  }

  public int getCapacidadFotosintesis() {
    return capacidadFotosintesis;
  }
  public void setCapacidadFotosintesis(int capacidadFotosintesis) {
    this.capacidadFotosintesis = capacidadFotosintesis;
  }
}
