/**
 * La clase coche cuenta con los parámetros:
 * @property color: String -> Cadena que registra el coolor del objeto
 * @property marca: String -> Cadena que registra la marca del objeto
 * @property modelo: String -> Cadena que resgistra el modelo del objeto
 * @constructor Crea una instancia de coche con color, marca y modelo
 */
class coche(var color:String, var marca: String, var modelo: String){
    //------------------------------------------------------------------------------------------------------------------
    private var caballos: Int = 70

    /**
     * setCaballos() se encarga de comprobar que los caballos establecidos no se salgan de un rango permitido
     * @param caballos: Int -> Entero que registra los caballos del objeto
     */
    fun setCaballos(caballos: Int) {
        require(caballos in 70..700) { "Los caballos no están dentro del rango permitido" }
        this.caballos = caballos
    }
    //------------------------------------------------------------------------------------------------------------------
    private var matricula: String = ""

    /**
     * setMatricula() se encarga al igual que setCaballos() de comprobar que la matricula del coche tenga un formato adecuado
     * @param matricula: String -> Cadena que registra la matricula del objeto y comprueva su validez
     */
    fun setMatricula(matricula: String){
            require(matricula.isNotEmpty() && matricula.length == 7) { "La matricula no tiene un formato válido" }
            this.matricula = matricula
    }
    //------------------------------------------------------------------------------------------------------------------
    private var puertas: Int = 0

    /**
     * setPuertas() se encarga al igual que setMatricula() de comprobar que las del coche estén dentro de un rango adecuado
     * @param puertas: String -> Entero que registra el número de puertas del objeto y comprueva su validez
     */
    fun setPuertas(puertas: Int){
        require(puertas in 3..5){"El número de puertas introducido no está dentro del rango permitido"}
            this.puertas = puertas
    }
    //------------------------------------------------------------------------------------------------------------------
    override fun toString(): String {
        return "${this.marca.replaceFirstChar { it -> it.uppercase() }} ${this.modelo.replaceFirstChar { it -> it.uppercase() }} con ${this.puertas} puertas, ${this.caballos} caballos, con matricula: ${this.matricula} y de color ${this.color.replaceFirstChar { it -> it.uppercase() }}"
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * cambiarColor() pregunta al usuario que color quiere eponerle ahora al coche, comprueba la entrada y en caso de que sea correcta la aplica.
     */
    fun cambiarColor(){
        print("¿De que color es tu ${this.marca} ${this.modelo}?: ")
        val colour = readln()
        if (colour != "") this.color = colour.lowercase()
        else {
            println("No se le ha cambiado el color al coche")
            readln()
        }
    }
}

