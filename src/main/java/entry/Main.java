package entry;

import builder.PojoBuilder;

public class Main {

    public static void main(String[] args) {

        try{
            new PojoBuilder().build();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }

    }

}
