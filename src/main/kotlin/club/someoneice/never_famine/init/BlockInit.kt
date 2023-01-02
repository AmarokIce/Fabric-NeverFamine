package club.someoneice.never_famine.init

import club.someoneice.never_famine.common.block.FoodBlockHelper
import club.someoneice.never_famine.modid
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object BlockInit {
    val CheeseBlock: Block = FoodBlockHelper()
    val ChocolateBlock: Block = FoodBlockHelper()

    fun init() {
        registerBlock("cheese_block", CheeseBlock)
        registerBlock("chocolate_block", ChocolateBlock)

        registerItem("cheese_block_item", BlockItem(CheeseBlock, Item.Settings()))
        registerItem("chocolate_block_item", BlockItem(ChocolateBlock, Item.Settings()))
    }

    private fun registerBlock(name: String, block: Block) {
        Registry.register(Registries.BLOCK, Identifier(modid, name), block)
    }

    private fun registerItem(name: String, item: Item) {
        ItemInit.itemList.add(item)
        Registry.register(Registries.ITEM, Identifier(modid, name), item)
    }
}