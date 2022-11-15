package club.someoneice.never_famine.common.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.event.GameEvent
import java.util.*

class FoodBlockHelper : Block(Settings.of(Material.SNOW_BLOCK).strength(0.1f).sounds(BlockSoundGroup.STONE)) {
    @Deprecated("Deprecated in Java")
    override fun onUse(state: BlockState, world: World, pos: BlockPos, player: PlayerEntity, hand: Hand, hit: BlockHitResult): ActionResult {
        world.playSound(player, player.x, player.y, player.z, SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.BLOCKS, 1.0f, 1.0f + (world.random.nextFloat() - world.random.nextFloat()) * 0.3f)
        player.hungerManager.add(2, 0.2f)
        if (!world.isClient) {
            if (Random().nextInt(15) == 0) {
                world.removeBlock(pos, false)
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
        }
        return ActionResult.SUCCESS
    }
}