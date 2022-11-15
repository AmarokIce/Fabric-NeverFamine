package club.someoneice.never_famine.common.item

import club.someoneice.never_famine.DSG
import net.minecraft.advancement.criterion.Criteria
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.ItemUsage
import net.minecraft.item.Items
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.stat.Stats
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.util.UseAction
import net.minecraft.world.World


class BukkitFood(private val isBukkitFood: Boolean): Item(Settings().group(DSG)) {
    override fun finishUsing(itemStack: ItemStack, world: World, player: LivingEntity): ItemStack {
        if (player is ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(player, itemStack)
            player.incrementStat(Stats.USED.getOrCreateStat(this))
        }

        if (player is PlayerEntity && !player.abilities.creativeMode) itemStack.decrement(1)

        if (!world.isClient) {
            player.clearStatusEffects()
            player.addStatusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 20 * 30, 0))
        }

        return if (itemStack.isEmpty)
            if (isBukkitFood) ItemStack(Items.BUCKET) else ItemStack.EMPTY
        else itemStack
    }


    override fun getMaxUseTime(stack: ItemStack?): Int {
        return 32
    }

    override fun getUseAction(stack: ItemStack?): UseAction {
        return UseAction.DRINK
    }

    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack?>? {
        return ItemUsage.consumeHeldItem(world, user, hand)
    }
}