public class Tree {
    public void getFather(Human a) {
        System.out.println(" папа-" + a.father.name);
    }

    public void getMother(Human a) {
        System.out.println("мама-" + a.mother.name);
    }

    public void getKids(Human a) {
        System.out.println("Дети - ");
        for (int i = 0; i < a.kids.size(); i++) {
            System.out.println(a.kids.get(i).name);
            System.out.println(" , ");
        }
    }

    public void getBrothers(Human a) {
        System.out.println("братья - ");
        for (int i = 0; i < a.brothers.size(); i++) {
            System.out.println(a.brothers.get(i).name);
            System.out.println(" , ");
        }
    }

    public void getSisters(Human a) {
        System.out.println("Сёстры - ");
        for (int i = 0; i < a.sisters.size(); i++) {
            System.out.println(a.sisters.get(i).name);
            System.out.println(" , ");
        }
    }
}
