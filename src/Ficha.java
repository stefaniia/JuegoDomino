import java.util.*;

public class Ficha {

        private int num1;
        private int num2;

        public Ficha(int num1, int num2) {   // Abre constructor
            this.num1 = num1;
            this.num2 = num2;
        }

        public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }

        public String toString() {   // Abre metodo toString
            return "["+num1+"|"+num2+"]";
        }



  /*  public void barajar() {
        ArrayList<Ficha> fichas = new ArrayList<>();

        fichas.add(ficha1);
        fichas.add(ficha2);
        fichas.add(ficha3);
        fichas.add(ficha4);

        fichas.add(ficha28);

        Collections.shuffle(fichas);

        for (int i = 0; i < fichas.size(); i++) {
            System.out.println(fichas);
        }*/
    }


