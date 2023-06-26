public class Main {
    public static void main(String[] args) {

        StringBuilder  strCollection= new StringBuilder ("Hallo");
        StringBuffer   strBuffer=new StringBuffer("Hallo");
        String strHallo= new String("Hallo");
        printCollectionBuilder(strCollection,strHallo,100000);
        printCollection(strHallo,10000);
        printCollectionBuffer(strBuffer,strHallo,100000);
    }

    public static void printCollection( String add,int Anzahl){

        long mystart= System.currentTimeMillis();
        for (int i =0;i<Anzahl;i++){
            add += "Java";
        }
        //System.out.println(add);
        long mystopp=System.currentTimeMillis();
        System.out.println(mystopp-mystart+ "ms");

    }
    public static void printCollectionBuilder(StringBuilder col, String add,int Anzahl){

        long mystart= System.currentTimeMillis();
        for (int i =0;i<Anzahl;i++){
            col.append(add);
        }
       // System.out.println(col);
        long mystopp=System.currentTimeMillis();
        System.out.println(mystopp-mystart+ "ms");

    }
    public static void printCollectionBuffer(StringBuffer col, String add,int Anzahl){

        long mystart= System.currentTimeMillis();
        for (int i =0;i<Anzahl;i++){
            col.append(add);
        }
        // System.out.println(col);
        long mystopp=System.currentTimeMillis();
        System.out.println(mystopp-mystart+ "ms");

    }
}