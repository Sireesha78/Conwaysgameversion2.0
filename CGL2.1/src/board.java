//@author P. Sireesha 2020501096
//Create board class
public class board {								
	cell[][] cell;
	private int n;

	public board(int n) {
		this.n = n;
		this.cell = new cell[n][n];
	}
//Creating board method
	public void createboard() {

		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.cell[i][j] = new cell(false);

			}
		}
		

	}
//Printing the board
	public String printBoard() {
		String con = "";
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if (cell[i][j].status==true) {

					con += "*";

				} else {

					con += ".";

					if (j == this.n - 1 && i < this.n - 1) {
						con = con + "\n";
					}
				}

			}

		}
		return con;
	}
	// modular division for corner cases  (Took help from team mate Sai chandra)
	public int modulardiv(int m) {
		
		return (((m % n) + n) % n);
	}
	//Generating Next Generation board by checking 8 neighbours of the cell
	public board generateNextGeneration(board b) {
		
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                int count=0;
                if(this.cell[modulardiv(i-1)][modulardiv(j-1)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i-1)][modulardiv(j)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i-1)][modulardiv(j+1)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i)][modulardiv(j-1)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i)][modulardiv(j+1)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i+1)][modulardiv(j-1)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i+1)][modulardiv(j)].status){
                    count+=1;
                }
                if(this.cell[modulardiv(i+1)][modulardiv(j+1)].status){
                    count+=1;
                }
                if(this.cell[i][j].status){
                    if(count==2 || count==3){
                        b.cell[i][j].status=true;
                        
                    }
                }
                else{
                    if(count==3){
                        b.cell[i][j].status=true;
                    }
                }
            }
            

        }
        return b;

    }
	public String toString() {
		
		return this.printBoard();
	}

	 
}
