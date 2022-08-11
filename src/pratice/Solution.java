package pratice;

/*
class Result {
    public static String getLargestNumber(String num) {
    // Write your code here
    	 final List<List<Integer>> results = new ArrayList<>();

    	 

    	 
         for (final String querie : queries) {
             final List<Integer> queryResult = new ArrayList<>();
             results.add(queryResult);

             if (!querie.trim().isEmpty()) {
                 final String[] queryWords = querie.trim().replaceAll(" +", " ").split(" ");
                 for (int j = 0; j < sentences.size(); j++) {
                     final String[] sentenceWords = sentences.get(j).trim().replaceAll(" +", " ").split(" ");

                     if (sentenceWords.length>0 && containsAll(sentenceWords, queryWords)) {
                         queryResult.add(j);
                     }
                 }
             }
         }

         for (final List<Integer> queryResult : results) {
             if (!queryResult.isEmpty()) {
                 final StringBuffer print = new StringBuffer();
                 queryResult.forEach(value -> print.append(value + " "));
                 System.out.println(print.toString().trim());
             } else {
                 System.out.println(-1);
             }
         }

     }

     static boolean containsAll(String[] sentenceWords, String[] queryWords) {
            return Arrays.asList(sentenceWords).containsAll(Arrays.asList(queryWords));
     }
     
     final String[] queries = new String[queries_size];
     for(int i = 0; i < queries_size; i++) {
         String queries_item;
         try {
             queries_item = in.nextLine();
         } catch (final Exception e) {
             queries_item = null;
         }
         queries[i] = queries_item;
     }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String num = bufferedReader.readLine();

        String result = Result.getLargestNumber(num);
        //System.out.println(result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
