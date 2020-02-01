class Droid {
    // initial fields
    int batteryLevel;
    String name;
  
    // constructor
    public Droid(String DroidName) {
      name = DroidName;
      batteryLevel = 100;
    }
  
    // methods
    public void performTask(String task){
      print(name + " is performing task: " + task);
      batteryLevel = batteryLevel -10;
    }
    public void stateBatteryLevel(){
      print(name + "'s battery level is: " + batteryLevel);
    }
    public void energyTransfer(Droid receivingDroid){
      print(name + " gave 10 energy to" + receivingDroid.name);
      batteryLevel = batteryLevel -10;
      receivingDroid.batteryLevel = receivingDroid.batteryLevel + 10;
    }
  
    public static void print(String content) {
      System.out.println(content);
    }
  
    public String toString() {
      return "Hi, I'm " + name;
    }
  
    // main
    public static void Droid(String[] args) {
      System.out.println("Hello world!");
      Droid codey = new Droid("Codey");
  
      Droid codette = new Droid("Codette");
      
      print(codey.toString());
      codey.performTask("nothing");
      codey.stateBatteryLevel();
  
      codey.energyTransfer(codette);
  
      codette.stateBatteryLevel();
  
    }
  }