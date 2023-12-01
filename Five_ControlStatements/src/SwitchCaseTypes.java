public class SwitchCaseTypes {
    public static void main(String[] args) {
        int i;
        for (i=0;i<3;i++){
            switch(i){
                case 0 :
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                default:
                    System.out.println("Nothing");

            }
        }
        System.out.println("Seasons");
        int month =5;
            switch(month){
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Bogus month");

        }
        System.out.println("Nested Switch");
            int h=0;
            char u='s';
            switch(h){
                case 0:
                    switch(u){
                        case 's':
                            System.out.println("Small");
                            break;
                        case 'm':
                            System.out.println("Medium");
                            break;
                    }

            }

    }
}
