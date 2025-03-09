# **Java If-Else Conditional Statements Challenge**
by HackerRank
## **1️⃣ Understanding If-Else Statements**

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement follows the logical flow as shown in the diagram below:

```
IF (A = TRUE)
Then B
Else C
End IF
```

This means:
- If condition **A** is **true**, execute **B**.
- If condition **A** is **false**, execute **C**.

---

## **2️⃣ Task**
Given an integer `n`, perform the following conditional actions:

- If `n` is **odd**, print `Weird`.
- If `n` is **even** and in the range **2 to 5 (inclusive)**, print `Not Weird`.
- If `n` is **even** and in the range **6 to 20 (inclusive)**, print `Weird`.
- If `n` is **even** and **greater than 20**, print `Not Weird`.

Complete the stub code provided in your editor to determine whether or not `n` is weird.

---

## **3️⃣ Input Format**
A single line containing a positive integer, `n`.

### **Constraints:**
```
1 ≤ n ≤ 100
```

---

## **4️⃣ Output Format**
Print **Weird** if the number meets the conditions for being weird. Otherwise, print **Not Weird**.

---

## **5️⃣ Example Test Cases**
### **Example 1**
**Input:**
```
3
```
**Output:**
```
Weird
```
**Explanation:**
Since `3` is **odd**, the output is `Weird`.

### **Example 2**
**Input:**
```
4
```
**Output:**
```
Not Weird
```
**Explanation:**
Since `4` is **even** and in the range **2 to 5**, the output is `Not Weird`.

### **Example 3**
**Input:**
```
18
```
**Output:**
```
Weird
```
**Explanation:**
Since `18` is **even** and in the range **6 to 20**, the output is `Weird`.

### **Example 4**
**Input:**
```
22
```
**Output:**
```
Not Weird
```
**Explanation:**
Since `22` is **even** and **greater than 20**, the output is `Not Weird`.

---

## **6️⃣ Sample Java Code**
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
    }
}
```

---

## **7️⃣ Summary**
| **Condition** | **Output** |
|--------------|-----------|
| Odd `n` | `Weird` |
| Even `n` (2 to 5) | `Not Weird` |
| Even `n` (6 to 20) | `Weird` |
| Even `n` (>20) | `Not Weird` |

🚀 **By implementing this challenge, you strengthen your understanding of conditional statements in Java!**

