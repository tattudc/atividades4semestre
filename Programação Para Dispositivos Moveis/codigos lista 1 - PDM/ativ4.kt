open class Pessoa(nome: String = "", anoNascimento: Int, altura: Float = 0f, anoAtual: Int) {
    var nome: String;
    var anoNascimento: Int = anoNascimento;
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

    //private fun setIdade(idade: Long){
    //    this.idade = idade
    //}*/

    override fun toString(): String {
        return "Nome: $nome($anoNascimento, $altura)"
    }
}

class Agenda(){
    var listaAgenda: ArrayList<Pessoa>

    init{
        this.listaAgenda = ArrayList()
    }

    fun armazenaPessoa(p: Pessoa){
        this.listaAgenda.add(p)
    }

    fun removePessoa(nome: String){
        var p: Int? = buscaPessoa(nome)
        if(p == null){
            println("Pessoa não encontrada")
        }
        else{
            this.listaAgenda.removeAt(p)
        }
    }
    
    fun buscaPessoa(nome: String): Int?{
        for(p in listaAgenda){
            if(p.nome.equals(nome)){
                println(listaAgenda.indexOf(p))
                return listaAgenda.indexOf(p)
            }
        }
        return null
    }
    
    fun printAgenda(){
        println(listaAgenda.toString())
    }
    
    fun printPessoa(index: Int){
        println(listaAgenda.get(index));
    }
}

class Funcionario:Pessoa {
    var salario: Float;
    constructor(nome: String = "", anoNascimento: Int, altura: Float = 0f, anoAtual: Int, salario: Float) : super(nome, anoNascimento, altura, anoAtual) {
        this.salario = salario;
    }
}

fun main(){
    var people1 = Pessoa("Tarcisio", 1985, 1.70f, 2021)
    println(people1.nome)
    println(people1.getIdade())
    println(people1.toString())

    var people2 = Pessoa("Edi", 1986, 1.58f, 2021)
    var people3 = Pessoa("Junior", 1961, 1.78f, 2021)
    var people4 = Pessoa("Leka", 1990, 1.74f, 2021)
    
    var agenda = Agenda()
    agenda.armazenaPessoa(people1)
    agenda.armazenaPessoa(people2)
    agenda.armazenaPessoa(people3)
    agenda.armazenaPessoa(people4)
    agenda.printAgenda()

    var people5 = Pessoa("Beni", 2016, 0.90f, 2021)
    agenda.armazenaPessoa(people5)
    agenda.printAgenda()
    agenda.removePessoa("Beni")
    agenda.printAgenda()
    agenda.removePessoa("Tarcisio")
    agenda.printAgenda()
    var funcionario1 = Funcionario("Tarcisio", 1985, 1.70f, 2021, 1500.0f)
    println(funcionario1.salario)
    agenda.armazenaPessoa(funcionario1)
    agenda.printAgenda()
}