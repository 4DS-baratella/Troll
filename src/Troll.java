public class Troll {
    private int vita;

    public Troll(int vita) throws Exception{
        if(vita > 0){
            this.vita = vita;
        }else{
            throw new Exception("\nLa vita non può essere minore di 0.");
        }
    }

    public void attaccoSubito(int attacco){
        this.vita -= attacco;
    }
}
