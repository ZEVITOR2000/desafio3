
public class BolsaValores {

	public static void main(String[] args) {
		
		int mesesSemanas[][] = new int [4][7];
		mesesSemanas[0][0] = 1;
		mesesSemanas[0][1] = 2;
		mesesSemanas[0][2] = 3;
		mesesSemanas[0][3] = 4;
		mesesSemanas[0][4] = 5;
		mesesSemanas[0][5] = 6;
		mesesSemanas[0][6] = 7;
		mesesSemanas[1][0] = 8;
		mesesSemanas[1][1] = 9;
		mesesSemanas[1][2] = 10;
		mesesSemanas[1][3] = 11;
		mesesSemanas[1][4] = 12;
		mesesSemanas[1][5] = 13;
		mesesSemanas[1][6] = 14;
		mesesSemanas[2][0] = 15;
		mesesSemanas[2][1] = 16;
		mesesSemanas[2][2] = 17;
		mesesSemanas[2][3] = 18;
		mesesSemanas[2][4] = 19;
		mesesSemanas[2][5] = 20;
		mesesSemanas[2][6] = 21;
		mesesSemanas[3][0] = 22;
		mesesSemanas[3][1] = 23;
		mesesSemanas[3][2] = 24;
		mesesSemanas[3][3] = 25;
		mesesSemanas[3][4] = 26;
		mesesSemanas[3][5] = 27;
		mesesSemanas[3][6] = 28;
		int media;
		for(int linha = 0; linha <= mesesSemanas.length -1 ; linha ++)
			
		{
			for(int coluna = 0; coluna <= mesesSemanas[0].length -1 ; coluna ++ )
			{
				System.out.print(mesesSemanas[linha][coluna]+" ");
			}
			System.out.print("\n");
			}
		System.out.print("Calculando Média Semanal");
		double soma;
		for(int linha = 0; linha <= mesesSemanas.length -1 ; linha ++) {
			
			soma = 0;
			for(int coluna = 0; coluna <= mesesSemanas[0].length -1 ; coluna ++ ) {
				soma += mesesSemanas[linha][coluna];
			}
			System.out.println("A média " + linha + " é = " + (soma/28));
			
		}
		System.out.print("\n");
		}
	}


