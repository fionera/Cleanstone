package rocks.cleanstone.io.vanilla.nbt.type;

import rocks.cleanstone.io.vanilla.nbt.TagType;
import rocks.cleanstone.io.vanilla.nbt.VanillaTagType;

import java.util.Map;

public class CompoundTag extends AbstractTag<Map<String, AbstractTag>> {

    public CompoundTag(byte[] rawData) {
        super(rawData);
    }

    @Override
    public Map<String, AbstractTag> get() {
        // TODO
        return null;
    }

    @Override
    public TagType getType() {
        return VanillaTagType.COMPOUND;
    }
}