package club.someoneice.ds.util

import club.someoneice.ds.DSG
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings

object ItemList {
    fun ItemItems(): Item {
        return Item(Settings().group(DSG))
    }

    fun ItemFoods(hunger: Int, wolfFood: Boolean, fastEat: Boolean, alwaysEat: Boolean): Item {
        val settings = Settings()
        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        if (((hunger / 10) - 0.2) > 0) builder.saturationModifier(((hunger / 10) - 0.2).toFloat())
        else builder.saturationModifier(0.0f)

        if (wolfFood) builder.meat()
        if (fastEat) builder.snack()
        if (alwaysEat) builder.alwaysEdible()
        settings.group(DSG)

        settings.food(builder.build())
        return Item(settings)
    }

    fun BowlFoods(hunger: Int, wolfFood: Boolean, fastEat: Boolean, alwaysEat: Boolean): Item {
        val settings = Settings()
        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        if (((hunger / 10) - 0.2) > 0) builder.saturationModifier(((hunger / 10) - 0.2).toFloat())
        else builder.saturationModifier(0.0f)

        if (wolfFood) builder.meat()
        if (fastEat) builder.snack()
        if (alwaysEat) builder.alwaysEdible()
        settings.group(DSG)

        settings.food(builder.build())
        return BowlFood(settings)
    }

    fun CupFoods(hunger: Int, wolfFood: Boolean, fastEat: Boolean, alwaysEat: Boolean): Item {
        val settings = Settings()
        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        if (((hunger / 10) - 0.2) > 0) builder.saturationModifier(((hunger / 10) - 0.2).toFloat())
        else builder.saturationModifier(0.0f)

        if (wolfFood) builder.meat()
        if (fastEat) builder.snack()
        if (alwaysEat) builder.alwaysEdible()
        settings.group(DSG)

        settings.food(builder.build())
        return CupFood(settings)
    }
}