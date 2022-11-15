package club.someoneice.never_famine

import club.someoneice.never_famine.init.BlockInit
import club.someoneice.never_famine.init.ItemInit
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val modid = "never_famine"
val LOGGER: Logger = LoggerFactory.getLogger(modid)

val DSG = FabricItemGroupBuilder.build(
    Identifier(modid, "never_famine")
) { ItemStack(Items.CAKE) }

fun onInitialize() {
    LOGGER.info("Welcome to play Never Famine! Now your world will NEVER FAMINE ......")
    ItemInit.init()
    BlockInit.init()
}
