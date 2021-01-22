class Pessoa(nome: String = "", anoNascimento: Int, altura: Float = 0f, anoAtual: Int) {
    var nome: String;
    var anoNascimento: Int =anoNascimento;
    var altura: Float;
    private var idade: Int = calcIdade(anoAtual);
	
    init {
        this.nome = nome
        this.altura = altura
    }
    /*
    constructor(nome: String, anoNascimento: Long, altura: Double, anoAtual: Int){
        this.nome = nome
        this.anoNascimento = anoNascimento
        this.altura = altura
        this.idade: Int = calcIdade(anoAtual);
    }*/

    fun calcIdade(anoAtual: Int):Int{
        return anoAtual - this.anoNascimento
    }

    fun getIdade(): Int {
        return this.idade;
    }

    private fun setIdade(idade: Long){
        this.idade = idade
    }*/

    override fun toString(): String {
        return "Nome: $nome($anoNascimento, $altura)"
    }
}

fun main(){
    var c1 = Pessoa("Tarcisio", 1985, 1.70f, 2021)
    println(c1.nome)
    println(c1.getIdade())
    println(c1.toString())
}