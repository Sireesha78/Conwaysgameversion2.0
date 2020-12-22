
public class board {
	private cell[][] cell;
	private int n;

	public board(int n) {
		this.n = n;
		this.cell = new cell[n][n];
	}

	public board createboard() {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				this.cell[i][j] = new cell(false);
			}
		}

		return this;
	}

	public String printBoard() {
		String con = "";
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if (this.cell[i][j].status==true) {

					con += "*";

					if (j == this.n - 1 && i < this.n - 1) {
						con = con + "\n";
					}
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
	public board generateNextGeneration(board b) {
		
        for(int i=1;i<this.n-1;i++){
            for(int j=1;j<this.n-1;j++){
                int count=0;
                if(this.cell[i-1][j-1].status){
                    count+=1;
                }
                if(this.cell[i-1][j].status){
                    count+=1;
                }
                if(this.cell[i-1][j+1].status){
                    count+=1;
                }
                if(this.cell[i][j-1].status){
                    count+=1;
                }
                if(this.cell[i][j+1].status){
                    count+=1;
                }
                if(this.cell[i+1][j-1].status){
                    count+=1;
                }
                if(this.cell[i+1][j].status){
                    count+=1;
                }
                if(this.cell[i+1][j+1].status){
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

}
