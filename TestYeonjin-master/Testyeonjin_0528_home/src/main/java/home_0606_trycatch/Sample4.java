package home_0606_trycatch;

public class Sample4 {
    public void sayNick(String nick) throws FoolException{

            if ("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("별명은" + nick);


    }
}