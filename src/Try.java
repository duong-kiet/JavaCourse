import java.io.*;

public class Try {
    public void writeToFile(){
        String txt = "Nguyen Van A";
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            /*
            for(String s : a){
                bw.write(s);
                bw.newLine();
            }
             */
            bw.close();
            fw.close();
        }
        catch (IOException e) {
        }
    }

    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String  line = "";
            while(true){
                if(line == null){
                    break;
                }
                line = br.readLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
        }
    }
}
