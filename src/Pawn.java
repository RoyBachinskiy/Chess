public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPosition(line) && checkPosition(column) && checkPosition(toLine) && checkPosition(toColumn)){
            if (column == toColumn){
                int start, direction;

                if(color.equals("White")){
                    start = 1;
                    direction = 1;
                } else {
                    start = 6;
                    direction = -1;
                }

                if (line + direction == toLine){
                    return chessBoard.board[toLine][toColumn] == null;
                }

                if (line == start && line + 2 * direction == toLine){
                    return chessBoard.board[toLine][toColumn] == null && chessBoard.board[line + direction][column] == null;
                }
            } else return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
    public boolean checkPosition(int position){
        if (position < 0 || position > 7){
            return false;
        } else return true;
    }
}
