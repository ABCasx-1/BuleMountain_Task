```java
package homework;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Test<testArray> {
    public static void main(String[] args) {
        Lost[] testArray = new Lost[5];
        testArray[0] = new BookLost("book", "2117", "2021.04.14", "线代课本");
        testArray[1] = new CardLost("card", "3110", "2022.05.11", "2021212114");
        testArray[2] = new BookLost("book", "4203", "2022.01.25", "高数课本");
        testArray[3] = new CardLost("card", "5300", "2022.07.08", "2020212210");
        testArray[4] = new CardLost("card", "知行苑7舍", "2022.07.17", "2021212203");
        Solution solute = new Solution();
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入欲查询关键字:");
        String temp = scan.next();
        Lost[] ans = solute.selectByKeyword(testArray, temp);//查询到的数据保存在ans中
        if (ans.length == 0) {
            System.out.println("未查询到相关结果~");
        } else {
            for (int i = 0; i < ans.length; ++i) {
                System.out.print("第" + (i + 1) + "个:");
                System.out.println(ans[i].toString());
            }
        }
        System.out.println("排序前:" + "\n" + Arrays.toString(testArray));
        solute.sortLost(testArray);
        System.out.println("排序后:" + "\n" + Arrays.toString(testArray));
    }

}
```