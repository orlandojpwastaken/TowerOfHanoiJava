public class TowerOfHanoi {
    public static void TowerOfHanoi(int disc, char origin, char destination, char auxiliary) {
        if (disc == 1) {
            System.out.println("Moved disk " + disc + " from Rod " + origin + " to " + destination);
            return;
        }
        TowerOfHanoi(disc-1, origin, auxiliary, destination);
        System.out.println("Moved disk " + disc + " from Rod " + origin + " to " + destination);
        TowerOfHanoi(disc-1, auxiliary, destination, origin);

    }
    public static void main(String[] args) {
     int noOfDiscs = 3;
     char rodOne = 'A';
     char rodTwo = 'B';
     char rodThree = 'C';

     TowerOfHanoi(noOfDiscs,rodOne, rodThree, rodTwo);


    }
}