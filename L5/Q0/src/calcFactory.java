public class calcFactory {
    public Calculator get(String name){
        if(name.equalsIgnoreCase("+")){
            return new calcPlus();
        }
        else if( name.equalsIgnoreCase("-")){
            return new calcMinus();
        }
        return null;
    }
}