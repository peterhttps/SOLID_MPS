import java.util.ArrayList;


public class verificarGanhador{
    public Boolean verificaGanhador(Tabuleiro tab){
    	if ((tab.spots.get(0) == tab.spots.get(1)) && (tab.spots.get(0) == tab.spots.get(2))){
    		return true;
    	} else if ((tab.spots.get(3) == tab.spots.get(4)) && (tab.spots.get(3) == tab.spots.get(5))) {
			  return true;
    	} else{
    		return false;
    	}
    }
}

public class Tabuleiro {
    ArrayList<String> spots;

    public Tabuleiro() {
        this.spots = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(" ");
        }
    }
 
    public void display() {
        String tabuleiroFormatado = this.spots.get(0) + " | " + 
                                    this.spots.get(1) + " | " + 
                                    this.spots.get(2) + "\n" + 
                                    this.spots.get(3) + " | " + 
                                    this.spots.get(4) + " | " + 
                                    this.spots.get(5) + "\n" + 
                                    this.spots.get(6) + " | " + 
                                    this.spots.get(7) + " | " + 
                                    this.spots.get(8);
        System.out.print(tabuleiroFormatado);
    }
}


public class verificaLinha{

    public ArrayList<String> primeiraLinha(Tabuleiro tab) {
        ArrayList<String> firstRow = new ArrayList<String>();
        firstRow.add(tab.spots.get(0));
        firstRow.add(tab.spots.get(1));
        firstRow.add(tab.spots.get(2));
        return firstRow;
    }

    public ArrayList<String> segundaLinha(Tabuleiro tab) {
        ArrayList<String> secondRow = new ArrayList<String>();
        secondRow.add(tab.spots.get(3));
        secondRow.add(tab.spots.get(4));
        secondRow.add(tab.spots.get(5));
        return secondRow;
    }

    public ArrayList<String> terceiraLinha(Tabuleiro tab) {
        ArrayList<String> thirdRow = new ArrayList<String>();
        thirdRow.add(tab.spots.get(6));
        thirdRow.add(tab.spots.get(7));
        thirdRow.add(tab.spots.get(8));
        return thirdRow;
    }
}
