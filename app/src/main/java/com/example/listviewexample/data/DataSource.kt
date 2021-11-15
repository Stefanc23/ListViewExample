package com.example.listviewexample.data

import com.example.listviewexample.R
import com.example.listviewexample.model.Coffee

class DataSource {

    fun load() = arrayListOf(
            Coffee(
                R.drawable.espresso,
                "Espresso",
                "A single shot of coffee produced by forcing hot water through finely ground coffee beans."
            ),
            Coffee(
                R.drawable.doppio,
                "Doppio",
                "A double shot of espresso with no added hot water or milk. This results in 60 ml of coffee. Doppio means 'double' in Italian."
            ),
            Coffee(
                R.drawable.ristretto,
                "Ristretto",
                "A ristretto, which means 'restricted' in Italian, is a shot of espresso coffee but extracted with half the amount of water."
            ),
            Coffee(
                R.drawable.longblack,
                "Long Black",
                "A long black is made by pouring a double-shot of espresso over hot water."
            ),
            Coffee(
                R.drawable.cappuccino,
                "Cappuccino",
                "A cappuccino is one part espresso shot, one part textured milk and one part froth on top with a dusting of chocolate to finish."
            ),
            Coffee(
                R.drawable.latte,
                "Latte",
                "A latte is a coffee espresso shot filled with steamed milk and with a layer of foamed milk crema."
            ),
            Coffee(
                R.drawable.mocha,
                "Mocha",
                "A latte with the added sweetness of chocolate. A mocha can be prepared by adding chocolate to the espresso shot before adding the textured milk, or adding the chocolate to the cold milk before frothing."
            ),
            Coffee(
                R.drawable.affogato,
                "Affogato",
                "Combine a scoop of vanilla ice cream and a double shot of hot espresso and you have an affogato. Great for a post-lunch or dinner treat."
            ),
        )
}