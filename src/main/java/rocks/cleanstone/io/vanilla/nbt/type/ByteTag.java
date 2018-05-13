package rocks.cleanstone.io.vanilla.nbt.type;

import rocks.cleanstone.io.vanilla.nbt.TagType;
import rocks.cleanstone.io.vanilla.nbt.VanillaTagType;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteTag extends AbstractTag<Byte> {

    public ByteTag(byte[] rawData) {
        super(rawData);
    }

    @Override
    public Byte get() {
        return ByteBuffer.wrap(this.rawData).order(ByteOrder.BIG_ENDIAN).get();
    }

    @Override
    public TagType getType() {
        return VanillaTagType.BYTE;
    }
}
