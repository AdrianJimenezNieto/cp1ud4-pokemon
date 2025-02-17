public class Combate {
  // Definimos los dos pokemon del duelo como atributos de clase de tipo Pokemon
  private Pokemon pokemon1;
  private Pokemon pokemon2;

  // Constructor
  public Combate(Pokemon pokemon1, Pokemon pokemon2) {
      this.pokemon1 = pokemon1;
      this.pokemon2 = pokemon2;
  }

  // Metodo para iniciar el combate y determinar el ganador
  public void iniciarCombate() {
    System.out.println("🔥⚡ Combate entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + " ⚡🔥");

    if (pokemon1.getNivel() > pokemon2.getNivel()) {
      // Si el pokemon1 tiene más nivel que el pokemon dos gana el 1
      System.out.println("🏆 " + pokemon1.getNombre() + " gana el combate!");
    } else if (pokemon1.getNivel() < pokemon2.getNivel()) {
      // Si el pokemon1 tiene menos nivel que pokemon2 gana pokemon2
      System.out.println("🏆 " + pokemon2.getNombre() + " gana el combate!");
    } else {
      // Si los dos pokemon tienen el mismo nivel termina en empate
      System.out.println("🤝 El combate termina en empate!");
    }
  }
}
