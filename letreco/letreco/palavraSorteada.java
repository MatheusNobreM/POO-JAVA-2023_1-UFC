import java.util.Scanner;

import java.time.LocalDateTime;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;


public class palavraSorteada {

    String filePath = "br-utf8.txt"; //"src/AP3/br-utf8.txt"

    List <String> list;
    private String aPalavra;


    public palavraSorteada() {
        list = new ArrayList<String>();
        deArquivoParaList();
        this.aPalavra = geradorDaPalavra();
    }

    public String getaPalavra() {
        return aPalavra;
    }
    public List<String> getList() {
        return list;
    }

    private void deArquivoParaList() {

        try {

            File file = new File(filePath);
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(line);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private String geradorDaPalavra() {

        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano();

        long seed = hour * 1000000000L + minute * 10000000L + second * 100000L + nanosecond;

        Random random = new Random(seed);

        return list.get(random.nextInt(5906));
    }




}
