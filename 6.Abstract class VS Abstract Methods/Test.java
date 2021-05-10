abstract public class Test {

    abstract void m1() ;
    abstract void m2() ;

}

class SubTest extends Test {

    public void m1() {

    }
}

/*
error: SubTest is not abstract and does not override abstract method m2() in Test
class SubTest extends Test {
*/

/*
@DESC: After compiling the above code you got above error

Now How can we solve this problem?
ANS: We can solve this issue in two ways:

1. By implementing the second method "m2()"
                    OR
2. You can also make this class as abstract
 */
