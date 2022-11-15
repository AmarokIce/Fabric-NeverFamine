package club.someoneice.never_famine.init

import club.someoneice.never_famine.DSG
import club.someoneice.never_famine.common.block.FoodBlockHelper
import club.someoneice.never_famine.modid
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object BlockInit {
    /**
     * Block
     */
    val CheeseBlock: Block = FoodBlockHelper()
    val ChocolateBlock: Block = FoodBlockHelper()

    /**
     * BlockItem
     */
    val CheeseBlock_Item: BlockItem = BlockItem(CheeseBlock, Item.Settings().group(DSG))
    val ChocolateBlock_Item: BlockItem = BlockItem(ChocolateBlock, Item.Settings().group(DSG))

    fun init() {
        Registry.register(Registry.BLOCK, Identifier(modid, "cheese_block"), CheeseBlock)
        Registry.register(Registry.BLOCK, Identifier(modid, "chocolate_block"), ChocolateBlock)

        Registry.register(Registry.ITEM, Identifier(modid, "cheese_block_item"), CheeseBlock_Item)
        Registry.register(Registry.ITEM, Identifier(modid, "chocolate_block_item"), ChocolateBlock_Item)
    }
}