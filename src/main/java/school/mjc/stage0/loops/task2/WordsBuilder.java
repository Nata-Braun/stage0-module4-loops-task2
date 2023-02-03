package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter=0;
        String result = "";
        while (counter<=chars.length-1){

            System.out.print(chars[counter]);
            counter++;
        }

    }
}
