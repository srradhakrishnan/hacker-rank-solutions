package br.com.srijith.easy.salesbymatch;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(int n, List<Integer> ar) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/srradhakrishnan/hacker-rank-solutions
     */
    return ar.stream().collect(Collectors.groupingBy(item -> item)).values().stream()
        .mapToInt(integers -> integers.size() / 2)
        .sum();
  }
}

public class SalesByMatch {
  public static void main(String[] args) throws IOException {
    System.out.println(Result.sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
  }
}
