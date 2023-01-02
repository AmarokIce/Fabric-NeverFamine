package club.someoneice.never_famine.util

import club.someoneice.never_famine.init.ItemInit
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.UseAction
import net.minecraft.world.World

class CupFood(settings: Settings?) : Item(settings) {

    override fun getMaxUseTime(stack: ItemStack?): Int {
        return 32
    }

    override fun getUseAction(stack: ItemStack?): UseAction {
        return UseAction.DRINK
    }

    override fun finishUsing(itemStack: ItemStack, world: World, player: LivingEntity): ItemStack {
        if (player is PlayerEntity)
            if (!player.giveItemStack(ItemStack(ItemInit.Cup))) player.dropItem(ItemStack(ItemInit.Cup), false)
        return super.finishUsing(itemStack, world, player)
    }
}