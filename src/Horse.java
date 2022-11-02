public class Horse extends ChessPiece{
    public Horse(String color) {
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
            if (((Math.abs(line - toLine) == 2) && (Math.abs(column - toColumn) == 1)) || ((Math.abs(line - toLine) == 1) && (Math.abs(column - toColumn) == 2))){
                return true;
            } else return false;
        }
    }

    @Override
    public String getSymbol() {
        return "H";
    }

}
