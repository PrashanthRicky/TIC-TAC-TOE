public class TicTacToe{
public static void main(String[] args) {
    
    char[][] board = {{' ', ' ', ' '},
				 	  {' ', ' ', ' '}, 
				 	  {' ', ' ', ' '}
                    };

    printBoard(board);
    
    updateBoard(9,2,board);
}


private static void updateBoard(int position,int player ,char[][] board){
          
    char character;

           if(player==1){
            character= 'X';
           }else{
            character= 'O';
           }

           switch (position){

            case 1:
                board[0][0] = character;
                printBoard(board);
                break;
            case 2:
                board[0][1] = character;
                printBoard(board);
                break;
            case 3:
                board[0][2] = character;
                printBoard(board);
                break;
            case 4:
                board[1][0] = character;
                printBoard(board);
                break;
            case 5:
                board[1][1] = character;
                printBoard(board);
                break;
            case 6:
                board[1][2] = character;
                printBoard(board);
                break;
            case 7:
                board[2][0] = character;
                printBoard(board);
                break;
            case 8:
                board[2][1] = character;
                printBoard(board);
                break;
            case 9:
                board[2][2] = character;
                printBoard(board);
                break;
            default:
                break;
        }
}

private static void printBoard(char[][] board) {
    System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
    System.out.println("-+-+-");
    System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
    System.out.println("-+-+-");
    System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
}

}