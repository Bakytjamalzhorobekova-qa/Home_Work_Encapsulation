public class Popugai {
    private String name;
    private String type;
    private int age;
    private int size;

    public void setName(String aty ){
        name=aty;
    }
    public void setType(String poroda){
        type=poroda;
    }
    public void setAge(int jash){
        if (jash>0&&jash<100)
        age=jash;
    }

    public void setSize(int razmer){
        size=razmer;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }
    public int getSize(){
        return size;
    }



}
