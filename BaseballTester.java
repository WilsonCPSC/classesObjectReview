public class BaseballTester
{
	public static void main (String[] args) {
		run();
    }
    public static void run()
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        //System.out.println(babeRuth.getBattingAverage());
    }
}