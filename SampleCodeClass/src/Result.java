public class Result {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
    int HCI;
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }
    
    void testDisplay()
    {
        System.out.println(getTotal());

    }
   
    void testAll()
 	{
     		System.out.println("Hello");
     		return;
	}
	
    void danielChong(){
        System.out.println("Testing");
    }

<<<<<<< HEAD
    int countAll() { return 0; }
=======
    void myTest(){
        
    }
>>>>>>> parent of 21d137c (Update Result.java)

    void LawBing(){
        System.out.println("See you guys in Starlight Fantasy this Saturday!!!");
    }
}
