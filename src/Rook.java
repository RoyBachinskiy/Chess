public class Rook extends ChessPiece{

    public Rook(String color) {super(color);}
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPosition(line) && checkPosition(column) && checkPosition(toLine) && checkPosition(toColumn)) {
            if (column == toColumn){

                for (int i = Math.min(line, toLine); i < Math.max(line, toLine); i++){
                    if (chessBoard.board[i][column] != null) {
                        if (chessBoard.board[i][column] == this && i == Math.max(line, toLine)) return false;
                        else if (chessBoard.board[i][column].getColor().equals(this.color) && i == toLine) return false;
                        else if (!chessBoard.board[i][column].getColor().equals(this.color) && i == toLine) return true;
                        else if (i != toLine && i != line) return false;
                    }
                }

                if (chessBoard.board[toLine][column] != null){
                    if (chessBoard.board[toLine][column].getColor().equals(this.color) && chessBoard.board[toLine][column] != this) return false;
                    else return !chessBoard.board[toLine][column].getColor().equals(this.color) && chessBoard.board[toLine][column] != this;
                } else return true;
            } else if (line == toLine){

                    for (int i = Math.min(column, toColumn); i < Math.max(column, toColumn); i++){
                        if (chessBoard.board[line][i] != null) {
                            if (chessBoard.board[line][i] == this && i == Math.max(column, toColumn)) return false;
                            else if (chessBoard.board[line][i].getColor().equals(this.color) && i == toColumn) return false;
                            else if (!chessBoard.board[line][i].getColor().equals(this.color) && i == toColumn) return true;
                            else if (i != toColumn && i != column) return false;
                        }
                    }

                    if (chessBoard.board[line][toColumn] != null){
                        if (chessBoard.board[line][toColumn].getColor().equals(this.color) && chessBoard.board[line][toColumn] != this) return false;
                        else return !chessBoard.board[line][toColumn].getColor().equals(this.color) && chessBoard.board[line][toColumn] != this;
                    } else return true;
            } else return false;
        } else return false;
    }
    @Override
    public String getSymbol() {
        return "R";
    }

    public boolean checkPosition(int position){
        if (position < 0 || position > 7){
            return false;
        } else return true;
    }
}
