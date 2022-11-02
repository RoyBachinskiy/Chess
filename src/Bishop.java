public class Bishop extends ChessPiece{
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (((line == toLine) && (column == toColumn)) || (toLine < 0 || toLine > 7) || (toColumn < 0 || toColumn > 7)){
            return false;
        } else {
            if ((color.equals("White")) && (((line == 1) && ((toLine - line) == 2)) || ((line > 1) && ((toLine - line) == 1))) || ((color.equals("Black")) && (((line == 7) && (line - toLine == 2)) || ((line > 1) && (line - toLine == 1)))) && (column == toColumn)){
                return true;
            } else return false;
        }
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
