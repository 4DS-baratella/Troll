public class Main {
    public static void main(String[] args) {
        Troll troll = null;
        try{
            troll = new Troll(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}