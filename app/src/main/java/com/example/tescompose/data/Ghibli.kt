package com.example.tescompose.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tescompose.R

data class Ghibli(
    val name: String,
    val year: String,
    val description: String,
    val photo: Int,
    val background: Int
) {
    fun doesMatchSearchQuery(query: String): Boolean {
        val matchingCombinations = listOf(
            "$name $year",
        )

        return matchingCombinations.any {
            it.contains(query, ignoreCase = true)
        }
    }
}

object StudioGhibliMovies {
    val ghiblis: List<Ghibli> = listOf(
        Ghibli(
            name = "Spirited Away",
            year = "2001",
            description = "Chihiro, a young girl, wanders into a mysterious world of spirits with her parents and finds herself trapped. To save her parents and escape, she must work in a bathhouse run by a witch, facing strange and sometimes dangerous creatures. Through her journey, Chihiro learns about resilience, bravery, and the importance of compassion.",
            photo = R.drawable.spirited_away,
            background = R.drawable.spirited_away_bg
        ),
        Ghibli(
            name = "My Neighbor Totoro",
            year = "1988",
            description = "Set in rural Japan, two young sisters, Satsuki and Mei, move to a new home with their father to be closer to their mother, who is recovering from an illness. As they explore their new surroundings, they encounter friendly forest spirits, including the lovable Totoro. The film is a heartwarming tale of family bonds, imagination, and the wonder of childhood.",
            photo = R.drawable.totoro,
            background = R.drawable.totoro_bg
        ),
        Ghibli(
            name = "Princess Mononoke",
            year = "1997",
            description = "Set in the Muromachi period of Japan, the film follows Ashitaka, a young prince who becomes cursed after defending his village from a demon boar. He sets out to find a cure and becomes embroiled in a conflict between the industrializing humans and the spirits of the forest, led by the fierce Princess Mononoke. The film explores themes of environmentalism, humanity's relationship with nature, and the complexities of morality.",
            photo = R.drawable.mononoke,
            background = R.drawable.mononoke_bg
        ),
        Ghibli(
            name = "Howl's Moving Castle",
            year = "2004",
            description = "Based on the novel by Diana Wynne Jones, the film follows Sophie, a young woman who is cursed by a witch and transformed into an old woman. Seeking a way to break the curse, she seeks refuge in the magical moving castle of the mysterious wizard Howl. As Sophie navigates the intricacies of the castle and its inhabitants, she discovers inner strength, love, and the power of empathy.",
            photo = R.drawable.howl_moving_castle,
            background = R.drawable.howl_moving_castle_bg
        ),
        Ghibli(
            name = "Kiki's Delivery Service",
            year = "1989",
            description = "Kiki, a young witch-in-training, leaves home with her talking cat, Jiji, to spend a year in a new town. She sets up a delivery service using her flying broomstick, delivering goods to the townspeople. As Kiki faces challenges and makes new friends, she learns about independence, responsibility, and the importance of believing in oneself.",
            photo = R.drawable.kiki,
            background = R.drawable.kiki_bg
        ),
        Ghibli(
            name = "Castle in the Sky",
            year = "1986",
            description = "Set in a steampunk-inspired world, the film follows Sheeta, a young girl who possesses a magical crystal sought after by air pirates and the government. She meets Pazu, a young boy who helps her evade capture and discover the legendary floating city of Laputa. Together, they embark on an adventure filled with aerial battles, ancient civilizations, and the power of friendship.",
            photo = R.drawable.laputa,
            background = R.drawable.laputa_bg
        ),
        Ghibli(
            name = "The Wind Rises",
            year = "2013",
            description = "Inspired by the life of Jiro Horikoshi, an aviation engineer, the film follows his dreams of designing beautiful aircraft despite the looming specter of war. Set in pre-World War II Japan, Jiro navigates personal and professional challenges, including his love for Nahoko, who suffers from tuberculosis. The film explores themes of ambition, creativity, and the cost of pursuing one's dreams in a turbulent world.",
            photo = R.drawable.wind_rises,
            background = R.drawable.wind_rises_bg
        ),
        Ghibli(
            name = "Ponyo",
            year = "2008",
            description = "A reimagining of \"The Little Mermaid\" tale, the film follows Ponyo, a goldfish princess who befriends a human boy named Sosuke. Ponyo desires to become human and be with Sosuke, unleashing a chain of magical events that threaten the balance of the world. The film is a whimsical and enchanting story of love, friendship, and the power of nature.",
            photo = R.drawable.ponyo,
            background = R.drawable.ponyo_bg
        ),
        Ghibli(
            name = "The Tale of the Princess Kaguya",
            year = "2013",
            description = "Based on the folktale \"The Tale of the Bamboo Cutter,\" the film follows a bamboo cutter who discovers a tiny princess inside a bamboo stalk. He and his wife raise her as their own, and she grows into a beautiful woman, attracting suitors from far and wide. However, Kaguya longs for freedom and resists the constraints of society and her celestial origins. The film is a visually stunning exploration of love, sacrifice, and the ephemeral nature of life.",
            photo = R.drawable.kaguya,
            background = R.drawable.kaguya_bg
        ),
        Ghibli(
            name = "The Boy and The Heron",
            year = "2023",
            description = "Taeko, a 27-year-old woman from Tokyo, takes a trip to the countryside to visit her relatives and help with the safflower harvest. During her stay, she reflects on her childhood memories, particularly her 10-year-old self, and comes to terms with her past and present. The film interweaves Taeko's past and present, exploring themes of nostalgia, self-discovery, and the passage of time.",
            photo = R.drawable.boy_and_heron,
            background = R.drawable.boy_and_heron_bg
        ),
        Ghibli(
            name = "Porco Rosso",
            year = "1992",
            description = "Set in the Adriatic Sea during the interwar period, the film follows Porco Rosso, a former World War I fighter pilot cursed to resemble a pig. Now a bounty hunter, he battles air pirates and protects the innocent. As he navigates the skies, Porco Rosso grapples with his past and searches for meaning in a changing world.",
            photo = R.drawable.porco_rosso,
            background = R.drawable.porco_rosso_bg
        ),
        Ghibli(
            name = "Whisper of the Heart",
            year = "1995",
            description = "Shizuku, a young girl with a passion for reading, discovers that all the books she borrows from the library have been previously checked out by the same person, Seiji Amasawa. Intrigued, she sets out to meet him and discover her true talents. Along the way, she learns about love, determination, and the pursuit of dreams.",
            photo = R.drawable.whisper_of_the_heart,
            background = R.drawable.whisper_of_the_heart_bg
        ),
    )
}

//@Composable
//fun MovieCard(ghiblis: Ghibli) {
//    Card(
//        shape = RoundedCornerShape(8.dp),
//        modifier = Modifier
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 6.dp
//        ),
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .padding(vertical = 12.dp, horizontal = 8.dp)
//                .width(170.dp)
//        ) {
//            Image(
//                painter = painterResource(id = ghiblis.photo),
//                contentDescription = ghiblis.name,
//                contentScale = ContentScale.Fit,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .size(220.dp)
//                    .clip(RoundedCornerShape(8.dp))
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = ghiblis.name,
//                style = MaterialTheme.typography.titleMedium,
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis,
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//
//        }
//    }
//}

@Composable
fun MovieCardGradient(ghiblis: Ghibli, modifier: Modifier) {
    Box(Modifier.aspectRatio(9f/16f)) {
        Image(
            painterResource(ghiblis.photo),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.drawWithCache {
                onDrawWithContent {
                    drawContent()
                    drawRect(
                        Brush.verticalGradient(
                            0.5f to Color.Black.copy(alpha = 0F),
                            0.9F to Color.Black
                        )
                    )
                }
            }
        )
        Text(
            text = ghiblis.name,
            color = Color.LightGray,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(bottom = 36.dp)
        )
    }

}

@Preview("Tes")
@Composable
fun MovieCardPreview() {
    MovieCardGradient(ghiblis = StudioGhibliMovies.ghiblis[0], Modifier.fillMaxSize())
}

@Preview("Tes List")
@Composable
fun MovieListPreview() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        content = {
            itemsIndexed(StudioGhibliMovies.ghiblis) { index, item ->
                MovieCardGradient(ghiblis = item, Modifier.fillMaxHeight())
            }
        }
    )
}
