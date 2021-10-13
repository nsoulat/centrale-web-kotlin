fun main() {
    val person1 = Person("Jack", "Empereur", mutableListOf())
    val person2 = Person("Severin", "Demon", mutableListOf())
    val person3 = PersonPrivate("T'es","Blocké", mutableListOf(person1))
    println("Jack et Severin s'ajoutent en amis")
    person1.addFriend(person2)
    println("Voici Jack: $person1")
    println("Et voici ses amis: ${person1.printFriends()}")
    println("Ci-dessus sont les infos complètes de Severin")
    person2.printInfo()
    println("Voici les amis de Severin: ${person2.printFriends()}")
    println("Voici les amis d'une personne privée: ${person3.printFriends()}")

    val message = Message("cc !", person1, person2)
    println("message: $message")
    message.printInfo()

    val post1 = Post(person1, "J'ai adoré mes vacances")
    val post2 = Post(person2, "Je hais les patates")

    person1.page.addPost(post1)
    person2.page.addPost(post2)
    println("--------Page de Jack----------\n ${person2.page} \n------------FIN---------------")

    post1.modifyPost("J'ai adoré mes vacances et les patates")
    println("--------Page de Severin-------\n ${person1.page} \n------------FIN---------------")
}