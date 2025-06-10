public class Array {
   public Array() {
   }

   public static int sum(int[] var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1 += var0[var2];
      }

      return var1;
   }

   public static double average(int[] var0) {
      return var0.length == 0 ? 0.0 : (double)sum(var0) / (double)var0.length;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5};
      System.out.println("Sum: " + sum(var1));
      System.out.println("Average: " + average(var1));
   }
}