public class main {
    public static void main(String[] args) {
        Human b=new Human("1");
        Human v=new Human("2");
        Human a=new Human("ivan");
        a.father=v;
        a.mother=b;
        Tree bn=new Tree();
        bn.getFather(a);
        bn.getMother(a);


        /**
         * есть ещё комонды-
         * bn.getBrothers(a);
         * bn.getKids(a);
         * bn.getSisters(a);
         */
    }
}
