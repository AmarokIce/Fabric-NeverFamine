package club.someoneice.never_famine.util

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.world.World

class BowlFood(settings: Settings?) : Item(settings) {
    override fun finishUsing(itemStack: ItemStack, world: World, player: LivingEntity): ItemStack {
        if (player is PlayerEntity)
            if (!player.giveItemStack(ItemStack(Items.BOWL))) player.dropItem(ItemStack(Items.BOWL), false)
        return super.finishUsing(itemStack, world, player)
    }
}