public class ControlStatements {
//All control statements

    public void loopwhile()
    {
        int i=0;
        while( i<=5){
            System.out.println(i);
            i=i+1;
        }
    }
    public void loopdowhile(){
        int i=0;
        do{

            System.out.println("do while output:"+i);
            i=i+1;
        }while(i<=5);
    }
    public void jumpstatementsBreak()
    {
        for(int i=0;i<=5;i++){
            if(i==2)
                break;
            System.out.println("break statement output:"+i);

        }
    }
    public void jumpstatementContinue()
    {
        for(int i=0;i<=5;i++)
        {
            if(i==2)
                continue;
            System.out.println("continue statement output"+ i);

        }
    }
    public static void main(String[] args) {
        ControlStatements demo=new ControlStatements();
       demo.loopwhile();
       demo.loopdowhile();
        demo.jumpstatementsBreak();
        demo.jumpstatementContinue();


    }
}