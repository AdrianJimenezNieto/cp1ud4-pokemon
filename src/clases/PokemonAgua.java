public class PokemonAgua extends Pokemon {
  // Atributos propios de clase
  private int profundidadMaxima;
  private String tipoAgua;

  public PokemonAgua(String nombre, int nivel, int puntosDeVida, int profundidadMaxima, String tipoAgua) {
    // LLamada al constructor padre
    super(nombre, nivel, puntosDeVida);
    this.profundidadMaxima = profundidadMaxima;
    this.tipoAgua = tipoAgua;
  }

  // Getters y setters
  public int getProfundidadMaxima() {
    return profundidadMaxima;
  }
  public void setProfundidadMaxima(int profundidadMaxima) {
    this.profundidadMaxima = profundidadMaxima;
  }

  public String getTipoAgua() {
    return tipoAgua;
  }
  public void setTipoAgua(String tipoAgua) {
    this.tipoAgua = tipoAgua;
  }
}