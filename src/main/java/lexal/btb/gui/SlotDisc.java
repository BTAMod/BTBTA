package lexal.btb.gui;

import lexal.btb.item.BTBItems;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemRecord;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.player.inventory.slot.Slot;

public class SlotDisc extends Slot {
    public SlotDisc(IInventory inventory, int id, int x, int y) {
        super(inventory, id, x, y);
    }

    @Override
    public boolean canPutStackInSlot(ItemStack itemstack) {
        return itemstack != null && (itemstack.getItem() instanceof ItemRecord || itemstack.getItem().id == BTBItems.pancake.id) && itemstack.getItem().id != BTBItems.recordBlank.id;
    }

    @Override
    public int getSlotStackLimit() {
        return 1;
    }

    @Override
    public boolean allowItemInteraction() {
        return false;
    }
}

