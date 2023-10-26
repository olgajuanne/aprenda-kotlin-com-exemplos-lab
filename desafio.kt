// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.addAll(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo1 = ConteudoEducacional("Introdução da Linguagem", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Orientação a Objetos", 120, Nivel.INTERMEDIARIO)
    
    val formacao = Formacao("Java", listOf(conteudo1, conteudo2))
    
    val flavia = Usuario("Flavia")                      
    val rebeca = Usuario("Rebeca")
    val arthu = Usuario("Arthu")
    val diogo = Usuario("Diogo")
    
    formacao.matricular(flavia, rebeca, arthu, diogo)
    
    println("Conteúdos da formação ${formacao.nome}:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome}")
    }

    println("\nInscritos na formação ${formacao.nome}:")
    for (usuario in formacao.inscritos) {
        println("- ${usuario.nome}")
    }
}
