public class Programmer extends Employee{
    
    //overload method
    public void skill(){
        System.out.println("No skill");
    }
    public void skill(String...language){
        for(int i = 0; i < language.length; i++){
            System.out.println("I have skill in " + language[i]);
        }
    }
    //override method
    public void bonus(){
        
    }

}
 