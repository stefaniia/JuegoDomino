import java.util.ArrayList;

public class Tablero {
    public Tablero(){

    }
    ArrayList<Ficha> fichasTablero = new ArrayList<>();
    ArrayList<Ficha> fichasAct = new ArrayList<>();
    ArrayList<Ficha> fichaInicial = new ArrayList<>();


    public ArrayList quienSale(ArrayList<Ficha> fichaJug1, ArrayList<Ficha> fichaJug2) {
        if (fichaJug1 != null && fichaJug2 != null) {
            for (int j = 6; j >= 0; j--) {
                for (int i = 0; i < 7; i++) {
                    if (fichaJug1.get(i).getNum1() == j && fichaJug1.get(i).getNum2() == j) {
                        fichaInicial.add(fichaJug1.get(i));
                        break;
                    } else if (fichaJug2.get(i).getNum1() == j && fichaJug2.get(i).getNum2() == j) {
                        fichaInicial.add(fichaJug2.get(i));
                        break;
                    }

                }
                if(fichaInicial.get(0).getNum1() == 6  && fichaInicial.get(0).getNum2() == 6){

                }
            }
            System.out.println(fichaInicial + "++++_____+++++");
        }
        return fichaInicial;
    }
              public ArrayList ponerFicha(ArrayList<Ficha> fichaJug) {

                fichasTablero.add(fichaJug.get(0));

                //fichaJug.remove(0);
                fichasAct = fichaJug;
                //System.out.println("+++++");
                //System.out.println(fichaJug);
                //System.out.println("-----");
                //System.out.println(fichasAct);


        return fichasAct;
    }



}
