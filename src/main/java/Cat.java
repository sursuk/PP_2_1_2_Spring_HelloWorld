public class Cat {

    private String name;

    Cat(){

    }

    Cat(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{ name= " + name + '}';
    }
}
