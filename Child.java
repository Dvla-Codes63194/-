public class Child {
 private String name;
 private int age;
 private int iq;
 private int strength;
 private int code;
 private boolean escaped;

public Child(String name,int age,int iq,int strength,int code){
    this.name=name;
    this.age=age;
    this.iq=iq;
    this.strength=strength;
    this.code=code;
    this.escaped=false;

}
public String getName(){
    return name;
}
   public int getAge() {
        return age;
    }
    public int getIq() {
        return iq;
    }

    public int getStrength() {
        return strength;
    }

    public int getCode() {
        return code;
    }

    public boolean isEscaped() {
        return escaped;
    }
public void showInfo(){

    System.out.println("Name: " +getName());
    System.out.println("Age: "+getAge());
    System.out.println("IQ: "+getIq());
    System.out.println("Strength: "+getStrength());
    System.out.println("Code: "+getCode());
    System.out.println("Escaped: "+isEscaped());
    System.out.println("====== ====== ======");

}
public void train(){
    iq += 5;
    strength += 5;
}

public void escape(){
    escaped=true;
}

}
