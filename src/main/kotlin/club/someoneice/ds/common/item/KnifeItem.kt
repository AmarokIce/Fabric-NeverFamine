package club.someoneice.ds.common.item

import club.someoneice.ds.DSG
import club.someoneice.ds.init.ItemInit
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.tag.BlockTags
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.world.RaycastContext.FluidHandling
import net.minecraft.world.World
import net.minecraft.world.event.GameEvent
import java.util.*


class KnifeItem(): Item(Settings().group(DSG).maxCount(1)) {

    override fun use(world: World, player: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack>? {
        val itemStack = player.getStackInHand(hand)
        val areaEffectCloudEntity: HitResult = raycast(world, player, FluidHandling.SOURCE_ONLY)
        if (areaEffectCloudEntity.type == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack)
        } else {
            if (areaEffectCloudEntity.type == HitResult.Type.BLOCK) {
                val blockPos = (areaEffectCloudEntity as BlockHitResult).blockPos
                if (!world.canPlayerModifyAt(player, blockPos)) return TypedActionResult.pass(itemStack)

                return if (world.getBlockState(blockPos).isIn(BlockTags.LEAVES)) {
                    world.playSound(player, player.x, player.y, player.z, SoundEvents.BLOCK_AZALEA_LEAVES_BREAK, SoundCategory.NEUTRAL, 1.0f, 1.0f)
                    world.emitGameEvent(player, GameEvent.FLUID_PICKUP, blockPos)

                    if (Random().nextInt(2) == 0)  TypedActionResult.success(this.fill(itemStack, player, ItemStack(ItemInit.Leaves)), world.isClient())
                    else TypedActionResult.pass(knife(itemStack, player))
                } else if (world.getBlockState(blockPos).isIn(BlockTags.FLOWERS)) {
                    world.playSound(player, player.x, player.y, player.z, SoundEvents.BLOCK_AZALEA_LEAVES_BREAK, SoundCategory.NEUTRAL, 1.0f, 1.0f)
                    world.emitGameEvent(player, GameEvent.FLUID_PICKUP, blockPos)

                    if (Random().nextInt(9) == 0) TypedActionResult.success(this.fill(itemStack, player, ItemStack(ItemInit.Nectar)), world.isClient())
                    else TypedActionResult.fail(knife(itemStack, player))
                } else TypedActionResult.pass(itemStack)
            }
        }
        return TypedActionResult.pass(itemStack)
    }

    protected fun fill(itemStack: ItemStack?, player: PlayerEntity, outputStack: ItemStack?): ItemStack? {
        // player.incrementStat(Stats.USED.getOrCreateStat(this))
        // return if (Random().nextInt(15) > 5) ItemUsage.exchangeStack(itemStack, player, outputStack)
        // else ItemUsage.exchangeStack(ItemStack.EMPTY, player, outputStack)

        if (!player.giveItemStack(outputStack)) player.dropItem(outputStack, false)
        return if (Random().nextInt(9) == 0) ItemStack.EMPTY else itemStack
    }

    protected fun knife(itemStack: ItemStack?, player: PlayerEntity): ItemStack? {
        return if (Random().nextInt(9) == 0 && !player.isCreative) ItemStack.EMPTY else itemStack
    }
}