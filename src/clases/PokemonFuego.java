public class PokemonFuego extends Pokemon {
  // Atributos propios de esta clase
  private int temperaturaLlama;
  private String tipoAtaqueEspecial;

  public PokemonFuego(String nombre, int nivel, int puntosDeVida, int temperaturaLlama, String tipoAtaqueEspecial) {
    // Llamada al constructor padre
    super(nombre, nivel, puntosDeVida);
    this.temperaturaLlama = temperaturaLlama;
    this.tipoAtaqueEspecial = tipoAtaqueEspecial;
  }

  //Getters y setters

  public int getTemperaturaLlama() {
    return temperaturaLlama;
  }
  public void setTemperaturaLlama(int temperaturaLlama) {
    this.temperaturaLlama = temperaturaLlama;
  }

  public String getTipoAtaqueEspecial() {
    return tipoAtaqueEspecial;
  }
  public void setTipoAtaqueEspecial(String tipoAtaqueEspecial) {
    this.tipoAtaqueEspecial = tipoAtaqueEspecial;
  }
}