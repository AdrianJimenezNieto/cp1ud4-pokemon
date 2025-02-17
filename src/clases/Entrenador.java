public class Entrenador {
  // definición de los atributos
  private String nombre;
  private int experiencia;
  private int numeroMedallas;
  private int equipoPokemon;

  // Constructor
  public Entrenador(String nombre, int experiencia, int numeroMedallas, int equipoPokemon) {
      this.nombre = nombre;
      this.experiencia = experiencia;
      this.numeroMedallas = numeroMedallas;
      this.equipoPokemon = equipoPokemon;
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getExperiencia() {
    return experiencia;
  }
  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

  public int getNumeroMedallas() {
    return numeroMedallas;
  }
  public void setNumeroMedallas(int numeroMedallas) {
    this.numeroMedallas = numeroMedallas;
  }

  public int getEquipoPokemon() {
      return equipoPokemon;
  }
  public void setEquipoPokemon(int equipoPokemon) {
    this.equipoPokemon = equipoPokemon;
  }
}
