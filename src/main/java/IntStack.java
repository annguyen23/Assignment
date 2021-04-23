public class IntStack{
   private int [] collection;
   private int elementNum = 0;

   /**create object IntStack
      @param collection: Array represents the collection
   */
  public IntStack createIntStack() {
    return new IntStack();
  } 
  
  public IntStack(int initialCapacity) {
      collection = new int [initialCapacity];
   }

   /**create object IntStack with empty capacity
      @param collection: Array represents the collection
   */
   public IntStack () {
      collection = new int [10];
   }

   /**print out the result
      @param word: String needs to be displayed
      @param elementNum: length of collection
      @param collection: Array represents the collection
      @return word: collection that will be displayed as String
   */
   public String toString() {
      if (elementNum == 0){
         return "[]";
      }
      String word = "[";
      for (int i = 0 ; i < elementNum; i++){
         if (i < elementNum-1){
            word += collection[i] + ", ";
         }else{
            word += collection[i] + "]";
         }
      }
      return word;
   }

   /**print out the lenghth of collection
      @param elementNum: length of collection
      @return elementNum: length of collection as int.
   */
   public int getLength() {
      return elementNum;
   }

   /**check if the collection is empty
      @param collection: Array represents the collection
      @return true if collection is empty and false if collection is not
   */
   public boolean isEmpty() {
      return elementNum == 0;
   }

   /**set a warning to user
      @param WARNING: a warning as String when the collection is full
   */
   public static final String WARNING = "Push is unsuccessful!\nThe collection is full.";

   /**push value in collection
      @param num: value that will be added
      @param elementNum: length of collection
      @param collection: Array represents the collection
   */
   public void push(int num) {
      if (elementNum+1 > collection.length){
         System.out.println(WARNING);
      }else{
         collection[elementNum] = num;
         elementNum++;
      }
   }

   /**take out the most recent value and display it
      @param mostRecentNum: the most recent value
      @param elementNum: length of collection
      @param collection: Array represents the collection
      @return mostRecentNum: the most recent value as int
   */
   public int pop() {
      if (elementNum == 0){
         System.out.println("Popping is falied!\nThis collection is empty!");
         return 0;
      }
      elementNum--;
      int mostRecentNum = collection[elementNum];
      collection[elementNum] = 0;
      return mostRecentNum;
   }

   /**get capacity of collection
      @param collection: Array represents the collection
      @return capacity of collection
   */
   public int getCapacity() {
      return collection.length;
   }

   /**set capacity of collection
      @param newCapacity: new capacity of collection
      @param collection: Array represents the collection
      @param tem: temperary Array to store the collection
      @return newCapacity: new capacity of collection as String
   */
   public int setCapacity(int newCapacity) {
      if (newCapacity < collection.length){
         System.out.println("Setting new capacity is failed! New capacity is smaller than the old capacity!");
         return newCapacity;
      }else{
         int[] tem = new int [collection.length];
         for (int i = 0; i < tem.length; i++){
            tem[i] = collection[i];
         }
         collection = new int [newCapacity];
         for (int i = 0; i < tem.length; i++){
            collection[i] = tem[i];
         }
         return newCapacity;
      }
   }
}
