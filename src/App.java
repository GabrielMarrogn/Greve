import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[a];

        int g = 0;
        int v = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].split(" ");
            if(temp[0].equals("G")){
                g += Integer.parseInt(temp[1]);
            }else if(temp[0].equals("V")){
                v += Integer.parseInt(temp[1]); 
            }
        }

        if(v < g){
            System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");
        }else{
            System.out.println("A greve vai parar.");
        }

        sc.close();

    }
}
