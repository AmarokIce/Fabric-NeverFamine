package club.someoneice.never_famine.init

import club.someoneice.never_famine.common.item.BukkitFood
import club.someoneice.never_famine.common.item.KnifeItem
import club.someoneice.never_famine.modid
import club.someoneice.never_famine.util.ItemList
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ItemInit {
    val itemList = ArrayList<Item>()

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
        registerItem("knife", Knife)
        registerItem("leaves", Leaves)
        registerItem("cup", Cup)
        registerItem("cooked_canes", CookedCanes)
        registerItem("cooked_leather", CookedLeather)
        registerItem("cooked_egg", CookedEgg)
        registerItem("marshmallows", Marshmallows)
        registerItem("cooked_carrot", CookedCarrot)
        registerItem("pumpkin_side", PumpkinSide)
        registerItem("chocolate", Chocolate)
        registerItem("cooked_mushroom", CookedMushroom)
        registerItem("cooked_vine", CookedVine)
        registerItem("lotus", Lotus)
        registerItem("cooked_lotus", CookedLotus)
        registerItem("cactus_fruit", CactusFruit)
        registerItem("cooked_cactus_fruit", CoookedCactusFruit)
        registerItem("ice_cream", IceCream)
        registerItem("berries_juice", BerriesJuice)
        registerItem("glow_berries_juice", GlowBerriesJuice)
        registerItem("cooked_flesh", CookedFlesh)
        registerItem("cooked_eye", CookedEye)
        registerItem("cooked_bone", CookedBone)
        registerItem("cooked_pearl", CookedPearl)
        registerItem("slime_fudge", SlimeFudge)
        registerItem("cooked_seed", CookedSeed)
        registerItem("grass_salad", GrassSalad)
        registerItem("leaves_salad", LeavesSalad)
        registerItem("mushroom_salad", MushroomSalad)
        registerItem("seed_salad", SeedSalad)
        registerItem("tramp_salad", TrampSalad)
        registerItem("hot_milk", HotMilk)
        registerItem("cheese", Cheese)
        registerItem("nectar", Nectar)
    }

    private fun registerItem(name: String, item: Item) {
        itemList.add(item)
        Registry.register(Registries.ITEM, Identifier(modid, name), item)
    }
}