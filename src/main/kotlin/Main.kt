fun main() {
    val person1 = Person("Jack", "Empereur", mutableListOf())
    val person2 = Person("Severin", "Demon", mutableListOf())
    val person3 = PersonPrivate("T'es","Blocké", mutableListOf(person1))
    person1.addFriend(person2)
    println("Personne 1: $person1")
    println("Amis de Personne 1: ${person1.printFriends()}")
    person2.printInfo()
    println("Amis de Personne 2: ${person2.printFriends()}")
    println("Amis de Personne 3: ${person3.printFriends()}")

    val message = Message("cc !", person1, person2)
    println("message: $message")
    message.printInfo()

    val post1 = Post(person1, "J'ai adoré mes vacances")
    val post2 = Post(person2, "Je hais les patates")

    person1.page.addPost(post1)
    person2.page.addPost(post2)
    println("--------Page de Personne 2----------\n ${person2.page} \n--------Fin-----------")

    post1.modifyPost("J'ai adoré mes vacances et les patates")
    println("--------Page de Personne 1----------\n ${person1.page} \n--------Fin-----------")
}