package club.someoneice.ds.init

import club.someoneice.ds.MODID
import club.someoneice.ds.common.item.BukkitFood
import club.someoneice.ds.common.item.KnifeItem
import club.someoneice.ds.util.ItemList
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
        Registry.register(Registry.ITEM, Identifier(MODID, "knife"), Knife)

        Registry.register(Registry.ITEM, Identifier(MODID, "leaves"), Leaves)
        Registry.register(Registry.ITEM, Identifier(MODID, "cup"), Cup)

        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_canes"), CookedCanes)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_leather"), CookedLeather)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_egg"), CookedEgg)
        Registry.register(Registry.ITEM, Identifier(MODID, "marshmallows"), Marshmallows)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_carrot"), CookedCarrot)
        Registry.register(Registry.ITEM, Identifier(MODID, "pumpkin_side"), PumpkinSide)
        Registry.register(Registry.ITEM, Identifier(MODID, "chocolate"), Chocolate)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_mushroom"), CookedMushroom)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_vine"), CookedVine)
        Registry.register(Registry.ITEM, Identifier(MODID, "lotus"), Lotus)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_lotus"), CookedLotus)
        Registry.register(Registry.ITEM, Identifier(MODID, "cactus_fruit"), CactusFruit)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_cactus_fruit"), CoookedCactusFruit)
        Registry.register(Registry.ITEM, Identifier(MODID, "ice_cream"), IceCream)
        Registry.register(Registry.ITEM, Identifier(MODID, "berries_juice"), BerriesJuice)
        Registry.register(Registry.ITEM, Identifier(MODID, "glow_berries_juice"), GlowBerriesJuice)

        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_flesh"), CookedFlesh)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_eye"), CookedEye)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_bone"), CookedBone)
        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_pearl"), CookedPearl)
        Registry.register(Registry.ITEM, Identifier(MODID, "slime_fudge"), SlimeFudge)

        Registry.register(Registry.ITEM, Identifier(MODID, "cooked_seed"), CookedSeed)

        Registry.register(Registry.ITEM, Identifier(MODID, "grass_salad"), GrassSalad)
        Registry.register(Registry.ITEM, Identifier(MODID, "leaves_salad"), LeavesSalad)
        Registry.register(Registry.ITEM, Identifier(MODID, "mushroom_salad"), MushroomSalad)
        Registry.register(Registry.ITEM, Identifier(MODID, "seed_salad"), SeedSalad)
        Registry.register(Registry.ITEM, Identifier(MODID, "tramp_salad"), TrampSalad)

        Registry.register(Registry.ITEM, Identifier(MODID, "hot_milk"), HotMilk)
        Registry.register(Registry.ITEM, Identifier(MODID, "cheese"), Cheese)

        Registry.register(Registry.ITEM, Identifier(MODID, "nectar"), Nectar)
    }
}