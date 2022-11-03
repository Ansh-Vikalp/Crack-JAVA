public class cwh_4_Precedence_Associativity {
    public static void main(String[] args) {
        // Precedence and Associativity of Operators
        int k = 23 + 12 / 2 - 1 * 3;// Here *,/ has higher Precedence than +,-
        // = 23+ 6- 1*3 as /,* has same precedence then asocciativity is L-->R
        // = 23+ 6- 3
        // = 29-3
        // = 26
        System.out.println(k);

        int a = 1;
        int b = 2;
        int c = 4;
        int x = b * b - 4 * a * c / 2 * a;
        // *,/ greater precedence than +,- also L-->R
        // x= 2*2 - 4*1*4/ 2*1
        // = 4- 4*1*4/ 2*1
        // = 4- 16/2*1
        // = 4- 8*1
        // = 4-8
        // = -4
        System.out.println(x);

        int y = b * b - (4 * a * c) / (2 * a); // On appling () we can define our own order of evaluation also () has
                                               // highest of all precedence
        // *,/ greater precedence than +,- also L-->R: ()Left solved then ()Right solved
        // y= 2*2 - (4*1*4)/ (2*1)
        // = 2*2 - (16)/(2*1)
        // = 2*2 - 16/2
        // = 2*2 - 8
        // = 4 - 8
        // =-4
        System.out.println(y);

        int z = (b * b - 4 * a * c) / (2 * a);
        // *,/ greater precedence than +,- also L-->R: ()Left solved then ()Right solved
        // z = (2*2 - 4*1*4)/ (2*1)
        // = (4-16)/(2*1)
        // = (-12)/(2*1)
        // = -12/2
        // = -6
        System.out.println(z);
    }
}
