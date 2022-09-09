public class Opskrift {
    private String navn;
    private Ingrediens[] ingredienser = new Ingrediens[7];
    private int antal;

    public Opskrift() {
        ingredienser[0] = new Ingrediens("Æg", 3, "stk", 61, 150);
        ingredienser[1] = new Ingrediens("Sukker", 170, "gram", 1, 500);
        ingredienser[2] = new Ingrediens("Vaniljesukker", 2, "tsk", 1, 100);
        ingredienser[3] = new Ingrediens("Hvedemel", 125, "gram", 1, 200);
        ingredienser[4] = new Ingrediens("Bagepulver", 1, "tsk", 1, 50);
        ingredienser[5] = new Ingrediens("Smør", 100, "gram", 1, 700);
        ingredienser[6] = new Ingrediens("Banan", 2, "stk", 1, 400);
    }

    //SET antal
    public void setAntal(int antal) {
        this.antal = antal;
    }

    //GET antal
    public int getAntal() {
        return antal;
    }

    public String toString() {
        for (int i = 0; i < ingredienser.length; i++) {
            this.ingredienser[i].setAmount(antal * ingredienser[i].getAmount());
            this.ingredienser[i].setEnergy(antal * ingredienser[i].getEnergy());
            System.out.println(ingredienser[i]);
        }
        return " ";
    }

}