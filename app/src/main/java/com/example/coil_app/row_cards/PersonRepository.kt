package com.example.coil_app.row_cards

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                title = "Batman",
                body = "Batman is a fictional character of a superhero, who appears in the DC Comics booklets.\n" +
                        "The character first appeared as the comic book's Gold from March 1939 and was created by " +
                        "artist Bob Kane and writer Bill Finger.\n" +
                        "The character is known as \"The Batman\", \"The Dark Knight\", \"The Crusader in a Cloak\" and " +
                        "\"The Greatest Detective in the World\".",
                section = "Superheroes",
                Image ="https://i.pinimg.com/564x/f8/81/c4/f881c448813e58cd527557cc7f05cdac.jpg"
            ),
            Person(
                id = 1,
                title = "Captain America",
                body = "Captain America is a fictional superhero character who appears in Marvel Comics books.\n" +
                        "The character was created by writer Joe Simon and illustrator Jack Kirby.\n" +
                        "First appeared in the March 1941 issue of Captain America Comics # 1. The character of Captain America\n" +
                        "Designed as a patriotic super-soldier who\n" +
                        "Bread alongside the Allies during World War II.",
                section = "Superheroes",
                Image ="https://i.pinimg.com/564x/e1/ce/c2/e1cec29f02a8a8a321f4e4652ded496d.jpg"
            ),
            Person(
                id = 2,
                title = "Cat Woman",
                body = "Cat Woman is a fictional character of an anti-heroine who appears in the DC Comics booklets.\n" +
                        "The character first appeared in the Batman # 1 booklet from the spring of 1940,\n" +
                        "and was created by writer Bill Finger and illustrator Bob Kane.\n" +
                        "She's the most successful thief in Gotham City. Over the years she has maintained\n" +
                        "an inconsistent relationship with Batman.",
                section = "Superheroes",
                Image ="https://i.pinimg.com/564x/74/dc/fd/74dcfd530d2a41e880f78659823ee039.jpg"
            ),
            Person(
                id = 3,
                title = "The Flash",
                body = "The Flash or Lightning is the common name of a number of fictional characters, superheroes who\n" +
                        "appear in DC Comics booklets. The original Golden Age Flash was created by writer Gardner Fox\n" +
                        "and illustrator Harry Lampert and first appeared in the January 1940 issue of Flash Comics # 1.\n" +
                        "The Flash has a super-speed capability that includes the ability to run and move at tremendous speeds,\n" +
                        "with superhuman reflexes, in violation of the laws of physics.",
                section = "Superheroes",
                Image ="https://i.pinimg.com/564x/63/a7/59/63a759c87173f52bb096d4c89124fc6d.jpg"
            ),
            Person(
                id = 4,
                title = "Wonder Woman",
                body = "Wonder Woman is a fictional superhero character who appears in DC Comics booklets.\n" +
                        "Her character first appeared in the December 1941 All-Star Comics booklet # 8 and was\n" +
                        "created by William Molton Marston.\n" +
                        "This character is the most famous among the superheroes and is one of the three superheroes\n" +
                        "(along with Superman and Batman) released since the founding of DC. It was designed by Marston as having\n" +
                        "superhuman abilities and tools given to it by the Olympic gods, in order to bring peace, love and brotherhood to a divided world.",
                section = "Superheroes" ,
                Image="https://i.pinimg.com/564x/41/37/82/413782661b0547a9bfc91aee3a0f4cdd.jpg"
            ),
            Person(
                id = 5,
                title = "Duffy Duck",
                body = "Duffy Duck is a famous duck animated and comic book character.\n" +
                        "Duffy Duck has appeared in the cartoon series \"Looney Tunes\" and \"Mary Melodis\" produced by Warner Bros.\n" +
                        "Was one of the first characters in the film genre of the crazy comedy. The characteristic features of Duffy Duck\n" +
                        "are his tendency to accumulate anger until outburst, narcissism, stupidity and unbearable arrogance mixed with trouble,\n" +
                        "cunning and selfishness.",
                section = "Looney Tunes",
                Image="https://i.pinimg.com/564x/cf/c5/a5/cfc5a5e2343e67eba93888a26e80a919.jpg"
            ),
            Person(
                id = 6,
                title = "Bugs Bunny",
                body = "Bugs Bunny is an animated rabbit who appears in the cartoon series \"Looney Tunes\" and \"Mary Melodis\" \n" +
                        "produced by the Warner Brothers. He is considered one of the most recognizable cartoon characters in the world.\n" +
                        "Bugs Bunny became famous with the phrase \"Ah, what does it sound like, Doc?\", Which was said while chewing carrots,\n" +
                        "and in his conflicts with Elmer Pad, Yosemite Sam, Marvin from Mars, Tasmanian demon Taz, Duffy Duck and even Weil E.",
                section = "Looney Tunes",
                Image="https://i.pinimg.com/564x/2b/73/10/2b7310faa95496489664af8dd90b70f3.jpg"
            ),
            Person(
                id = 7,
                title = "Taz",
                body = "Tasmanian demon taz or taz is a fictional character created in the 1950s and appears in the animated\n" +
                        "films of the Looney Tunes. Taz is a Tasmanian demon and he has a bad temper, hot-tempered, always hungry\n" +
                        "and destroys everything that happens in his way by the tornado he creates as he progresses. Taz is a pretty stupid\n" +
                        "creature and can be easily \"arranged\", but when he realizes that they have piled him up he should stay away from him,\n" +
                        "he is considered the most violent of the Looney Tunes characters.",
                section = "Looney Tunes",
                Image="https://i.pinimg.com/564x/7a/53/10/7a531044f72add48a8531560eb1f8628.jpg"
            ),
            Person(
                id = 8,
                title = "The Brain",
                body = "Pinky and the Brain is a 66-episode animated series produced for television between 1995 and 1998 on the Kids' WB network.\n" +
                        "In Israel, the series was broadcast on the children's channel in the 1990s. The series was produced by Steven Spielberg and Warner Bros.\n" +
                        "Studios. Pinky and the Brain are two genetically engineered lab mice, which has given them human-level intelligence and the ability to speak. A brain\n" +
                        "is a genius and serious-minded mouse that wants to take over the world.",
                section = "Looney Tunes",
                Image="https://i.pinimg.com/564x/be/c8/da/bec8dad2362ff8c77f97fe1fb9a2e07f.jpg"
            ),
            Person(
                id = 9,
                title = "Tweety",
                body = "Tweety is a character in the animated series \"Looney Tunes\". Tweety is a bird of the canary species. In most of the videos in which\n" +
                        "he appears, he is in conflict with Sylvester the cat, who is trying to eat him.",
                section = "Looney Tunes",
                Image="https://i.pinimg.com/564x/d7/a0/14/d7a014814ca230ec908caff0ddbc9c1b.jpg"
            ),
            Person(
                id = 10,
                title = "Garfield",
                body = "Garfield is an American comic strip by illustrator Jim Davis. The comic depicts the life of a cat named Garfield with human qualities, characterized by\n" +
                        "extraordinary laziness and hunger.",
                section = "Popular Shows",
                Image="https://i.pinimg.com/564x/a1/cf/c9/a1cfc9bd67c365886c3aa1ab91bd4294.jpg"
            ),
            Person(
                id = 11,
                title = "Papa Smurf",
                body = "The Smurfs is a Belgian franchise that deals with the adventures of a fictional colony of small, blue, human-like creatures living in a village with mushroom-shaped\n" +
                        "houses in the heart of the forest. The franchise began as a comic strip originally created by Belgian comics artist Pierre \"Pio\" Culipur and first appeared in Spiro\n" +
                        "magazine on October 23, 1958. Papa Smurf represents a father figure to the rest of the smurfs. 584 years old, with a white beard and a red hat. Is smart and knowledgeable. \n" +
                        "He is a magician with extensive experience in preparing special potions and spells.",
                section = "Popular Shows",
                Image="https://i.pinimg.com/564x/5e/77/b3/5e77b3416a0f73607139e84216abc773.jpg"
            ),
            Person(
                id = 12,
                title = "Pikachu",
                body = "Pikachu is one of the most famous and well-known Japanese (anime) character in the world, which is a symbol of the \"Pokemon\" franchise owned by Nintendo, developed by the game\n" +
                        "company Game Freak. Pikachu is a fictional character who first appeared in video games in the Pokemon franchise.",
                section = "Popular Shows",
                Image="https://i.pinimg.com/564x/fc/f4/bb/fcf4bbd7cfb472e2fd1adae08ddd9654.jpg"
            ),
            Person(
                id = 13,
                title = "Pink Panther",
                body = "The Pink Panther is the name of a series of comedy films, the first of which came out in 1963. The character \"The Pink Panther\" appeared in a short video shown before the beginning\n" +
                        "of each film, in which Supervisor Closo chases after the Pink Panther without success. The movie \"The Pink Panther\" (1963) was directed by Blake Edwards, who also created the character.",
                section = "Popular Shows",
                Image="https://i.pinimg.com/564x/e8/61/6e/e8616e8df8c9d7675626933e1410aef2.jpg"
            ),
            Person(
                id = 14,
                title = "Sonic",
                body = "Sonic the Hedgehog is a popular video game series, from the Japanese company Sega. In the years 1988-1989, a 16-bit game console was released in Japan and the United States, \n" +
                        "the \"Sega Mega Drive\" of the Sega company. The blue hedgehog, designed by Nauto Oshima.",
                section = "Popular Shows",
                Image="https://i.pinimg.com/564x/dc/db/05/dcdb0522df35e71fc34a2c7193e7cffd.jpg"
            ),
            Person(
                id = 15,
                title = "Dexter",
                body = "Dexter's Lab is a 79-episode American comedy animated series created by Gandhi Tartakovsky. The plot of the series tells the story of Dexter, a genius boy who owns a secret\n" +
                        "laboratory in his home who has to deal with the harassment of his sister, who knows about the existence of the laboratory. The series was produced for the Cartoon Network by\n" +
                        "Hannah-Barbara between 1996 and 1999 and 2001 to 2003.",
                section = "Human",
                Image="https://i.pinimg.com/564x/5e/55/5e/5e555e9d24e8ac0ef72ac62a1f4cf21d.jpg"
            ),
            Person(
                id = 16,
                title = "Popeye",
                body = "Popeye the sailor man is a comic book and cartoon character created by Elzie Segar in 1929. When Popeye gets into trouble he eats spinach from a can, and gains tremendous power, \n" +
                        "usually to save his beloved Olive Oil from his enemy Baluto.",
                section = "Human",
                Image="https://i.pinimg.com/564x/c0/f2/2c/c0f22c172549b0af08d95590812914c8.jpg"
            ),
            Person(
                id = 17,
                title = "Flintstones",
                body = "The Flintstones is a 166-episode animated series originally produced by Hannah-Barbara for the ABC channel, 1960-1966. The series is originally based on a 1950s American situation comedy \n" +
                        "called \"The Honeymooners\". The series focused on the life of an ancient man belonging to the working class in a modern version of the Stone Age, his family and neighbor Bernie, who is also his best friend.",
                section = "Human",
                Image="https://i.pinimg.com/564x/55/fa/a0/55faa07a67d9cc3882e74eb0eafbf410.jpg"
            ),
            Person(
                id = 18,
                title = "X-Men",
                body = "X-Men is a superhero fiction group that appears in Marvel Comics booklets. Her first appearance was in September 1963 in the booklet The X-Men # 1, and it was created by writer Stan Lee and illustrator Jack Kirby. \n" +
                        "The X-Men are mutants - a subspecies and minority of humans who, following an evolutionary leap, were born with superhuman abilities.",
                section = "Human",
                Image="https://i.pinimg.com/564x/14/40/07/144007bea34b5a3a605fcb5d5faa1150.jpg"
            ),
            Person(
                id = 19,
                title = "Harrison Ford",
                body = "Harrison Ford is a Jewish-American film actor. Some of his most famous roles were Han Solo in the Star Wars movie trilogy, archaeologist and adventurer Indiana Jones, private detective Rick Deckard in the science \n" +
                        "fiction film Blade Runner, Richard Kimble in \"The Escape\" and as \"Jack Ryan\" in the film series According to Tom Clancy's books. Between 1977 and 1983, he starred in four of the ten most lucrative films of all time, and in 2001 was named \"The Most Profitable Actor\" in the Guinness Book of Records.",
                section = "Human",
                Image="https://i.pinimg.com/564x/ab/92/c5/ab92c5960881ec5af98c4ad965bc0173.jpg"
            ),
        )
    }
}
