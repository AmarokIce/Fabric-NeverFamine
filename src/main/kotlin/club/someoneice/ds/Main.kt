package club.someoneice.ds

import club.someoneice.ds.init.BlockInit
import club.someoneice.ds.init.ItemInit
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.Marker


val MODID = "never_famine"
val LOGGER: Logger = LoggerFactory.getLogger(MODID)

val DSG = FabricItemGroupBuilder.build(
    Identifier(MODID, "never_famine")
) { ItemStack(Items.CAKE) }

fun onInitialize() {
    LOGGER.info("Welcome to play Never Famin! Now Loader Never Famin main ......")
    ItemInit.init()
    BlockInit.init()
}
