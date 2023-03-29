import java.util.ArrayList;

public class Human {
    String name;
    String last_name;
    Human mother;
    Human father;
    ArrayList<Human>brothers;
    ArrayList<Human> kids=new ArrayList<>();
    ArrayList<Human>sisters;
    Human spouse;
    Gender gender;
    Human(String name){
        this.name=name;
    }
    Human(String name1,String last_name1, Human mother1,Human father1,ArrayList<Human>brothers1,ArrayList<Human>sisters1,ArrayList<Human>kids1,Human spouse1,int gender1){

        this.name=name1;
        this.last_name=last_name1;
        this.mother=mother1;
        this.father=father1;
        this.brothers=brothers1;
        this.sisters=sisters1;
        this.kids=kids1;
        this.spouse=spouse1;
        if (gender1==1){
            this.gender=Gender.male;
        }
        else {
            this.gender=Gender.female;
        }
        if (mother1!=null){
            mother1.kids.add(this);
        }
        if (father1!=null){
            father1.kids.add(this);
        }
        if (brothers1!=null){
            for (int i = 0; i < brothers1.size(); i++) {
                if (gender1==1){
                    brothers1.get(i).brothers.add(this);

                }
                else {
                    brothers1.get(i).sisters.add(this);
                }

            }
        }
        if (sisters1!=null){
            for (int i = 0; i < sisters1.size(); i++) {
                if (gender1==1){
                    sisters1.get(i).brothers.add(this);

                }
                else {
                    sisters1.get(i).sisters.add(this);
                }
            }
        }
        if (kids1!=null){
            for (int i = 0; i < kids1.size(); i++) {
                if (gender1==1){
                    kids1.get(i).father=this;
                }
                else {
                    kids1.get(i).mother=this;
                }

            }
            spouse1.spouse=this;
        }
        }


    @Override
    public String toString() {
        return String.format("Имя : %s ,Фамилия: %s  ,Дети %s ,Сёстры : %s ,Братья : %s ,Папа  : %s,Мама  : %s,Супруг : %s , ",name,last_name,kids,brothers,sisters,father,mother,spouse);
    }
}
