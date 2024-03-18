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
    void kxTest();
=======
    void myTest(){
        System.out.println("Testing");
    }
>>>>>>> f7a8dc4f06686fa4509ad0aa720b238736273893

}
