package chess;

import java.awt.Color;

class Rook extends Piece {

    private Color[][] image = new Color[PIECE_SIZE][PIECE_SIZE];
    private final boolean isWhite;

    Rook(boolean isWhite) {
        this.isWhite = isWhite;
        final int[][] pixels =
                {
                        {1, 0, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1}
                };
        getColor(image, pixels, isWhite);
    }

    @Override
    public Color[][] getImage() {
        return image;
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }
}