package random.gingerbread.block;

import net.minecraft.block.material.MaterialColor;

public enum GumdropColor {
    BLUE(MaterialColor.BLUE),
    CYAN(MaterialColor.CYAN),
    LIGHT_BLUE(MaterialColor.LIGHT_BLUE),
    LIME(MaterialColor.LIME),
    MAGENTA(MaterialColor.MAGENTA),
    ORANGE(MaterialColor.ADOBE),
    PINK(MaterialColor.PINK),
    PURPLE(MaterialColor.PURPLE),
    RED(MaterialColor.RED),
    YELLOW(MaterialColor.YELLOW);

    public MaterialColor map;

    GumdropColor(MaterialColor map) {
        this.map = map;
    }
}
