package ru.unn.agile.ColorConverter.Model.Converters;

import ru.unn.agile.ColorConverter.Model.ColorSpaces.Rgb;

public final class RgbConverter {

    private RgbConverter() {
    }

    public static void fromRgbToColorSpace(final Rgb srcColor, final Rgb dstColor) {
        dstColor.setR(srcColor.getR());
        dstColor.setG(srcColor.getG());
        dstColor.setB(srcColor.getB());
    }

    public static Rgb toRgbColor(final Rgb srcColor) {
        return srcColor;
    }
}
