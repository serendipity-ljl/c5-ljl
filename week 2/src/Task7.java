public class Task7 {
    public static void main(String[] args) {
        Duck D = new Duck("鸭子", "发烧", 2, "感冒");
        D.showMsg();
        D.showIllness();
        D.showSymptom();
    }
    public static abstract class Poultry{
        private String name;          //动物种类
        private String symptom;       //症状
        private int age;              //年龄
        private String illness;       //病因
        public Poultry(){
        }
        public Poultry(String name,String symptom,int age,String illness)
        {
            this.name=name;
            this.symptom=symptom;
            this.age=age;
            this.illness=illness;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age)
        {
            this.age=age;
        }

        public String getName() {
            return name;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void setIllness(String illness){
            this.illness=illness;
        }
        public String getIllness()
        {
            return illness;
        }
        public String getSymptom()
        {
            return symptom;
        }
        public void setSymptom(String symptom)
        {
            this.symptom=symptom;
        }
        public abstract void showSymptom();  //抽象方法症状
        public void showMsg()          //提供基本信息
        {
            System.out.println("动物种类:"+name+","+"年龄："+age+"岁");
        }
        public void showIllness()                       //展现病因
        {
            System.out.println("入院原因："+illness);
        }
    }

    public static class Duck extends Poultry{
        public Duck(String name, String symptom, int age, String illness)
        {
            super(name,symptom,age,illness);
        }
        @Override
        public void showSymptom() {
            System.out.println("症状为："+getSymptom());
        }
    }
}
