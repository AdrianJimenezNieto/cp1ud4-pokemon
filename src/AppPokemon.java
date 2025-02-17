public class AppPokemon {
  // la clase AppPokemon es la encargada de encapsular toda la aplicacion 
  // el metodo main de esta clase será el que corra el programa
  
  public static class Pokemon {
    // Definicion de atributos
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    // Constructor sin parametros
    public Pokemon(){}
  
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
  
  public static class PokemonAgua extends Pokemon {
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
  
  public static class PokemonFuego extends Pokemon {
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
  
  public static class PokemonPlanta extends Pokemon {
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

  public static class Entrenador {
    // definición de los atributos
    private String nombre;
    private int experiencia;
    private int numeroMedallas;
    private int equipoPokemon;
    // Ponemos un atributo que sea de tipo Pokemon para que a traves del polimorfismo
    // acepte cualquier instancia de alguna clase hija de Pokemon, como las que hemos definido
    private Pokemon companero;
  
    // Constructor
    public Entrenador(String nombre, int experiencia, int numeroMedallas, int equipoPokemon, Pokemon companero) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.numeroMedallas = numeroMedallas;
        this.equipoPokemon = equipoPokemon;
        this.companero = companero;
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

    public Pokemon getCompanero() {
      return companero;
    }
    public void setCompanero(Pokemon newCompanero) {
      this.companero = newCompanero;
    }
  }

  public static class Combate {
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
      System.out.println("Combate entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre());
  
      if (pokemon1.getNivel() > pokemon2.getNivel()) {
        // Si el pokemon1 tiene más nivel que el pokemon dos gana el 1
        System.out.println(pokemon1.getNombre() + " gana el combate!");
      } else if (pokemon1.getNivel() < pokemon2.getNivel()) {
        // Si el pokemon1 tiene menos nivel que pokemon2 gana pokemon2
        System.out.println(pokemon2.getNombre() + " gana el combate!");
      } else {
        // Si los dos pokemon tienen el mismo nivel termina en empate
        System.out.println("El combate termina en empate!");
      }
    }
  }
  public static void main(String[] args) {
      // Creamos los pokemon de los entrenadores
      PokemonFuego charmander = new PokemonFuego("Charmander", 12, 50, 800, "Llamarada");
      PokemonAgua squirtle = new PokemonAgua("Squirtle", 10, 55, 30, "Burbuja");

      // Creamos a los entrenadores con los pokemon como su compañero
      Entrenador ash = new Entrenador("Ash Ketchum", 200, 5, 3, charmander);
      Entrenador misty = new Entrenador("Misty", 180, 6, 4, squirtle);

      // Crear el combate entre los Pokémon principales de los entrenadores
      System.out.println("\n=== COMIENZA EL COMBATE ===");
      Combate combate = new Combate(ash.getCompanero(), misty.getCompanero());
      combate.iniciarCombate(); // Determina el ganador o empate
  }

}

