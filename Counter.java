// https://repl.it/LYvQ/14

class Counter
{
  private int numClicks;
  private int money;

  public Counter(int initial){
    numClicks = initial;
    setMoney();
  }

  public Counter(){
    numClicks = 0;
  }

  public int getValue(){
    return numClicks;
  }

  public int getMoney(){
    return Math.round(money / 2);
  }

  public void click(){
    numClicks += 1;
    setMoney();
  }

  private void setMoney(){
     money = numClicks * 30;
  }

  public void reset(){
    numClicks = 0;
  }
}

class Main {
  public static void main(String[] args) {
    Counter jordon = new Counter(10);
    Counter zhong = new Counter();
      jordon.click();
      zhong.click();
      zhong.click();
      zhong.click();
      zhong.click();
      zhong.click();
      jordon.click();

      System.out.println("jordon: val is " + jordon.getValue() + " and mon is "+jordon.getMoney());
      System.out.println("zhong: val is " + zhong.getValue() + " and mon is "+zhong.getMoney());
  }
}
