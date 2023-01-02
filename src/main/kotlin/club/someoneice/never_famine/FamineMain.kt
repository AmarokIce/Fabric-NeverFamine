package club.someoneice.never_famine

import club.someoneice.never_famine.init.BlockInit
import club.someoneice.never_famine.init.ItemInit
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.resource.featuretoggle.FeatureSet
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory


const val modid = "never_famine"
val LOGGER: Logger = LoggerFactory.getLogger(modid)

fun onInitialize() {
    LOGGER.info("Welcome to play Never Famine! Now your world will NEVER FAMINE ......")
    ItemInit.init()
    BlockInit.init()

    FabricItemGroup.builder(Identifier(modid, "never_famine"))
        .icon { ItemStack(Items.CAKE) }.entries{ features: FeatureSet, entries: ItemGroup.Entries, _: Boolean ->
            run {
                for (i: Item in ItemInit.itemList) {
                    entries.add(i)
                }
            }
        }.build()



}
