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
	RE = 1;
	SDA = 1;
	SQAT = 1;
	SEAM = 1;
	FM = 1
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

    int countAll() { return 0; }

}
