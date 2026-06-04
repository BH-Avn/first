package current;
import java.util.*;
import static utils.Base.*;
class BankAccount {
private double balance;
private int accountNumber;
private String accountHolderName="";
BankAccount(double initialBalance, int no,String name) 
{
 balance = initialBalance; accountNumber=no; accountHolderName=name;
 }
 public String getName()
 {
    return accountHolderName;
 }
 public int getAccountNumber() 
 { return accountNumber;

 } 
 public void deposit(double amount) 
 {
 balance = balance + amount;
 }

 

}

public class learning {
 public static void main(String[] args) {
BankAccount[] accounts=new BankAccount[50];

for(int i=0;i<50;i++)
{
    accounts[i]=new BankAccount(0.0,i+1,"");
}


int length = accounts.length;
for (int i = 0; i < length - 1; i++) {
    for (int j = 0; j < length - i - 1; j++) {
        // Step 1: Extract strings using the correct inner loop index 'j'
        String s1 = accounts[j].getName();
        String s2 = accounts[j+1].getName();
        
        // Step 2: Compare lexicographically
        if (s1.compareToIgnoreCase(s2) > 0) {
            // Step 3: Swap the OBJECTS in the array, not the strings
            BankAccount temp = accounts[j];
            accounts[j] = accounts[j+1];
            accounts[j+1] = temp;
        }
    }
}

/*int targetAccount = 37;
double depositAmt = 1500.0;
boolean found=false;
for(int i=0;i<50;i++)
{
    if(accounts[i].getAccountNumber()==targetAccount)
    {
        accounts[i].deposit(depositAmt);
        found=true;break;
    }
}
if(!found)
{
    System.out.println("Account not Found");
}
    */
 }
}

class Time {
    int hours;
    int minutes;

    Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    /*public void addTime(Time otherTime) {
        
        int sum=this.minutes+otherTime.minutes;
        if(sum>=60)
        {
            this.hours+=(sum/60);
            this.minutes=sum%60;
        }
        this.hours+=otherTime.hours;
    }*/
    public Time addTime(Time otherTime) {
        int totalMinutes = this.minutes + otherTime.minutes;
    
        Time temp = new Time((this.hours+otherTime.hours+(totalMinutes/60)),totalMinutes%60);
    
   
    
   return temp;
}
}

/*```java
import java.util.ArrayList;
```

Create:

```java
ArrayList<String> list = new ArrayList<>();
```

Common functions:

Add element:

```java
list.add("A");
```

Add at index:

```java
list.add(0, "B");
```

Get element:

```java
list.get(0);
```

Update element:

```java
list.set(0, "C");
```

Remove by index:

```java
list.remove(0);
```

Remove by value:

```java
list.remove("C");
```

Size:

```java
list.size();
```

Check if contains:

```java
list.contains("A");
```

Find index:

```java
list.indexOf("A");
```

Check empty:

```java
list.isEmpty();
```

Clear all elements:

```java
list.clear();
```

Loop:

```java
for(String item : list) {
    System.out.println(item);
}
```

Convert to array:

```java
String[] arr = list.toArray(new String[0]);
```

Example:

```java
ArrayList<String> names = new ArrayList<>();

names.add("John");
names.add("Alice");

System.out.println(names.get(0)); // John

names.set(0, "Bob");

System.out.println(names.size()); // 2

names.remove("Alice");

System.out.println(names.contains("Bob")); // true
```
 */

class lrArrayList
{
  void main()
  {
    ArrayList<String> names=new ArrayList<>();
    names.add("Bob");
    names.add("Alice");
    pl(names.size());

  }
}