package club.someoneice.never_famine.init

import club.someoneice.never_famine.common.item.BukkitFood
import club.someoneice.never_famine.common.item.KnifeItem
import club.someoneice.never_famine.util.ItemList
import club.someoneice.never_famine.modid
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


object ItemInit {
    val Knife: Item = KnifeItem()
    val Leaves: Item = ItemList.ItemItems()
    val Cup: Item = ItemList.ItemItems()

    val CookedCanes: Item = ItemList.ItemFoods(6, false, false, false)
    val CookedLeather: Item = ItemList.ItemFoods(6, false, false, false)
    val CookedEgg: Item = ItemList.ItemFoods(6, false, true, false)
    val Marshmallows: Item = ItemList.ItemFoods(6, false, true, false)
    val CookedCarrot: Item = ItemList.ItemFoods(8, false, false, false)
    val PumpkinSide: Item = ItemList.ItemFoods(4, false, true, false)
    val Chocolate: Item = ItemList.ItemFoods(8, false, false, false)
    val CookedMushroom: Item = ItemList.ItemFoods(6, false, false, false)
    val CookedVine: Item = ItemList.ItemFoods(6, false, false, false)
    val Lotus: Item = ItemList.ItemFoods(2, false, false, false)
    val CookedLotus: Item = ItemList.ItemFoods(6, false, false, false)
    val CactusFruit: Item = ItemList.ItemFoods(2, false, true, false)
    val CoookedCactusFruit: Item = ItemList.ItemFoods(4, false, true, false)
    val CookedFlesh: Item = ItemList.ItemFoods(4, false, false, false)
    val CookedEye: Item = ItemList.ItemFoods(2, false, false, false)
    val CookedBone: Item = ItemList.ItemFoods(4, false, false, false)
    val CookedPearl: Item = ItemList.ItemFoods(3, false, false, false)
    val SlimeFudge: Item = ItemList.ItemFoods(6, false, false, false)
    val CookedSeed: Item = ItemList.ItemFoods(3, false, false, false)

    val IceCream: Item = ItemList.CupFoods(3, false, false, false)
    val BerriesJuice: Item = ItemList.CupFoods(3, false, true, false)
    val GlowBerriesJuice: Item = ItemList.CupFoods(3, false, true, false)

    val GrassSalad: Item = ItemList.BowlFoods(6, false, false, false)
    val LeavesSalad: Item = ItemList.BowlFoods(6, false, false, false)
    val MushroomSalad: Item = ItemList.BowlFoods(14, false, false, false)
    val SeedSalad: Item = ItemList.BowlFoods(14, false, false, false)
    val TrampSalad: Item = ItemList.BowlFoods(10, false, false, false)

    val HotMilk: Item = BukkitFood(true)
    val Cheese: Item = ItemList.ItemFoods(1, false, false, true)

    val Nectar: Item = BukkitFood(false)

    fun init() {
        Registry.register(Registry.ITEM, Identifier(modid, "knife"), Knife)

        Registry.register(Registry.ITEM, Identifier(modid, "leaves"), Leaves)
        Registry.register(Registry.ITEM, Identifier(modid, "cup"), Cup)

        Registry.register(Registry.ITEM, Identifier(modid, "cooked_canes"), CookedCanes)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_leather"), CookedLeather)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_egg"), CookedEgg)
        Registry.register(Registry.ITEM, Identifier(modid, "marshmallows"), Marshmallows)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_carrot"), CookedCarrot)
        Registry.register(Registry.ITEM, Identifier(modid, "pumpkin_side"), PumpkinSide)
        Registry.register(Registry.ITEM, Identifier(modid, "chocolate"), Chocolate)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_mushroom"), CookedMushroom)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_vine"), CookedVine)
        Registry.register(Registry.ITEM, Identifier(modid, "lotus"), Lotus)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_lotus"), CookedLotus)
        Registry.register(Registry.ITEM, Identifier(modid, "cactus_fruit"), CactusFruit)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_cactus_fruit"), CoookedCactusFruit)
        Registry.register(Registry.ITEM, Identifier(modid, "ice_cream"), IceCream)
        Registry.register(Registry.ITEM, Identifier(modid, "berries_juice"), BerriesJuice)
        Registry.register(Registry.ITEM, Identifier(modid, "glow_berries_juice"), GlowBerriesJuice)

        Registry.register(Registry.ITEM, Identifier(modid, "cooked_flesh"), CookedFlesh)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_eye"), CookedEye)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_bone"), CookedBone)
        Registry.register(Registry.ITEM, Identifier(modid, "cooked_pearl"), CookedPearl)
        Registry.register(Registry.ITEM, Identifier(modid, "slime_fudge"), SlimeFudge)

        Registry.register(Registry.ITEM, Identifier(modid, "cooked_seed"), CookedSeed)

        Registry.register(Registry.ITEM, Identifier(modid, "grass_salad"), GrassSalad)
        Registry.register(Registry.ITEM, Identifier(modid, "leaves_salad"), LeavesSalad)
        Registry.register(Registry.ITEM, Identifier(modid, "mushroom_salad"), MushroomSalad)
        Registry.register(Registry.ITEM, Identifier(modid, "seed_salad"), SeedSalad)
        Registry.register(Registry.ITEM, Identifier(modid, "tramp_salad"), TrampSalad)

        Registry.register(Registry.ITEM, Identifier(modid, "hot_milk"), HotMilk)
        Registry.register(Registry.ITEM, Identifier(modid, "cheese"), Cheese)

        Registry.register(Registry.ITEM, Identifier(modid, "nectar"), Nectar)
    }
}